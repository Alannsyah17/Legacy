import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import static com.kms.katalon.core.testobject.ObjectRepository.findWindowsObject
import com.kms.katalon.core.checkpoint.Checkpoint as Checkpoint
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.testcase.TestCase as TestCase
import com.kms.katalon.core.testdata.TestData as TestData
import com.kms.katalon.core.testng.keyword.TestNGBuiltinKeywords as TestNGKW
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.webui.keyword.internal.WebUIAbstractKeyword as WebUIAbstractKeyword
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows
import internal.GlobalVariable as GlobalVariable
import org.openqa.selenium.Keys as Keys

WebUI.openBrowser('http://10.170.64.66/plindoweb//login.php')

//WebUI.navigateToUrl('http://10.170.64.66/plindoweb/login.php')
WebUI.setText(findTestObject('Login/Username'), 'ECHO')

WebUI.setText(findTestObject('Login/Password'), 'ECHO')

WebUI.click(findTestObject('Login/Btn_Login'))

WebUI.getText(findTestObject('Login/Get Text'))

WebUI.click(findTestObject('Object Repository/Penawaran/daftar_penawaran'))

WebUI.getText(findTestObject('Object Repository/Penawaran/btn_prorposal_baru'))

WebUI.click(findTestObject('Object Repository/Penawaran/btn_prorposal_baru'))

WebUI.selectOptionByLabel(findTestObject('Penawaran/Page_Daftar Desisi/ddl_kd_bdn'), kd_badan, false)

WebUI.setText(findTestObject('Object Repository/Penawaran/Page_Daftar Desisi/pemegang_kontrak'), pemegang_kontrak)

WebUI.selectOptionByLabel(findTestObject('Object Repository/Penawaran/Page_Daftar Desisi/tertanggung'), tertanggung, false)

WebUI.setText(findTestObject('Object Repository/Penawaran/Page_Daftar Desisi/alamat_perusahaan'), alamat_perusahaan)

WebUI.setText(findTestObject('Object Repository/Penawaran/Page_Daftar Desisi/npwp_perusahaan'), npwp_perusahaan)

WebUI.setText(findTestObject('Object Repository/Penawaran/Page_Daftar Desisi/nama_perwakilan_1'), nama_wakil1)

WebUI.setText(findTestObject('Object Repository/Penawaran/Page_Daftar Desisi/nama_perwakilan_2'), nama_wakil2)

WebUI.setText(findTestObject('Object Repository/Penawaran/Page_Daftar Desisi/email_perusahaan_1'), email_perusahaan1)

WebUI.setText(findTestObject('Object Repository/Penawaran/Page_Daftar Desisi/email_perusahaan_2'), email_perusahaan2)

WebUI.selectOptionByValue(findTestObject('Penawaran/Page_Daftar Desisi/nama_rcbc'), '', false)

WebUI.setText(findTestObject('Penawaran/Page_Daftar Desisi/input_EMAIL CBMCBE 1_email_cbe1'), '')

WebUI.setText(findTestObject('Penawaran/Page_Daftar Desisi/input_EMAIL CBMCBE 2_email_cbe2'), '')

WebUI.setText(findTestObject('Penawaran/Page_Daftar Desisi/input_TANGGAL PERTANGGUNGAN_tgl_mulai'), '01/03/2023')

WebUI.setText(findTestObject('Penawaran/Page_Daftar Desisi/input_SU_su'), '')

WebUI.selectOptionByValue(findTestObject('Penawaran/Page_Daftar Desisi/pembentukan_premi'), '', false)

WebUI.selectOptionByValue(findTestObject('Penawaran/Page_Daftar Desisi/cara_bayar_premi'), '', false)

WebUI.setText(findTestObject('Penawaran/Page_Daftar Desisi/input__pros_kenaikan_gaji'), '')

WebUI.selectOptionByValue(findTestObject('Penawaran/Page_Daftar Desisi/bunga_jibor'), '', false)

WebUI.setText(findTestObject('Penawaran/Page_Daftar Desisi/bunga_isian'), '')

WebUI.setText(findTestObject('Penawaran/Page_Daftar Desisi/keterangan_bunga'), '')

WebUI.selectOptionByValue(findTestObject('Penawaran/Page_Daftar Desisi/pola_pendanaan'), '', false)

WebUI.selectOptionByValue(findTestObject('Penawaran/Page_Daftar Desisi/select_Apakah Restru       NEW ENTRY'), '', false)

WebUI.selectOptionByValue(findTestObject('Penawaran/Page_Daftar Desisi/select_Rupiah'), '', false)

WebUI.selectOptionByValue(findTestObject('Penawaran/Page_Daftar Desisi/select_(JS_PHT) JS PHT    (JS_PHE) JS PHT Eksekutif'), 
    '', false)

WebUI.selectOptionByValue(findTestObject('Penawaran/Page_Daftar Desisi/select_Silahkan Pilih    NON EBP    EBP'), '', false)

WebUI.setText(findTestObject('Penawaran/Page_Daftar Desisi/input_DESKRIPSI PRODUK_deskripsi_produk'), '')

