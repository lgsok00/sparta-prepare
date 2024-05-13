package com.sparta.springprepare;

import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@RequiredArgsConstructor
public class Memo {
  private final String username;
  private String contents;
}