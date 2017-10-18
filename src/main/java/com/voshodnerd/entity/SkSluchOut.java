/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.voshodnerd.entity;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Collection;
import java.util.Date;
import javax.persistence.Basic;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlTransient;

/**
 *
 * @author Талалаев
 */
@Entity
@Table(name = "sk_Sluch_Out", catalog = "forest_mtr_2", schema = "dbo")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "SkSluchOut.findAll", query = "SELECT s FROM SkSluchOut s"),
    @NamedQuery(name = "SkSluchOut.findById", query = "SELECT s FROM SkSluchOut s WHERE s.id = :id"),
    @NamedQuery(name = "SkSluchOut.findByIdSchetLpu", query = "SELECT s FROM SkSluchOut s WHERE s.idSchetLpu = :idSchetLpu"),
    @NamedQuery(name = "SkSluchOut.findByIdSluchFromLPU", query = "SELECT s FROM SkSluchOut s WHERE s.idSluchFromLPU = :idSluchFromLPU"),
    @NamedQuery(name = "SkSluchOut.findByDateLoad", query = "SELECT s FROM SkSluchOut s WHERE s.dateLoad = :dateLoad"),
    @NamedQuery(name = "SkSluchOut.findByNUpd", query = "SELECT s FROM SkSluchOut s WHERE s.nUpd = :nUpd"),
    @NamedQuery(name = "SkSluchOut.findByNZap", query = "SELECT s FROM SkSluchOut s WHERE s.nZap = :nZap"),
    @NamedQuery(name = "SkSluchOut.findByVpolis", query = "SELECT s FROM SkSluchOut s WHERE s.vpolis = :vpolis"),
    @NamedQuery(name = "SkSluchOut.findBySpolis", query = "SELECT s FROM SkSluchOut s WHERE s.spolis = :spolis"),
    @NamedQuery(name = "SkSluchOut.findByNpolis", query = "SELECT s FROM SkSluchOut s WHERE s.npolis = :npolis"),
    @NamedQuery(name = "SkSluchOut.findByEnp", query = "SELECT s FROM SkSluchOut s WHERE s.enp = :enp"),
    @NamedQuery(name = "SkSluchOut.findByStOkato", query = "SELECT s FROM SkSluchOut s WHERE s.stOkato = :stOkato"),
    @NamedQuery(name = "SkSluchOut.findByFam", query = "SELECT s FROM SkSluchOut s WHERE s.fam = :fam"),
    @NamedQuery(name = "SkSluchOut.findByIm", query = "SELECT s FROM SkSluchOut s WHERE s.im = :im"),
    @NamedQuery(name = "SkSluchOut.findByOt", query = "SELECT s FROM SkSluchOut s WHERE s.ot = :ot"),
    @NamedQuery(name = "SkSluchOut.findByW", query = "SELECT s FROM SkSluchOut s WHERE s.w = :w"),
    @NamedQuery(name = "SkSluchOut.findByDr", query = "SELECT s FROM SkSluchOut s WHERE s.dr = :dr"),
    @NamedQuery(name = "SkSluchOut.findByDost", query = "SELECT s FROM SkSluchOut s WHERE s.dost = :dost"),
    @NamedQuery(name = "SkSluchOut.findByFamP", query = "SELECT s FROM SkSluchOut s WHERE s.famP = :famP"),
    @NamedQuery(name = "SkSluchOut.findByImP", query = "SELECT s FROM SkSluchOut s WHERE s.imP = :imP"),
    @NamedQuery(name = "SkSluchOut.findByOtP", query = "SELECT s FROM SkSluchOut s WHERE s.otP = :otP"),
    @NamedQuery(name = "SkSluchOut.findByWP", query = "SELECT s FROM SkSluchOut s WHERE s.wP = :wP"),
    @NamedQuery(name = "SkSluchOut.findByDrP", query = "SELECT s FROM SkSluchOut s WHERE s.drP = :drP"),
    @NamedQuery(name = "SkSluchOut.findByDostP", query = "SELECT s FROM SkSluchOut s WHERE s.dostP = :dostP"),
    @NamedQuery(name = "SkSluchOut.findByMr", query = "SELECT s FROM SkSluchOut s WHERE s.mr = :mr"),
    @NamedQuery(name = "SkSluchOut.findByDoctype", query = "SELECT s FROM SkSluchOut s WHERE s.doctype = :doctype"),
    @NamedQuery(name = "SkSluchOut.findByDocser", query = "SELECT s FROM SkSluchOut s WHERE s.docser = :docser"),
    @NamedQuery(name = "SkSluchOut.findByDocnum", query = "SELECT s FROM SkSluchOut s WHERE s.docnum = :docnum"),
    @NamedQuery(name = "SkSluchOut.findBySnils", query = "SELECT s FROM SkSluchOut s WHERE s.snils = :snils"),
    @NamedQuery(name = "SkSluchOut.findByOkatog", query = "SELECT s FROM SkSluchOut s WHERE s.okatog = :okatog"),
    @NamedQuery(name = "SkSluchOut.findByOkatop", query = "SELECT s FROM SkSluchOut s WHERE s.okatop = :okatop"),
    @NamedQuery(name = "SkSluchOut.findByNovor", query = "SELECT s FROM SkSluchOut s WHERE s.novor = :novor"),
    @NamedQuery(name = "SkSluchOut.findByVnovD", query = "SELECT s FROM SkSluchOut s WHERE s.vnovD = :vnovD"),
    @NamedQuery(name = "SkSluchOut.findByComentp", query = "SELECT s FROM SkSluchOut s WHERE s.comentp = :comentp"),
    @NamedQuery(name = "SkSluchOut.findByIdcase", query = "SELECT s FROM SkSluchOut s WHERE s.idcase = :idcase"),
    @NamedQuery(name = "SkSluchOut.findByUslOk", query = "SELECT s FROM SkSluchOut s WHERE s.uslOk = :uslOk"),
    @NamedQuery(name = "SkSluchOut.findByVidpom", query = "SELECT s FROM SkSluchOut s WHERE s.vidpom = :vidpom"),
    @NamedQuery(name = "SkSluchOut.findByForPom", query = "SELECT s FROM SkSluchOut s WHERE s.forPom = :forPom"),
    @NamedQuery(name = "SkSluchOut.findByVidHmp", query = "SELECT s FROM SkSluchOut s WHERE s.vidHmp = :vidHmp"),
    @NamedQuery(name = "SkSluchOut.findByMetodHmp", query = "SELECT s FROM SkSluchOut s WHERE s.metodHmp = :metodHmp"),
    @NamedQuery(name = "SkSluchOut.findByExtr", query = "SELECT s FROM SkSluchOut s WHERE s.extr = :extr"),
    @NamedQuery(name = "SkSluchOut.findByLpu", query = "SELECT s FROM SkSluchOut s WHERE s.lpu = :lpu"),
    @NamedQuery(name = "SkSluchOut.findByProfil", query = "SELECT s FROM SkSluchOut s WHERE s.profil = :profil"),
    @NamedQuery(name = "SkSluchOut.findByDet", query = "SELECT s FROM SkSluchOut s WHERE s.det = :det"),
    @NamedQuery(name = "SkSluchOut.findByNhistory", query = "SELECT s FROM SkSluchOut s WHERE s.nhistory = :nhistory"),
    @NamedQuery(name = "SkSluchOut.findByDate1", query = "SELECT s FROM SkSluchOut s WHERE s.date1 = :date1"),
    @NamedQuery(name = "SkSluchOut.findByDate2", query = "SELECT s FROM SkSluchOut s WHERE s.date2 = :date2"),
    @NamedQuery(name = "SkSluchOut.findByDs0", query = "SELECT s FROM SkSluchOut s WHERE s.ds0 = :ds0"),
    @NamedQuery(name = "SkSluchOut.findByDs1", query = "SELECT s FROM SkSluchOut s WHERE s.ds1 = :ds1"),
    @NamedQuery(name = "SkSluchOut.findByDs2", query = "SELECT s FROM SkSluchOut s WHERE s.ds2 = :ds2"),
    @NamedQuery(name = "SkSluchOut.findByDs3", query = "SELECT s FROM SkSluchOut s WHERE s.ds3 = :ds3"),
    @NamedQuery(name = "SkSluchOut.findByVnovM", query = "SELECT s FROM SkSluchOut s WHERE s.vnovM = :vnovM"),
    @NamedQuery(name = "SkSluchOut.findByCodeMes1", query = "SELECT s FROM SkSluchOut s WHERE s.codeMes1 = :codeMes1"),
    @NamedQuery(name = "SkSluchOut.findByCodeMes2", query = "SELECT s FROM SkSluchOut s WHERE s.codeMes2 = :codeMes2"),
    @NamedQuery(name = "SkSluchOut.findByRslt", query = "SELECT s FROM SkSluchOut s WHERE s.rslt = :rslt"),
    @NamedQuery(name = "SkSluchOut.findByIshod", query = "SELECT s FROM SkSluchOut s WHERE s.ishod = :ishod"),
    @NamedQuery(name = "SkSluchOut.findByPrvs", query = "SELECT s FROM SkSluchOut s WHERE s.prvs = :prvs"),
    @NamedQuery(name = "SkSluchOut.findByVersSpec", query = "SELECT s FROM SkSluchOut s WHERE s.versSpec = :versSpec"),
    @NamedQuery(name = "SkSluchOut.findByIdsp", query = "SELECT s FROM SkSluchOut s WHERE s.idsp = :idsp"),
    @NamedQuery(name = "SkSluchOut.findByEdCol", query = "SELECT s FROM SkSluchOut s WHERE s.edCol = :edCol"),
    @NamedQuery(name = "SkSluchOut.findByTarif", query = "SELECT s FROM SkSluchOut s WHERE s.tarif = :tarif"),
    @NamedQuery(name = "SkSluchOut.findBySumv", query = "SELECT s FROM SkSluchOut s WHERE s.sumv = :sumv"),
    @NamedQuery(name = "SkSluchOut.findByOplata", query = "SELECT s FROM SkSluchOut s WHERE s.oplata = :oplata"),
    @NamedQuery(name = "SkSluchOut.findBySump", query = "SELECT s FROM SkSluchOut s WHERE s.sump = :sump"),
    @NamedQuery(name = "SkSluchOut.findBySankIt", query = "SELECT s FROM SkSluchOut s WHERE s.sankIt = :sankIt"),
    @NamedQuery(name = "SkSluchOut.findByComentsl", query = "SELECT s FROM SkSluchOut s WHERE s.comentsl = :comentsl"),
    @NamedQuery(name = "SkSluchOut.findByIdcaseOut", query = "SELECT s FROM SkSluchOut s WHERE s.idcaseOut = :idcaseOut"),
    @NamedQuery(name = "SkSluchOut.findByIdUser", query = "SELECT s FROM SkSluchOut s WHERE s.idUser = :idUser"),
    @NamedQuery(name = "SkSluchOut.findByOplataTF", query = "SELECT s FROM SkSluchOut s WHERE s.oplataTF = :oplataTF"),
    @NamedQuery(name = "SkSluchOut.findBySankItTf", query = "SELECT s FROM SkSluchOut s WHERE s.sankItTf = :sankItTf"),
    @NamedQuery(name = "SkSluchOut.findByCheckedMEK", query = "SELECT s FROM SkSluchOut s WHERE s.checkedMEK = :checkedMEK"),
    @NamedQuery(name = "SkSluchOut.findByCheckedMEE", query = "SELECT s FROM SkSluchOut s WHERE s.checkedMEE = :checkedMEE"),
    @NamedQuery(name = "SkSluchOut.findByCheckedEKMP", query = "SELECT s FROM SkSluchOut s WHERE s.checkedEKMP = :checkedEKMP"),
    @NamedQuery(name = "SkSluchOut.findByOtbor", query = "SELECT s FROM SkSluchOut s WHERE s.otbor = :otbor")})
