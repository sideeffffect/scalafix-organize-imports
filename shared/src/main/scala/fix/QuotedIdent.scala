package fix

object QuotedIdent {
  object `a.b` {
    object c
    object `{ d }` {
      object e
    }
  }

  object `macro`
}
