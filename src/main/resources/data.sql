-- Suppression des données existantes (si nécessaire)

DELETE FROM vin WHERE id IN (1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
DELETE FROM type_de_vin WHERE id IN (1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
DELETE FROM appelation WHERE id IN (1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
DELETE FROM cepage WHERE id IN (1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
DELETE FROM domaine_exploitation WHERE id IN (1, 2, 3, 4, 5, 6, 7, 8, 9, 10);


INSERT INTO TypeDeVin (id, nom, couleur, millesime, teneurAlcool, aromes, dureeGarde, temperatureService, description, regionViticole, prixMoyen, volumeProduction) VALUES 
(1, 'Margaux', 'Rouge', 2015, 13.5, 'Cassis, Cerise', 20, 16.0, 'Un vin exceptionnnel et connu provenant de Bordeaux', 'Bordeaux', 250.0, 200000.0),
(2, 'Romanée-Conti', 'Rouge', 2014, 14.0, 'Cassis, Cerise, Truffe', 25, 16.0, 'Un vin faisant partie du terroir et de la culture bourguignonne', 'Bourgogne', 12000.0, 120000.0),
(3, 'Chardonnay Grand Cru', 'Blanc', 2017, 13.5, 'Pomme, Agrumes', 15, 12.0, 'Un grand cru de Bourgogne', 'Bourgogne', 500.0, 50000.0),
(4, 'Pomerol', 'Rouge', 2016, 14.5, 'Cerise, Truffe', 20, 16.0, 'Un vin prestigieux de Pomerol', 'Pomerol', 600.0, 70000.0),
(5, 'Sauternes', 'Blanc', 2018, 12.0, 'Miel, Abricot', 30, 10.0, 'Un vin doux de Sauternes', 'Sauternes', 300.0, 80000.0),
(6, 'Riesling Grand Cru', 'Blanc', 2019, 12.5, 'Abricot, Miel', 25, 10.0, 'Un riesling exceptionnel d’Alsace', 'Alsace', 250.0, 70000.0),
(7, 'Syrah de Rhône', 'Rouge', 2015, 14.0, 'Poivre, Mûre', 18, 16.0, 'Un syrah typique du Rhône', 'Rhône', 150.0, 50000.0),
(8, 'Grenache du Sud', 'Rouge', 2017, 13.8, 'Fraise, Épices', 20, 15.0, 'Un grenache du sud de la France', 'Sud', 100.0, 55000.0),
(9, 'Pinot Noir', 'Rouge', 2016, 13.0, 'Fraise, Épices', 15, 14.0, 'Un pinot noir délicat', 'Bourgogne', 180.0, 60000.0),
(10, 'Tempranillo Reserva', 'Rouge', 2018, 14.2, 'Cerise, Tabac', 22, 16.0, 'Un tempranillo vieilli en fût', 'Espagne', 220.0, 70000.0);


INSERT INTO appelation (id, nomAppelation, anneeCreation, lieu) VALUES 
(1, 'AOC Bordeaux', 1936, 'Bordeaux'),
(2, 'AOC Bourgogne', 1937, 'Bourgogne'),
(3, 'AOC Champagne', 1911, 'Champagne'),
(4, 'AOC Côtes du Rhône', 1937, 'Rhône'),
(5, 'AOC Chablis', 1955, 'Chablis'),
(6, 'AOC Alsace', 1962, 'Alsace'),
(7, 'AOC Sauternes', 1850, 'Sauternes'),
(8, 'AOC Pomerol', 1900, 'Pomerol'),
(9, 'AOC Saint-Émilion', 1954, 'Saint-Émilion'),
(10, 'AOC Languedoc', 1985, 'Languedoc');



INSERT INTO cepage (id, nom, couleur, caracteristiquesGustatives, regionOrigine, tauxSucre, acidite, potentielGarde, rendement, temperatureOptimale, resistanceMaladies, aromesTypiques, alcoolPotentiel, descriptif) VALUES 
(1, 'Cabernet Sauvignon', 'Rouge', 'Notes de cassis, cerise, poivre', 'Bordeaux', 5.0, 3.2, 15, 50.0, 15.0, 'Bonne', 'Cassis, cerise, poivre', 14.0, 'Cepage rouge classique de Bordeaux'),
(2, 'Chardonnay', 'Blanc', 'Notes de pomme, agrumes, beurre', 'Bourgogne', 6.5, 3.3, 10, 60.0, 12.0, 'Bonne', 'Pomme, agrumes, beurre', 13.5, 'Cepage blanc polyvalent originaire de Bourgogne'),
(3, 'Sauvignon Blanc', 'Blanc', 'Notes de pamplemousse, herbe', 'Loire', 5.5, 3.4, 8, 55.0, 14.0, 'Très bonne', 'Pamplemousse, herbe', 12.5, 'Cepage aromatique du Val de Loire'),
(4, 'Merlot', 'Rouge', 'Notes de prune, cerise', 'Bordeaux', 6.0, 3.1, 12, 45.0, 16.0, 'Bonne', 'Prune, cerise', 13.8, 'Cepage souple et fruité de Bordeaux'),
(5, 'Pinot Noir', 'Rouge', 'Notes de fraise, épices', 'Bourgogne', 5.5, 3.5, 10, 40.0, 13.0, 'Bonne', 'Fraise, épices', 14.0, 'Cepage délicat du Bourgogne'),
(6, 'Syrah', 'Rouge', 'Notes de poivre, mûre', 'Rhône', 5.5, 3.3, 15, 50.0, 15.0, 'Très bonne', 'Poivre, mûre', 14.2, 'Cepage puissant du Rhône'),
(7, 'Grenache', 'Rouge', 'Notes de fraise, épices', 'Sud', 6.0, 3.0, 12, 55.0, 17.0, 'Bonne', 'Fraise, épices', 13.5, 'Cepage important du Sud de la France'),
(8, 'Riesling', 'Blanc', 'Notes d’abricot, miel', 'Alsace', 7.0, 3.6, 20, 50.0, 12.0, 'Excellente', 'Abricot, miel', 12.0, 'Cepage aromatique d’Alsace'),
(9, 'Gewurztraminer', 'Blanc', 'Notes de lychee, épices', 'Alsace', 8.0, 3.7, 25, 45.0, 13.0, 'Excellente', 'Lychee, épices', 13.0, 'Cepage exotique d’Alsace'),
(10, 'Tempranillo', 'Rouge', 'Notes de cerise, tabac', 'Espagne', 6.0, 3.2, 18, 60.0, 14.0, 'Bonne', 'Cerise, tabac', 14.5, 'Cepage principal en Espagne');



INSERT INTO domaineExploitation (id, nomDomaine, localisationDomaine, superficie, anneeCreationDomaine, proprietaireDomaine, typeProduction, volumeProductionAnnuel, description, contact, siteWeb) VALUES 
(1, 'Château Margaux', 'Bordeaux, France', 250.0, 1572, 'Pierre Castéja', 'Vin rouge', 200000.0, 'Un des domaines les plus prestigieux de Bordeaux', 'contact@chateau-margaux.com', 'www.chateau-margaux.com'),
(2, 'Domaine de la Romanée-Conti', 'Bourgogne, France', 180.0, 1232, 'Aubert de Villaine', 'Vin rouge', 120000.0, 'Domaine légendaire de Bourgogne', 'contact@romanee-conti.com', 'www.romanee-conti.com'),
(3, 'Château d’Yquem', 'Sauternes, France', 100.0, 1593, 'Sauternes Family', 'Vin blanc', 80000.0, 'Famous for its Sauternes sweet wine', 'contact@chateau-yquem.com', 'www.chateau-yquem.com'),
(4, 'Domaine Leflaive', 'Bourgogne, France', 75.0, 1717, 'Leflaive Family', 'Vin blanc', 50000.0, 'Notable for its white Burgundy wines', 'contact@domaine-leflaive.com', 'www.domaine-leflaive.com'),
(5, 'Château Cheval Blanc', 'Saint-Émilion, France', 90.0, 1830, 'Cheval Blanc Group', 'Vin rouge', 150000.0, 'Famous for its rich and complex reds', 'contact@chateau-cheval-blanc.com', 'www.chateau-cheval-blanc.com'),
(6, 'Domaine Zind-Humbrecht', 'Alsace, France', 60.0, 1989, 'Zind-Humbrecht Family', 'Vin blanc', 70000.0, 'Known for its biodynamic practices and excellent Rieslings', 'contact@zind-humbrecht.com', 'www.zind-humbrecht.com'),
(7, 'Château Haut-Brion', 'Bordeaux, France', 120.0, 1533, 'Haut-Brion Family', 'Vin rouge', 180000.0, 'One of the five First Growths', 'contact@chateau-haut-brion.com', 'www.chateau-haut-brion.com'),
(8, 'Domaine Armand Rousseau', 'Bourgogne, France', 50.0, 1860, 'Rousseau Family', 'Vin rouge', 40000.0, 'Noted for its exceptional Pinot Noir', 'contact@domaine-armand-rousseau.com', 'www.domaine-armand-rousseau.com'),
(9, 'Château Pétrus', 'Pomerol, France', 65.0, 1840, 'Pétrus Family', 'Vin rouge', 70000.0, 'Renowned for its Merlot wines', 'contact@chateau-petrus.com', 'www.chateau-petrus.com'),
(10, 'Domaine Coche-Dury', 'Bourgogne, France', 40.0, 1950, 'Coche-Dury Family', 'Vin blanc', 30000.0, 'Famous for its white Burgundy wines', 'contact@domaine-coche-dury.com', 'www.domaine-coche-dury.com');





INSERT INTO vin (id, nom, PAYS, type_de_vin_id, appelation_id, domaine_exploitation_id, cepage_id) VALUES 
(1, 'Margaux', 'France', 1, 1, 1, 1),
(2, 'Romanée-Conti', 'France', 2, 2, 2, 2),
(3, 'Chardonnay Grand Cru', 'France', 3, 5, 4, 2),
(4, 'Pomerol', 'France', 4, 8, 9, 10),
(5, 'Sauternes', 'France', 5, 7, 3, 7),
(6, 'Riesling Grand Cru', 'France', 6, 6, 6, 8),
(7, 'Syrah de Rhône', 'France', 7, 7, 4, 6),
(8, 'Grenache du Sud', 'France', 8, 8, 10, 7),
(9, 'Pinot Noir', 'France', 9, 9, 5, 5),
(10, 'Tempranillo Reserva', 'Espagne', 10, 10, 10, 10);