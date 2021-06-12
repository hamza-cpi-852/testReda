package com.example.demo.model;

import java.io.Serializable;
import java.sql.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "param_flux_cre")
public class ParamFluxCre implements Serializable {

	private static final long serialVersionUID = 1L;
	
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column
	private int id;  
	@Column
	private String code_domain;
	@Column
	private String code_application;
	@Id
	@Column
	private String code_evenement;
	@Column
	private String code_structure;
	@Column
	private String code_emetteur;
	@Column
	private String a_enrichir;
	@Column
	private String a_comptabiliser;
	@Column
	private Date date_mise_prod;
	@Column
	private int etat_initial_cre;
	@Column
	private String top_evt_actif;
	@Column
	private Date date_dernier_passage;
	@Column
	private String top_aggra_cdc;
	@Column
	private String val_aggra_cdc;
	@Column
	private Date date_maj_aggra_cdc;
	@Column
	private String top_aggra_ctx;
	@Column
	private String val_aggra_ctx;
	@Column
	private Date date_maj_aggra_ctx;
	@Column
	private int position_rib;
	@Column
	private int lignes_validee;
	@Column
	private int lignes_rejetee;
	public String getCode_domain() {
		return code_domain;
	}
	public void setCode_domain(String code_domain) {
		this.code_domain = code_domain;
	}
	public String getCode_application() {
		return code_application;
	}
	public void setCode_application(String code_application) {
		this.code_application = code_application;
	}
	public String getCode_evenement() {
		return code_evenement;
	}
	public void setCode_evenement(String code_evenement) {
		this.code_evenement = code_evenement;
	}
	public String getCode_structure() {
		return code_structure;
	}
	public void setCode_structure(String code_structure) {
		this.code_structure = code_structure;
	}
	public String getCode_emetteur() {
		return code_emetteur;
	}
	public void setCode_emetteur(String code_emetteur) {
		this.code_emetteur = code_emetteur;
	}
	public String getA_enrichir() {
		return a_enrichir;
	}
	public void setA_enrichir(String a_enrichir) {
		this.a_enrichir = a_enrichir;
	}
	public String getA_comptabiliser() {
		return a_comptabiliser;
	}
	public void setA_comptabiliser(String a_comptabiliser) {
		this.a_comptabiliser = a_comptabiliser;
	}
	public Date getDate_mise_prod() {
		return date_mise_prod;
	}
	public void setDate_mise_prod(Date date_mise_prod) {
		this.date_mise_prod = date_mise_prod;
	}
	public int getEtat_initial_cre() {
		return etat_initial_cre;
	}
	public void setEtat_initial_cre(int etat_initial_cre) {
		this.etat_initial_cre = etat_initial_cre;
	}
	public String getTop_evt_actif() {
		return top_evt_actif;
	}
	public void setTop_evt_actif(String top_evt_actif) {
		this.top_evt_actif = top_evt_actif;
	}
	public Date getDate_dernier_passage() {
		return date_dernier_passage;
	}
	public void setDate_dernier_passage(Date date_dernier_passage) {
		this.date_dernier_passage = date_dernier_passage;
	}
	public String getTop_aggra_cdc() {
		return top_aggra_cdc;
	}
	public void setTop_aggra_cdc(String top_aggra_cdc) {
		this.top_aggra_cdc = top_aggra_cdc;
	}
	public String getVal_aggra_cdc() {
		return val_aggra_cdc;
	}
	public void setVal_aggra_cdc(String val_aggra_cdc) {
		this.val_aggra_cdc = val_aggra_cdc;
	}
	public Date getDate_maj_aggra_cdc() {
		return date_maj_aggra_cdc;
	}
	public void setDate_maj_aggra_cdc(Date date_maj_aggra_cdc) {
		this.date_maj_aggra_cdc = date_maj_aggra_cdc;
	}
	public String getTop_aggra_ctx() {
		return top_aggra_ctx;
	}
	public void setTop_aggra_ctx(String top_aggra_ctx) {
		this.top_aggra_ctx = top_aggra_ctx;
	}
	public String getVal_aggra_ctx() {
		return val_aggra_ctx;
	}
	public void setVal_aggra_ctx(String val_aggra_ctx) {
		this.val_aggra_ctx = val_aggra_ctx;
	}
	public Date getDate_maj_aggra_ctx() {
		return date_maj_aggra_ctx;
	}
	public void setDate_maj_aggra_ctx(Date date_maj_aggra_ctx) {
		this.date_maj_aggra_ctx = date_maj_aggra_ctx;
	}
	public int getPosition_rib() {
		return position_rib;
	}
	public void setPosition_rib(int position_rib) {
		this.position_rib = position_rib;
	}
	public int getLignes_validee() {
		return lignes_validee;
	}
	public void setLignes_validee(int lignes_validee) {
		this.lignes_validee = lignes_validee;
	}
	public int getLignes_rejetee() {
		return lignes_rejetee;
	}
	public void setLignes_rejetee(int lignes_rejetee) {
		this.lignes_rejetee = lignes_rejetee;
	}
	public ParamFluxCre(String code_domain, String code_application, String code_evenement, String code_structure,
			String code_emetteur, String a_enrichir, String a_comptabiliser, Date date_mise_prod, int etat_initial_cre,
			String top_evt_actif, Date date_dernier_passage, String top_aggra_cdc, String val_aggra_cdc,
			Date date_maj_aggra_cdc, String top_aggra_ctx, String val_aggra_ctx, Date date_maj_aggra_ctx,
			int position_rib, int lignes_validee, int lignes_rejetee) {
		super();
		this.code_domain = code_domain;
		this.code_application = code_application;
		this.code_evenement = code_evenement;
		this.code_structure = code_structure;
		this.code_emetteur = code_emetteur;
		this.a_enrichir = a_enrichir;
		this.a_comptabiliser = a_comptabiliser;
		this.date_mise_prod = date_mise_prod;
		this.etat_initial_cre = etat_initial_cre;
		this.top_evt_actif = top_evt_actif;
		this.date_dernier_passage = date_dernier_passage;
		this.top_aggra_cdc = top_aggra_cdc;
		this.val_aggra_cdc = val_aggra_cdc;
		this.date_maj_aggra_cdc = date_maj_aggra_cdc;
		this.top_aggra_ctx = top_aggra_ctx;
		this.val_aggra_ctx = val_aggra_ctx;
		this.date_maj_aggra_ctx = date_maj_aggra_ctx;
		this.position_rib = position_rib;
		this.lignes_validee = lignes_validee;
		this.lignes_rejetee = lignes_rejetee;
	}
	
	public ParamFluxCre() {
		
	}
}
