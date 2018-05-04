/*
 * Copyright 2018 Google Inc.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.google.firebase.auth.hash;

public class Pbkdf2Sha256 extends Basic {

  private Pbkdf2Sha256(Builder builder) {
    super("PBKDF2_SHA256", builder);
  }

  public static Builder builder() {
    return new Builder();
  }

  public static class Builder extends Basic.Builder<Builder, Pbkdf2Sha256> {

    private Builder() {}

    @Override
    protected Builder getInstance() {
      return this;
    }

    public Pbkdf2Sha256 build() {
      return new Pbkdf2Sha256(this);
    }
  }
}
