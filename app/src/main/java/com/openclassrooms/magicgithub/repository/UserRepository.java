package com.openclassrooms.magicgithub.repository;

import com.openclassrooms.magicgithub.api.ApiService;
import com.openclassrooms.magicgithub.model.User;

import java.util.ArrayList;
import java.util.List;


public class UserRepository {

    private final ApiService apiService;


    public UserRepository(ApiService apiService) {
        this.apiService = apiService;

    }


    public List<User> getUsers() {
        return apiService.getUsers();
        // je retourne la fonction getUsers() de l'interface apiService

    }


    public void generateRandomUser() {
        apiService.generateRandomUser();
        // j'utilise la fonction apiService.generateRandomUser() de l'interface apiService
    }


    public void deleteUser(User user) {
        apiService.deleteUser(user);
        // j'utilise la fonction apiService.deleteUser(user) de l'interface apiService
    }
}
