-- phpMyAdmin SQL Dump
-- version 5.0.4
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1
-- Erstellungszeit: 26. Nov 2020 um 15:27
-- Server-Version: 10.4.16-MariaDB
-- PHP-Version: 7.4.12

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Datenbank: `semester03_internet_technology_website`
--

-- --------------------------------------------------------

--
-- Tabellenstruktur für Tabelle `author`
--

CREATE TABLE `author` (
  `ID` bigint(20) NOT NULL,
  `Name` varchar(255) DEFAULT NULL,
  `FirstName` varchar(255) DEFAULT NULL,
  `LegalNotice` varchar(255) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Daten für Tabelle `author`
--

INSERT INTO `author` (`ID`, `Name`, `FirstName`, `LegalNotice`) VALUES
(0, 'Tolstoi', 'Leo', 'Is already dead. Rights belong to his family ...'),
(1, 'Tolstoi', 'Leo', 'ALready dead, rights belong to his family till 2...'),
(2, 'Boyne', 'John', 'He is alive, usually here comes his contact information (manager, lawyer)');

-- --------------------------------------------------------

--
-- Tabellenstruktur für Tabelle `author_book_relationship`
--

CREATE TABLE `author_book_relationship` (
  `author_id` bigint(20) NOT NULL,
  `book_id` bigint(20) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Daten für Tabelle `author_book_relationship`
--

INSERT INTO `author_book_relationship` (`author_id`, `book_id`) VALUES
(0, 1),
(2, 2);

-- --------------------------------------------------------

--
-- Tabellenstruktur für Tabelle `author_institute_relationship`
--

CREATE TABLE `author_institute_relationship` (
  `author_id` bigint(20) NOT NULL,
  `institute_id` bigint(20) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

-- --------------------------------------------------------

--
-- Tabellenstruktur für Tabelle `book`
--

CREATE TABLE `book` (
  `ID` bigint(20) NOT NULL,
  `ISBN` varchar(255) DEFAULT NULL,
  `TITLE` varchar(255) DEFAULT NULL,
  `SUBTITLE` varchar(255) DEFAULT NULL,
  `comment` varchar(255) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Daten für Tabelle `book`
--

INSERT INTO `book` (`ID`, `ISBN`, `TITLE`, `SUBTITLE`, `comment`) VALUES
(1, '978-3-86647-176-4', 'War and Peace', 'Standard edition', 'English'),
(2, '978-1-909-53119-2', 'The Boy in the Striped Pyjamas', 'The 10th Aniversary Edition', 'Paperback');

-- --------------------------------------------------------

--
-- Tabellenstruktur für Tabelle `institute`
--

CREATE TABLE `institute` (
  `ID` bigint(20) NOT NULL,
  `Name` varchar(255) DEFAULT NULL,
  `LegalNotice` varchar(255) DEFAULT NULL,
  `head_id` bigint(20) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Daten für Tabelle `institute`
--

INSERT INTO `institute` (`ID`, `Name`, `LegalNotice`, `head_id`) VALUES
(1, 'Institute of Leo Tolstoi literature', 'University of Great Literature\r\nInstitute of Leo Tolstoi literature\r\nCampus\r\nTolstoi street 1\r\n12345\r\nBasel\r\n', 1),
(2, 'Institute of German History', 'University of Berlin\r\nInstitute of German History\r\nHistorystreet 1\r\n123 Berlin', 2);

-- --------------------------------------------------------

--
-- Tabellenstruktur für Tabelle `institute_location_relationship`
--

CREATE TABLE `institute_location_relationship` (
  `institute_id` bigint(20) NOT NULL,
  `location_id` bigint(20) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Daten für Tabelle `institute_location_relationship`
--

INSERT INTO `institute_location_relationship` (`institute_id`, `location_id`) VALUES
(1, 1);

-- --------------------------------------------------------

--
-- Tabellenstruktur für Tabelle `job`
--

CREATE TABLE `job` (
  `ID` bigint(20) NOT NULL,
  `member_id` bigint(20) NOT NULL,
  `book_id` bigint(20) NOT NULL,
  `jobstatus` enum('OPEN','IN_PROGRESS','DONE') DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

-- --------------------------------------------------------

--
-- Tabellenstruktur für Tabelle `location`
--

CREATE TABLE `location` (
  `ID` bigint(20) NOT NULL,
  `street` varchar(255) DEFAULT NULL,
  `buildingnumber` int(11) DEFAULT NULL,
  `comment` varchar(255) DEFAULT NULL,
  `zipCode` int(11) DEFAULT NULL,
  `city` varchar(255) DEFAULT NULL,
  `country` varchar(255) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Daten für Tabelle `location`
--

INSERT INTO `location` (`ID`, `street`, `buildingnumber`, `comment`, `zipCode`, `city`, `country`) VALUES
(1, 'Mainstreet 1', 3, NULL, 12345, 'Zermatt', 'Switzerland'),
(2, 'Berlinstreet 1', 2, '4th Floor', 123, 'Berlin', 'Germany');

-- --------------------------------------------------------

--
-- Tabellenstruktur für Tabelle `location_book_relationship`
--

CREATE TABLE `location_book_relationship` (
  `location_id` bigint(20) NOT NULL,
  `book_id` bigint(20) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Daten für Tabelle `location_book_relationship`
--

INSERT INTO `location_book_relationship` (`location_id`, `book_id`) VALUES
(1, 1),
(2, 2);

-- --------------------------------------------------------

--
-- Tabellenstruktur für Tabelle `member`
--

CREATE TABLE `member` (
  `ID` bigint(20) NOT NULL,
  `email` varchar(255) DEFAULT NULL,
  `phone` varchar(255) DEFAULT NULL,
  `role` enum('ADMIN','LECTURER','STUDENT','LIBRARY') DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

-- --------------------------------------------------------

--
-- Tabellenstruktur für Tabelle `person`
--

CREATE TABLE `person` (
  `ID` bigint(20) NOT NULL,
  `name` varchar(255) DEFAULT NULL,
  `firstname` varchar(255) DEFAULT NULL,
  `legalnotice` varchar(255) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Daten für Tabelle `person`
--

INSERT INTO `person` (`ID`, `name`, `firstname`, `legalnotice`) VALUES
(1, 'Ivanovic', 'Ivan', NULL),
(2, 'Schmidt', 'Bruno', 'Can be reached threw his assistant: Anna Schneider, +456..........');

--
-- Indizes der exportierten Tabellen
--

--
-- Indizes für die Tabelle `author`
--
ALTER TABLE `author`
  ADD PRIMARY KEY (`ID`);

--
-- Indizes für die Tabelle `author_book_relationship`
--
ALTER TABLE `author_book_relationship`
  ADD PRIMARY KEY (`author_id`,`book_id`),
  ADD KEY `book_id` (`book_id`);

--
-- Indizes für die Tabelle `author_institute_relationship`
--
ALTER TABLE `author_institute_relationship`
  ADD PRIMARY KEY (`author_id`,`institute_id`),
  ADD KEY `institute_id` (`institute_id`);

--
-- Indizes für die Tabelle `book`
--
ALTER TABLE `book`
  ADD PRIMARY KEY (`ID`);

--
-- Indizes für die Tabelle `institute`
--
ALTER TABLE `institute`
  ADD PRIMARY KEY (`ID`);

--
-- Indizes für die Tabelle `institute_location_relationship`
--
ALTER TABLE `institute_location_relationship`
  ADD PRIMARY KEY (`location_id`,`institute_id`) USING BTREE,
  ADD KEY `institute_id` (`institute_id`);

--
-- Indizes für die Tabelle `job`
--
ALTER TABLE `job`
  ADD PRIMARY KEY (`ID`);

--
-- Indizes für die Tabelle `location`
--
ALTER TABLE `location`
  ADD PRIMARY KEY (`ID`);

--
-- Indizes für die Tabelle `location_book_relationship`
--
ALTER TABLE `location_book_relationship`
  ADD PRIMARY KEY (`location_id`,`book_id`),
  ADD KEY `book_id` (`book_id`);

--
-- Indizes für die Tabelle `member`
--
ALTER TABLE `member`
  ADD PRIMARY KEY (`ID`);

--
-- Indizes für die Tabelle `person`
--
ALTER TABLE `person`
  ADD PRIMARY KEY (`ID`);

--
-- Constraints der exportierten Tabellen
--

--
-- Constraints der Tabelle `author_book_relationship`
--
ALTER TABLE `author_book_relationship`
  ADD CONSTRAINT `author_book_relationship_ibfk_1` FOREIGN KEY (`author_id`) REFERENCES `author` (`ID`),
  ADD CONSTRAINT `author_book_relationship_ibfk_2` FOREIGN KEY (`book_id`) REFERENCES `book` (`ID`);

--
-- Constraints der Tabelle `author_institute_relationship`
--
ALTER TABLE `author_institute_relationship`
  ADD CONSTRAINT `author_institute_relationship_ibfk_1` FOREIGN KEY (`author_id`) REFERENCES `author` (`ID`),
  ADD CONSTRAINT `author_institute_relationship_ibfk_2` FOREIGN KEY (`institute_id`) REFERENCES `institute` (`ID`);

--
-- Constraints der Tabelle `institute_location_relationship`
--
ALTER TABLE `institute_location_relationship`
  ADD CONSTRAINT `institute_location_relationship_ibfk_1` FOREIGN KEY (`institute_id`) REFERENCES `institute` (`ID`),
  ADD CONSTRAINT `institute_location_relationship_ibfk_2` FOREIGN KEY (`location_id`) REFERENCES `location` (`ID`);

--
-- Constraints der Tabelle `location_book_relationship`
--
ALTER TABLE `location_book_relationship`
  ADD CONSTRAINT `location_book_relationship_ibfk_1` FOREIGN KEY (`book_id`) REFERENCES `book` (`ID`),
  ADD CONSTRAINT `location_book_relationship_ibfk_2` FOREIGN KEY (`location_id`) REFERENCES `location` (`ID`);
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
