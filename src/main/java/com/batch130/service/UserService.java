package com.batch130.service;

import com.batch130.entity.concretes.User;
import com.batch130.payload.request.UserRequest;
import com.batch130.payload.response.UserResponse;
import com.batch130.repository.UserRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.data.domain.Page;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class UserService {

    private final UserRepository userRepository;

    public UserResponse add(UserRequest userRequest) {
        return null;
    }

    public Page<UserResponse> getAll(int page, int size, String sort, String type) {
        return null;
    }

    public UserResponse getById(Long userId) {
        return null;

    }

    public UserResponse update(UserRequest userRequest, Long userId) {
        return null;
    }

    public UserResponse delete(Long userId) {
        return null;
    }

    public UserResponse getMyProfile(String username) {
        return null;
    }
}