public class SkSluchOut implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Column(name = "Id")
    private Integer id;
    @Column(name = "Id_Schet_Lpu")
    private Integer idSchetLpu;
    @Basic(optional = false)
    @NotNull
    @Column(name = "Id_Sluch_From_LPU")
    private int idSluchFromLPU;
    @Basic(optional = false)
    @NotNull
    @Column(name = "DateLoad")
    @Temporal(TemporalType.DATE)
    private Date dateLoad;
    @Basic(optional = false)
    @NotNull
    @Column(name = "N_Upd")
    private int nUpd;
    @Basic(optional = false)
    @NotNull
    @Column(name = "N_Zap")
    private int nZap;
    @Basic(optional = false)
    @NotNull
    @Column(name = "Vpolis")
    private short vpolis;
    @Size(max = 10)
    @Column(name = "Spolis")
    private String spolis;
    @Size(max = 20)
    @Column(name = "Npolis")
    private String npolis;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 16)
    @Column(name = "ENP")
    private String enp;
    @Size(max = 5)
    @Column(name = "ST_OKATO")
    private String stOkato;
    @Size(max = 40)
    @Column(name = "FAM")
    private String fam;
    @Size(max = 40)
    @Column(name = "IM")
    private String im;
    @Size(max = 40)
    @Column(name = "OT")
    private String ot;
    @Basic(optional = false)
    @NotNull
    @Column(name = "W")
    private short w;
    @Basic(optional = false)
    @NotNull
    @Column(name = "DR")
    @Temporal(TemporalType.DATE)
    private Date dr;
    @Size(max = 2147483647)
    @Column(name = "DOST")
    private String dost;
    @Size(max = 40)
    @Column(name = "FAM_P")
    private String famP;
    @Size(max = 40)
    @Column(name = "IM_P")
    private String imP;
    @Size(max = 40)
    @Column(name = "OT_P")
    private String otP;
    @Column(name = "W_P")
    private Short wP;
    @Column(name = "DR_P")
    @Temporal(TemporalType.DATE)
    private Date drP;
    @Size(max = 2147483647)
    @Column(name = "DOST_P")
    private String dostP;
    @Size(max = 100)
    @Column(name = "MR")
    private String mr;
    @Column(name = "DOCTYPE")
    private Short doctype;
    @Size(max = 10)
    @Column(name = "DOCSER")
    private String docser;
    @Size(max = 20)
    @Column(name = "DOCNUM")
    private String docnum;
    @Size(max = 14)
    @Column(name = "SNILS")
    private String snils;
    @Size(max = 11)
    @Column(name = "OKATOG")
    private String okatog;
    @Size(max = 11)
    @Column(name = "OKATOP")
    private String okatop;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 9)
    @Column(name = "NOVOR")
    private String novor;
    @Column(name = "VNOV_D")
    private Short vnovD;
    @Size(max = 250)
    @Column(name = "COMENTP")
    private String comentp;
    @Basic(optional = false)
    @NotNull
    @Column(name = "IDCASE")
    private long idcase;
    @Basic(optional = false)
    @NotNull
    @Column(name = "USL_OK")
    private short uslOk;
    @Basic(optional = false)
    @NotNull
    @Column(name = "VIDPOM")
    private short vidpom;
    @Basic(optional = false)
    @NotNull
    @Column(name = "FOR_POM")
    private short forPom;
    @Size(max = 9)
    @Column(name = "VID_HMP")
    private String vidHmp;
    @Column(name = "METOD_HMP")
    private Short metodHmp;
    @Column(name = "EXTR")
    private Short extr;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 6)
    @Column(name = "LPU")
    private String lpu;
    @Column(name = "PROFIL")
    private Short profil;
    @Column(name = "DET")
    private Short det;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 50)
    @Column(name = "NHISTORY")
    private String nhistory;
    @Basic(optional = false)
    @NotNull
    @Column(name = "DATE_1")
    @Temporal(TemporalType.DATE)
    private Date date1;
    @Basic(optional = false)
    @NotNull
    @Column(name = "DATE_2")
    @Temporal(TemporalType.DATE)
    private Date date2;
    @Size(max = 10)
    @Column(name = "DS0")
    private String ds0;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 10)
    @Column(name = "DS1")
    private String ds1;
    @Size(max = 2147483647)
    @Column(name = "DS2")
    private String ds2;
    @Size(max = 2147483647)
    @Column(name = "DS3")
    private String ds3;
    @Size(max = 2147483647)
    @Column(name = "VNOV_M")
    private String vnovM;
    @Size(max = 2147483647)
    @Column(name = "CODE_MES1")
    private String codeMes1;
    @Size(max = 20)
    @Column(name = "CODE_MES2")
    private String codeMes2;
    @Column(name = "RSLT")
    private Short rslt;
    @Column(name = "ISHOD")
    private Short ishod;
    @Column(name = "PRVS")
    private Integer prvs;
    @Size(max = 4)
    @Column(name = "VERS_SPEC")
    private String versSpec;
    @Basic(optional = false)
    @NotNull
    @Column(name = "IDSP")
    private short idsp;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Column(name = "ED_COL")
    private BigDecimal edCol;
    @Column(name = "TARIF")
    private BigDecimal tarif;
    @Basic(optional = false)
    @NotNull
    @Column(name = "SUMV")
    private BigDecimal sumv;
    @Column(name = "OPLATA")
    private Short oplata;
    @Column(name = "SUMP")
    private BigDecimal sump;
    @Column(name = "SANK_IT")
    private BigDecimal sankIt;
    @Size(max = 250)
    @Column(name = "COMENTSL")
    private String comentsl;
    @Column(name = "IDCASE_OUT")
    private Integer idcaseOut;
    @Column(name = "Id_User")
    private Integer idUser;
    @Column(name = "Oplata_TF")
    private Short oplataTF;
    @Column(name = "SANK_IT_TF")
    private BigDecimal sankItTf;
    @Column(name = "Checked_MEK")
    private Boolean checkedMEK;
    @Column(name = "Checked_MEE")
    private Boolean checkedMEE;
    @Column(name = "Checked_EKMP")
    private Boolean checkedEKMP;
    @Column(name = "Otbor")
    private Boolean otbor;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "idSluch")
    private Collection<UslOut> uslOutCollection;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "idSluch")
    private Collection<SanktionOut> sanktionOutCollection;
    @JoinColumn(name = "Id_Schet_To_TF", referencedColumnName = "ID")
    @ManyToOne
    private JOutSchet idSchetToTF;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "idSluchOut")
    private Collection<SlAnswers> slAnswersCollection;

    public SkSluchOut() {
    }

    public SkSluchOut(Integer id) {
        this.id = id;
    }

    public SkSluchOut(Integer id, int idSluchFromLPU, Date dateLoad, int nUpd, int nZap, short vpolis, String enp, short w, Date dr, String novor, long idcase, short uslOk, short vidpom, short forPom, String lpu, String nhistory, Date date1, Date date2, String ds1, short idsp, BigDecimal sumv) {
        this.id = id;
        this.idSluchFromLPU = idSluchFromLPU;
        this.dateLoad = dateLoad;
        this.nUpd = nUpd;
        this.nZap = nZap;
        this.vpolis = vpolis;
        this.enp = enp;
        this.w = w;
        this.dr = dr;
        this.novor = novor;
        this.idcase = idcase;
        this.uslOk = uslOk;
        this.vidpom = vidpom;
        this.forPom = forPom;
        this.lpu = lpu;
        this.nhistory = nhistory;
        this.date1 = date1;
        this.date2 = date2;
        this.ds1 = ds1;
        this.idsp = idsp;
        this.sumv = sumv;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getIdSchetLpu() {
        return idSchetLpu;
    }

    public void setIdSchetLpu(Integer idSchetLpu) {
        this.idSchetLpu = idSchetLpu;
    }

    public int getIdSluchFromLPU() {
        return idSluchFromLPU;
    }

    public void setIdSluchFromLPU(int idSluchFromLPU) {
        this.idSluchFromLPU = idSluchFromLPU;
    }

    public Date getDateLoad() {
        return dateLoad;
    }

    public void setDateLoad(Date dateLoad) {
        this.dateLoad = dateLoad;
    }

    public int getNUpd() {
        return nUpd;
    }

    public void setNUpd(int nUpd) {
        this.nUpd = nUpd;
    }

    public int getNZap() {
        return nZap;
    }

    public void setNZap(int nZap) {
        this.nZap = nZap;
    }

    public short getVpolis() {
        return vpolis;
    }

    public void setVpolis(short vpolis) {
        this.vpolis = vpolis;
    }

    public String getSpolis() {
        return spolis;
    }

    public void setSpolis(String spolis) {
        this.spolis = spolis;
    }

    public String getNpolis() {
        return npolis;
    }

    public void setNpolis(String npolis) {
        this.npolis = npolis;
    }

    public String getEnp() {
        return enp;
    }

    public void setEnp(String enp) {
        this.enp = enp;
    }

    public String getStOkato() {
        return stOkato;
    }

    public void setStOkato(String stOkato) {
        this.stOkato = stOkato;
    }

    public String getFam() {
        return fam;
    }

    public void setFam(String fam) {
        this.fam = fam;
    }

    public String getIm() {
        return im;
    }

    public void setIm(String im) {
        this.im = im;
    }

    public String getOt() {
        return ot;
    }

    public void setOt(String ot) {
        this.ot = ot;
    }

    public short getW() {
        return w;
    }

    public void setW(short w) {
        this.w = w;
    }

    public Date getDr() {
        return dr;
    }

    public void setDr(Date dr) {
        this.dr = dr;
    }

    public String getDost() {
        return dost;
    }

    public void setDost(String dost) {
        this.dost = dost;
    }

    public String getFamP() {
        return famP;
    }

    public void setFamP(String famP) {
        this.famP = famP;
    }

    public String getImP() {
        return imP;
    }

    public void setImP(String imP) {
        this.imP = imP;
    }

    public String getOtP() {
        return otP;
    }

    public void setOtP(String otP) {
        this.otP = otP;
    }

    public Short getWP() {
        return wP;
    }

    public void setWP(Short wP) {
        this.wP = wP;
    }

    public Date getDrP() {
        return drP;
    }

    public void setDrP(Date drP) {
        this.drP = drP;
    }

    public String getDostP() {
        return dostP;
    }

    public void setDostP(String dostP) {
        this.dostP = dostP;
    }

    public String getMr() {
        return mr;
    }

    public void setMr(String mr) {
        this.mr = mr;
    }

    public Short getDoctype() {
        return doctype;
    }

    public void setDoctype(Short doctype) {
        this.doctype = doctype;
    }

    public String getDocser() {
        return docser;
    }

    public void setDocser(String docser) {
        this.docser = docser;
    }

    public String getDocnum() {
        return docnum;
    }

    public void setDocnum(String docnum) {
        this.docnum = docnum;
    }

    public String getSnils() {
        return snils;
    }

    public void setSnils(String snils) {
        this.snils = snils;
    }

    public String getOkatog() {
        return okatog;
    }

    public void setOkatog(String okatog) {
        this.okatog = okatog;
    }

    public String getOkatop() {
        return okatop;
    }

    public void setOkatop(String okatop) {
        this.okatop = okatop;
    }

    public String getNovor() {
        return novor;
    }

    public void setNovor(String novor) {
        this.novor = novor;
    }

    public Short getVnovD() {
        return vnovD;
    }

    public void setVnovD(Short vnovD) {
        this.vnovD = vnovD;
    }

    public String getComentp() {
        return comentp;
    }

    public void setComentp(String comentp) {
        this.comentp = comentp;
    }

    public long getIdcase() {
        return idcase;
    }

    public void setIdcase(long idcase) {
        this.idcase = idcase;
    }

    public short getUslOk() {
        return uslOk;
    }

    public void setUslOk(short uslOk) {
        this.uslOk = uslOk;
    }

    public short getVidpom() {
        return vidpom;
    }

    public void setVidpom(short vidpom) {
        this.vidpom = vidpom;
    }

    public short getForPom() {
        return forPom;
    }

    public void setForPom(short forPom) {
        this.forPom = forPom;
    }

    public String getVidHmp() {
        return vidHmp;
    }

    public void setVidHmp(String vidHmp) {
        this.vidHmp = vidHmp;
    }

    public Short getMetodHmp() {
        return metodHmp;
    }

    public void setMetodHmp(Short metodHmp) {
        this.metodHmp = metodHmp;
    }

    public Short getExtr() {
        return extr;
    }

    public void setExtr(Short extr) {
        this.extr = extr;
    }

    public String getLpu() {
        return lpu;
    }

    public void setLpu(String lpu) {
        this.lpu = lpu;
    }

    public Short getProfil() {
        return profil;
    }

    public void setProfil(Short profil) {
        this.profil = profil;
    }

    public Short getDet() {
        return det;
    }

    public void setDet(Short det) {
        this.det = det;
    }

    public String getNhistory() {
        return nhistory;
    }

    public void setNhistory(String nhistory) {
        this.nhistory = nhistory;
    }

    public Date getDate1() {
        return date1;
    }

    public void setDate1(Date date1) {
        this.date1 = date1;
    }

    public Date getDate2() {
        return date2;
    }

    public void setDate2(Date date2) {
        this.date2 = date2;
    }

    public String getDs0() {
        return ds0;
    }

    public void setDs0(String ds0) {
        this.ds0 = ds0;
    }

    public String getDs1() {
        return ds1;
    }

    public void setDs1(String ds1) {
        this.ds1 = ds1;
    }

    public String getDs2() {
        return ds2;
    }

    public void setDs2(String ds2) {
        this.ds2 = ds2;
    }

    public String getDs3() {
        return ds3;
    }

    public void setDs3(String ds3) {
        this.ds3 = ds3;
    }

    public String getVnovM() {
        return vnovM;
    }

    public void setVnovM(String vnovM) {
        this.vnovM = vnovM;
    }

    public String getCodeMes1() {
        return codeMes1;
    }

    public void setCodeMes1(String codeMes1) {
        this.codeMes1 = codeMes1;
    }

    public String getCodeMes2() {
        return codeMes2;
    }

    public void setCodeMes2(String codeMes2) {
        this.codeMes2 = codeMes2;
    }

    public Short getRslt() {
        return rslt;
    }

    public void setRslt(Short rslt) {
        this.rslt = rslt;
    }

    public Short getIshod() {
        return ishod;
    }

    public void setIshod(Short ishod) {
        this.ishod = ishod;
    }

    public Integer getPrvs() {
        return prvs;
    }

    public void setPrvs(Integer prvs) {
        this.prvs = prvs;
    }

    public String getVersSpec() {
        return versSpec;
    }

    public void setVersSpec(String versSpec) {
        this.versSpec = versSpec;
    }

    public short getIdsp() {
        return idsp;
    }

    public void setIdsp(short idsp) {
        this.idsp = idsp;
    }

    public BigDecimal getEdCol() {
        return edCol;
    }

    public void setEdCol(BigDecimal edCol) {
        this.edCol = edCol;
    }

    public BigDecimal getTarif() {
        return tarif;
    }

    public void setTarif(BigDecimal tarif) {
        this.tarif = tarif;
    }

    public BigDecimal getSumv() {
        return sumv;
    }

    public void setSumv(BigDecimal sumv) {
        this.sumv = sumv;
    }

    public Short getOplata() {
        return oplata;
    }

    public void setOplata(Short oplata) {
        this.oplata = oplata;
    }

    public BigDecimal getSump() {
        return sump;
    }

    public void setSump(BigDecimal sump) {
        this.sump = sump;
    }

    public BigDecimal getSankIt() {
        return sankIt;
    }

    public void setSankIt(BigDecimal sankIt) {
        this.sankIt = sankIt;
    }

    public String getComentsl() {
        return comentsl;
    }

    public void setComentsl(String comentsl) {
        this.comentsl = comentsl;
    }

    public Integer getIdcaseOut() {
        return idcaseOut;
    }

    public void setIdcaseOut(Integer idcaseOut) {
        this.idcaseOut = idcaseOut;
    }

    public Integer getIdUser() {
        return idUser;
    }

    public void setIdUser(Integer idUser) {
        this.idUser = idUser;
    }

    public Short getOplataTF() {
        return oplataTF;
    }

    public void setOplataTF(Short oplataTF) {
        this.oplataTF = oplataTF;
    }

    public BigDecimal getSankItTf() {
        return sankItTf;
    }

    public void setSankItTf(BigDecimal sankItTf) {
        this.sankItTf = sankItTf;
    }

    public Boolean getCheckedMEK() {
        return checkedMEK;
    }

    public void setCheckedMEK(Boolean checkedMEK) {
        this.checkedMEK = checkedMEK;
    }

    public Boolean getCheckedMEE() {
        return checkedMEE;
    }

    public void setCheckedMEE(Boolean checkedMEE) {
        this.checkedMEE = checkedMEE;
    }

    public Boolean getCheckedEKMP() {
        return checkedEKMP;
    }

    public void setCheckedEKMP(Boolean checkedEKMP) {
        this.checkedEKMP = checkedEKMP;
    }

    public Boolean getOtbor() {
        return otbor;
    }

    public void setOtbor(Boolean otbor) {
        this.otbor = otbor;
    }

    @XmlTransient
    public Collection<UslOut> getUslOutCollection() {
        return uslOutCollection;
    }

    public void setUslOutCollection(Collection<UslOut> uslOutCollection) {
        this.uslOutCollection = uslOutCollection;
    }

    @XmlTransient
    public Collection<SanktionOut> getSanktionOutCollection() {
        return sanktionOutCollection;
    }

    public void setSanktionOutCollection(Collection<SanktionOut> sanktionOutCollection) {
        this.sanktionOutCollection = sanktionOutCollection;
    }

    public JOutSchet getIdSchetToTF() {
        return idSchetToTF;
    }

    public void setIdSchetToTF(JOutSchet idSchetToTF) {
        this.idSchetToTF = idSchetToTF;
    }

    @XmlTransient
    public Collection<SlAnswers> getSlAnswersCollection() {
        return slAnswersCollection;
    }

    public void setSlAnswersCollection(Collection<SlAnswers> slAnswersCollection) {
        this.slAnswersCollection = slAnswersCollection;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (id != null ? id.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof SkSluchOut)) {
            return false;
        }
        SkSluchOut other = (SkSluchOut) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.voshodnerd.entity.SkSluchOut[ id=" + id + " ]";
    }
    
}
