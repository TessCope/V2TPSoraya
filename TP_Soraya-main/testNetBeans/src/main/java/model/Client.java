/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;
import jakarta.persistence.*;

/**
 *
 * @author tjcor
 */
@Entity
@Table
public class Client {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer idClient;
    private String nomClient, prenomClient, courriel,motPasse, adresse, modePaiement;

    public Client() {
    }

    public Client(Integer idClient, String nomClient, String prenomClient, String motPasse,String courriel, String adresse, String modePaiement) {
        this.idClient = idClient;
        this.nomClient = nomClient;
        this.prenomClient = prenomClient;
        this.courriel = courriel;
        this.motPasse = motPasse;
        this.adresse = adresse;
        this.modePaiement = modePaiement;

    }

    public Client(String nomClient, String prenomClient, String courriel,String motPasse, String adresse, String modePaiement) {
        this.nomClient = nomClient;
        this.prenomClient = prenomClient;
        this.courriel = courriel;
        this.motPasse = motPasse;
        this.adresse = adresse;
        this.modePaiement = modePaiement;
    }

    public Integer getIdClient() {
        return idClient;
    }

    public void setIdClient(Integer idClient) {
        this.idClient = idClient;
    }

    public String getNomClient() {
        return nomClient;
    }

    public void setNomClient(String nomClient) {
        this.nomClient = nomClient;
    }

    public String getPrenomClient() {
        return prenomClient;
    }

    public void setPrenomClient(String prenomClient) {
        this.prenomClient = prenomClient;
    }

    public String getCourriel() {
        return courriel;
    }

    public void setCourriel(String courriel) {
        this.courriel = courriel;
    }

    public String getAdresse() {
        return adresse;
    }

    public void setAdresse(String adresse) {
        this.adresse = adresse;
    }

    public String getModePaiement() {
        return modePaiement;
    }

    public void setModePaiement(String modePaiement) {
        this.modePaiement = modePaiement;
    }

    public String getMotPasse() {
        return motPasse;
    }

    public void setMotPasse(String motPasse) {
        this.motPasse = motPasse;
    }

    @Override
    public String toString() {
        return "Client{" +
                "idClient=" + idClient +
                ", nomClient='" + nomClient + '\'' +
                ", prenomClient='" + prenomClient + '\'' +
                ", courriel='" + courriel + '\'' +
                ", motPasse='" + motPasse + '\'' +
                ", adresse='" + adresse + '\'' +
                ", modePaiement='" + modePaiement + '\'' +
                '}';
    }}