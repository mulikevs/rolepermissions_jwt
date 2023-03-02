package com.samdev.mulikevs.controler;

import com.samdev.mulikevs.entity.Role;
import com.samdev.mulikevs.repository.RoleRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/roles")
public class RoleController {

    @Autowired
    private RoleRepository roleRepository;

    @PostMapping
    public ResponseEntity<Role> createRole(@RequestBody Role role) {
        Role savedRole = roleRepository.save(role);
        return ResponseEntity.created(null).body(savedRole);
    }

    @GetMapping("/{roleName}/permissions")
    public ResponseEntity<List<Role.Permissions>> getPermissionsByRoleName(@PathVariable String roleName) {
        Optional<Role> roleOptional = roleRepository.findByRoleName(roleName);
        if (roleOptional.isPresent()) {
            Role role = roleOptional.get();
            return ResponseEntity.ok(role.getPermissions());
        }
        return ResponseEntity.notFound().build();
    }

    @GetMapping("/permissions")
    public ResponseEntity<List<Role.Permissions>> getAllPermissions() {
        return ResponseEntity.ok(Arrays.asList(Role.Permissions.values()));
    }

}

