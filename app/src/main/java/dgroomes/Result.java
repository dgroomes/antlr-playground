package dgroomes;

/**
 * I'm trying out a wrapper return type that represents either a successful response ("Ok") along with the success
 * payload or an error response ("Err") along with the error payload (it could be a {@link Exception} or just a {@link String}
 * representing an error message.
 * <p>
 * With Java's sealed types and "pattern matching in switch" support, this design pattern is feasible. I'm not sure
 * it's better, but I want to try it out. Rust code uses this pattern extensively.
 * <p>
 * UPDATE: Yikes this pattern is still very verbose. I'm annoyed that I can't 'return' from a case branch in a switch
 * expression. I can `throw` from a branch, but of course the purpose of the 'Ok/Err' design pattern is to avoid
 * throwing exceptions and instead tream them as normal return values.
 *
 * @param <T>
 * @param <E>
 */
sealed interface Result<T, E> permits Err, Ok {}
