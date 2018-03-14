package com.codurance.ddddemo.application.user;

import com.codurance.ddddemo.domain.user.*;
import com.codurance.ddddemo.user.*;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.is;
import static org.mockito.BDDMockito.given;

@RunWith(MockitoJUnitRunner.class)
public class GetUserByIdShould {
    private static final String UUID = "1921ef2c-d023-4a39-b01e-bba58b3e051b";
    private static final UserId USER_ID = UserId.of(UUID);
    private static final User A_USER = new User(USER_ID, "John", "Doe");

    private static final String NOT_EXISTENT_UUID = "9fcc9235-e1d3-42d0-9cd2-906fd6f2259c";
    private static final UserId NOT_EXISTENT_USER_ID = UserId.of(NOT_EXISTENT_UUID);
    private static final User NOT_EXISTENT_USER = null;

    @Mock
    private UserRepository userRepository;
    private GetUserById getUserById;

    @Before
    public void setUp() {
        getUserById = new GetUserById(userRepository);
    }

    @Test
    public void
    get_a_user_by_id() throws UserNotFoundException {
        GetUserByIdRequest getUserByIdRequest = new GetUserByIdRequest(UUID);
        given(userRepository.ofId(USER_ID))
                .willReturn(A_USER);

        User user = getUserById.execute(getUserByIdRequest);

        assertThat(user, is(A_USER));
    }

    @Test(expected = UserNotFoundException.class)
    public void
    throws_exception_if_the_user_is_not_found() throws UserNotFoundException {
        GetUserByIdRequest getUserByIdRequest = new GetUserByIdRequest(NOT_EXISTENT_UUID);
        given(userRepository.ofId(NOT_EXISTENT_USER_ID))
                .willReturn(NOT_EXISTENT_USER);

        getUserById.execute(getUserByIdRequest);
    }
}
