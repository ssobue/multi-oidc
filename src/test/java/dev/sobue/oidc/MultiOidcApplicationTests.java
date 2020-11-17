package dev.sobue.oidc;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertDoesNotThrow;

class MultiOidcApplicationTests {

  @Test
  void contextLoads() {
    assertDoesNotThrow(() -> MultiOidcApplication.main(new String[0]));
  }
}
