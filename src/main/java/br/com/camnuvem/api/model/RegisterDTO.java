package br.com.camnuvem.api.model;

public record RegisterDTO(String login, String password, UserRole role) {

}
