package edu.asu.ser335.jfm;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.core.type.TypeReference;
import org.jfm.main.CommonConstants;
import org.jfm.main.Role;

import java.io.File;
import java.io.IOException;
import java.util.List;

public class WhitelistReader {

    public static void loadWhitelist() {
        ObjectMapper mapper = new ObjectMapper();
        try {
            List<Role> roles = mapper.readValue(new File(CommonConstants.WHITELIST_FILE), new TypeReference<List<Role>>() {});
            updateRolePrivilegesMapping(roles);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private static void updateRolePrivilegesMapping(List<Role> roles) {
        for (Role role : roles) {
            RolesSingleton.rolePrivilegesMapping.put(role.getRole(), role.getWhitelist());
        }
    }
}
