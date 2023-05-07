package com.example.headfirst.command;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class UserProfileTest {

    private UserProfile userProfile;
    private CompositeCommand compositeCommand;

    @BeforeEach
    void init() {
        userProfile = new UserProfile("zerom", "zerom@gmail.com", "010-0000-0000");
        compositeCommand = new CompositeCommand();
    }

    @Test
    public void testUpdateName() {
        compositeCommand.addCommand(new UpdateNameCommand(userProfile, "문스터디"));
        compositeCommand.execute();

        Assertions.assertThat(userProfile.getName()).isEqualTo("문스터디");
    }

    @Test
    public void testUpdateEmail() {
        compositeCommand.addCommand(new UpdateEmailCommand(userProfile, "moonstudy@gmail.com"));
        compositeCommand.execute();

        Assertions.assertThat(userProfile.getEmail()).isEqualTo("moonstudy@gmail.com");
    }

    @Test
    public void testUpdatePhone() {
        compositeCommand.addCommand(new UpdatePhoneCommand(userProfile, "555-5678"));
        compositeCommand.execute();

        Assertions.assertThat(userProfile.getPhone()).isEqualTo("555-5678");
    }

    @Test
    public void testUpdateAll() {
        compositeCommand.addCommand(new UpdateNameCommand(userProfile, "문스터디"));
        compositeCommand.addCommand(new UpdateEmailCommand(userProfile, "moonstudy@gmail.com"));
        compositeCommand.addCommand(new UpdatePhoneCommand(userProfile, "555-5678"));
        compositeCommand.execute();

        Assertions.assertThat(userProfile.getName()).isEqualTo("문스터디");
        Assertions.assertThat(userProfile.getEmail()).isEqualTo("moonstudy@gmail.com");
        Assertions.assertThat(userProfile.getPhone()).isEqualTo("555-5678");
    }
}