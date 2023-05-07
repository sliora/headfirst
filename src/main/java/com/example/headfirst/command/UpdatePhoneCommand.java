package com.example.headfirst.command;

public class UpdatePhoneCommand implements Command{
    private UserProfile userProfile;
    private String newPhone;

    public UpdatePhoneCommand(UserProfile userProfile, String newPhone) {
        this.userProfile = userProfile;
        this.newPhone = newPhone;
    }

    @Override
    public void execute() {
        userProfile.setPhone(newPhone);
    }
}
