CREATE DATABASE IF NOT EXISTS cricket_selection;
USE cricket_selection;

CREATE TABLE IF NOT EXISTS player (
  id               INT UNSIGNED NOT NULL AUTO_INCREMENT PRIMARY KEY,
  name             VARCHAR(100) NOT NULL,
  role             VARCHAR(20)  NOT NULL,     -- BATSMAN | BOWLER | ALL_ROUNDER | WICKET_KEEPER
  batting_average  DECIMAL(5,2) NULL,         -- nullable for pure bowlers
  bowling_average  DECIMAL(5,2) NULL          -- nullable for pure batsmen
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;