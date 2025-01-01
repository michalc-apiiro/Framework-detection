const loggly = require('loggly');
const winston = require('winston');
const Graylog = require('graylog2');

// --- Graylog2 Configuration ---
const graylog = new Graylog({
  servers: [{ host: 'localhost', port: 12201 }],
  facility: 'MyApp',
});

graylog.on('error', (err) => {
  console.log('Graylog error: ', err);
});

// --- Loggly Configuration ---
const logglyClient = loggly.createClient({
  token: 'YOUR_LOGGLY_TOKEN',  // Replace with your Loggly token
  subdomain: 'YOUR_LOGGLY_SUBDOMAIN',  // Replace with your Loggly subdomain
  json: true,
});

// --- Logger2 Configuration ---
const logger2 = winston.createLogger({
  level: 'info',
  transports: [
    new winston.transports.Console(),
    new winston.transports.File({ filename: 'logfile.log' }),
  ],
});

// Log message using each framework
function logMessages() {
  const message = 'This is a test log message';

  // Graylog
  graylog.log(message, (err, res) => {
    if (err) {
      console.error('Error sending log to Graylog:', err);
    } else {
      console.log('Logged message to Graylog');
    }
  });

  // Loggly
  logglyClient.log(message, (err) => {
    if (err) {
      console.error('Error sending log to Loggly:', err);
    } else {
      console.log('Logged message to Loggly');
    }
  });

  // Logger2 (Winston) - Console and File
  logger2.info(message);
  console.log('Logged message to Console and File using Logger2');
}

// Run the log function
logMessages();
