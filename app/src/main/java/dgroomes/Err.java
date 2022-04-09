package dgroomes;

record Err<T, E>(E value) implements Result<T, E> {

  static <T, E> Err<T, E> err(E errorPayload) {
    return new Err<>(errorPayload);
  }
}
