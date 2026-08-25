package com.socops.web;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.test.web.servlet.MockMvc;

import static org.hamcrest.Matchers.containsString;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.content;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

@WebMvcTest(BingoRestController.class)
class BingoRestControllerTests {

    @Autowired
    private MockMvc mockMvc;

    @Test
    @DisplayName("Lobby page keeps the required carnival landing hooks")
    void lobbyPageKeepsRequiredHooks() throws Exception {
        mockMvc.perform(get("/"))
                .andExpect(status().isOk())
                .andExpect(content().string(containsString("id=\"lobbyView\"")))
                .andExpect(content().string(containsString("id=\"welcomeTitle\"")))
                .andExpect(content().string(containsString("onclick=\"launchGame()\"")))
                .andExpect(content().string(containsString("Start a New Round")))
                .andExpect(content().string(containsString("type=\"button\"")))
                .andExpect(content().string(containsString("aria-labelledby=\"welcomeTitle\"")))
                .andExpect(content().string(containsString("lobby-mini-grid")));
    }
}
