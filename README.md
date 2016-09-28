# scalamock-scalatest-support

This project allows using [ScalaMock](http://www.scalamock.org) with [ScalaTest](http://www.scalatest.org). This was
previously possible until ScalaTest 3.0.0, but ScalaMock hasn't yet been updated to be compatible with the latest
version of ScalaTest (which introduced some breaking changes).

All the code in this project came from 
[ScalaMock's module of the same name](https://github.com/paulbutcher/ScalaMock/tree/master/frameworks/scalatest). It was
slightly modified to be compatible with ScalaTest 3.0.0.

The motivation for this is that the author of ScalaMock seems to be too busy to update it. With this module extracted,
we can keep it up to date with ScalaTest, and publish artifacts that allow us to easily use ScalaMock in our tests.

## Artifact
I'm currently publishing this to my Bintray repository:

```scala
resolvers += Resolver.bintrayRepo("jeremyrsmith", "maven")
libraryDependencies += "io.github.jeremyrsmith" %% "scalamock-scalatest-support" % "3.0.0"
```

Since ScalaMock seems to be finished at version 3.2.2, it makes sense to instead peg the version of this module to
the ScalaTest version (currently 3.0.0). If the current version of this module is not compatible with the latest version
of ScalaTest, I'll try to update this module and release a new artifact.

## Usage
The usage of ScalaMock in ScalaTest is described in
[ScalaTest's User Guide](http://www.scalatest.org/user_guide/testing_with_mock_objects).

## License
As far as I can tell, ScalaMock is under a BSD license. I've marked this module as Apache 2.0 because it's what I'm
used to. But the original code is Copyright Paul Butcher.