package com.example.headfirst.template_method;

public class GetUserResponse extends ApiResponseTemplate<UserDto> {

    private UserService userService;
    private Long userId;

    public GetUserResponse(UserService userService, Long userId) {
        this.userService = userService;
        this.userId = userId;
    }

    @Override
    protected UserDto doAction() throws Exception {
        return userService.getUserById(userId);
    }

    @Override
    protected UserDto handleException(Exception e) {
        System.out.println("Error occurred: " + e.getMessage());
        return new UserDto(-1L, "Error");
    }
}