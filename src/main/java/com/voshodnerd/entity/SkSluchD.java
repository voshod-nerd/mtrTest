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
@Table(name = "sk_Sluch_D", catalog = "forest_mtr_2", schema = "dbo")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "SkSluchD.findAll", query = "SELECT s FROM SkSluchD s"),
    @NamedQuery(name = "SkSluchD.findById", query = "SELECT s FROM SkSluchD s WHERE s.id = :id"),
    @NamedQuery(name = "SkSluchD.findByIdSchetLpu", query = "SELECT s FROM SkSluchD s WHERE s.idSchetLpu = :idSchetLpu"),
    @NamedQuery(name = "SkSluchD.findByDateLoad", query = "SELECT s FROM SkSluchD s WHERE s.dateLoad = :dateLoad"),
    @NamedQuery(name = "SkSluchD.findByIdSluch", query = "SELECT s FROM SkSluchD s WHERE s.idSluch = :idSluch"),
    @NamedQuery(name = "SkSluchD.findByNUpd", query = "SELECT s FROM SkSluchD s WHERE s.nUpd = :nUpd"),
    @NamedQuery(name = "SkSluchD.findByNZap", query = "SELECT s FROM SkSluchD s WHERE s.nZap = :nZap"),
    @NamedQuery(name = "SkSluchD.findByPrNov", query = "SELECT s FROM SkSluchD s WHERE s.prNov = :prNov"),
    @NamedQuery(name = "SkSluchD.findByVpolis", query = "SELECT s FROM SkSluchD s WHERE s.vpolis = :vpolis"),
    @NamedQuery(name = "SkSluchD.findBySpolis", query = "SELECT s FROM SkSluchD s WHERE s.spolis = :spolis"),
    @NamedQuery(name = "SkSluchD.findByNpolis", query = "SELECT s FROM SkSluchD s WHERE s.npolis = :npolis"),
    @NamedQuery(name = "SkSluchD.findByEnp", query = "SELECT s FROM SkSluchD s WHERE s.enp = :enp"),
    @NamedQuery(name = "SkSluchD.findByStOkato", query = "SELECT s FROM SkSluchD s WHERE s.stOkato = :stOkato"),
    @NamedQuery(name = "SkSluchD.findBySmo", query = "SELECT s FROM SkSluchD s WHERE s.smo = :smo"),
    @NamedQuery(name = "SkSluchD.findBySmoOgrn", query = "SELECT s FROM SkSluchD s WHERE s.smoOgrn = :smoOgrn"),
    @NamedQuery(name = "SkSluchD.findBySmoOk", query = "SELECT s FROM SkSluchD s WHERE s.smoOk = :smoOk"),
    @NamedQuery(name = "SkSluchD.findBySmoNam", query = "SELECT s FROM SkSluchD s WHERE s.smoNam = :smoNam"),
    @NamedQuery(name = "SkSluchD.findByNovor", query = "SELECT s FROM SkSluchD s WHERE s.novor = :novor"),
    @NamedQuery(name = "SkSluchD.findByVnovD", query = "SELECT s FROM SkSluchD s WHERE s.vnovD = :vnovD"),
    @NamedQuery(name = "SkSluchD.findByFam", query = "SELECT s FROM SkSluchD s WHERE s.fam = :fam"),
    @NamedQuery(name = "SkSluchD.findByIm", query = "SELECT s FROM SkSluchD s WHERE s.im = :im"),
    @NamedQuery(name = "SkSluchD.findByOt", query = "SELECT s FROM SkSluchD s WHERE s.ot = :ot"),
    @NamedQuery(name = "SkSluchD.findByW", query = "SELECT s FROM SkSluchD s WHERE s.w = :w"),
    @NamedQuery(name = "SkSluchD.findByDr", query = "SELECT s FROM SkSluchD s WHERE s.dr = :dr"),
    @NamedQuery(name = "SkSluchD.findByDost", query = "SELECT s FROM SkSluchD s WHERE s.dost = :dost"),
    @NamedQuery(name = "SkSluchD.findByFamP", query = "SELECT s FROM SkSluchD s WHERE s.famP = :famP"),
    @NamedQuery(name = "SkSluchD.findByImP", query = "SELECT s FROM SkSluchD s WHERE s.imP = :imP"),
    @NamedQuery(name = "SkSluchD.findByOtP", query = "SELECT s FROM SkSluchD s WHERE s.otP = :otP"),
    @NamedQuery(name = "SkSluchD.findByWP", query = "SELECT s FROM SkSluchD s WHERE s.wP = :wP"),
    @NamedQuery(name = "SkSluchD.findByDrP", query = "SELECT s FROM SkSluchD s WHERE s.drP = :drP"),
    @NamedQuery(name = "SkSluchD.findByDostP", query = "SELECT s FROM SkSluchD s WHERE s.dostP = :dostP"),
    @NamedQuery(name = "SkSluchD.findByMr", query = "SELECT s FROM SkSluchD s WHERE s.mr = :mr"),
    @NamedQuery(name = "SkSluchD.findByDoctype", query = "SELECT s FROM SkSluchD s WHERE s.doctype = :doctype"),
    @NamedQuery(name = "SkSluchD.findByDocser", query = "SELECT s FROM SkSluchD s WHERE s.docser = :docser"),
    @NamedQuery(name = "SkSluchD.findByDocnum", query = "SELECT s FROM SkSluchD s WHERE s.docnum = :docnum"),
    @NamedQuery(name = "SkSluchD.findBySnils", query = "SELECT s FROM SkSluchD s WHERE s.snils = :snils"),
    @NamedQuery(name = "SkSluchD.findByOkatog", query = "SELECT s FROM SkSluchD s WHERE s.okatog = :okatog"),
    @NamedQuery(name = "SkSluchD.findByOkatop", query = "SELECT s FROM SkSluchD s WHERE s.okatop = :okatop"),
    @NamedQuery(name = "SkSluchD.findByComentp", query = "SELECT s FROM SkSluchD s WHERE s.comentp = :comentp"),
    @NamedQuery(name = "SkSluchD.findByIdcase", query = "SELECT s FROM SkSluchD s WHERE s.idcase = :idcase"),
    @NamedQuery(name = "SkSluchD.findByUslOk", query = "SELECT s FROM SkSluchD s WHERE s.uslOk = :uslOk"),
    @NamedQuery(name = "SkSluchD.findByVidpom", query = "SELECT s FROM SkSluchD s WHERE s.vidpom = :vidpom"),
    @NamedQuery(name = "SkSluchD.findByForPom", query = "SELECT s FROM SkSluchD s WHERE s.forPom = :forPom"),
    @NamedQuery(name = "SkSluchD.findByVidHmp", query = "SELECT s FROM SkSluchD s WHERE s.vidHmp = :vidHmp"),
    @NamedQuery(name = "SkSluchD.findByMetodHmp", query = "SELECT s FROM SkSluchD s WHERE s.metodHmp = :metodHmp"),
    @NamedQuery(name = "SkSluchD.findByNprMo", query = "SELECT s FROM SkSluchD s WHERE s.nprMo = :nprMo"),
    @NamedQuery(name = "SkSluchD.findByExtr", query = "SELECT s FROM SkSluchD s WHERE s.extr = :extr"),
    @NamedQuery(name = "SkSluchD.findByLpu", query = "SELECT s FROM SkSluchD s WHERE s.lpu = :lpu"),
    @NamedQuery(name = "SkSluchD.findByLpu1", query = "SELECT s FROM SkSluchD s WHERE s.lpu1 = :lpu1"),
    @NamedQuery(name = "SkSluchD.findByPodr", query = "SELECT s FROM SkSluchD s WHERE s.podr = :podr"),
    @NamedQuery(name = "SkSluchD.findByProfil", query = "SELECT s FROM SkSluchD s WHERE s.profil = :profil"),
    @NamedQuery(name = "SkSluchD.findByDet", query = "SELECT s FROM SkSluchD s WHERE s.det = :det"),
    @NamedQuery(name = "SkSluchD.findByNhistory", query = "SELECT s FROM SkSluchD s WHERE s.nhistory = :nhistory"),
    @NamedQuery(name = "SkSluchD.findByDate1", query = "SELECT s FROM SkSluchD s WHERE s.date1 = :date1"),
    @NamedQuery(name = "SkSluchD.findByDate2", query = "SELECT s FROM SkSluchD s WHERE s.date2 = :date2"),
    @NamedQuery(name = "SkSluchD.findByDs0", query = "SELECT s FROM SkSluchD s WHERE s.ds0 = :ds0"),
    @NamedQuery(name = "SkSluchD.findByDs1", query = "SELECT s FROM SkSluchD s WHERE s.ds1 = :ds1"),
    @NamedQuery(name = "SkSluchD.findByDs2", query = "SELECT s FROM SkSluchD s WHERE s.ds2 = :ds2"),
    @NamedQuery(name = "SkSluchD.findByDs3", query = "SELECT s FROM SkSluchD s WHERE s.ds3 = :ds3"),
    @NamedQuery(name = "SkSluchD.findByVnovM", query = "SELECT s FROM SkSluchD s WHERE s.vnovM = :vnovM"),
    @NamedQuery(name = "SkSluchD.findByCodeMes1", query = "SELECT s FROM SkSluchD s WHERE s.codeMes1 = :codeMes1"),
    @NamedQuery(name = "SkSluchD.findByCodeMes2", query = "SELECT s FROM SkSluchD s WHERE s.codeMes2 = :codeMes2"),
    @NamedQuery(name = "SkSluchD.findByRslt", query = "SELECT s FROM SkSluchD s WHERE s.rslt = :rslt"),
    @NamedQuery(name = "SkSluchD.findByRsltD", query = "SELECT s FROM SkSluchD s WHERE s.rsltD = :rsltD"),
    @NamedQuery(name = "SkSluchD.findByIshod", query = "SELECT s FROM SkSluchD s WHERE s.ishod = :ishod"),
    @NamedQuery(name = "SkSluchD.findByPrvs", query = "SELECT s FROM SkSluchD s WHERE s.prvs = :prvs"),
    @NamedQuery(name = "SkSluchD.findByVersSpec", query = "SELECT s FROM SkSluchD s WHERE s.versSpec = :versSpec"),
    @NamedQuery(name = "SkSluchD.findByIddokt", query = "SELECT s FROM SkSluchD s WHERE s.iddokt = :iddokt"),
    @NamedQuery(name = "SkSluchD.findByOsSluch", query = "SELECT s FROM SkSluchD s WHERE s.osSluch = :osSluch"),
    @NamedQuery(name = "SkSluchD.findByIdsp", query = "SELECT s FROM SkSluchD s WHERE s.idsp = :idsp"),
    @NamedQuery(name = "SkSluchD.findByEdCol", query = "SELECT s FROM SkSluchD s WHERE s.edCol = :edCol"),
    @NamedQuery(name = "SkSluchD.findByTarif", query = "SELECT s FROM SkSluchD s WHERE s.tarif = :tarif"),
    @NamedQuery(name = "SkSluchD.findBySumv", query = "SELECT s FROM SkSluchD s WHERE s.sumv = :sumv"),
    @NamedQuery(name = "SkSluchD.findByOplata", query = "SELECT s FROM SkSluchD s WHERE s.oplata = :oplata"),
    @NamedQuery(name = "SkSluchD.findBySump", query = "SELECT s FROM SkSluchD s WHERE s.sump = :sump"),
    @NamedQuery(name = "SkSluchD.findBySankIt", query = "SELECT s FROM SkSluchD s WHERE s.sankIt = :sankIt"),
    @NamedQuery(name = "SkSluchD.findByComentsl", query = "SELECT s FROM SkSluchD s WHERE s.comentsl = :comentsl"),
    @NamedQuery(name = "SkSluchD.findByIdDOut", query = "SELECT s FROM SkSluchD s WHERE s.idDOut = :idDOut"),
    @NamedQuery(name = "SkSluchD.findByIdcaseOut", query = "SELECT s FROM SkSluchD s WHERE s.idcaseOut = :idcaseOut"),
    @NamedQuery(name = "SkSluchD.findByIdUser", query = "SELECT s FROM SkSluchD s WHERE s.idUser = :idUser"),
    @NamedQuery(name = "SkSluchD.findByOplataTF", query = "SELECT s FROM SkSluchD s WHERE s.oplataTF = :oplataTF"),
    @NamedQuery(name = "SkSluchD.findBySankItTf", query = "SELECT s FROM SkSluchD s WHERE s.sankItTf = :sankItTf"),
    @NamedQuery(name = "SkSluchD.findByReadyToOut", query = "SELECT s FROM SkSluchD s WHERE s.readyToOut = :readyToOut"),
    @NamedQuery(name = "SkSluchD.findByCheckedMEK", query = "SELECT s FROM SkSluchD s WHERE s.checkedMEK = :checkedMEK"),
    @NamedQuery(name = "SkSluchD.findByUserMEK", query = "SELECT s FROM SkSluchD s WHERE s.userMEK = :userMEK"),
    @NamedQuery(name = "SkSluchD.findByCheckedMEE", query = "SELECT s FROM SkSluchD s WHERE s.checkedMEE = :checkedMEE"),
    @NamedQuery(name = "SkSluchD.findByUserMEE", query = "SELECT s FROM SkSluchD s WHERE s.userMEE = :userMEE"),
    @NamedQuery(name = "SkSluchD.findByCheckedEKMP", query = "SELECT s FROM SkSluchD s WHERE s.checkedEKMP = :checkedEKMP"),
    @NamedQuery(name = "SkSluchD.findByUserEKMP", query = "SELECT s FROM SkSluchD s WHERE s.userEKMP = :userEKMP"),
    @NamedQuery(name = "SkSluchD.findByOtbor", query = "SELECT s FROM SkSluchD s WHERE s.otbor = :otbor")})
