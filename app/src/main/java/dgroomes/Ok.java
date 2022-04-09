package dgroomes;

record Ok<T, E>(T value) implements Result<T, E> {

  static <T, E> Ok<T, E> ok(T payload) {
    return new Ok<>(payload);
  }
}
