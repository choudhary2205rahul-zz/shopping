package com.crazzy.shopping.resource;

import com.crazzy.shopping.service.UserService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import java.util.Collections;
import java.util.Map;

@RestController
@Slf4j
public class LoginResource {

    private final UserService userService;

    public LoginResource(UserService userService) {
        this.userService = userService;
    }

    @GetMapping("/token")
    public Map<String,String> token(HttpSession httpSession, HttpServletRequest httpServletRequest) {
        return Collections.singletonMap("token",httpSession.getId());
    }

    @GetMapping("/checkSession")
    public ResponseEntity checkSession() {
        return new ResponseEntity("", HttpStatus.OK);
    }

    @PostMapping("/user/logout")
    public ResponseEntity logout() {
        SecurityContextHolder.clearContext();
        return new ResponseEntity("", HttpStatus.OK);
    }
}
