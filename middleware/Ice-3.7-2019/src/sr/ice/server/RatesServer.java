package sr.ice.server;

import io.grpc.Server;
import io.grpc.ServerBuilder;

import java.io.IOException;
import java.util.logging.Logger;

public class RatesServer {




        private static final Logger logger = Logger.getLogger(RatesServer.class.getName());

        private int port = 50051;
        private Server server;

        private void start() throws IOException
        {
            server = ServerBuilder.forPort(port)
                    .addService(new CurrencyExchangeImpl())
                    //.addService(new CalculatorImpl())
                    //.addService(new AdvancedCalculatorImpl())
                    //.addService(new StreamTesterImpl())
                    .build()
                    .start();
            logger.info("Server started, listening on " + port);
            Runtime.getRuntime().addShutdownHook(new Thread() {
                @Override
                public void run() {
                    // Use stderr here since the logger may have been reset by its JVM shutdown hook.
                    System.err.println("*** shutting down gRPC server since JVM is shutting down");
                    RatesServer.this.stop();
                    System.err.println("*** server shut down");
                }
            });
        }

        private void stop() {
            if (server != null) {
                server.shutdown();
            }
        }

        /**
         * Await termination on the main thread since the grpc library uses daemon threads.
         */
        private void blockUntilShutdown() throws InterruptedException {
            if (server != null) {
                server.awaitTermination();
            }
        }

        /**
         * Main launches the server from the command line.
         */
        public static void main(String[] args) throws IOException, InterruptedException {
            final RatesServer server = new RatesServer();
            server.start();
            server.blockUntilShutdown();
        }


}
