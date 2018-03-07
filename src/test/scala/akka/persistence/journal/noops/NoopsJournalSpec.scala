package akka.persistence.journal.noops

import akka.persistence.CapabilityFlag
import akka.persistence.journal.JournalSpec
import com.typesafe.config.ConfigFactory

class NoopsJournalSpec extends JournalSpec(
  config = ConfigFactory.parseString(
    """
      |akka.persistence.journal.plugin = "akka-persistence-no-ops.journal"
      |""".stripMargin)) {

  override protected def supportsRejectingNonSerializableObjects: CapabilityFlag = CapabilityFlag.off()

}
