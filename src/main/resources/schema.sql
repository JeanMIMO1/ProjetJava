-- Création des tables

CREATE TABLE IF NOT EXISTS appelation (
    id INT NOT NULL AUTO_INCREMENT PRIMARY KEY,
    nom_appelation VARCHAR(100),
    annee_creation INT,
    lieu VARCHAR(100)
);

CREATE TABLE IF NOT EXISTS cepage (
    id INT NOT NULL AUTO_INCREMENT PRIMARY KEY,
    nom VARCHAR(100),
    couleur VARCHAR(100),
    caracteristiques_gustatives TEXT,
    region_origine VARCHAR(100),
    taux_sucre DOUBLE,
    acidite DOUBLE,
    potentiel_garde INT,
    rendement DOUBLE,
    temperature_optimale DOUBLE,
    resistance_maladies VARCHAR(100),
    aromes_typiques TEXT,
    alcool_potentiel DOUBLE,
    descriptif VARCHAR(100)
);

CREATE TABLE IF NOT EXISTS domaine_exploitation (
    id INT NOT NULL AUTO_INCREMENT PRIMARY KEY,
    nom_domaine VARCHAR(100),
    localisation_domaine VARCHAR(100),
    superficie DOUBLE,
    annee_creation_domaine INT,
    proprietaire_domaine VARCHAR(100),
    type_production VARCHAR(100),
    volume_production_annuel DOUBLE,
    description TEXT,
    contact VARCHAR(100),
    site_web VARCHAR(100)
);

CREATE TABLE IF NOT EXISTS type_de_vin (
    id INT NOT NULL AUTO_INCREMENT PRIMARY KEY,
    nom VARCHAR(100),
    couleur VARCHAR(100),
    millesime INT,
    teneur_alcool DOUBLE,
    aromes TEXT,
    duree_garde INT,
    temperature_service DOUBLE,
    description TEXT,
    region_viticole VARCHAR(100),
    prix_moyen DOUBLE,
    volume_production DOUBLE,
    cepage_principal_id INT,
    domaine_origine_id INT,
    FOREIGN KEY (cepage_principal_id) REFERENCES cepage(id),
    FOREIGN KEY (domaine_origine_id) REFERENCES domaine_exploitation(id)
);

CREATE TABLE IF NOT EXISTS vin (
    id INT NOT NULL AUTO_INCREMENT PRIMARY KEY,
    nom VARCHAR(100),
    pays VARCHAR(100),
    type_de_vin_id INT,
    appelation_id INT,
    domaine_exploitation_id INT,
    cepage_id INT,
    FOREIGN KEY (type_de_vin_id) REFERENCES type_de_vin(id),
    FOREIGN KEY (appelation_id) REFERENCES appelation(id),
    FOREIGN KEY (domaine_exploitation_id) REFERENCES domaine_exploitation(id),
    FOREIGN KEY (cepage_id) REFERENCES cepage(id)
);

