package com.dxc.personrestapi.controllers;

public class PersonNotFoundException extends RuntimeException {

    PersonNotFoundException(Integer id) {
        super("Could not find Person " + id);

    }
}