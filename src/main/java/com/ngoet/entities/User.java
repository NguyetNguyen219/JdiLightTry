package com.ngoet.entities;

import com.sun.istack.NotNull;
import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class User {
    private @NotNull String name;
    private @NotNull String password;
}
