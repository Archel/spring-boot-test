package com.codurance.ddddemo.application;

import com.codurance.ddddemo.user.*;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.is;
import static org.mockito.BDDMockito.given;

@RunWith(MockitoJUnitRunner.class)
public class GetUserByIdShould {
    @Mock
    private UserRepository userRepository;

    @Test
    public void
    get_a_user_by_id() {
        UserId userId = UserId.of("1921ef2c-d023-4a39-b01e-bba58b3e051b");
        GetUserById getUserById = new GetUserById(userRepository);
        User expectedUser = new User(userId, "John", "Doe");
        GetUserByIdRequest getUserByIdRequest = new GetUserByIdRequest("1921ef2c-d023-4a39-b01e-bba58b3e051b");
        given(userRepository.ofId(userId)).willReturn(expectedUser);

        User user = getUserById.get(getUserByIdRequest);

        assertThat(user, is(expectedUser));
    }
}
