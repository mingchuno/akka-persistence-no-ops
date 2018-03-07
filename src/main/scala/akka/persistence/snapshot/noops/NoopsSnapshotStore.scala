package akka.persistence.snapshot.noops

import akka.persistence.{SelectedSnapshot, SnapshotMetadata, SnapshotSelectionCriteria}
import akka.persistence.snapshot.SnapshotStore

import scala.concurrent.Future

class NoopsSnapshotStore extends SnapshotStore {
  override def loadAsync(persistenceId: String, criteria: SnapshotSelectionCriteria): Future[Option[SelectedSnapshot]] = {
    Future.successful(None)
  }

  override def saveAsync(metadata: SnapshotMetadata, snapshot: Any): Future[Unit] = {
    Future.successful(())
  }

  override def deleteAsync(metadata: SnapshotMetadata): Future[Unit] = {
    Future.successful(())
  }

  override def deleteAsync(persistenceId: String, criteria: SnapshotSelectionCriteria): Future[Unit] = {
    Future.successful(())
  }
}
