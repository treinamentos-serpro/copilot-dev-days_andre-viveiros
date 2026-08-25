package com.socops.web;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.MvcResult;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.content;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

@SpringBootTest
@AutoConfigureMockMvc
class GamePageRenderingTests {

    @Autowired
    private MockMvc mockMvc;

    @Test
    @DisplayName("Lobby page keeps the launch controls and preview board")
    void lobbyPageIncludesRequiredLaunchElements() throws Exception {
        MvcResult result = mockMvc.perform(get("/"))
                .andExpect(status().isOk())
                .andExpect(content().string(org.hamcrest.Matchers.containsString("id=\"lobbyView\"")))
                .andExpect(content().string(org.hamcrest.Matchers.containsString("id=\"welcomeTitle\"")))
                .andExpect(content().string(org.hamcrest.Matchers.containsString("onclick=\"launchGame()\"")))
                .andExpect(content().string(org.hamcrest.Matchers.containsString("How the round moves")))
                .andExpect(content().string(org.hamcrest.Matchers.containsString("Board preview")))
                .andReturn();

        String markup = result.getResponse().getContentAsString();
        assertEquals(25, countOccurrences(markup, "class=\"lobby-mini-cell"),
                "The lobby preview should render a stable 5x5 mini board");
    }

    private int countOccurrences(String text, String token) {
        int count = 0;
        int index = 0;

        while ((index = text.indexOf(token, index)) >= 0) {
            count++;
            index += token.length();
        }

        return count;
    }
}
