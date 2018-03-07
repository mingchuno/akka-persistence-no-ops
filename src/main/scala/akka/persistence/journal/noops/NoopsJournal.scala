package akka.persistence.journal.noops

import akka.persistence.journal.AsyncWriteJournal
import akka.persistence.{AtomicWrite, PersistentRepr}

import scala.collection.immutable
import scala.concurrent.Future
import scala.util.Try

class NoopsJournal extends AsyncWriteJournal {
  override def asyncWriteMessages(messages: immutable.Seq[AtomicWrite]): Future[immutable.Seq[Try[Unit]]] = {
    Future.successful(messages.map(_ => Try(())))
  }

  override def asyncDeleteMessagesTo(persistenceId: String, toSequenceNr: Long): Future[Unit] = {
    Future.successful(())
  }

  override def asyncReplayMessages(persistenceId: String, fromSequenceNr: Long, toSequenceNr: Long, max: Long)(recoveryCallback: PersistentRepr => Unit): Future[Unit] = {
    Future.successful(())
  }

  override def asyncReadHighestSequenceNr(persistenceId: String, fromSequenceNr: Long): Future[Long] = {
    Future.successful(fromSequenceNr)
  }
}
