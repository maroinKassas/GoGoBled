package com.gogobled.contactwebsite;

import com.gogobled.contactwebsite.user.User;
import org.springframework.security.core.context.SecurityContextHolder;

public class Utils {

    public static User getCurrentUser() {
        return (User) SecurityContextHolder.getContext().getAuthentication().getPrincipal();
    }

    public static int getCurrentUserId() {
        return getCurrentUser().getId();
    }
}