public class SkSluchD implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Column(name = "Id")
    private Integer id;
    @Basic(optional = false)
    @NotNull
    @Column(name = "Id_Schet_Lpu")
    private int idSchetLpu;
    @Basic(optional = false)
    @NotNull
    @Column(name = "DateLoad")
    @Temporal(TemporalType.DATE)
    private Date dateLoad;
    @Basic(optional = false)
    @NotNull
    @Column(name = "Id_Sluch")
    private int idSluch;
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
    @Column(name = "Pr_Nov")
    private short prNov;
    @Basic(optional = false)
    @NotNull
    @Column(name = "Vpolis")
    private short vpolis;
    @Size(max = 10)
    @Column(name = "Spolis")
    private String spolis;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 20)
    @Column(name = "Npolis")
    private String npolis;
    @Size(max = 16)
    @Column(name = "ENP")
    private String enp;
    @Size(max = 5)
    @Column(name = "ST_OKATO")
    private String stOkato;
    @Size(max = 5)
    @Column(name = "SMO")
    private String smo;
    @Size(max = 15)
    @Column(name = "SMO_OGRN")
    private String smoOgrn;
    @Size(max = 5)
    @Column(name = "SMO_OK")
    private String smoOk;
    @Size(max = 100)
    @Column(name = "SMO_NAM")
    private String smoNam;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 9)
    @Column(name = "NOVOR")
    private String novor;
    @Column(name = "VNOV_D")
    private Short vnovD;
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
    @Column(name = "FOR_POM")
    private Short forPom;
    @Size(max = 9)
    @Column(name = "VID_HMP")
    private String vidHmp;
    @Column(name = "METOD_HMP")
    private Short metodHmp;
    @Size(max = 6)
    @Column(name = "NPR_MO")
    private String nprMo;
    @Column(name = "EXTR")
    private Short extr;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 6)
    @Column(name = "LPU")
    private String lpu;
    @Size(max = 8)
    @Column(name = "LPU_1")
    private String lpu1;
    @Column(name = "PODR")
    private Integer podr;
    @Basic(optional = false)
    @NotNull
    @Column(name = "PROFIL")
    private short profil;
    @Basic(optional = false)
    @NotNull
    @Column(name = "DET")
    private short det;
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
    @Column(name = "RSLT_D")
    private Short rsltD;
    @Column(name = "ISHOD")
    private Short ishod;
    @Basic(optional = false)
    @NotNull
    @Column(name = "PRVS")
    private int prvs;
    @Size(max = 4)
    @Column(name = "VERS_SPEC")
    private String versSpec;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 25)
    @Column(name = "IDDOKT")
    private String iddokt;
    @Size(max = 2147483647)
    @Column(name = "OS_SLUCH")
    private String osSluch;
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
    @Column(name = "Id_D_Out")
    private Integer idDOut;
    @Column(name = "IDCASE_OUT")
    private Integer idcaseOut;
    @Column(name = "Id_User")
    private Integer idUser;
    @Column(name = "Oplata_TF")
    private Short oplataTF;
    @Column(name = "SANK_IT_TF")
    private BigDecimal sankItTf;
    @Column(name = "ReadyToOut")
    private Boolean readyToOut;
    @Column(name = "Checked_MEK")
    private Boolean checkedMEK;
    @Column(name = "User_MEK")
    private Integer userMEK;
    @Column(name = "Checked_MEE")
    private Boolean checkedMEE;
    @Column(name = "User_MEE")
    private Integer userMEE;
    @Column(name = "Checked_EKMP")
    private Boolean checkedEKMP;
    @Column(name = "User_EKMP")
    private Integer userEKMP;
    @Column(name = "Otbor")
    private Boolean otbor;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "idSluch")
    private Collection<UslD> uslDCollection;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "idSluch")
    private Collection<SanktionD> sanktionDCollection;
    @JoinColumn(name = "Id_Schet_To_TF", referencedColumnName = "ID")
    @ManyToOne
    private JOutSchet idSchetToTF;

    public SkSluchD() {
    }

    public SkSluchD(Integer id) {
        this.id = id;
    }

    public SkSluchD(Integer id, int idSchetLpu, Date dateLoad, int idSluch, int nUpd, int nZap, short prNov, short vpolis, String npolis, String novor, short w, Date dr, long idcase, short uslOk, short vidpom, String lpu, short profil, short det, String nhistory, Date date1, Date date2, String ds1, int prvs, String iddokt, short idsp, BigDecimal sumv) {
        this.id = id;
        this.idSchetLpu = idSchetLpu;
        this.dateLoad = dateLoad;
        this.idSluch = idSluch;
        this.nUpd = nUpd;
        this.nZap = nZap;
        this.prNov = prNov;
        this.vpolis = vpolis;
        this.npolis = npolis;
        this.novor = novor;
        this.w = w;
        this.dr = dr;
        this.idcase = idcase;
        this.uslOk = uslOk;
        this.vidpom = vidpom;
        this.lpu = lpu;
        this.profil = profil;
        this.det = det;
        this.nhistory = nhistory;
        this.date1 = date1;
        this.date2 = date2;
        this.ds1 = ds1;
        this.prvs = prvs;
        this.iddokt = iddokt;
        this.idsp = idsp;
        this.sumv = sumv;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public int getIdSchetLpu() {
        return idSchetLpu;
    }

    public void setIdSchetLpu(int idSchetLpu) {
        this.idSchetLpu = idSchetLpu;
    }

    public Date getDateLoad() {
        return dateLoad;
    }

    public void setDateLoad(Date dateLoad) {
        this.dateLoad = dateLoad;
    }

    public int getIdSluch() {
        return idSluch;
    }

    public void setIdSluch(int idSluch) {
        this.idSluch = idSluch;
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

    public short getPrNov() {
        return prNov;
    }

    public void setPrNov(short prNov) {
        this.prNov = prNov;
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

    public String getSmo() {
        return smo;
    }

    public void setSmo(String smo) {
        this.smo = smo;
    }

    public String getSmoOgrn() {
        return smoOgrn;
    }

    public void setSmoOgrn(String smoOgrn) {
        this.smoOgrn = smoOgrn;
    }

    public String getSmoOk() {
        return smoOk;
    }

    public void setSmoOk(String smoOk) {
        this.smoOk = smoOk;
    }

    public String getSmoNam() {
        return smoNam;
    }

    public void setSmoNam(String smoNam) {
        this.smoNam = smoNam;
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

    public Short getForPom() {
        return forPom;
    }

    public void setForPom(Short forPom) {
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

    public String getNprMo() {
        return nprMo;
    }

    public void setNprMo(String nprMo) {
        this.nprMo = nprMo;
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

    public String getLpu1() {
        return lpu1;
    }

    public void setLpu1(String lpu1) {
        this.lpu1 = lpu1;
    }

    public Integer getPodr() {
        return podr;
    }

    public void setPodr(Integer podr) {
        this.podr = podr;
    }

    public short getProfil() {
        return profil;
    }

    public void setProfil(short profil) {
        this.profil = profil;
    }

    public short getDet() {
        return det;
    }

    public void setDet(short det) {
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

    public Short getRsltD() {
        return rsltD;
    }

    public void setRsltD(Short rsltD) {
        this.rsltD = rsltD;
    }

    public Short getIshod() {
        return ishod;
    }

    public void setIshod(Short ishod) {
        this.ishod = ishod;
    }

    public int getPrvs() {
        return prvs;
    }

    public void setPrvs(int prvs) {
        this.prvs = prvs;
    }

    public String getVersSpec() {
        return versSpec;
    }

    public void setVersSpec(String versSpec) {
        this.versSpec = versSpec;
    }

    public String getIddokt() {
        return iddokt;
    }

    public void setIddokt(String iddokt) {
        this.iddokt = iddokt;
    }

    public String getOsSluch() {
        return osSluch;
    }

    public void setOsSluch(String osSluch) {
        this.osSluch = osSluch;
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

    public Integer getIdDOut() {
        return idDOut;
    }

    public void setIdDOut(Integer idDOut) {
        this.idDOut = idDOut;
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

    public Boolean getReadyToOut() {
        return readyToOut;
    }

    public void setReadyToOut(Boolean readyToOut) {
        this.readyToOut = readyToOut;
    }

    public Boolean getCheckedMEK() {
        return checkedMEK;
    }

    public void setCheckedMEK(Boolean checkedMEK) {
        this.checkedMEK = checkedMEK;
    }

    public Integer getUserMEK() {
        return userMEK;
    }

    public void setUserMEK(Integer userMEK) {
        this.userMEK = userMEK;
    }

    public Boolean getCheckedMEE() {
        return checkedMEE;
    }

    public void setCheckedMEE(Boolean checkedMEE) {
        this.checkedMEE = checkedMEE;
    }

    public Integer getUserMEE() {
        return userMEE;
    }

    public void setUserMEE(Integer userMEE) {
        this.userMEE = userMEE;
    }

    public Boolean getCheckedEKMP() {
        return checkedEKMP;
    }

    public void setCheckedEKMP(Boolean checkedEKMP) {
        this.checkedEKMP = checkedEKMP;
    }

    public Integer getUserEKMP() {
        return userEKMP;
    }

    public void setUserEKMP(Integer userEKMP) {
        this.userEKMP = userEKMP;
    }

    public Boolean getOtbor() {
        return otbor;
    }

    public void setOtbor(Boolean otbor) {
        this.otbor = otbor;
    }

    @XmlTransient
    public Collection<UslD> getUslDCollection() {
        return uslDCollection;
    }

    public void setUslDCollection(Collection<UslD> uslDCollection) {
        this.uslDCollection = uslDCollection;
    }

    @XmlTransient
    public Collection<SanktionD> getSanktionDCollection() {
        return sanktionDCollection;
    }

    public void setSanktionDCollection(Collection<SanktionD> sanktionDCollection) {
        this.sanktionDCollection = sanktionDCollection;
    }

    public JOutSchet getIdSchetToTF() {
        return idSchetToTF;
    }

    public void setIdSchetToTF(JOutSchet idSchetToTF) {
        this.idSchetToTF = idSchetToTF;
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
        if (!(object instanceof SkSluchD)) {
            return false;
        }
        SkSluchD other = (SkSluchD) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.voshodnerd.entity.SkSluchD[ id=" + id + " ]";
    }
    
}
