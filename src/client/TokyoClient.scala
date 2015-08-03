package client

import java.rmi._

trait TokyoClient extends Remote {
  @throws(classOf[RemoteException]) def startGame(): Unit
  @throws(classOf[RemoteException]) def turn(id: Int)
}
