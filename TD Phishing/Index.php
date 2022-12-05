<!doctype html>
<html class="no-js" lang="fr">
	<head>
		<meta charset="UTF-8">
		<meta name="viewport" content="width=device-width, initial-scale=1, maximum-scale=1">
		<title>Identification - La Banque Postale</title>
        
		
		<meta http-equiv="content-style-type" content="text/css" />
		<meta name="robots" content="noindex, nofollow" >
		<meta http-equiv="Content-Type" content="text/html; charset=UTF-8" />
		<style type="text/css">
			@import url(https://transverse.labanquepostale.fr/xo_/09_08_10.000/cvvs/css/cvs_all.css);
			@import url(https://transverse.labanquepostale.fr/xo_/09_08_10.000/cvvs/css/loader.css);
			[id="imageclavier"]{
				background:url(loginform?imgid=allunifie2&e=4&0.2952216364355851) no-repeat 13px 6px;
			}
		</style>
		<style type="text/css" media="(orientation:portrait) and (max-height:533px)">
			@import url(https://transverse.labanquepostale.fr/xo_/09_08_10.000/cvvs/css/cvs_portable.css);
			[id="imageclavier"]{
				background:url(loginform?imgid=allunifie1&e=3&0.6194981470166248) no-repeat 44px 6px;
			}
		</style>
		<script language="javascript" type="text/javascript"
				src="https://transverse.labanquepostale.fr/xo_/09_08_10.000/cvvs/js/val_keypad_cvvs-env.js"></script>

		<script type="text/javascript">
            if (!navigator.cookieEnabled){
				document.location.href='https://transverse.labanquepostale.fr/xo_/messages/message.html?param=NoCookie&origin=particuliers';
			}
		</script>
		<!--[if lte IE 10]>
			<script type="text/javascript">
				currentPageUrlIs = document.location.toString();
				var originIE = false;
				var origin;
				var urlEnvoyee = "";
				var t = location.search.substring(1).split('&');
				for (var i=0; i<t.length; i++){
					var x = t[ i ].split('=');
					if(x[0] === "URL"){
						urlEnvoyee = x[1];
					}
					else{
						if(x[1] === "professionnels"){
							origin = "professionnels";
						}
						else if(x[1] === "professionnelsIE67"){
							origin = "professionnelsIE67";
						}
						else if(x[1] === "particuliersIE67"){
							origin = "particuliersIE67";
						}
						else if(x[1] === "particuliers"){
							origin = "particuliers";
						}
						else if(x[1] === "tppparticuliers"){
							origin = "tppparticuliers";
						}
						else if(x[1] === "tppprofessionnels"){
							origin = "tppprofessionnels";
						}
						else if(x[1] === "tpptactile"){
							origin = "tpptactile";
						}
						else if(x[1] === "tpppmotactile"){
							origin = "tpppmotactile";
						}
					}
				}
				if(urlEnvoyee != ""){
					urlEnvoyee = unescape(urlEnvoyee);
					t = urlEnvoyee.split('&');
					for (var j=0; j<t.length; j++){
						var y = t[ j ].split('=');
						if(y[1] === "professionnels"){
							origin = "professionnels";
						}
						else if(y[1] === "professionnelsIE67"){
							origin = "professionnelsIE67";
						}
						else if(y[1] === "particuliersIE67"){
							origin = "particuliersIE67";
						}
						else if(y[1] === "particuliers"){
							origin = "particuliers";
						}
						else if(y[1] === "tppparticuliers"){
							origin = "tppparticuliers";
						}
						else if(y[1] === "tppprofessionnels"){
							origin = "tppprofessionnels";
						}
						else if(y[1] === "tpptactile"){
							origin = "tpptactile";
						}
						else if(y[1] === "tpppmotactile"){
							origin = "tpppmotactile";
						}
					}
				}
				if(origin === "particuliersIE67" || origin === "professionnelsIE67"){
					originIE = true;
				}
				if(!originIE){
					if(origin === "professionnels"){
						newURL = currentPageUrlIs.replace("professionnels","professionnelsIE67","tppprofessionnels","tpppmotactile");
						window.location.href = newURL;
					}
					else if(origin === "particuliers"){
						newURL = currentPageUrlIs.replace("particuliers","particuliersIE67","tppparticuliers","tpptactile");
						window.location.href = newURL;
					}
				}
			</script>
		<![endif]-->
		<!--[if lt IE 9]>
			<style type="text/css">@import url(https://transverse.labanquepostale.fr/xo_/09_08_10.000/cvvs/css/cvs_oldie.css);</style>
		<![endif]-->
	</head>

	<body id="particuliers">
		<div id="loader" aria-hidden="true" class="loading" style="top:0px"><div></div></div>
		<div class="zone-inactif" id="conteneurCvs" style="display:none;">
			<form method="post" action="/wsost/OstBrokerWeb/auth" name="formAccesCompte" class="layer_blockRight">
				<div>
					<input type="hidden" name="urlbackend" value="%2Fvoscomptes%2FcanalXHTML%2Fsecurite%2Fauthentification%2FrecupererPointEntree-identif.ea%3Forigin%3Dparticuliers%26entree%3DentreeFormAuth%26fauth.fof%3Dagv" />
					<input type="hidden" name="origin" value="particuliers" />
					<input type="hidden" name="password" id="cs" value="" />
					<input type="hidden" name="cv" value="true" /> 	
					<input type="hidden" name="cvvs" value="" />
					<input type="hidden" id="iscd" name="iscdName" value="0" />
					<input type="hidden" id="clt" name="cltName" value="0" />
				</div>
				<div id="cvs-bloc">
					<div id="messagePrecaution" class="webaccess"></div>
					<div id="cvs-bloc-identifiant">
						<label class="labelVisible" for="val_cel_identifiant">Identifiant :</label>
						<!--[if lt IE 10]>
						<input type="text" class="input-non-modif cache" id="val_cel_identifiant_hidden" value="Saisissez ici votre identifiant" onfocus="editLogin();"/>
						<input autocorrect="off" type="tel" name="username" id="val_cel_identifiant" autocapitalize="off" format="*N" placeholder="Saisissez ici votre identifiant" maxlength="11" pattern="[0-9,a-z,A-Z]*" spellcheck="false" onkeypress="return checkInput(event);" onblur="activePlaceholderIe(this);" onfocus="editLogin();"/>
						<![endif]-->
						<!--[if (gt IE 9)|!(IE)]><!-->
						<input autocorrect="off" type="tel" name="username" id="val_cel_identifiant" autocapitalize="off" format="*N" placeholder="Saisissez ici votre identifiant" maxlength="11" pattern="[0-9,a-z,A-Z]*" spellcheck="false" onkeypress="return checkInput(event);"/>
						<!--<![endif]-->
						<input class="input-non-modif" type="tel" id="val_cel_identifiant_masque" disabled/>
						<div style="text-align: left">
							<input type="checkbox" id="saveId" name="saveId" onchange="modifIdent()"/>
							<label for="saveId">M&eacute;moriser mon identifiant</label>
						</div>
					</div>
					<div id="cvs-bloc-mdp">
						<label class="labelVisible" for="cvs-bloc-mdp-input" >Mot de passe :</label>
						<!--[if lt IE 10]>
						<input type="text" disabled="disabled" class="cache" id="cvs-bloc-mdp-input-hidden" value="Composez votre mot de passe"/>
						<![endif]-->
						<input type="text" disabled="disabled" id="cvs-bloc-mdp-input" placeholder="Composez votre mot de passe" autocomplete="off" autocorrect="off" autocapitalize="off" spellcheck="false"/>
			
						<div id="cvs-lien-voca">
							<input type="button" class="non-cache" id="cvs-lien-voca-active" value="Activer la vocalisation" onclick="CVSVTable.lancer();">
							<input type="button" class="cache" id="cvs-lien-voca-desactive" value="D&eacute;sactiver la vocalisation" onclick="desactiverVocalisation();">
						</div>
						<div id="messageDebutClavier" class="webaccess"></div>
						<div id="messageDebutClavier2" class="webaccess"></div>
						<div id="blocImage">
							<div id="imageclavier">
								<div>
									<button type="button" id="val_cel_0"><img alt="" src="https://transverse.labanquepostale.fr/xo_/09_08_10.000/cvvs/img/transparent.gif"/></button><!--
									--><button type="button" id="val_cel_1" ><img alt="" src="https://transverse.labanquepostale.fr/xo_/09_08_10.000/cvvs/img/transparent.gif"/></button><!--
									--><button type="button" id="val_cel_2" ><img alt="" src="https://transverse.labanquepostale.fr/xo_/09_08_10.000/cvvs/img/transparent.gif" /></button><!--
									--><button type="button" id="val_cel_3" ><img alt="" src="https://transverse.labanquepostale.fr/xo_/09_08_10.000/cvvs/img/transparent.gif" /></button>
								</div><!--
								--><div>
									<button type="button" id="val_cel_4" ><img alt="" src="https://transverse.labanquepostale.fr/xo_/09_08_10.000/cvvs/img/transparent.gif" /></button><!--
									--><button type="button" id="val_cel_5" ><img alt="" src="https://transverse.labanquepostale.fr/xo_/09_08_10.000/cvvs/img/transparent.gif" /></button><!--
									--><button type="button" id="val_cel_6" ><img alt="" src="https://transverse.labanquepostale.fr/xo_/09_08_10.000/cvvs/img/transparent.gif" /></button><!--
									--><button type="button" id="val_cel_7" ><img alt="" src="https://transverse.labanquepostale.fr/xo_/09_08_10.000/cvvs/img/transparent.gif" /></button>
								</div><!--
								--><div>
									<button type="button" id="val_cel_8" ><img alt="" src="https://transverse.labanquepostale.fr/xo_/09_08_10.000/cvvs/img/transparent.gif" /></button><!--
									--><button type="button" id="val_cel_9" ><img alt="" src="https://transverse.labanquepostale.fr/xo_/09_08_10.000/cvvs/img/transparent.gif" /></button><!--
									--><button type="button" id="val_cel_10" ><img alt="" src="https://transverse.labanquepostale.fr/xo_/09_08_10.000/cvvs/img/transparent.gif" /></button><!--
									--><button type="button" id="val_cel_11" ><img alt="" src="https://transverse.labanquepostale.fr/xo_/09_08_10.000/cvvs/img/transparent.gif" /></button>
								</div><!--
								--><div>
									<button type="button" id="val_cel_12" ><img alt="" src="https://transverse.labanquepostale.fr/xo_/09_08_10.000/cvvs/img/transparent.gif" /></button><!--
									--><button type="button" id="val_cel_13" ><img alt="" src="https://transverse.labanquepostale.fr/xo_/09_08_10.000/cvvs/img/transparent.gif" /></button><!--
									--><button type="button" id="val_cel_14" ><img alt="" src="https://transverse.labanquepostale.fr/xo_/09_08_10.000/cvvs/img/transparent.gif" /></button><!--
									--><button type="button" id="val_cel_15" ><img alt="" src="https://transverse.labanquepostale.fr/xo_/09_08_10.000/cvvs/img/transparent.gif" /></button>
								</div>
							</div>
						</div>
						<div class="webaccess">Fin du clavier virtuel</div>
					</div>
					<div id="cvs-bloc-boutons">
						<input type="button" id="valider" value="Valider" disabled="disabled" class="grey" onclick="sendForm();">
						<input type="button" id="effacer" value="Effacer" onclick="CVSVTable.reset();">
					</div>
					<div id="progressBar"></div>
				</div>
			</form>
		</div>
		<div id="cvs_swf">&nbsp;</div>
		<div id="audio_box"> 
			<audio id="audio" preload="none" autoplay>
				Audio non affichable avec votre navigateur.
			</audio>
		</div>
		<noscript>
			<div id="noscript">
			<!-- No script code -->
			<!-- End No script code -->
			</div>
		</noscript>
	<script language="javascript" type="text/javascript">
		var OST_origin="particuliers";
		var OST_flash="loginform?swf=avalue&";
		var OST_audio5="loginform?mp3=avalue&";
		var OST_audioOgg = "";
		var OST_action="login";
		var PATH_STATIQUE = "https://transverse.labanquepostale.fr/xo_/09_08_10.000/cvvs";
		var IMG_ALL = "loginform?imgid=allunifie2&e=4&0.2952216364355851";
	</script>
	<script>
		if(OST_origin === 'pmotactile' || OST_origin === 'professionnels'){
			document.write('<link rel="stylesheet" type="text/css" href="https://transverse.labanquepostale.fr/xo_/09_08_10.000/cvvs/css/cvs_pmo.css" />');
		}

		if(OST_origin === 'tpp'){
			var img = new Image();
			img.src = "https://transverse.labanquepostale.fr/xo_/09_08_10.000/cvvs/img/logo-lbp.svg";
			img.style.display = "block";
			img.style.margin = "auto";
			img.style.width = "25%";
			img.style.paddingBottom = "10px";
			var div = document.getElementById('cvs-bloc');
			 
			img.onload = function() {
			  div.insertBefore(img, div.firstChild);
		  };
		}
	</script>
	<script language="javascript" type="text/javascript" src="https://transverse.labanquepostale.fr/cdn/js/jquery-3.6.0.min.js"></script>
	<script language="javascript" type="text/javascript" src="https://transverse.labanquepostale.fr/xo_/09_08_10.000/cvvs/js/val_keypad_cvvs-commun-unifie.js"></script> 
	<script language="javascript" type="text/javascript" src="https://transverse.labanquepostale.fr/xo_/09_08_10.000/cvvs/js/val_keypad_cvvs-unifie.js"></script>
	<!--[if lt IE 10]>
		<script language="javascript" type="text/javascript" src="https://transverse.labanquepostale.fr/xo_/09_08_10.000/cvvs/js/cvs_ie.js"></script>
	<![endif]-->
	</body>
</html>

