package akka.persistence.snapshot.noops

import akka.persistence.snapshot.SnapshotStoreSpec
import com.typesafe.config.ConfigFactory

class NoopsSnapshotStoreSpec extends SnapshotStoreSpec(
  config = ConfigFactory.parseString(
    """
    akka.persistence.snapshot-store.plugin = "akka-persistence-no-ops.snapshot"
    """)) {

}
