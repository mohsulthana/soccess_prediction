/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package applbo;

import java.beans.PropertyChangeListener;
import java.beans.PropertyChangeSupport;
import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.persistence.Transient;

/**
 *
 * @author muham
 */
@Entity
@Table(name = "data", catalog = "java_soccer", schema = "")
@NamedQueries({
    @NamedQuery(name = "Data.findAll", query = "SELECT d FROM Data d")
    , @NamedQuery(name = "Data.findByIdTeam", query = "SELECT d FROM Data d WHERE d.idTeam = :idTeam")
    , @NamedQuery(name = "Data.findByNamaTim", query = "SELECT d FROM Data d WHERE d.namaTim = :namaTim")
    , @NamedQuery(name = "Data.findByJlhBertanding", query = "SELECT d FROM Data d WHERE d.jlhBertanding = :jlhBertanding")
    , @NamedQuery(name = "Data.findByMenang", query = "SELECT d FROM Data d WHERE d.menang = :menang")
    , @NamedQuery(name = "Data.findByKalah", query = "SELECT d FROM Data d WHERE d.kalah = :kalah")
    , @NamedQuery(name = "Data.findBySeri", query = "SELECT d FROM Data d WHERE d.seri = :seri")
    , @NamedQuery(name = "Data.findByKekuatan", query = "SELECT d FROM Data d WHERE d.kekuatan = :kekuatan")
    , @NamedQuery(name = "Data.findByStamina", query = "SELECT d FROM Data d WHERE d.stamina = :stamina")})
public class Data implements Serializable {

    @Transient
    private PropertyChangeSupport changeSupport = new PropertyChangeSupport(this);

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "id_team")
    private Integer idTeam;
    @Basic(optional = false)
    @Column(name = "nama_tim")
    private String namaTim;
    @Basic(optional = false)
    @Column(name = "jlhBertanding")
    private int jlhBertanding;
    @Basic(optional = false)
    @Column(name = "menang")
    private int menang;
    @Basic(optional = false)
    @Column(name = "kalah")
    private int kalah;
    @Basic(optional = false)
    @Column(name = "seri")
    private int seri;
    @Basic(optional = false)
    @Column(name = "kekuatan")
    private int kekuatan;
    @Basic(optional = false)
    @Column(name = "stamina")
    private int stamina;

    public Data() {
    }

    public Data(Integer idTeam) {
        this.idTeam = idTeam;
    }

    public Data(Integer idTeam, String namaTim, int jlhBertanding, int menang, int kalah, int seri, int kekuatan, int stamina) {
        this.idTeam = idTeam;
        this.namaTim = namaTim;
        this.jlhBertanding = jlhBertanding;
        this.menang = menang;
        this.kalah = kalah;
        this.seri = seri;
        this.kekuatan = kekuatan;
        this.stamina = stamina;
    }

    public Integer getIdTeam() {
        return idTeam;
    }

    public void setIdTeam(Integer idTeam) {
        Integer oldIdTeam = this.idTeam;
        this.idTeam = idTeam;
        changeSupport.firePropertyChange("idTeam", oldIdTeam, idTeam);
    }

    public String getNamaTim() {
        return namaTim;
    }

    public void setNamaTim(String namaTim) {
        String oldNamaTim = this.namaTim;
        this.namaTim = namaTim;
        changeSupport.firePropertyChange("namaTim", oldNamaTim, namaTim);
    }

    public int getJlhBertanding() {
        return jlhBertanding;
    }

    public void setJlhBertanding(int jlhBertanding) {
        int oldJlhBertanding = this.jlhBertanding;
        this.jlhBertanding = jlhBertanding;
        changeSupport.firePropertyChange("jlhBertanding", oldJlhBertanding, jlhBertanding);
    }

    public int getMenang() {
        return menang;
    }

    public void setMenang(int menang) {
        int oldMenang = this.menang;
        this.menang = menang;
        changeSupport.firePropertyChange("menang", oldMenang, menang);
    }

    public int getKalah() {
        return kalah;
    }

    public void setKalah(int kalah) {
        int oldKalah = this.kalah;
        this.kalah = kalah;
        changeSupport.firePropertyChange("kalah", oldKalah, kalah);
    }

    public int getSeri() {
        return seri;
    }

    public void setSeri(int seri) {
        int oldSeri = this.seri;
        this.seri = seri;
        changeSupport.firePropertyChange("seri", oldSeri, seri);
    }

    public int getKekuatan() {
        return kekuatan;
    }

    public void setKekuatan(int kekuatan) {
        int oldKekuatan = this.kekuatan;
        this.kekuatan = kekuatan;
        changeSupport.firePropertyChange("kekuatan", oldKekuatan, kekuatan);
    }

    public int getStamina() {
        return stamina;
    }

    public void setStamina(int stamina) {
        int oldStamina = this.stamina;
        this.stamina = stamina;
        changeSupport.firePropertyChange("stamina", oldStamina, stamina);
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idTeam != null ? idTeam.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Data)) {
            return false;
        }
        Data other = (Data) object;
        if ((this.idTeam == null && other.idTeam != null) || (this.idTeam != null && !this.idTeam.equals(other.idTeam))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "applbo.Data[ idTeam=" + idTeam + " ]";
    }

    public void addPropertyChangeListener(PropertyChangeListener listener) {
        changeSupport.addPropertyChangeListener(listener);
    }

    public void removePropertyChangeListener(PropertyChangeListener listener) {
        changeSupport.removePropertyChangeListener(listener);
    }
    
}
