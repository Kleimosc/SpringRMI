package server;

import java.rmi.RemoteException;
import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;
import java.rmi.server.RMIClientSocketFactory;
import java.rmi.server.RMIServerSocketFactory;

import org.springframework.remoting.rmi.RmiServiceExporter;

public class ExporterRmi extends RmiServiceExporter {
	private Registry registry;
	
	@Override
	protected Registry getRegistry(String registryHost, int registryPort,
            RMIClientSocketFactory clientSocketFactory, RMIServerSocketFactory serverSocketFactory)
            		throws RemoteException {
		if (registry == null) {
			 registry= LocateRegistry.createRegistry(registryPort);
		}
		return registry;
		/*if (registryHost != null) {
			// Host explicitly specified: only lookup possible.
			if (logger.isInfoEnabled()) {
				logger.info("Looking for RMI registry at port '" + registryPort + "' of host [" + registryHost + "]");
			}
			Registry reg = LocateRegistry.getRegistry(registryHost, registryPort, clientSocketFactory);
			testRegistry(reg);
			return reg;
		}

		else {
			return getRegistry(registryPort, clientSocketFactory, serverSocketFactory);
		}
	} **/
	}
}
