require 'semantic_logger'
require 'logger'

logger = Logger.new(STDOUT)
logger.level = Logger::WARN

SemanticLogger.default_level = :trace
SemanticLogger.add_appender(file_name: 'development.log', formatter: :color)
