package project.api.devbank.service;

import project.api.devbank.domain.model.User;

public interface UserService {
    User findById(Long id);

    User create(User userToCreate);
}
