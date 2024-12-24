package com.fawry.movie_app.security.SecurityUtil;

import com.fawry.movie_app.security.CustomUserDetails;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;

public class SecurityUtil {
    public static CustomUserDetails getCustomUserDetails() throws Exception {
        Authentication authentication = SecurityContextHolder.getContext().getAuthentication();

        if (authentication != null && authentication.isAuthenticated()) {
            return (CustomUserDetails) authentication.getPrincipal();
        }
        throw new Exception("User is not authenticated.");
    }
}
