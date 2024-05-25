-- phpMyAdmin SQL Dump
-- version 5.2.1
-- https://www.phpmyadmin.net/
--
-- Hôte : 127.0.0.1
-- Généré le : sam. 25 mai 2024 à 13:17
-- Version du serveur : 10.4.28-MariaDB
-- Version de PHP : 8.2.4

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Base de données : `baby`
--

-- --------------------------------------------------------

--
-- Structure de la table `babyname`
--

CREATE TABLE `babyname` (
  `id` int(10) NOT NULL,
  `name` varchar(100) NOT NULL,
  `meaning` varchar(100) NOT NULL,
  `sex` varchar(20) NOT NULL,
  `religion` varchar(20) NOT NULL,
  `dateNaissance` date DEFAULT NULL,
  `photo` blob DEFAULT NULL,
  `contactParent` varchar(50) DEFAULT NULL,
  `nomParent` varchar(50) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1 COLLATE=latin1_swedish_ci;

--
-- Déchargement des données de la table `babyname`
--

INSERT INTO `babyname` (`id`, `name`, `meaning`, `sex`, `religion`, `dateNaissance`, `photo`, `contactParent`, `nomParent`) VALUES
(2, 'ahmed khalifa', 'tunisian name', 'boy', 'tunisian', NULL, NULL, NULL, NULL),
(3, 'oussema mbarek', 'tunisian name', 'boy', 'tunisian', NULL, NULL, NULL, NULL),
(4, 'ahlem fdhila', 'Innocent', 'girl', 'tunisian', NULL, NULL, NULL, NULL);

--
-- Index pour les tables déchargées
--

--
-- Index pour la table `babyname`
--
ALTER TABLE `babyname`
  ADD PRIMARY KEY (`id`);

--
-- AUTO_INCREMENT pour les tables déchargées
--

--
-- AUTO_INCREMENT pour la table `babyname`
--
ALTER TABLE `babyname`
  MODIFY `id` int(10) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=7;
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
