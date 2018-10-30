package uniandes.mdd.aplicacion.blockchain.ide.contentassist.antlr.internal;

import java.io.InputStream;
import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.ide.editor.contentassist.antlr.internal.AbstractInternalContentAssistParser;
import org.eclipse.xtext.ide.editor.contentassist.antlr.internal.DFA;
import uniandes.mdd.aplicacion.blockchain.services.BlockchainGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalBlockchainParser extends AbstractInternalContentAssistParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_STRING", "RULE_ID", "RULE_INT", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'.'", "'true'", "'false'", "'E'", "'e'", "'=='", "'!='", "'>'", "'<'", "'>='", "'<='", "'&&'", "'||'", "'+'", "'-'", "'*'", "'/'", "'='", "'GET'", "'DELETE'", "'if'", "'else'", "'STRING'", "'NUMERICO'", "'BOOLEAN'", "'Aplicacion'", "'{'", "'}'", "','", "'TipoDato'", "'SmartContract'", "'Entidad'", "'Operacion'", "'('", "')'", "'return'", "'isUd='", "':'", "'Estado'", "'ExpLog'", "'id'", "'var'", "'new'", "'Condicional'", "'expresionlogica'", "'sentencias'", "'tipoCondicional'", "'ExpNum'", "'ExpRef'", "'ExpRel'", "'Map'"
    };
    public static final int T__50=50;
    public static final int T__19=19;
    public static final int T__15=15;
    public static final int T__59=59;
    public static final int T__16=16;
    public static final int T__17=17;
    public static final int T__18=18;
    public static final int T__11=11;
    public static final int T__55=55;
    public static final int T__12=12;
    public static final int T__56=56;
    public static final int T__13=13;
    public static final int T__57=57;
    public static final int T__14=14;
    public static final int T__58=58;
    public static final int T__51=51;
    public static final int T__52=52;
    public static final int T__53=53;
    public static final int T__54=54;
    public static final int T__60=60;
    public static final int T__61=61;
    public static final int RULE_ID=5;
    public static final int T__26=26;
    public static final int T__27=27;
    public static final int T__28=28;
    public static final int RULE_INT=6;
    public static final int T__29=29;
    public static final int T__22=22;
    public static final int RULE_ML_COMMENT=7;
    public static final int T__23=23;
    public static final int T__24=24;
    public static final int T__25=25;
    public static final int T__20=20;
    public static final int T__21=21;
    public static final int RULE_STRING=4;
    public static final int RULE_SL_COMMENT=8;
    public static final int T__37=37;
    public static final int T__38=38;
    public static final int T__39=39;
    public static final int T__33=33;
    public static final int T__34=34;
    public static final int T__35=35;
    public static final int T__36=36;
    public static final int EOF=-1;
    public static final int T__30=30;
    public static final int T__31=31;
    public static final int T__32=32;
    public static final int RULE_WS=9;
    public static final int RULE_ANY_OTHER=10;
    public static final int T__48=48;
    public static final int T__49=49;
    public static final int T__44=44;
    public static final int T__45=45;
    public static final int T__46=46;
    public static final int T__47=47;
    public static final int T__40=40;
    public static final int T__41=41;
    public static final int T__42=42;
    public static final int T__43=43;

    // delegates
    // delegators


        public InternalBlockchainParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public InternalBlockchainParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return InternalBlockchainParser.tokenNames; }
    public String getGrammarFileName() { return "InternalBlockchain.g"; }


    	private BlockchainGrammarAccess grammarAccess;

    	public void setGrammarAccess(BlockchainGrammarAccess grammarAccess) {
    		this.grammarAccess = grammarAccess;
    	}

    	@Override
    	protected Grammar getGrammar() {
    		return grammarAccess.getGrammar();
    	}

    	@Override
    	protected String getValueForTokenName(String tokenName) {
    		return tokenName;
    	}



    // $ANTLR start "entryRuleAplicacion"
    // InternalBlockchain.g:53:1: entryRuleAplicacion : ruleAplicacion EOF ;
    public final void entryRuleAplicacion() throws RecognitionException {
        try {
            // InternalBlockchain.g:54:1: ( ruleAplicacion EOF )
            // InternalBlockchain.g:55:1: ruleAplicacion EOF
            {
             before(grammarAccess.getAplicacionRule()); 
            pushFollow(FOLLOW_1);
            ruleAplicacion();

            state._fsp--;

             after(grammarAccess.getAplicacionRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleAplicacion"


    // $ANTLR start "ruleAplicacion"
    // InternalBlockchain.g:62:1: ruleAplicacion : ( ( rule__Aplicacion__Group__0 ) ) ;
    public final void ruleAplicacion() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBlockchain.g:66:2: ( ( ( rule__Aplicacion__Group__0 ) ) )
            // InternalBlockchain.g:67:2: ( ( rule__Aplicacion__Group__0 ) )
            {
            // InternalBlockchain.g:67:2: ( ( rule__Aplicacion__Group__0 ) )
            // InternalBlockchain.g:68:3: ( rule__Aplicacion__Group__0 )
            {
             before(grammarAccess.getAplicacionAccess().getGroup()); 
            // InternalBlockchain.g:69:3: ( rule__Aplicacion__Group__0 )
            // InternalBlockchain.g:69:4: rule__Aplicacion__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Aplicacion__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getAplicacionAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleAplicacion"


    // $ANTLR start "entryRuleTipoDato"
    // InternalBlockchain.g:78:1: entryRuleTipoDato : ruleTipoDato EOF ;
    public final void entryRuleTipoDato() throws RecognitionException {
        try {
            // InternalBlockchain.g:79:1: ( ruleTipoDato EOF )
            // InternalBlockchain.g:80:1: ruleTipoDato EOF
            {
             before(grammarAccess.getTipoDatoRule()); 
            pushFollow(FOLLOW_1);
            ruleTipoDato();

            state._fsp--;

             after(grammarAccess.getTipoDatoRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleTipoDato"


    // $ANTLR start "ruleTipoDato"
    // InternalBlockchain.g:87:1: ruleTipoDato : ( ( rule__TipoDato__Alternatives ) ) ;
    public final void ruleTipoDato() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBlockchain.g:91:2: ( ( ( rule__TipoDato__Alternatives ) ) )
            // InternalBlockchain.g:92:2: ( ( rule__TipoDato__Alternatives ) )
            {
            // InternalBlockchain.g:92:2: ( ( rule__TipoDato__Alternatives ) )
            // InternalBlockchain.g:93:3: ( rule__TipoDato__Alternatives )
            {
             before(grammarAccess.getTipoDatoAccess().getAlternatives()); 
            // InternalBlockchain.g:94:3: ( rule__TipoDato__Alternatives )
            // InternalBlockchain.g:94:4: rule__TipoDato__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__TipoDato__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getTipoDatoAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleTipoDato"


    // $ANTLR start "entryRuleSentencia"
    // InternalBlockchain.g:103:1: entryRuleSentencia : ruleSentencia EOF ;
    public final void entryRuleSentencia() throws RecognitionException {
        try {
            // InternalBlockchain.g:104:1: ( ruleSentencia EOF )
            // InternalBlockchain.g:105:1: ruleSentencia EOF
            {
             before(grammarAccess.getSentenciaRule()); 
            pushFollow(FOLLOW_1);
            ruleSentencia();

            state._fsp--;

             after(grammarAccess.getSentenciaRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleSentencia"


    // $ANTLR start "ruleSentencia"
    // InternalBlockchain.g:112:1: ruleSentencia : ( ( rule__Sentencia__Alternatives ) ) ;
    public final void ruleSentencia() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBlockchain.g:116:2: ( ( ( rule__Sentencia__Alternatives ) ) )
            // InternalBlockchain.g:117:2: ( ( rule__Sentencia__Alternatives ) )
            {
            // InternalBlockchain.g:117:2: ( ( rule__Sentencia__Alternatives ) )
            // InternalBlockchain.g:118:3: ( rule__Sentencia__Alternatives )
            {
             before(grammarAccess.getSentenciaAccess().getAlternatives()); 
            // InternalBlockchain.g:119:3: ( rule__Sentencia__Alternatives )
            // InternalBlockchain.g:119:4: rule__Sentencia__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__Sentencia__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getSentenciaAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleSentencia"


    // $ANTLR start "entryRuleSmartContract"
    // InternalBlockchain.g:128:1: entryRuleSmartContract : ruleSmartContract EOF ;
    public final void entryRuleSmartContract() throws RecognitionException {
        try {
            // InternalBlockchain.g:129:1: ( ruleSmartContract EOF )
            // InternalBlockchain.g:130:1: ruleSmartContract EOF
            {
             before(grammarAccess.getSmartContractRule()); 
            pushFollow(FOLLOW_1);
            ruleSmartContract();

            state._fsp--;

             after(grammarAccess.getSmartContractRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleSmartContract"


    // $ANTLR start "ruleSmartContract"
    // InternalBlockchain.g:137:1: ruleSmartContract : ( ( rule__SmartContract__Group__0 ) ) ;
    public final void ruleSmartContract() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBlockchain.g:141:2: ( ( ( rule__SmartContract__Group__0 ) ) )
            // InternalBlockchain.g:142:2: ( ( rule__SmartContract__Group__0 ) )
            {
            // InternalBlockchain.g:142:2: ( ( rule__SmartContract__Group__0 ) )
            // InternalBlockchain.g:143:3: ( rule__SmartContract__Group__0 )
            {
             before(grammarAccess.getSmartContractAccess().getGroup()); 
            // InternalBlockchain.g:144:3: ( rule__SmartContract__Group__0 )
            // InternalBlockchain.g:144:4: rule__SmartContract__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__SmartContract__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getSmartContractAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleSmartContract"


    // $ANTLR start "entryRuleEString"
    // InternalBlockchain.g:153:1: entryRuleEString : ruleEString EOF ;
    public final void entryRuleEString() throws RecognitionException {
        try {
            // InternalBlockchain.g:154:1: ( ruleEString EOF )
            // InternalBlockchain.g:155:1: ruleEString EOF
            {
             before(grammarAccess.getEStringRule()); 
            pushFollow(FOLLOW_1);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getEStringRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleEString"


    // $ANTLR start "ruleEString"
    // InternalBlockchain.g:162:1: ruleEString : ( ( rule__EString__Alternatives ) ) ;
    public final void ruleEString() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBlockchain.g:166:2: ( ( ( rule__EString__Alternatives ) ) )
            // InternalBlockchain.g:167:2: ( ( rule__EString__Alternatives ) )
            {
            // InternalBlockchain.g:167:2: ( ( rule__EString__Alternatives ) )
            // InternalBlockchain.g:168:3: ( rule__EString__Alternatives )
            {
             before(grammarAccess.getEStringAccess().getAlternatives()); 
            // InternalBlockchain.g:169:3: ( rule__EString__Alternatives )
            // InternalBlockchain.g:169:4: rule__EString__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__EString__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getEStringAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleEString"


    // $ANTLR start "entryRuleEntidad"
    // InternalBlockchain.g:178:1: entryRuleEntidad : ruleEntidad EOF ;
    public final void entryRuleEntidad() throws RecognitionException {
        try {
            // InternalBlockchain.g:179:1: ( ruleEntidad EOF )
            // InternalBlockchain.g:180:1: ruleEntidad EOF
            {
             before(grammarAccess.getEntidadRule()); 
            pushFollow(FOLLOW_1);
            ruleEntidad();

            state._fsp--;

             after(grammarAccess.getEntidadRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleEntidad"


    // $ANTLR start "ruleEntidad"
    // InternalBlockchain.g:187:1: ruleEntidad : ( ( rule__Entidad__Group__0 ) ) ;
    public final void ruleEntidad() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBlockchain.g:191:2: ( ( ( rule__Entidad__Group__0 ) ) )
            // InternalBlockchain.g:192:2: ( ( rule__Entidad__Group__0 ) )
            {
            // InternalBlockchain.g:192:2: ( ( rule__Entidad__Group__0 ) )
            // InternalBlockchain.g:193:3: ( rule__Entidad__Group__0 )
            {
             before(grammarAccess.getEntidadAccess().getGroup()); 
            // InternalBlockchain.g:194:3: ( rule__Entidad__Group__0 )
            // InternalBlockchain.g:194:4: rule__Entidad__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Entidad__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getEntidadAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleEntidad"


    // $ANTLR start "entryRuleOperacion"
    // InternalBlockchain.g:203:1: entryRuleOperacion : ruleOperacion EOF ;
    public final void entryRuleOperacion() throws RecognitionException {
        try {
            // InternalBlockchain.g:204:1: ( ruleOperacion EOF )
            // InternalBlockchain.g:205:1: ruleOperacion EOF
            {
             before(grammarAccess.getOperacionRule()); 
            pushFollow(FOLLOW_1);
            ruleOperacion();

            state._fsp--;

             after(grammarAccess.getOperacionRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleOperacion"


    // $ANTLR start "ruleOperacion"
    // InternalBlockchain.g:212:1: ruleOperacion : ( ( rule__Operacion__Group__0 ) ) ;
    public final void ruleOperacion() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBlockchain.g:216:2: ( ( ( rule__Operacion__Group__0 ) ) )
            // InternalBlockchain.g:217:2: ( ( rule__Operacion__Group__0 ) )
            {
            // InternalBlockchain.g:217:2: ( ( rule__Operacion__Group__0 ) )
            // InternalBlockchain.g:218:3: ( rule__Operacion__Group__0 )
            {
             before(grammarAccess.getOperacionAccess().getGroup()); 
            // InternalBlockchain.g:219:3: ( rule__Operacion__Group__0 )
            // InternalBlockchain.g:219:4: rule__Operacion__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Operacion__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getOperacionAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleOperacion"


    // $ANTLR start "entryRuleEstado"
    // InternalBlockchain.g:228:1: entryRuleEstado : ruleEstado EOF ;
    public final void entryRuleEstado() throws RecognitionException {
        try {
            // InternalBlockchain.g:229:1: ( ruleEstado EOF )
            // InternalBlockchain.g:230:1: ruleEstado EOF
            {
             before(grammarAccess.getEstadoRule()); 
            pushFollow(FOLLOW_1);
            ruleEstado();

            state._fsp--;

             after(grammarAccess.getEstadoRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleEstado"


    // $ANTLR start "ruleEstado"
    // InternalBlockchain.g:237:1: ruleEstado : ( ( rule__Estado__Group__0 ) ) ;
    public final void ruleEstado() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBlockchain.g:241:2: ( ( ( rule__Estado__Group__0 ) ) )
            // InternalBlockchain.g:242:2: ( ( rule__Estado__Group__0 ) )
            {
            // InternalBlockchain.g:242:2: ( ( rule__Estado__Group__0 ) )
            // InternalBlockchain.g:243:3: ( rule__Estado__Group__0 )
            {
             before(grammarAccess.getEstadoAccess().getGroup()); 
            // InternalBlockchain.g:244:3: ( rule__Estado__Group__0 )
            // InternalBlockchain.g:244:4: rule__Estado__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Estado__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getEstadoAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleEstado"


    // $ANTLR start "entryRuleAtributo"
    // InternalBlockchain.g:253:1: entryRuleAtributo : ruleAtributo EOF ;
    public final void entryRuleAtributo() throws RecognitionException {
        try {
            // InternalBlockchain.g:254:1: ( ruleAtributo EOF )
            // InternalBlockchain.g:255:1: ruleAtributo EOF
            {
             before(grammarAccess.getAtributoRule()); 
            pushFollow(FOLLOW_1);
            ruleAtributo();

            state._fsp--;

             after(grammarAccess.getAtributoRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleAtributo"


    // $ANTLR start "ruleAtributo"
    // InternalBlockchain.g:262:1: ruleAtributo : ( ( rule__Atributo__Group__0 ) ) ;
    public final void ruleAtributo() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBlockchain.g:266:2: ( ( ( rule__Atributo__Group__0 ) ) )
            // InternalBlockchain.g:267:2: ( ( rule__Atributo__Group__0 ) )
            {
            // InternalBlockchain.g:267:2: ( ( rule__Atributo__Group__0 ) )
            // InternalBlockchain.g:268:3: ( rule__Atributo__Group__0 )
            {
             before(grammarAccess.getAtributoAccess().getGroup()); 
            // InternalBlockchain.g:269:3: ( rule__Atributo__Group__0 )
            // InternalBlockchain.g:269:4: rule__Atributo__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Atributo__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getAtributoAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleAtributo"


    // $ANTLR start "entryRuleParametro"
    // InternalBlockchain.g:278:1: entryRuleParametro : ruleParametro EOF ;
    public final void entryRuleParametro() throws RecognitionException {
        try {
            // InternalBlockchain.g:279:1: ( ruleParametro EOF )
            // InternalBlockchain.g:280:1: ruleParametro EOF
            {
             before(grammarAccess.getParametroRule()); 
            pushFollow(FOLLOW_1);
            ruleParametro();

            state._fsp--;

             after(grammarAccess.getParametroRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleParametro"


    // $ANTLR start "ruleParametro"
    // InternalBlockchain.g:287:1: ruleParametro : ( ( rule__Parametro__Group__0 ) ) ;
    public final void ruleParametro() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBlockchain.g:291:2: ( ( ( rule__Parametro__Group__0 ) ) )
            // InternalBlockchain.g:292:2: ( ( rule__Parametro__Group__0 ) )
            {
            // InternalBlockchain.g:292:2: ( ( rule__Parametro__Group__0 ) )
            // InternalBlockchain.g:293:3: ( rule__Parametro__Group__0 )
            {
             before(grammarAccess.getParametroAccess().getGroup()); 
            // InternalBlockchain.g:294:3: ( rule__Parametro__Group__0 )
            // InternalBlockchain.g:294:4: rule__Parametro__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Parametro__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getParametroAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleParametro"


    // $ANTLR start "entryRuleEBoolean"
    // InternalBlockchain.g:303:1: entryRuleEBoolean : ruleEBoolean EOF ;
    public final void entryRuleEBoolean() throws RecognitionException {
        try {
            // InternalBlockchain.g:304:1: ( ruleEBoolean EOF )
            // InternalBlockchain.g:305:1: ruleEBoolean EOF
            {
             before(grammarAccess.getEBooleanRule()); 
            pushFollow(FOLLOW_1);
            ruleEBoolean();

            state._fsp--;

             after(grammarAccess.getEBooleanRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleEBoolean"


    // $ANTLR start "ruleEBoolean"
    // InternalBlockchain.g:312:1: ruleEBoolean : ( ( rule__EBoolean__Alternatives ) ) ;
    public final void ruleEBoolean() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBlockchain.g:316:2: ( ( ( rule__EBoolean__Alternatives ) ) )
            // InternalBlockchain.g:317:2: ( ( rule__EBoolean__Alternatives ) )
            {
            // InternalBlockchain.g:317:2: ( ( rule__EBoolean__Alternatives ) )
            // InternalBlockchain.g:318:3: ( rule__EBoolean__Alternatives )
            {
             before(grammarAccess.getEBooleanAccess().getAlternatives()); 
            // InternalBlockchain.g:319:3: ( rule__EBoolean__Alternatives )
            // InternalBlockchain.g:319:4: rule__EBoolean__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__EBoolean__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getEBooleanAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleEBoolean"


    // $ANTLR start "entryRuleExpresionLogica"
    // InternalBlockchain.g:328:1: entryRuleExpresionLogica : ruleExpresionLogica EOF ;
    public final void entryRuleExpresionLogica() throws RecognitionException {
        try {
            // InternalBlockchain.g:329:1: ( ruleExpresionLogica EOF )
            // InternalBlockchain.g:330:1: ruleExpresionLogica EOF
            {
             before(grammarAccess.getExpresionLogicaRule()); 
            pushFollow(FOLLOW_1);
            ruleExpresionLogica();

            state._fsp--;

             after(grammarAccess.getExpresionLogicaRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleExpresionLogica"


    // $ANTLR start "ruleExpresionLogica"
    // InternalBlockchain.g:337:1: ruleExpresionLogica : ( ( rule__ExpresionLogica__Group__0 ) ) ;
    public final void ruleExpresionLogica() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBlockchain.g:341:2: ( ( ( rule__ExpresionLogica__Group__0 ) ) )
            // InternalBlockchain.g:342:2: ( ( rule__ExpresionLogica__Group__0 ) )
            {
            // InternalBlockchain.g:342:2: ( ( rule__ExpresionLogica__Group__0 ) )
            // InternalBlockchain.g:343:3: ( rule__ExpresionLogica__Group__0 )
            {
             before(grammarAccess.getExpresionLogicaAccess().getGroup()); 
            // InternalBlockchain.g:344:3: ( rule__ExpresionLogica__Group__0 )
            // InternalBlockchain.g:344:4: rule__ExpresionLogica__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__ExpresionLogica__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getExpresionLogicaAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleExpresionLogica"


    // $ANTLR start "entryRuleExpresionAritmetica"
    // InternalBlockchain.g:353:1: entryRuleExpresionAritmetica : ruleExpresionAritmetica EOF ;
    public final void entryRuleExpresionAritmetica() throws RecognitionException {
        try {
            // InternalBlockchain.g:354:1: ( ruleExpresionAritmetica EOF )
            // InternalBlockchain.g:355:1: ruleExpresionAritmetica EOF
            {
             before(grammarAccess.getExpresionAritmeticaRule()); 
            pushFollow(FOLLOW_1);
            ruleExpresionAritmetica();

            state._fsp--;

             after(grammarAccess.getExpresionAritmeticaRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleExpresionAritmetica"


    // $ANTLR start "ruleExpresionAritmetica"
    // InternalBlockchain.g:362:1: ruleExpresionAritmetica : ( ( rule__ExpresionAritmetica__Group__0 ) ) ;
    public final void ruleExpresionAritmetica() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBlockchain.g:366:2: ( ( ( rule__ExpresionAritmetica__Group__0 ) ) )
            // InternalBlockchain.g:367:2: ( ( rule__ExpresionAritmetica__Group__0 ) )
            {
            // InternalBlockchain.g:367:2: ( ( rule__ExpresionAritmetica__Group__0 ) )
            // InternalBlockchain.g:368:3: ( rule__ExpresionAritmetica__Group__0 )
            {
             before(grammarAccess.getExpresionAritmeticaAccess().getGroup()); 
            // InternalBlockchain.g:369:3: ( rule__ExpresionAritmetica__Group__0 )
            // InternalBlockchain.g:369:4: rule__ExpresionAritmetica__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__ExpresionAritmetica__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getExpresionAritmeticaAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleExpresionAritmetica"


    // $ANTLR start "entryRuleVariable"
    // InternalBlockchain.g:378:1: entryRuleVariable : ruleVariable EOF ;
    public final void entryRuleVariable() throws RecognitionException {
        try {
            // InternalBlockchain.g:379:1: ( ruleVariable EOF )
            // InternalBlockchain.g:380:1: ruleVariable EOF
            {
             before(grammarAccess.getVariableRule()); 
            pushFollow(FOLLOW_1);
            ruleVariable();

            state._fsp--;

             after(grammarAccess.getVariableRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleVariable"


    // $ANTLR start "ruleVariable"
    // InternalBlockchain.g:387:1: ruleVariable : ( ( rule__Variable__Group__0 ) ) ;
    public final void ruleVariable() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBlockchain.g:391:2: ( ( ( rule__Variable__Group__0 ) ) )
            // InternalBlockchain.g:392:2: ( ( rule__Variable__Group__0 ) )
            {
            // InternalBlockchain.g:392:2: ( ( rule__Variable__Group__0 ) )
            // InternalBlockchain.g:393:3: ( rule__Variable__Group__0 )
            {
             before(grammarAccess.getVariableAccess().getGroup()); 
            // InternalBlockchain.g:394:3: ( rule__Variable__Group__0 )
            // InternalBlockchain.g:394:4: rule__Variable__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Variable__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getVariableAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleVariable"


    // $ANTLR start "entryRuleCondicional"
    // InternalBlockchain.g:403:1: entryRuleCondicional : ruleCondicional EOF ;
    public final void entryRuleCondicional() throws RecognitionException {
        try {
            // InternalBlockchain.g:404:1: ( ruleCondicional EOF )
            // InternalBlockchain.g:405:1: ruleCondicional EOF
            {
             before(grammarAccess.getCondicionalRule()); 
            pushFollow(FOLLOW_1);
            ruleCondicional();

            state._fsp--;

             after(grammarAccess.getCondicionalRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleCondicional"


    // $ANTLR start "ruleCondicional"
    // InternalBlockchain.g:412:1: ruleCondicional : ( ( rule__Condicional__Group__0 ) ) ;
    public final void ruleCondicional() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBlockchain.g:416:2: ( ( ( rule__Condicional__Group__0 ) ) )
            // InternalBlockchain.g:417:2: ( ( rule__Condicional__Group__0 ) )
            {
            // InternalBlockchain.g:417:2: ( ( rule__Condicional__Group__0 ) )
            // InternalBlockchain.g:418:3: ( rule__Condicional__Group__0 )
            {
             before(grammarAccess.getCondicionalAccess().getGroup()); 
            // InternalBlockchain.g:419:3: ( rule__Condicional__Group__0 )
            // InternalBlockchain.g:419:4: rule__Condicional__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Condicional__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getCondicionalAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleCondicional"


    // $ANTLR start "entryRuleExpresionNumerica"
    // InternalBlockchain.g:428:1: entryRuleExpresionNumerica : ruleExpresionNumerica EOF ;
    public final void entryRuleExpresionNumerica() throws RecognitionException {
        try {
            // InternalBlockchain.g:429:1: ( ruleExpresionNumerica EOF )
            // InternalBlockchain.g:430:1: ruleExpresionNumerica EOF
            {
             before(grammarAccess.getExpresionNumericaRule()); 
            pushFollow(FOLLOW_1);
            ruleExpresionNumerica();

            state._fsp--;

             after(grammarAccess.getExpresionNumericaRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleExpresionNumerica"


    // $ANTLR start "ruleExpresionNumerica"
    // InternalBlockchain.g:437:1: ruleExpresionNumerica : ( ( rule__ExpresionNumerica__Group__0 ) ) ;
    public final void ruleExpresionNumerica() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBlockchain.g:441:2: ( ( ( rule__ExpresionNumerica__Group__0 ) ) )
            // InternalBlockchain.g:442:2: ( ( rule__ExpresionNumerica__Group__0 ) )
            {
            // InternalBlockchain.g:442:2: ( ( rule__ExpresionNumerica__Group__0 ) )
            // InternalBlockchain.g:443:3: ( rule__ExpresionNumerica__Group__0 )
            {
             before(grammarAccess.getExpresionNumericaAccess().getGroup()); 
            // InternalBlockchain.g:444:3: ( rule__ExpresionNumerica__Group__0 )
            // InternalBlockchain.g:444:4: rule__ExpresionNumerica__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__ExpresionNumerica__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getExpresionNumericaAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleExpresionNumerica"


    // $ANTLR start "entryRuleExpresionReferenciada"
    // InternalBlockchain.g:453:1: entryRuleExpresionReferenciada : ruleExpresionReferenciada EOF ;
    public final void entryRuleExpresionReferenciada() throws RecognitionException {
        try {
            // InternalBlockchain.g:454:1: ( ruleExpresionReferenciada EOF )
            // InternalBlockchain.g:455:1: ruleExpresionReferenciada EOF
            {
             before(grammarAccess.getExpresionReferenciadaRule()); 
            pushFollow(FOLLOW_1);
            ruleExpresionReferenciada();

            state._fsp--;

             after(grammarAccess.getExpresionReferenciadaRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleExpresionReferenciada"


    // $ANTLR start "ruleExpresionReferenciada"
    // InternalBlockchain.g:462:1: ruleExpresionReferenciada : ( ( rule__ExpresionReferenciada__Group__0 ) ) ;
    public final void ruleExpresionReferenciada() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBlockchain.g:466:2: ( ( ( rule__ExpresionReferenciada__Group__0 ) ) )
            // InternalBlockchain.g:467:2: ( ( rule__ExpresionReferenciada__Group__0 ) )
            {
            // InternalBlockchain.g:467:2: ( ( rule__ExpresionReferenciada__Group__0 ) )
            // InternalBlockchain.g:468:3: ( rule__ExpresionReferenciada__Group__0 )
            {
             before(grammarAccess.getExpresionReferenciadaAccess().getGroup()); 
            // InternalBlockchain.g:469:3: ( rule__ExpresionReferenciada__Group__0 )
            // InternalBlockchain.g:469:4: rule__ExpresionReferenciada__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__ExpresionReferenciada__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getExpresionReferenciadaAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleExpresionReferenciada"


    // $ANTLR start "entryRuleExpresionRelacional"
    // InternalBlockchain.g:478:1: entryRuleExpresionRelacional : ruleExpresionRelacional EOF ;
    public final void entryRuleExpresionRelacional() throws RecognitionException {
        try {
            // InternalBlockchain.g:479:1: ( ruleExpresionRelacional EOF )
            // InternalBlockchain.g:480:1: ruleExpresionRelacional EOF
            {
             before(grammarAccess.getExpresionRelacionalRule()); 
            pushFollow(FOLLOW_1);
            ruleExpresionRelacional();

            state._fsp--;

             after(grammarAccess.getExpresionRelacionalRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleExpresionRelacional"


    // $ANTLR start "ruleExpresionRelacional"
    // InternalBlockchain.g:487:1: ruleExpresionRelacional : ( ( rule__ExpresionRelacional__Group__0 ) ) ;
    public final void ruleExpresionRelacional() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBlockchain.g:491:2: ( ( ( rule__ExpresionRelacional__Group__0 ) ) )
            // InternalBlockchain.g:492:2: ( ( rule__ExpresionRelacional__Group__0 ) )
            {
            // InternalBlockchain.g:492:2: ( ( rule__ExpresionRelacional__Group__0 ) )
            // InternalBlockchain.g:493:3: ( rule__ExpresionRelacional__Group__0 )
            {
             before(grammarAccess.getExpresionRelacionalAccess().getGroup()); 
            // InternalBlockchain.g:494:3: ( rule__ExpresionRelacional__Group__0 )
            // InternalBlockchain.g:494:4: rule__ExpresionRelacional__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__ExpresionRelacional__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getExpresionRelacionalAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleExpresionRelacional"


    // $ANTLR start "entryRuleEInt"
    // InternalBlockchain.g:503:1: entryRuleEInt : ruleEInt EOF ;
    public final void entryRuleEInt() throws RecognitionException {
        try {
            // InternalBlockchain.g:504:1: ( ruleEInt EOF )
            // InternalBlockchain.g:505:1: ruleEInt EOF
            {
             before(grammarAccess.getEIntRule()); 
            pushFollow(FOLLOW_1);
            ruleEInt();

            state._fsp--;

             after(grammarAccess.getEIntRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleEInt"


    // $ANTLR start "ruleEInt"
    // InternalBlockchain.g:512:1: ruleEInt : ( ( rule__EInt__Group__0 ) ) ;
    public final void ruleEInt() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBlockchain.g:516:2: ( ( ( rule__EInt__Group__0 ) ) )
            // InternalBlockchain.g:517:2: ( ( rule__EInt__Group__0 ) )
            {
            // InternalBlockchain.g:517:2: ( ( rule__EInt__Group__0 ) )
            // InternalBlockchain.g:518:3: ( rule__EInt__Group__0 )
            {
             before(grammarAccess.getEIntAccess().getGroup()); 
            // InternalBlockchain.g:519:3: ( rule__EInt__Group__0 )
            // InternalBlockchain.g:519:4: rule__EInt__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__EInt__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getEIntAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleEInt"


    // $ANTLR start "entryRuleEDouble"
    // InternalBlockchain.g:528:1: entryRuleEDouble : ruleEDouble EOF ;
    public final void entryRuleEDouble() throws RecognitionException {
        try {
            // InternalBlockchain.g:529:1: ( ruleEDouble EOF )
            // InternalBlockchain.g:530:1: ruleEDouble EOF
            {
             before(grammarAccess.getEDoubleRule()); 
            pushFollow(FOLLOW_1);
            ruleEDouble();

            state._fsp--;

             after(grammarAccess.getEDoubleRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleEDouble"


    // $ANTLR start "ruleEDouble"
    // InternalBlockchain.g:537:1: ruleEDouble : ( ( rule__EDouble__Group__0 ) ) ;
    public final void ruleEDouble() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBlockchain.g:541:2: ( ( ( rule__EDouble__Group__0 ) ) )
            // InternalBlockchain.g:542:2: ( ( rule__EDouble__Group__0 ) )
            {
            // InternalBlockchain.g:542:2: ( ( rule__EDouble__Group__0 ) )
            // InternalBlockchain.g:543:3: ( rule__EDouble__Group__0 )
            {
             before(grammarAccess.getEDoubleAccess().getGroup()); 
            // InternalBlockchain.g:544:3: ( rule__EDouble__Group__0 )
            // InternalBlockchain.g:544:4: rule__EDouble__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__EDouble__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getEDoubleAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleEDouble"


    // $ANTLR start "entryRulePrimitivo"
    // InternalBlockchain.g:553:1: entryRulePrimitivo : rulePrimitivo EOF ;
    public final void entryRulePrimitivo() throws RecognitionException {
        try {
            // InternalBlockchain.g:554:1: ( rulePrimitivo EOF )
            // InternalBlockchain.g:555:1: rulePrimitivo EOF
            {
             before(grammarAccess.getPrimitivoRule()); 
            pushFollow(FOLLOW_1);
            rulePrimitivo();

            state._fsp--;

             after(grammarAccess.getPrimitivoRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRulePrimitivo"


    // $ANTLR start "rulePrimitivo"
    // InternalBlockchain.g:562:1: rulePrimitivo : ( ( rule__Primitivo__Group__0 ) ) ;
    public final void rulePrimitivo() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBlockchain.g:566:2: ( ( ( rule__Primitivo__Group__0 ) ) )
            // InternalBlockchain.g:567:2: ( ( rule__Primitivo__Group__0 ) )
            {
            // InternalBlockchain.g:567:2: ( ( rule__Primitivo__Group__0 ) )
            // InternalBlockchain.g:568:3: ( rule__Primitivo__Group__0 )
            {
             before(grammarAccess.getPrimitivoAccess().getGroup()); 
            // InternalBlockchain.g:569:3: ( rule__Primitivo__Group__0 )
            // InternalBlockchain.g:569:4: rule__Primitivo__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Primitivo__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getPrimitivoAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rulePrimitivo"


    // $ANTLR start "entryRuleMapa"
    // InternalBlockchain.g:578:1: entryRuleMapa : ruleMapa EOF ;
    public final void entryRuleMapa() throws RecognitionException {
        try {
            // InternalBlockchain.g:579:1: ( ruleMapa EOF )
            // InternalBlockchain.g:580:1: ruleMapa EOF
            {
             before(grammarAccess.getMapaRule()); 
            pushFollow(FOLLOW_1);
            ruleMapa();

            state._fsp--;

             after(grammarAccess.getMapaRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleMapa"


    // $ANTLR start "ruleMapa"
    // InternalBlockchain.g:587:1: ruleMapa : ( ( rule__Mapa__Group__0 ) ) ;
    public final void ruleMapa() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBlockchain.g:591:2: ( ( ( rule__Mapa__Group__0 ) ) )
            // InternalBlockchain.g:592:2: ( ( rule__Mapa__Group__0 ) )
            {
            // InternalBlockchain.g:592:2: ( ( rule__Mapa__Group__0 ) )
            // InternalBlockchain.g:593:3: ( rule__Mapa__Group__0 )
            {
             before(grammarAccess.getMapaAccess().getGroup()); 
            // InternalBlockchain.g:594:3: ( rule__Mapa__Group__0 )
            // InternalBlockchain.g:594:4: rule__Mapa__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Mapa__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getMapaAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleMapa"


    // $ANTLR start "ruleOperadorLogico"
    // InternalBlockchain.g:603:1: ruleOperadorLogico : ( ( rule__OperadorLogico__Alternatives ) ) ;
    public final void ruleOperadorLogico() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBlockchain.g:607:1: ( ( ( rule__OperadorLogico__Alternatives ) ) )
            // InternalBlockchain.g:608:2: ( ( rule__OperadorLogico__Alternatives ) )
            {
            // InternalBlockchain.g:608:2: ( ( rule__OperadorLogico__Alternatives ) )
            // InternalBlockchain.g:609:3: ( rule__OperadorLogico__Alternatives )
            {
             before(grammarAccess.getOperadorLogicoAccess().getAlternatives()); 
            // InternalBlockchain.g:610:3: ( rule__OperadorLogico__Alternatives )
            // InternalBlockchain.g:610:4: rule__OperadorLogico__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__OperadorLogico__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getOperadorLogicoAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleOperadorLogico"


    // $ANTLR start "ruleOperador"
    // InternalBlockchain.g:619:1: ruleOperador : ( ( rule__Operador__Alternatives ) ) ;
    public final void ruleOperador() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBlockchain.g:623:1: ( ( ( rule__Operador__Alternatives ) ) )
            // InternalBlockchain.g:624:2: ( ( rule__Operador__Alternatives ) )
            {
            // InternalBlockchain.g:624:2: ( ( rule__Operador__Alternatives ) )
            // InternalBlockchain.g:625:3: ( rule__Operador__Alternatives )
            {
             before(grammarAccess.getOperadorAccess().getAlternatives()); 
            // InternalBlockchain.g:626:3: ( rule__Operador__Alternatives )
            // InternalBlockchain.g:626:4: rule__Operador__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__Operador__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getOperadorAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleOperador"


    // $ANTLR start "ruleTipoCondicion"
    // InternalBlockchain.g:635:1: ruleTipoCondicion : ( ( rule__TipoCondicion__Alternatives ) ) ;
    public final void ruleTipoCondicion() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBlockchain.g:639:1: ( ( ( rule__TipoCondicion__Alternatives ) ) )
            // InternalBlockchain.g:640:2: ( ( rule__TipoCondicion__Alternatives ) )
            {
            // InternalBlockchain.g:640:2: ( ( rule__TipoCondicion__Alternatives ) )
            // InternalBlockchain.g:641:3: ( rule__TipoCondicion__Alternatives )
            {
             before(grammarAccess.getTipoCondicionAccess().getAlternatives()); 
            // InternalBlockchain.g:642:3: ( rule__TipoCondicion__Alternatives )
            // InternalBlockchain.g:642:4: rule__TipoCondicion__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__TipoCondicion__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getTipoCondicionAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleTipoCondicion"


    // $ANTLR start "ruleOperadorRelacion"
    // InternalBlockchain.g:651:1: ruleOperadorRelacion : ( ( '.' ) ) ;
    public final void ruleOperadorRelacion() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBlockchain.g:655:1: ( ( ( '.' ) ) )
            // InternalBlockchain.g:656:2: ( ( '.' ) )
            {
            // InternalBlockchain.g:656:2: ( ( '.' ) )
            // InternalBlockchain.g:657:3: ( '.' )
            {
             before(grammarAccess.getOperadorRelacionAccess().getPUNTOEnumLiteralDeclaration()); 
            // InternalBlockchain.g:658:3: ( '.' )
            // InternalBlockchain.g:658:4: '.'
            {
            match(input,11,FOLLOW_2); 

            }

             after(grammarAccess.getOperadorRelacionAccess().getPUNTOEnumLiteralDeclaration()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleOperadorRelacion"


    // $ANTLR start "ruleDatoPrimitivo"
    // InternalBlockchain.g:667:1: ruleDatoPrimitivo : ( ( rule__DatoPrimitivo__Alternatives ) ) ;
    public final void ruleDatoPrimitivo() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBlockchain.g:671:1: ( ( ( rule__DatoPrimitivo__Alternatives ) ) )
            // InternalBlockchain.g:672:2: ( ( rule__DatoPrimitivo__Alternatives ) )
            {
            // InternalBlockchain.g:672:2: ( ( rule__DatoPrimitivo__Alternatives ) )
            // InternalBlockchain.g:673:3: ( rule__DatoPrimitivo__Alternatives )
            {
             before(grammarAccess.getDatoPrimitivoAccess().getAlternatives()); 
            // InternalBlockchain.g:674:3: ( rule__DatoPrimitivo__Alternatives )
            // InternalBlockchain.g:674:4: rule__DatoPrimitivo__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__DatoPrimitivo__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getDatoPrimitivoAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleDatoPrimitivo"


    // $ANTLR start "rule__TipoDato__Alternatives"
    // InternalBlockchain.g:682:1: rule__TipoDato__Alternatives : ( ( ruleEntidad ) | ( rulePrimitivo ) | ( ruleMapa ) );
    public final void rule__TipoDato__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBlockchain.g:686:1: ( ( ruleEntidad ) | ( rulePrimitivo ) | ( ruleMapa ) )
            int alt1=3;
            switch ( input.LA(1) ) {
            case 42:
                {
                alt1=1;
                }
                break;
            case 33:
            case 34:
            case 35:
                {
                alt1=2;
                }
                break;
            case RULE_STRING:
            case RULE_ID:
                {
                alt1=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 1, 0, input);

                throw nvae;
            }

            switch (alt1) {
                case 1 :
                    // InternalBlockchain.g:687:2: ( ruleEntidad )
                    {
                    // InternalBlockchain.g:687:2: ( ruleEntidad )
                    // InternalBlockchain.g:688:3: ruleEntidad
                    {
                     before(grammarAccess.getTipoDatoAccess().getEntidadParserRuleCall_0()); 
                    pushFollow(FOLLOW_2);
                    ruleEntidad();

                    state._fsp--;

                     after(grammarAccess.getTipoDatoAccess().getEntidadParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalBlockchain.g:693:2: ( rulePrimitivo )
                    {
                    // InternalBlockchain.g:693:2: ( rulePrimitivo )
                    // InternalBlockchain.g:694:3: rulePrimitivo
                    {
                     before(grammarAccess.getTipoDatoAccess().getPrimitivoParserRuleCall_1()); 
                    pushFollow(FOLLOW_2);
                    rulePrimitivo();

                    state._fsp--;

                     after(grammarAccess.getTipoDatoAccess().getPrimitivoParserRuleCall_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalBlockchain.g:699:2: ( ruleMapa )
                    {
                    // InternalBlockchain.g:699:2: ( ruleMapa )
                    // InternalBlockchain.g:700:3: ruleMapa
                    {
                     before(grammarAccess.getTipoDatoAccess().getMapaParserRuleCall_2()); 
                    pushFollow(FOLLOW_2);
                    ruleMapa();

                    state._fsp--;

                     after(grammarAccess.getTipoDatoAccess().getMapaParserRuleCall_2()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TipoDato__Alternatives"


    // $ANTLR start "rule__Sentencia__Alternatives"
    // InternalBlockchain.g:709:1: rule__Sentencia__Alternatives : ( ( ruleParametro ) | ( ruleEstado ) | ( ruleExpresionLogica ) | ( ruleExpresionAritmetica ) | ( ruleVariable ) | ( ruleCondicional ) | ( ruleExpresionNumerica ) | ( ruleEString ) | ( ruleEBoolean ) | ( ruleExpresionReferenciada ) | ( ruleExpresionRelacional ) );
    public final void rule__Sentencia__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBlockchain.g:713:1: ( ( ruleParametro ) | ( ruleEstado ) | ( ruleExpresionLogica ) | ( ruleExpresionAritmetica ) | ( ruleVariable ) | ( ruleCondicional ) | ( ruleExpresionNumerica ) | ( ruleEString ) | ( ruleEBoolean ) | ( ruleExpresionReferenciada ) | ( ruleExpresionRelacional ) )
            int alt2=11;
            alt2 = dfa2.predict(input);
            switch (alt2) {
                case 1 :
                    // InternalBlockchain.g:714:2: ( ruleParametro )
                    {
                    // InternalBlockchain.g:714:2: ( ruleParametro )
                    // InternalBlockchain.g:715:3: ruleParametro
                    {
                     before(grammarAccess.getSentenciaAccess().getParametroParserRuleCall_0()); 
                    pushFollow(FOLLOW_2);
                    ruleParametro();

                    state._fsp--;

                     after(grammarAccess.getSentenciaAccess().getParametroParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalBlockchain.g:720:2: ( ruleEstado )
                    {
                    // InternalBlockchain.g:720:2: ( ruleEstado )
                    // InternalBlockchain.g:721:3: ruleEstado
                    {
                     before(grammarAccess.getSentenciaAccess().getEstadoParserRuleCall_1()); 
                    pushFollow(FOLLOW_2);
                    ruleEstado();

                    state._fsp--;

                     after(grammarAccess.getSentenciaAccess().getEstadoParserRuleCall_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalBlockchain.g:726:2: ( ruleExpresionLogica )
                    {
                    // InternalBlockchain.g:726:2: ( ruleExpresionLogica )
                    // InternalBlockchain.g:727:3: ruleExpresionLogica
                    {
                     before(grammarAccess.getSentenciaAccess().getExpresionLogicaParserRuleCall_2()); 
                    pushFollow(FOLLOW_2);
                    ruleExpresionLogica();

                    state._fsp--;

                     after(grammarAccess.getSentenciaAccess().getExpresionLogicaParserRuleCall_2()); 

                    }


                    }
                    break;
                case 4 :
                    // InternalBlockchain.g:732:2: ( ruleExpresionAritmetica )
                    {
                    // InternalBlockchain.g:732:2: ( ruleExpresionAritmetica )
                    // InternalBlockchain.g:733:3: ruleExpresionAritmetica
                    {
                     before(grammarAccess.getSentenciaAccess().getExpresionAritmeticaParserRuleCall_3()); 
                    pushFollow(FOLLOW_2);
                    ruleExpresionAritmetica();

                    state._fsp--;

                     after(grammarAccess.getSentenciaAccess().getExpresionAritmeticaParserRuleCall_3()); 

                    }


                    }
                    break;
                case 5 :
                    // InternalBlockchain.g:738:2: ( ruleVariable )
                    {
                    // InternalBlockchain.g:738:2: ( ruleVariable )
                    // InternalBlockchain.g:739:3: ruleVariable
                    {
                     before(grammarAccess.getSentenciaAccess().getVariableParserRuleCall_4()); 
                    pushFollow(FOLLOW_2);
                    ruleVariable();

                    state._fsp--;

                     after(grammarAccess.getSentenciaAccess().getVariableParserRuleCall_4()); 

                    }


                    }
                    break;
                case 6 :
                    // InternalBlockchain.g:744:2: ( ruleCondicional )
                    {
                    // InternalBlockchain.g:744:2: ( ruleCondicional )
                    // InternalBlockchain.g:745:3: ruleCondicional
                    {
                     before(grammarAccess.getSentenciaAccess().getCondicionalParserRuleCall_5()); 
                    pushFollow(FOLLOW_2);
                    ruleCondicional();

                    state._fsp--;

                     after(grammarAccess.getSentenciaAccess().getCondicionalParserRuleCall_5()); 

                    }


                    }
                    break;
                case 7 :
                    // InternalBlockchain.g:750:2: ( ruleExpresionNumerica )
                    {
                    // InternalBlockchain.g:750:2: ( ruleExpresionNumerica )
                    // InternalBlockchain.g:751:3: ruleExpresionNumerica
                    {
                     before(grammarAccess.getSentenciaAccess().getExpresionNumericaParserRuleCall_6()); 
                    pushFollow(FOLLOW_2);
                    ruleExpresionNumerica();

                    state._fsp--;

                     after(grammarAccess.getSentenciaAccess().getExpresionNumericaParserRuleCall_6()); 

                    }


                    }
                    break;
                case 8 :
                    // InternalBlockchain.g:756:2: ( ruleEString )
                    {
                    // InternalBlockchain.g:756:2: ( ruleEString )
                    // InternalBlockchain.g:757:3: ruleEString
                    {
                     before(grammarAccess.getSentenciaAccess().getEStringParserRuleCall_7()); 
                    pushFollow(FOLLOW_2);
                    ruleEString();

                    state._fsp--;

                     after(grammarAccess.getSentenciaAccess().getEStringParserRuleCall_7()); 

                    }


                    }
                    break;
                case 9 :
                    // InternalBlockchain.g:762:2: ( ruleEBoolean )
                    {
                    // InternalBlockchain.g:762:2: ( ruleEBoolean )
                    // InternalBlockchain.g:763:3: ruleEBoolean
                    {
                     before(grammarAccess.getSentenciaAccess().getEBooleanParserRuleCall_8()); 
                    pushFollow(FOLLOW_2);
                    ruleEBoolean();

                    state._fsp--;

                     after(grammarAccess.getSentenciaAccess().getEBooleanParserRuleCall_8()); 

                    }


                    }
                    break;
                case 10 :
                    // InternalBlockchain.g:768:2: ( ruleExpresionReferenciada )
                    {
                    // InternalBlockchain.g:768:2: ( ruleExpresionReferenciada )
                    // InternalBlockchain.g:769:3: ruleExpresionReferenciada
                    {
                     before(grammarAccess.getSentenciaAccess().getExpresionReferenciadaParserRuleCall_9()); 
                    pushFollow(FOLLOW_2);
                    ruleExpresionReferenciada();

                    state._fsp--;

                     after(grammarAccess.getSentenciaAccess().getExpresionReferenciadaParserRuleCall_9()); 

                    }


                    }
                    break;
                case 11 :
                    // InternalBlockchain.g:774:2: ( ruleExpresionRelacional )
                    {
                    // InternalBlockchain.g:774:2: ( ruleExpresionRelacional )
                    // InternalBlockchain.g:775:3: ruleExpresionRelacional
                    {
                     before(grammarAccess.getSentenciaAccess().getExpresionRelacionalParserRuleCall_10()); 
                    pushFollow(FOLLOW_2);
                    ruleExpresionRelacional();

                    state._fsp--;

                     after(grammarAccess.getSentenciaAccess().getExpresionRelacionalParserRuleCall_10()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Sentencia__Alternatives"


    // $ANTLR start "rule__EString__Alternatives"
    // InternalBlockchain.g:784:1: rule__EString__Alternatives : ( ( RULE_STRING ) | ( RULE_ID ) );
    public final void rule__EString__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBlockchain.g:788:1: ( ( RULE_STRING ) | ( RULE_ID ) )
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0==RULE_STRING) ) {
                alt3=1;
            }
            else if ( (LA3_0==RULE_ID) ) {
                alt3=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 3, 0, input);

                throw nvae;
            }
            switch (alt3) {
                case 1 :
                    // InternalBlockchain.g:789:2: ( RULE_STRING )
                    {
                    // InternalBlockchain.g:789:2: ( RULE_STRING )
                    // InternalBlockchain.g:790:3: RULE_STRING
                    {
                     before(grammarAccess.getEStringAccess().getSTRINGTerminalRuleCall_0()); 
                    match(input,RULE_STRING,FOLLOW_2); 
                     after(grammarAccess.getEStringAccess().getSTRINGTerminalRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalBlockchain.g:795:2: ( RULE_ID )
                    {
                    // InternalBlockchain.g:795:2: ( RULE_ID )
                    // InternalBlockchain.g:796:3: RULE_ID
                    {
                     before(grammarAccess.getEStringAccess().getIDTerminalRuleCall_1()); 
                    match(input,RULE_ID,FOLLOW_2); 
                     after(grammarAccess.getEStringAccess().getIDTerminalRuleCall_1()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EString__Alternatives"


    // $ANTLR start "rule__EBoolean__Alternatives"
    // InternalBlockchain.g:805:1: rule__EBoolean__Alternatives : ( ( 'true' ) | ( 'false' ) );
    public final void rule__EBoolean__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBlockchain.g:809:1: ( ( 'true' ) | ( 'false' ) )
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==12) ) {
                alt4=1;
            }
            else if ( (LA4_0==13) ) {
                alt4=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 4, 0, input);

                throw nvae;
            }
            switch (alt4) {
                case 1 :
                    // InternalBlockchain.g:810:2: ( 'true' )
                    {
                    // InternalBlockchain.g:810:2: ( 'true' )
                    // InternalBlockchain.g:811:3: 'true'
                    {
                     before(grammarAccess.getEBooleanAccess().getTrueKeyword_0()); 
                    match(input,12,FOLLOW_2); 
                     after(grammarAccess.getEBooleanAccess().getTrueKeyword_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalBlockchain.g:816:2: ( 'false' )
                    {
                    // InternalBlockchain.g:816:2: ( 'false' )
                    // InternalBlockchain.g:817:3: 'false'
                    {
                     before(grammarAccess.getEBooleanAccess().getFalseKeyword_1()); 
                    match(input,13,FOLLOW_2); 
                     after(grammarAccess.getEBooleanAccess().getFalseKeyword_1()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EBoolean__Alternatives"


    // $ANTLR start "rule__EDouble__Alternatives_4_0"
    // InternalBlockchain.g:826:1: rule__EDouble__Alternatives_4_0 : ( ( 'E' ) | ( 'e' ) );
    public final void rule__EDouble__Alternatives_4_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBlockchain.g:830:1: ( ( 'E' ) | ( 'e' ) )
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==14) ) {
                alt5=1;
            }
            else if ( (LA5_0==15) ) {
                alt5=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 5, 0, input);

                throw nvae;
            }
            switch (alt5) {
                case 1 :
                    // InternalBlockchain.g:831:2: ( 'E' )
                    {
                    // InternalBlockchain.g:831:2: ( 'E' )
                    // InternalBlockchain.g:832:3: 'E'
                    {
                     before(grammarAccess.getEDoubleAccess().getEKeyword_4_0_0()); 
                    match(input,14,FOLLOW_2); 
                     after(grammarAccess.getEDoubleAccess().getEKeyword_4_0_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalBlockchain.g:837:2: ( 'e' )
                    {
                    // InternalBlockchain.g:837:2: ( 'e' )
                    // InternalBlockchain.g:838:3: 'e'
                    {
                     before(grammarAccess.getEDoubleAccess().getEKeyword_4_0_1()); 
                    match(input,15,FOLLOW_2); 
                     after(grammarAccess.getEDoubleAccess().getEKeyword_4_0_1()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EDouble__Alternatives_4_0"


    // $ANTLR start "rule__OperadorLogico__Alternatives"
    // InternalBlockchain.g:847:1: rule__OperadorLogico__Alternatives : ( ( ( '==' ) ) | ( ( '!=' ) ) | ( ( '>' ) ) | ( ( '<' ) ) | ( ( '>=' ) ) | ( ( '<=' ) ) | ( ( '&&' ) ) | ( ( '||' ) ) );
    public final void rule__OperadorLogico__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBlockchain.g:851:1: ( ( ( '==' ) ) | ( ( '!=' ) ) | ( ( '>' ) ) | ( ( '<' ) ) | ( ( '>=' ) ) | ( ( '<=' ) ) | ( ( '&&' ) ) | ( ( '||' ) ) )
            int alt6=8;
            switch ( input.LA(1) ) {
            case 16:
                {
                alt6=1;
                }
                break;
            case 17:
                {
                alt6=2;
                }
                break;
            case 18:
                {
                alt6=3;
                }
                break;
            case 19:
                {
                alt6=4;
                }
                break;
            case 20:
                {
                alt6=5;
                }
                break;
            case 21:
                {
                alt6=6;
                }
                break;
            case 22:
                {
                alt6=7;
                }
                break;
            case 23:
                {
                alt6=8;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 6, 0, input);

                throw nvae;
            }

            switch (alt6) {
                case 1 :
                    // InternalBlockchain.g:852:2: ( ( '==' ) )
                    {
                    // InternalBlockchain.g:852:2: ( ( '==' ) )
                    // InternalBlockchain.g:853:3: ( '==' )
                    {
                     before(grammarAccess.getOperadorLogicoAccess().getIGUAL_IGUALEnumLiteralDeclaration_0()); 
                    // InternalBlockchain.g:854:3: ( '==' )
                    // InternalBlockchain.g:854:4: '=='
                    {
                    match(input,16,FOLLOW_2); 

                    }

                     after(grammarAccess.getOperadorLogicoAccess().getIGUAL_IGUALEnumLiteralDeclaration_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalBlockchain.g:858:2: ( ( '!=' ) )
                    {
                    // InternalBlockchain.g:858:2: ( ( '!=' ) )
                    // InternalBlockchain.g:859:3: ( '!=' )
                    {
                     before(grammarAccess.getOperadorLogicoAccess().getDIFERENTEEnumLiteralDeclaration_1()); 
                    // InternalBlockchain.g:860:3: ( '!=' )
                    // InternalBlockchain.g:860:4: '!='
                    {
                    match(input,17,FOLLOW_2); 

                    }

                     after(grammarAccess.getOperadorLogicoAccess().getDIFERENTEEnumLiteralDeclaration_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalBlockchain.g:864:2: ( ( '>' ) )
                    {
                    // InternalBlockchain.g:864:2: ( ( '>' ) )
                    // InternalBlockchain.g:865:3: ( '>' )
                    {
                     before(grammarAccess.getOperadorLogicoAccess().getMAYORQUEEnumLiteralDeclaration_2()); 
                    // InternalBlockchain.g:866:3: ( '>' )
                    // InternalBlockchain.g:866:4: '>'
                    {
                    match(input,18,FOLLOW_2); 

                    }

                     after(grammarAccess.getOperadorLogicoAccess().getMAYORQUEEnumLiteralDeclaration_2()); 

                    }


                    }
                    break;
                case 4 :
                    // InternalBlockchain.g:870:2: ( ( '<' ) )
                    {
                    // InternalBlockchain.g:870:2: ( ( '<' ) )
                    // InternalBlockchain.g:871:3: ( '<' )
                    {
                     before(grammarAccess.getOperadorLogicoAccess().getMENORQUEEnumLiteralDeclaration_3()); 
                    // InternalBlockchain.g:872:3: ( '<' )
                    // InternalBlockchain.g:872:4: '<'
                    {
                    match(input,19,FOLLOW_2); 

                    }

                     after(grammarAccess.getOperadorLogicoAccess().getMENORQUEEnumLiteralDeclaration_3()); 

                    }


                    }
                    break;
                case 5 :
                    // InternalBlockchain.g:876:2: ( ( '>=' ) )
                    {
                    // InternalBlockchain.g:876:2: ( ( '>=' ) )
                    // InternalBlockchain.g:877:3: ( '>=' )
                    {
                     before(grammarAccess.getOperadorLogicoAccess().getMAYORIGUALEnumLiteralDeclaration_4()); 
                    // InternalBlockchain.g:878:3: ( '>=' )
                    // InternalBlockchain.g:878:4: '>='
                    {
                    match(input,20,FOLLOW_2); 

                    }

                     after(grammarAccess.getOperadorLogicoAccess().getMAYORIGUALEnumLiteralDeclaration_4()); 

                    }


                    }
                    break;
                case 6 :
                    // InternalBlockchain.g:882:2: ( ( '<=' ) )
                    {
                    // InternalBlockchain.g:882:2: ( ( '<=' ) )
                    // InternalBlockchain.g:883:3: ( '<=' )
                    {
                     before(grammarAccess.getOperadorLogicoAccess().getMENORIGUALEnumLiteralDeclaration_5()); 
                    // InternalBlockchain.g:884:3: ( '<=' )
                    // InternalBlockchain.g:884:4: '<='
                    {
                    match(input,21,FOLLOW_2); 

                    }

                     after(grammarAccess.getOperadorLogicoAccess().getMENORIGUALEnumLiteralDeclaration_5()); 

                    }


                    }
                    break;
                case 7 :
                    // InternalBlockchain.g:888:2: ( ( '&&' ) )
                    {
                    // InternalBlockchain.g:888:2: ( ( '&&' ) )
                    // InternalBlockchain.g:889:3: ( '&&' )
                    {
                     before(grammarAccess.getOperadorLogicoAccess().getANDEnumLiteralDeclaration_6()); 
                    // InternalBlockchain.g:890:3: ( '&&' )
                    // InternalBlockchain.g:890:4: '&&'
                    {
                    match(input,22,FOLLOW_2); 

                    }

                     after(grammarAccess.getOperadorLogicoAccess().getANDEnumLiteralDeclaration_6()); 

                    }


                    }
                    break;
                case 8 :
                    // InternalBlockchain.g:894:2: ( ( '||' ) )
                    {
                    // InternalBlockchain.g:894:2: ( ( '||' ) )
                    // InternalBlockchain.g:895:3: ( '||' )
                    {
                     before(grammarAccess.getOperadorLogicoAccess().getOREnumLiteralDeclaration_7()); 
                    // InternalBlockchain.g:896:3: ( '||' )
                    // InternalBlockchain.g:896:4: '||'
                    {
                    match(input,23,FOLLOW_2); 

                    }

                     after(grammarAccess.getOperadorLogicoAccess().getOREnumLiteralDeclaration_7()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__OperadorLogico__Alternatives"


    // $ANTLR start "rule__Operador__Alternatives"
    // InternalBlockchain.g:904:1: rule__Operador__Alternatives : ( ( ( '+' ) ) | ( ( '-' ) ) | ( ( '*' ) ) | ( ( '/' ) ) | ( ( '=' ) ) | ( ( 'GET' ) ) | ( ( 'DELETE' ) ) );
    public final void rule__Operador__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBlockchain.g:908:1: ( ( ( '+' ) ) | ( ( '-' ) ) | ( ( '*' ) ) | ( ( '/' ) ) | ( ( '=' ) ) | ( ( 'GET' ) ) | ( ( 'DELETE' ) ) )
            int alt7=7;
            switch ( input.LA(1) ) {
            case 24:
                {
                alt7=1;
                }
                break;
            case 25:
                {
                alt7=2;
                }
                break;
            case 26:
                {
                alt7=3;
                }
                break;
            case 27:
                {
                alt7=4;
                }
                break;
            case 28:
                {
                alt7=5;
                }
                break;
            case 29:
                {
                alt7=6;
                }
                break;
            case 30:
                {
                alt7=7;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 7, 0, input);

                throw nvae;
            }

            switch (alt7) {
                case 1 :
                    // InternalBlockchain.g:909:2: ( ( '+' ) )
                    {
                    // InternalBlockchain.g:909:2: ( ( '+' ) )
                    // InternalBlockchain.g:910:3: ( '+' )
                    {
                     before(grammarAccess.getOperadorAccess().getMASEnumLiteralDeclaration_0()); 
                    // InternalBlockchain.g:911:3: ( '+' )
                    // InternalBlockchain.g:911:4: '+'
                    {
                    match(input,24,FOLLOW_2); 

                    }

                     after(grammarAccess.getOperadorAccess().getMASEnumLiteralDeclaration_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalBlockchain.g:915:2: ( ( '-' ) )
                    {
                    // InternalBlockchain.g:915:2: ( ( '-' ) )
                    // InternalBlockchain.g:916:3: ( '-' )
                    {
                     before(grammarAccess.getOperadorAccess().getMENOSEnumLiteralDeclaration_1()); 
                    // InternalBlockchain.g:917:3: ( '-' )
                    // InternalBlockchain.g:917:4: '-'
                    {
                    match(input,25,FOLLOW_2); 

                    }

                     after(grammarAccess.getOperadorAccess().getMENOSEnumLiteralDeclaration_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalBlockchain.g:921:2: ( ( '*' ) )
                    {
                    // InternalBlockchain.g:921:2: ( ( '*' ) )
                    // InternalBlockchain.g:922:3: ( '*' )
                    {
                     before(grammarAccess.getOperadorAccess().getPRODUCTOEnumLiteralDeclaration_2()); 
                    // InternalBlockchain.g:923:3: ( '*' )
                    // InternalBlockchain.g:923:4: '*'
                    {
                    match(input,26,FOLLOW_2); 

                    }

                     after(grammarAccess.getOperadorAccess().getPRODUCTOEnumLiteralDeclaration_2()); 

                    }


                    }
                    break;
                case 4 :
                    // InternalBlockchain.g:927:2: ( ( '/' ) )
                    {
                    // InternalBlockchain.g:927:2: ( ( '/' ) )
                    // InternalBlockchain.g:928:3: ( '/' )
                    {
                     before(grammarAccess.getOperadorAccess().getDIVISIONEnumLiteralDeclaration_3()); 
                    // InternalBlockchain.g:929:3: ( '/' )
                    // InternalBlockchain.g:929:4: '/'
                    {
                    match(input,27,FOLLOW_2); 

                    }

                     after(grammarAccess.getOperadorAccess().getDIVISIONEnumLiteralDeclaration_3()); 

                    }


                    }
                    break;
                case 5 :
                    // InternalBlockchain.g:933:2: ( ( '=' ) )
                    {
                    // InternalBlockchain.g:933:2: ( ( '=' ) )
                    // InternalBlockchain.g:934:3: ( '=' )
                    {
                     before(grammarAccess.getOperadorAccess().getIGUALEnumLiteralDeclaration_4()); 
                    // InternalBlockchain.g:935:3: ( '=' )
                    // InternalBlockchain.g:935:4: '='
                    {
                    match(input,28,FOLLOW_2); 

                    }

                     after(grammarAccess.getOperadorAccess().getIGUALEnumLiteralDeclaration_4()); 

                    }


                    }
                    break;
                case 6 :
                    // InternalBlockchain.g:939:2: ( ( 'GET' ) )
                    {
                    // InternalBlockchain.g:939:2: ( ( 'GET' ) )
                    // InternalBlockchain.g:940:3: ( 'GET' )
                    {
                     before(grammarAccess.getOperadorAccess().getGETEnumLiteralDeclaration_5()); 
                    // InternalBlockchain.g:941:3: ( 'GET' )
                    // InternalBlockchain.g:941:4: 'GET'
                    {
                    match(input,29,FOLLOW_2); 

                    }

                     after(grammarAccess.getOperadorAccess().getGETEnumLiteralDeclaration_5()); 

                    }


                    }
                    break;
                case 7 :
                    // InternalBlockchain.g:945:2: ( ( 'DELETE' ) )
                    {
                    // InternalBlockchain.g:945:2: ( ( 'DELETE' ) )
                    // InternalBlockchain.g:946:3: ( 'DELETE' )
                    {
                     before(grammarAccess.getOperadorAccess().getDELETEEnumLiteralDeclaration_6()); 
                    // InternalBlockchain.g:947:3: ( 'DELETE' )
                    // InternalBlockchain.g:947:4: 'DELETE'
                    {
                    match(input,30,FOLLOW_2); 

                    }

                     after(grammarAccess.getOperadorAccess().getDELETEEnumLiteralDeclaration_6()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Operador__Alternatives"


    // $ANTLR start "rule__TipoCondicion__Alternatives"
    // InternalBlockchain.g:955:1: rule__TipoCondicion__Alternatives : ( ( ( 'if' ) ) | ( ( 'else' ) ) );
    public final void rule__TipoCondicion__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBlockchain.g:959:1: ( ( ( 'if' ) ) | ( ( 'else' ) ) )
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0==31) ) {
                alt8=1;
            }
            else if ( (LA8_0==32) ) {
                alt8=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 8, 0, input);

                throw nvae;
            }
            switch (alt8) {
                case 1 :
                    // InternalBlockchain.g:960:2: ( ( 'if' ) )
                    {
                    // InternalBlockchain.g:960:2: ( ( 'if' ) )
                    // InternalBlockchain.g:961:3: ( 'if' )
                    {
                     before(grammarAccess.getTipoCondicionAccess().getIFEnumLiteralDeclaration_0()); 
                    // InternalBlockchain.g:962:3: ( 'if' )
                    // InternalBlockchain.g:962:4: 'if'
                    {
                    match(input,31,FOLLOW_2); 

                    }

                     after(grammarAccess.getTipoCondicionAccess().getIFEnumLiteralDeclaration_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalBlockchain.g:966:2: ( ( 'else' ) )
                    {
                    // InternalBlockchain.g:966:2: ( ( 'else' ) )
                    // InternalBlockchain.g:967:3: ( 'else' )
                    {
                     before(grammarAccess.getTipoCondicionAccess().getELSEEnumLiteralDeclaration_1()); 
                    // InternalBlockchain.g:968:3: ( 'else' )
                    // InternalBlockchain.g:968:4: 'else'
                    {
                    match(input,32,FOLLOW_2); 

                    }

                     after(grammarAccess.getTipoCondicionAccess().getELSEEnumLiteralDeclaration_1()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TipoCondicion__Alternatives"


    // $ANTLR start "rule__DatoPrimitivo__Alternatives"
    // InternalBlockchain.g:976:1: rule__DatoPrimitivo__Alternatives : ( ( ( 'STRING' ) ) | ( ( 'NUMERICO' ) ) | ( ( 'BOOLEAN' ) ) );
    public final void rule__DatoPrimitivo__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBlockchain.g:980:1: ( ( ( 'STRING' ) ) | ( ( 'NUMERICO' ) ) | ( ( 'BOOLEAN' ) ) )
            int alt9=3;
            switch ( input.LA(1) ) {
            case 33:
                {
                alt9=1;
                }
                break;
            case 34:
                {
                alt9=2;
                }
                break;
            case 35:
                {
                alt9=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 9, 0, input);

                throw nvae;
            }

            switch (alt9) {
                case 1 :
                    // InternalBlockchain.g:981:2: ( ( 'STRING' ) )
                    {
                    // InternalBlockchain.g:981:2: ( ( 'STRING' ) )
                    // InternalBlockchain.g:982:3: ( 'STRING' )
                    {
                     before(grammarAccess.getDatoPrimitivoAccess().getSTRINGEnumLiteralDeclaration_0()); 
                    // InternalBlockchain.g:983:3: ( 'STRING' )
                    // InternalBlockchain.g:983:4: 'STRING'
                    {
                    match(input,33,FOLLOW_2); 

                    }

                     after(grammarAccess.getDatoPrimitivoAccess().getSTRINGEnumLiteralDeclaration_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalBlockchain.g:987:2: ( ( 'NUMERICO' ) )
                    {
                    // InternalBlockchain.g:987:2: ( ( 'NUMERICO' ) )
                    // InternalBlockchain.g:988:3: ( 'NUMERICO' )
                    {
                     before(grammarAccess.getDatoPrimitivoAccess().getNUMERICOEnumLiteralDeclaration_1()); 
                    // InternalBlockchain.g:989:3: ( 'NUMERICO' )
                    // InternalBlockchain.g:989:4: 'NUMERICO'
                    {
                    match(input,34,FOLLOW_2); 

                    }

                     after(grammarAccess.getDatoPrimitivoAccess().getNUMERICOEnumLiteralDeclaration_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalBlockchain.g:993:2: ( ( 'BOOLEAN' ) )
                    {
                    // InternalBlockchain.g:993:2: ( ( 'BOOLEAN' ) )
                    // InternalBlockchain.g:994:3: ( 'BOOLEAN' )
                    {
                     before(grammarAccess.getDatoPrimitivoAccess().getBOOLEANEnumLiteralDeclaration_2()); 
                    // InternalBlockchain.g:995:3: ( 'BOOLEAN' )
                    // InternalBlockchain.g:995:4: 'BOOLEAN'
                    {
                    match(input,35,FOLLOW_2); 

                    }

                     after(grammarAccess.getDatoPrimitivoAccess().getBOOLEANEnumLiteralDeclaration_2()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DatoPrimitivo__Alternatives"


    // $ANTLR start "rule__Aplicacion__Group__0"
    // InternalBlockchain.g:1003:1: rule__Aplicacion__Group__0 : rule__Aplicacion__Group__0__Impl rule__Aplicacion__Group__1 ;
    public final void rule__Aplicacion__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBlockchain.g:1007:1: ( rule__Aplicacion__Group__0__Impl rule__Aplicacion__Group__1 )
            // InternalBlockchain.g:1008:2: rule__Aplicacion__Group__0__Impl rule__Aplicacion__Group__1
            {
            pushFollow(FOLLOW_3);
            rule__Aplicacion__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Aplicacion__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Aplicacion__Group__0"


    // $ANTLR start "rule__Aplicacion__Group__0__Impl"
    // InternalBlockchain.g:1015:1: rule__Aplicacion__Group__0__Impl : ( () ) ;
    public final void rule__Aplicacion__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBlockchain.g:1019:1: ( ( () ) )
            // InternalBlockchain.g:1020:1: ( () )
            {
            // InternalBlockchain.g:1020:1: ( () )
            // InternalBlockchain.g:1021:2: ()
            {
             before(grammarAccess.getAplicacionAccess().getAplicacionAction_0()); 
            // InternalBlockchain.g:1022:2: ()
            // InternalBlockchain.g:1022:3: 
            {
            }

             after(grammarAccess.getAplicacionAccess().getAplicacionAction_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Aplicacion__Group__0__Impl"


    // $ANTLR start "rule__Aplicacion__Group__1"
    // InternalBlockchain.g:1030:1: rule__Aplicacion__Group__1 : rule__Aplicacion__Group__1__Impl rule__Aplicacion__Group__2 ;
    public final void rule__Aplicacion__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBlockchain.g:1034:1: ( rule__Aplicacion__Group__1__Impl rule__Aplicacion__Group__2 )
            // InternalBlockchain.g:1035:2: rule__Aplicacion__Group__1__Impl rule__Aplicacion__Group__2
            {
            pushFollow(FOLLOW_4);
            rule__Aplicacion__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Aplicacion__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Aplicacion__Group__1"


    // $ANTLR start "rule__Aplicacion__Group__1__Impl"
    // InternalBlockchain.g:1042:1: rule__Aplicacion__Group__1__Impl : ( 'Aplicacion' ) ;
    public final void rule__Aplicacion__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBlockchain.g:1046:1: ( ( 'Aplicacion' ) )
            // InternalBlockchain.g:1047:1: ( 'Aplicacion' )
            {
            // InternalBlockchain.g:1047:1: ( 'Aplicacion' )
            // InternalBlockchain.g:1048:2: 'Aplicacion'
            {
             before(grammarAccess.getAplicacionAccess().getAplicacionKeyword_1()); 
            match(input,36,FOLLOW_2); 
             after(grammarAccess.getAplicacionAccess().getAplicacionKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Aplicacion__Group__1__Impl"


    // $ANTLR start "rule__Aplicacion__Group__2"
    // InternalBlockchain.g:1057:1: rule__Aplicacion__Group__2 : rule__Aplicacion__Group__2__Impl rule__Aplicacion__Group__3 ;
    public final void rule__Aplicacion__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBlockchain.g:1061:1: ( rule__Aplicacion__Group__2__Impl rule__Aplicacion__Group__3 )
            // InternalBlockchain.g:1062:2: rule__Aplicacion__Group__2__Impl rule__Aplicacion__Group__3
            {
            pushFollow(FOLLOW_5);
            rule__Aplicacion__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Aplicacion__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Aplicacion__Group__2"


    // $ANTLR start "rule__Aplicacion__Group__2__Impl"
    // InternalBlockchain.g:1069:1: rule__Aplicacion__Group__2__Impl : ( ( rule__Aplicacion__NameAssignment_2 ) ) ;
    public final void rule__Aplicacion__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBlockchain.g:1073:1: ( ( ( rule__Aplicacion__NameAssignment_2 ) ) )
            // InternalBlockchain.g:1074:1: ( ( rule__Aplicacion__NameAssignment_2 ) )
            {
            // InternalBlockchain.g:1074:1: ( ( rule__Aplicacion__NameAssignment_2 ) )
            // InternalBlockchain.g:1075:2: ( rule__Aplicacion__NameAssignment_2 )
            {
             before(grammarAccess.getAplicacionAccess().getNameAssignment_2()); 
            // InternalBlockchain.g:1076:2: ( rule__Aplicacion__NameAssignment_2 )
            // InternalBlockchain.g:1076:3: rule__Aplicacion__NameAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__Aplicacion__NameAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getAplicacionAccess().getNameAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Aplicacion__Group__2__Impl"


    // $ANTLR start "rule__Aplicacion__Group__3"
    // InternalBlockchain.g:1084:1: rule__Aplicacion__Group__3 : rule__Aplicacion__Group__3__Impl rule__Aplicacion__Group__4 ;
    public final void rule__Aplicacion__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBlockchain.g:1088:1: ( rule__Aplicacion__Group__3__Impl rule__Aplicacion__Group__4 )
            // InternalBlockchain.g:1089:2: rule__Aplicacion__Group__3__Impl rule__Aplicacion__Group__4
            {
            pushFollow(FOLLOW_6);
            rule__Aplicacion__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Aplicacion__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Aplicacion__Group__3"


    // $ANTLR start "rule__Aplicacion__Group__3__Impl"
    // InternalBlockchain.g:1096:1: rule__Aplicacion__Group__3__Impl : ( '{' ) ;
    public final void rule__Aplicacion__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBlockchain.g:1100:1: ( ( '{' ) )
            // InternalBlockchain.g:1101:1: ( '{' )
            {
            // InternalBlockchain.g:1101:1: ( '{' )
            // InternalBlockchain.g:1102:2: '{'
            {
             before(grammarAccess.getAplicacionAccess().getLeftCurlyBracketKeyword_3()); 
            match(input,37,FOLLOW_2); 
             after(grammarAccess.getAplicacionAccess().getLeftCurlyBracketKeyword_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Aplicacion__Group__3__Impl"


    // $ANTLR start "rule__Aplicacion__Group__4"
    // InternalBlockchain.g:1111:1: rule__Aplicacion__Group__4 : rule__Aplicacion__Group__4__Impl rule__Aplicacion__Group__5 ;
    public final void rule__Aplicacion__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBlockchain.g:1115:1: ( rule__Aplicacion__Group__4__Impl rule__Aplicacion__Group__5 )
            // InternalBlockchain.g:1116:2: rule__Aplicacion__Group__4__Impl rule__Aplicacion__Group__5
            {
            pushFollow(FOLLOW_6);
            rule__Aplicacion__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Aplicacion__Group__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Aplicacion__Group__4"


    // $ANTLR start "rule__Aplicacion__Group__4__Impl"
    // InternalBlockchain.g:1123:1: rule__Aplicacion__Group__4__Impl : ( ( rule__Aplicacion__Group_4__0 )? ) ;
    public final void rule__Aplicacion__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBlockchain.g:1127:1: ( ( ( rule__Aplicacion__Group_4__0 )? ) )
            // InternalBlockchain.g:1128:1: ( ( rule__Aplicacion__Group_4__0 )? )
            {
            // InternalBlockchain.g:1128:1: ( ( rule__Aplicacion__Group_4__0 )? )
            // InternalBlockchain.g:1129:2: ( rule__Aplicacion__Group_4__0 )?
            {
             before(grammarAccess.getAplicacionAccess().getGroup_4()); 
            // InternalBlockchain.g:1130:2: ( rule__Aplicacion__Group_4__0 )?
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0==41) ) {
                alt10=1;
            }
            switch (alt10) {
                case 1 :
                    // InternalBlockchain.g:1130:3: rule__Aplicacion__Group_4__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Aplicacion__Group_4__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getAplicacionAccess().getGroup_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Aplicacion__Group__4__Impl"


    // $ANTLR start "rule__Aplicacion__Group__5"
    // InternalBlockchain.g:1138:1: rule__Aplicacion__Group__5 : rule__Aplicacion__Group__5__Impl rule__Aplicacion__Group__6 ;
    public final void rule__Aplicacion__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBlockchain.g:1142:1: ( rule__Aplicacion__Group__5__Impl rule__Aplicacion__Group__6 )
            // InternalBlockchain.g:1143:2: rule__Aplicacion__Group__5__Impl rule__Aplicacion__Group__6
            {
            pushFollow(FOLLOW_6);
            rule__Aplicacion__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Aplicacion__Group__6();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Aplicacion__Group__5"


    // $ANTLR start "rule__Aplicacion__Group__5__Impl"
    // InternalBlockchain.g:1150:1: rule__Aplicacion__Group__5__Impl : ( ( rule__Aplicacion__Group_5__0 )* ) ;
    public final void rule__Aplicacion__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBlockchain.g:1154:1: ( ( ( rule__Aplicacion__Group_5__0 )* ) )
            // InternalBlockchain.g:1155:1: ( ( rule__Aplicacion__Group_5__0 )* )
            {
            // InternalBlockchain.g:1155:1: ( ( rule__Aplicacion__Group_5__0 )* )
            // InternalBlockchain.g:1156:2: ( rule__Aplicacion__Group_5__0 )*
            {
             before(grammarAccess.getAplicacionAccess().getGroup_5()); 
            // InternalBlockchain.g:1157:2: ( rule__Aplicacion__Group_5__0 )*
            loop11:
            do {
                int alt11=2;
                int LA11_0 = input.LA(1);

                if ( (LA11_0==40) ) {
                    alt11=1;
                }


                switch (alt11) {
            	case 1 :
            	    // InternalBlockchain.g:1157:3: rule__Aplicacion__Group_5__0
            	    {
            	    pushFollow(FOLLOW_7);
            	    rule__Aplicacion__Group_5__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop11;
                }
            } while (true);

             after(grammarAccess.getAplicacionAccess().getGroup_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Aplicacion__Group__5__Impl"


    // $ANTLR start "rule__Aplicacion__Group__6"
    // InternalBlockchain.g:1165:1: rule__Aplicacion__Group__6 : rule__Aplicacion__Group__6__Impl ;
    public final void rule__Aplicacion__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBlockchain.g:1169:1: ( rule__Aplicacion__Group__6__Impl )
            // InternalBlockchain.g:1170:2: rule__Aplicacion__Group__6__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Aplicacion__Group__6__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Aplicacion__Group__6"


    // $ANTLR start "rule__Aplicacion__Group__6__Impl"
    // InternalBlockchain.g:1176:1: rule__Aplicacion__Group__6__Impl : ( '}' ) ;
    public final void rule__Aplicacion__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBlockchain.g:1180:1: ( ( '}' ) )
            // InternalBlockchain.g:1181:1: ( '}' )
            {
            // InternalBlockchain.g:1181:1: ( '}' )
            // InternalBlockchain.g:1182:2: '}'
            {
             before(grammarAccess.getAplicacionAccess().getRightCurlyBracketKeyword_6()); 
            match(input,38,FOLLOW_2); 
             after(grammarAccess.getAplicacionAccess().getRightCurlyBracketKeyword_6()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Aplicacion__Group__6__Impl"


    // $ANTLR start "rule__Aplicacion__Group_4__0"
    // InternalBlockchain.g:1192:1: rule__Aplicacion__Group_4__0 : rule__Aplicacion__Group_4__0__Impl rule__Aplicacion__Group_4__1 ;
    public final void rule__Aplicacion__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBlockchain.g:1196:1: ( rule__Aplicacion__Group_4__0__Impl rule__Aplicacion__Group_4__1 )
            // InternalBlockchain.g:1197:2: rule__Aplicacion__Group_4__0__Impl rule__Aplicacion__Group_4__1
            {
            pushFollow(FOLLOW_8);
            rule__Aplicacion__Group_4__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Aplicacion__Group_4__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Aplicacion__Group_4__0"


    // $ANTLR start "rule__Aplicacion__Group_4__0__Impl"
    // InternalBlockchain.g:1204:1: rule__Aplicacion__Group_4__0__Impl : ( ( rule__Aplicacion__SmartcontractAssignment_4_0 ) ) ;
    public final void rule__Aplicacion__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBlockchain.g:1208:1: ( ( ( rule__Aplicacion__SmartcontractAssignment_4_0 ) ) )
            // InternalBlockchain.g:1209:1: ( ( rule__Aplicacion__SmartcontractAssignment_4_0 ) )
            {
            // InternalBlockchain.g:1209:1: ( ( rule__Aplicacion__SmartcontractAssignment_4_0 ) )
            // InternalBlockchain.g:1210:2: ( rule__Aplicacion__SmartcontractAssignment_4_0 )
            {
             before(grammarAccess.getAplicacionAccess().getSmartcontractAssignment_4_0()); 
            // InternalBlockchain.g:1211:2: ( rule__Aplicacion__SmartcontractAssignment_4_0 )
            // InternalBlockchain.g:1211:3: rule__Aplicacion__SmartcontractAssignment_4_0
            {
            pushFollow(FOLLOW_2);
            rule__Aplicacion__SmartcontractAssignment_4_0();

            state._fsp--;


            }

             after(grammarAccess.getAplicacionAccess().getSmartcontractAssignment_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Aplicacion__Group_4__0__Impl"


    // $ANTLR start "rule__Aplicacion__Group_4__1"
    // InternalBlockchain.g:1219:1: rule__Aplicacion__Group_4__1 : rule__Aplicacion__Group_4__1__Impl ;
    public final void rule__Aplicacion__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBlockchain.g:1223:1: ( rule__Aplicacion__Group_4__1__Impl )
            // InternalBlockchain.g:1224:2: rule__Aplicacion__Group_4__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Aplicacion__Group_4__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Aplicacion__Group_4__1"


    // $ANTLR start "rule__Aplicacion__Group_4__1__Impl"
    // InternalBlockchain.g:1230:1: rule__Aplicacion__Group_4__1__Impl : ( ( rule__Aplicacion__Group_4_1__0 )* ) ;
    public final void rule__Aplicacion__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBlockchain.g:1234:1: ( ( ( rule__Aplicacion__Group_4_1__0 )* ) )
            // InternalBlockchain.g:1235:1: ( ( rule__Aplicacion__Group_4_1__0 )* )
            {
            // InternalBlockchain.g:1235:1: ( ( rule__Aplicacion__Group_4_1__0 )* )
            // InternalBlockchain.g:1236:2: ( rule__Aplicacion__Group_4_1__0 )*
            {
             before(grammarAccess.getAplicacionAccess().getGroup_4_1()); 
            // InternalBlockchain.g:1237:2: ( rule__Aplicacion__Group_4_1__0 )*
            loop12:
            do {
                int alt12=2;
                int LA12_0 = input.LA(1);

                if ( (LA12_0==39) ) {
                    alt12=1;
                }


                switch (alt12) {
            	case 1 :
            	    // InternalBlockchain.g:1237:3: rule__Aplicacion__Group_4_1__0
            	    {
            	    pushFollow(FOLLOW_9);
            	    rule__Aplicacion__Group_4_1__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop12;
                }
            } while (true);

             after(grammarAccess.getAplicacionAccess().getGroup_4_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Aplicacion__Group_4__1__Impl"


    // $ANTLR start "rule__Aplicacion__Group_4_1__0"
    // InternalBlockchain.g:1246:1: rule__Aplicacion__Group_4_1__0 : rule__Aplicacion__Group_4_1__0__Impl rule__Aplicacion__Group_4_1__1 ;
    public final void rule__Aplicacion__Group_4_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBlockchain.g:1250:1: ( rule__Aplicacion__Group_4_1__0__Impl rule__Aplicacion__Group_4_1__1 )
            // InternalBlockchain.g:1251:2: rule__Aplicacion__Group_4_1__0__Impl rule__Aplicacion__Group_4_1__1
            {
            pushFollow(FOLLOW_10);
            rule__Aplicacion__Group_4_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Aplicacion__Group_4_1__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Aplicacion__Group_4_1__0"


    // $ANTLR start "rule__Aplicacion__Group_4_1__0__Impl"
    // InternalBlockchain.g:1258:1: rule__Aplicacion__Group_4_1__0__Impl : ( ',' ) ;
    public final void rule__Aplicacion__Group_4_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBlockchain.g:1262:1: ( ( ',' ) )
            // InternalBlockchain.g:1263:1: ( ',' )
            {
            // InternalBlockchain.g:1263:1: ( ',' )
            // InternalBlockchain.g:1264:2: ','
            {
             before(grammarAccess.getAplicacionAccess().getCommaKeyword_4_1_0()); 
            match(input,39,FOLLOW_2); 
             after(grammarAccess.getAplicacionAccess().getCommaKeyword_4_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Aplicacion__Group_4_1__0__Impl"


    // $ANTLR start "rule__Aplicacion__Group_4_1__1"
    // InternalBlockchain.g:1273:1: rule__Aplicacion__Group_4_1__1 : rule__Aplicacion__Group_4_1__1__Impl ;
    public final void rule__Aplicacion__Group_4_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBlockchain.g:1277:1: ( rule__Aplicacion__Group_4_1__1__Impl )
            // InternalBlockchain.g:1278:2: rule__Aplicacion__Group_4_1__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Aplicacion__Group_4_1__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Aplicacion__Group_4_1__1"


    // $ANTLR start "rule__Aplicacion__Group_4_1__1__Impl"
    // InternalBlockchain.g:1284:1: rule__Aplicacion__Group_4_1__1__Impl : ( ( rule__Aplicacion__SmartcontractAssignment_4_1_1 ) ) ;
    public final void rule__Aplicacion__Group_4_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBlockchain.g:1288:1: ( ( ( rule__Aplicacion__SmartcontractAssignment_4_1_1 ) ) )
            // InternalBlockchain.g:1289:1: ( ( rule__Aplicacion__SmartcontractAssignment_4_1_1 ) )
            {
            // InternalBlockchain.g:1289:1: ( ( rule__Aplicacion__SmartcontractAssignment_4_1_1 ) )
            // InternalBlockchain.g:1290:2: ( rule__Aplicacion__SmartcontractAssignment_4_1_1 )
            {
             before(grammarAccess.getAplicacionAccess().getSmartcontractAssignment_4_1_1()); 
            // InternalBlockchain.g:1291:2: ( rule__Aplicacion__SmartcontractAssignment_4_1_1 )
            // InternalBlockchain.g:1291:3: rule__Aplicacion__SmartcontractAssignment_4_1_1
            {
            pushFollow(FOLLOW_2);
            rule__Aplicacion__SmartcontractAssignment_4_1_1();

            state._fsp--;


            }

             after(grammarAccess.getAplicacionAccess().getSmartcontractAssignment_4_1_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Aplicacion__Group_4_1__1__Impl"


    // $ANTLR start "rule__Aplicacion__Group_5__0"
    // InternalBlockchain.g:1300:1: rule__Aplicacion__Group_5__0 : rule__Aplicacion__Group_5__0__Impl rule__Aplicacion__Group_5__1 ;
    public final void rule__Aplicacion__Group_5__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBlockchain.g:1304:1: ( rule__Aplicacion__Group_5__0__Impl rule__Aplicacion__Group_5__1 )
            // InternalBlockchain.g:1305:2: rule__Aplicacion__Group_5__0__Impl rule__Aplicacion__Group_5__1
            {
            pushFollow(FOLLOW_11);
            rule__Aplicacion__Group_5__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Aplicacion__Group_5__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Aplicacion__Group_5__0"


    // $ANTLR start "rule__Aplicacion__Group_5__0__Impl"
    // InternalBlockchain.g:1312:1: rule__Aplicacion__Group_5__0__Impl : ( 'TipoDato' ) ;
    public final void rule__Aplicacion__Group_5__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBlockchain.g:1316:1: ( ( 'TipoDato' ) )
            // InternalBlockchain.g:1317:1: ( 'TipoDato' )
            {
            // InternalBlockchain.g:1317:1: ( 'TipoDato' )
            // InternalBlockchain.g:1318:2: 'TipoDato'
            {
             before(grammarAccess.getAplicacionAccess().getTipoDatoKeyword_5_0()); 
            match(input,40,FOLLOW_2); 
             after(grammarAccess.getAplicacionAccess().getTipoDatoKeyword_5_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Aplicacion__Group_5__0__Impl"


    // $ANTLR start "rule__Aplicacion__Group_5__1"
    // InternalBlockchain.g:1327:1: rule__Aplicacion__Group_5__1 : rule__Aplicacion__Group_5__1__Impl rule__Aplicacion__Group_5__2 ;
    public final void rule__Aplicacion__Group_5__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBlockchain.g:1331:1: ( rule__Aplicacion__Group_5__1__Impl rule__Aplicacion__Group_5__2 )
            // InternalBlockchain.g:1332:2: rule__Aplicacion__Group_5__1__Impl rule__Aplicacion__Group_5__2
            {
            pushFollow(FOLLOW_8);
            rule__Aplicacion__Group_5__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Aplicacion__Group_5__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Aplicacion__Group_5__1"


    // $ANTLR start "rule__Aplicacion__Group_5__1__Impl"
    // InternalBlockchain.g:1339:1: rule__Aplicacion__Group_5__1__Impl : ( ( rule__Aplicacion__TipodatoAssignment_5_1 ) ) ;
    public final void rule__Aplicacion__Group_5__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBlockchain.g:1343:1: ( ( ( rule__Aplicacion__TipodatoAssignment_5_1 ) ) )
            // InternalBlockchain.g:1344:1: ( ( rule__Aplicacion__TipodatoAssignment_5_1 ) )
            {
            // InternalBlockchain.g:1344:1: ( ( rule__Aplicacion__TipodatoAssignment_5_1 ) )
            // InternalBlockchain.g:1345:2: ( rule__Aplicacion__TipodatoAssignment_5_1 )
            {
             before(grammarAccess.getAplicacionAccess().getTipodatoAssignment_5_1()); 
            // InternalBlockchain.g:1346:2: ( rule__Aplicacion__TipodatoAssignment_5_1 )
            // InternalBlockchain.g:1346:3: rule__Aplicacion__TipodatoAssignment_5_1
            {
            pushFollow(FOLLOW_2);
            rule__Aplicacion__TipodatoAssignment_5_1();

            state._fsp--;


            }

             after(grammarAccess.getAplicacionAccess().getTipodatoAssignment_5_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Aplicacion__Group_5__1__Impl"


    // $ANTLR start "rule__Aplicacion__Group_5__2"
    // InternalBlockchain.g:1354:1: rule__Aplicacion__Group_5__2 : rule__Aplicacion__Group_5__2__Impl ;
    public final void rule__Aplicacion__Group_5__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBlockchain.g:1358:1: ( rule__Aplicacion__Group_5__2__Impl )
            // InternalBlockchain.g:1359:2: rule__Aplicacion__Group_5__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Aplicacion__Group_5__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Aplicacion__Group_5__2"


    // $ANTLR start "rule__Aplicacion__Group_5__2__Impl"
    // InternalBlockchain.g:1365:1: rule__Aplicacion__Group_5__2__Impl : ( ( rule__Aplicacion__Group_5_2__0 )* ) ;
    public final void rule__Aplicacion__Group_5__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBlockchain.g:1369:1: ( ( ( rule__Aplicacion__Group_5_2__0 )* ) )
            // InternalBlockchain.g:1370:1: ( ( rule__Aplicacion__Group_5_2__0 )* )
            {
            // InternalBlockchain.g:1370:1: ( ( rule__Aplicacion__Group_5_2__0 )* )
            // InternalBlockchain.g:1371:2: ( rule__Aplicacion__Group_5_2__0 )*
            {
             before(grammarAccess.getAplicacionAccess().getGroup_5_2()); 
            // InternalBlockchain.g:1372:2: ( rule__Aplicacion__Group_5_2__0 )*
            loop13:
            do {
                int alt13=2;
                int LA13_0 = input.LA(1);

                if ( (LA13_0==39) ) {
                    alt13=1;
                }


                switch (alt13) {
            	case 1 :
            	    // InternalBlockchain.g:1372:3: rule__Aplicacion__Group_5_2__0
            	    {
            	    pushFollow(FOLLOW_9);
            	    rule__Aplicacion__Group_5_2__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop13;
                }
            } while (true);

             after(grammarAccess.getAplicacionAccess().getGroup_5_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Aplicacion__Group_5__2__Impl"


    // $ANTLR start "rule__Aplicacion__Group_5_2__0"
    // InternalBlockchain.g:1381:1: rule__Aplicacion__Group_5_2__0 : rule__Aplicacion__Group_5_2__0__Impl rule__Aplicacion__Group_5_2__1 ;
    public final void rule__Aplicacion__Group_5_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBlockchain.g:1385:1: ( rule__Aplicacion__Group_5_2__0__Impl rule__Aplicacion__Group_5_2__1 )
            // InternalBlockchain.g:1386:2: rule__Aplicacion__Group_5_2__0__Impl rule__Aplicacion__Group_5_2__1
            {
            pushFollow(FOLLOW_11);
            rule__Aplicacion__Group_5_2__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Aplicacion__Group_5_2__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Aplicacion__Group_5_2__0"


    // $ANTLR start "rule__Aplicacion__Group_5_2__0__Impl"
    // InternalBlockchain.g:1393:1: rule__Aplicacion__Group_5_2__0__Impl : ( ',' ) ;
    public final void rule__Aplicacion__Group_5_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBlockchain.g:1397:1: ( ( ',' ) )
            // InternalBlockchain.g:1398:1: ( ',' )
            {
            // InternalBlockchain.g:1398:1: ( ',' )
            // InternalBlockchain.g:1399:2: ','
            {
             before(grammarAccess.getAplicacionAccess().getCommaKeyword_5_2_0()); 
            match(input,39,FOLLOW_2); 
             after(grammarAccess.getAplicacionAccess().getCommaKeyword_5_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Aplicacion__Group_5_2__0__Impl"


    // $ANTLR start "rule__Aplicacion__Group_5_2__1"
    // InternalBlockchain.g:1408:1: rule__Aplicacion__Group_5_2__1 : rule__Aplicacion__Group_5_2__1__Impl ;
    public final void rule__Aplicacion__Group_5_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBlockchain.g:1412:1: ( rule__Aplicacion__Group_5_2__1__Impl )
            // InternalBlockchain.g:1413:2: rule__Aplicacion__Group_5_2__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Aplicacion__Group_5_2__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Aplicacion__Group_5_2__1"


    // $ANTLR start "rule__Aplicacion__Group_5_2__1__Impl"
    // InternalBlockchain.g:1419:1: rule__Aplicacion__Group_5_2__1__Impl : ( ( rule__Aplicacion__TipodatoAssignment_5_2_1 ) ) ;
    public final void rule__Aplicacion__Group_5_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBlockchain.g:1423:1: ( ( ( rule__Aplicacion__TipodatoAssignment_5_2_1 ) ) )
            // InternalBlockchain.g:1424:1: ( ( rule__Aplicacion__TipodatoAssignment_5_2_1 ) )
            {
            // InternalBlockchain.g:1424:1: ( ( rule__Aplicacion__TipodatoAssignment_5_2_1 ) )
            // InternalBlockchain.g:1425:2: ( rule__Aplicacion__TipodatoAssignment_5_2_1 )
            {
             before(grammarAccess.getAplicacionAccess().getTipodatoAssignment_5_2_1()); 
            // InternalBlockchain.g:1426:2: ( rule__Aplicacion__TipodatoAssignment_5_2_1 )
            // InternalBlockchain.g:1426:3: rule__Aplicacion__TipodatoAssignment_5_2_1
            {
            pushFollow(FOLLOW_2);
            rule__Aplicacion__TipodatoAssignment_5_2_1();

            state._fsp--;


            }

             after(grammarAccess.getAplicacionAccess().getTipodatoAssignment_5_2_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Aplicacion__Group_5_2__1__Impl"


    // $ANTLR start "rule__SmartContract__Group__0"
    // InternalBlockchain.g:1435:1: rule__SmartContract__Group__0 : rule__SmartContract__Group__0__Impl rule__SmartContract__Group__1 ;
    public final void rule__SmartContract__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBlockchain.g:1439:1: ( rule__SmartContract__Group__0__Impl rule__SmartContract__Group__1 )
            // InternalBlockchain.g:1440:2: rule__SmartContract__Group__0__Impl rule__SmartContract__Group__1
            {
            pushFollow(FOLLOW_4);
            rule__SmartContract__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__SmartContract__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SmartContract__Group__0"


    // $ANTLR start "rule__SmartContract__Group__0__Impl"
    // InternalBlockchain.g:1447:1: rule__SmartContract__Group__0__Impl : ( 'SmartContract' ) ;
    public final void rule__SmartContract__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBlockchain.g:1451:1: ( ( 'SmartContract' ) )
            // InternalBlockchain.g:1452:1: ( 'SmartContract' )
            {
            // InternalBlockchain.g:1452:1: ( 'SmartContract' )
            // InternalBlockchain.g:1453:2: 'SmartContract'
            {
             before(grammarAccess.getSmartContractAccess().getSmartContractKeyword_0()); 
            match(input,41,FOLLOW_2); 
             after(grammarAccess.getSmartContractAccess().getSmartContractKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SmartContract__Group__0__Impl"


    // $ANTLR start "rule__SmartContract__Group__1"
    // InternalBlockchain.g:1462:1: rule__SmartContract__Group__1 : rule__SmartContract__Group__1__Impl rule__SmartContract__Group__2 ;
    public final void rule__SmartContract__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBlockchain.g:1466:1: ( rule__SmartContract__Group__1__Impl rule__SmartContract__Group__2 )
            // InternalBlockchain.g:1467:2: rule__SmartContract__Group__1__Impl rule__SmartContract__Group__2
            {
            pushFollow(FOLLOW_5);
            rule__SmartContract__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__SmartContract__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SmartContract__Group__1"


    // $ANTLR start "rule__SmartContract__Group__1__Impl"
    // InternalBlockchain.g:1474:1: rule__SmartContract__Group__1__Impl : ( ( rule__SmartContract__NameAssignment_1 ) ) ;
    public final void rule__SmartContract__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBlockchain.g:1478:1: ( ( ( rule__SmartContract__NameAssignment_1 ) ) )
            // InternalBlockchain.g:1479:1: ( ( rule__SmartContract__NameAssignment_1 ) )
            {
            // InternalBlockchain.g:1479:1: ( ( rule__SmartContract__NameAssignment_1 ) )
            // InternalBlockchain.g:1480:2: ( rule__SmartContract__NameAssignment_1 )
            {
             before(grammarAccess.getSmartContractAccess().getNameAssignment_1()); 
            // InternalBlockchain.g:1481:2: ( rule__SmartContract__NameAssignment_1 )
            // InternalBlockchain.g:1481:3: rule__SmartContract__NameAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__SmartContract__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getSmartContractAccess().getNameAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SmartContract__Group__1__Impl"


    // $ANTLR start "rule__SmartContract__Group__2"
    // InternalBlockchain.g:1489:1: rule__SmartContract__Group__2 : rule__SmartContract__Group__2__Impl rule__SmartContract__Group__3 ;
    public final void rule__SmartContract__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBlockchain.g:1493:1: ( rule__SmartContract__Group__2__Impl rule__SmartContract__Group__3 )
            // InternalBlockchain.g:1494:2: rule__SmartContract__Group__2__Impl rule__SmartContract__Group__3
            {
            pushFollow(FOLLOW_12);
            rule__SmartContract__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__SmartContract__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SmartContract__Group__2"


    // $ANTLR start "rule__SmartContract__Group__2__Impl"
    // InternalBlockchain.g:1501:1: rule__SmartContract__Group__2__Impl : ( '{' ) ;
    public final void rule__SmartContract__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBlockchain.g:1505:1: ( ( '{' ) )
            // InternalBlockchain.g:1506:1: ( '{' )
            {
            // InternalBlockchain.g:1506:1: ( '{' )
            // InternalBlockchain.g:1507:2: '{'
            {
             before(grammarAccess.getSmartContractAccess().getLeftCurlyBracketKeyword_2()); 
            match(input,37,FOLLOW_2); 
             after(grammarAccess.getSmartContractAccess().getLeftCurlyBracketKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SmartContract__Group__2__Impl"


    // $ANTLR start "rule__SmartContract__Group__3"
    // InternalBlockchain.g:1516:1: rule__SmartContract__Group__3 : rule__SmartContract__Group__3__Impl rule__SmartContract__Group__4 ;
    public final void rule__SmartContract__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBlockchain.g:1520:1: ( rule__SmartContract__Group__3__Impl rule__SmartContract__Group__4 )
            // InternalBlockchain.g:1521:2: rule__SmartContract__Group__3__Impl rule__SmartContract__Group__4
            {
            pushFollow(FOLLOW_12);
            rule__SmartContract__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__SmartContract__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SmartContract__Group__3"


    // $ANTLR start "rule__SmartContract__Group__3__Impl"
    // InternalBlockchain.g:1528:1: rule__SmartContract__Group__3__Impl : ( ( rule__SmartContract__Group_3__0 )* ) ;
    public final void rule__SmartContract__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBlockchain.g:1532:1: ( ( ( rule__SmartContract__Group_3__0 )* ) )
            // InternalBlockchain.g:1533:1: ( ( rule__SmartContract__Group_3__0 )* )
            {
            // InternalBlockchain.g:1533:1: ( ( rule__SmartContract__Group_3__0 )* )
            // InternalBlockchain.g:1534:2: ( rule__SmartContract__Group_3__0 )*
            {
             before(grammarAccess.getSmartContractAccess().getGroup_3()); 
            // InternalBlockchain.g:1535:2: ( rule__SmartContract__Group_3__0 )*
            loop14:
            do {
                int alt14=2;
                int LA14_0 = input.LA(1);

                if ( (LA14_0==42) ) {
                    alt14=1;
                }


                switch (alt14) {
            	case 1 :
            	    // InternalBlockchain.g:1535:3: rule__SmartContract__Group_3__0
            	    {
            	    pushFollow(FOLLOW_13);
            	    rule__SmartContract__Group_3__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop14;
                }
            } while (true);

             after(grammarAccess.getSmartContractAccess().getGroup_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SmartContract__Group__3__Impl"


    // $ANTLR start "rule__SmartContract__Group__4"
    // InternalBlockchain.g:1543:1: rule__SmartContract__Group__4 : rule__SmartContract__Group__4__Impl rule__SmartContract__Group__5 ;
    public final void rule__SmartContract__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBlockchain.g:1547:1: ( rule__SmartContract__Group__4__Impl rule__SmartContract__Group__5 )
            // InternalBlockchain.g:1548:2: rule__SmartContract__Group__4__Impl rule__SmartContract__Group__5
            {
            pushFollow(FOLLOW_12);
            rule__SmartContract__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__SmartContract__Group__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SmartContract__Group__4"


    // $ANTLR start "rule__SmartContract__Group__4__Impl"
    // InternalBlockchain.g:1555:1: rule__SmartContract__Group__4__Impl : ( ( rule__SmartContract__Group_4__0 )* ) ;
    public final void rule__SmartContract__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBlockchain.g:1559:1: ( ( ( rule__SmartContract__Group_4__0 )* ) )
            // InternalBlockchain.g:1560:1: ( ( rule__SmartContract__Group_4__0 )* )
            {
            // InternalBlockchain.g:1560:1: ( ( rule__SmartContract__Group_4__0 )* )
            // InternalBlockchain.g:1561:2: ( rule__SmartContract__Group_4__0 )*
            {
             before(grammarAccess.getSmartContractAccess().getGroup_4()); 
            // InternalBlockchain.g:1562:2: ( rule__SmartContract__Group_4__0 )*
            loop15:
            do {
                int alt15=2;
                int LA15_0 = input.LA(1);

                if ( (LA15_0==49) ) {
                    alt15=1;
                }


                switch (alt15) {
            	case 1 :
            	    // InternalBlockchain.g:1562:3: rule__SmartContract__Group_4__0
            	    {
            	    pushFollow(FOLLOW_14);
            	    rule__SmartContract__Group_4__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop15;
                }
            } while (true);

             after(grammarAccess.getSmartContractAccess().getGroup_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SmartContract__Group__4__Impl"


    // $ANTLR start "rule__SmartContract__Group__5"
    // InternalBlockchain.g:1570:1: rule__SmartContract__Group__5 : rule__SmartContract__Group__5__Impl rule__SmartContract__Group__6 ;
    public final void rule__SmartContract__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBlockchain.g:1574:1: ( rule__SmartContract__Group__5__Impl rule__SmartContract__Group__6 )
            // InternalBlockchain.g:1575:2: rule__SmartContract__Group__5__Impl rule__SmartContract__Group__6
            {
            pushFollow(FOLLOW_12);
            rule__SmartContract__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__SmartContract__Group__6();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SmartContract__Group__5"


    // $ANTLR start "rule__SmartContract__Group__5__Impl"
    // InternalBlockchain.g:1582:1: rule__SmartContract__Group__5__Impl : ( ( rule__SmartContract__Group_5__0 )* ) ;
    public final void rule__SmartContract__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBlockchain.g:1586:1: ( ( ( rule__SmartContract__Group_5__0 )* ) )
            // InternalBlockchain.g:1587:1: ( ( rule__SmartContract__Group_5__0 )* )
            {
            // InternalBlockchain.g:1587:1: ( ( rule__SmartContract__Group_5__0 )* )
            // InternalBlockchain.g:1588:2: ( rule__SmartContract__Group_5__0 )*
            {
             before(grammarAccess.getSmartContractAccess().getGroup_5()); 
            // InternalBlockchain.g:1589:2: ( rule__SmartContract__Group_5__0 )*
            loop16:
            do {
                int alt16=2;
                int LA16_0 = input.LA(1);

                if ( (LA16_0==43) ) {
                    alt16=1;
                }


                switch (alt16) {
            	case 1 :
            	    // InternalBlockchain.g:1589:3: rule__SmartContract__Group_5__0
            	    {
            	    pushFollow(FOLLOW_15);
            	    rule__SmartContract__Group_5__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop16;
                }
            } while (true);

             after(grammarAccess.getSmartContractAccess().getGroup_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SmartContract__Group__5__Impl"


    // $ANTLR start "rule__SmartContract__Group__6"
    // InternalBlockchain.g:1597:1: rule__SmartContract__Group__6 : rule__SmartContract__Group__6__Impl ;
    public final void rule__SmartContract__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBlockchain.g:1601:1: ( rule__SmartContract__Group__6__Impl )
            // InternalBlockchain.g:1602:2: rule__SmartContract__Group__6__Impl
            {
            pushFollow(FOLLOW_2);
            rule__SmartContract__Group__6__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SmartContract__Group__6"


    // $ANTLR start "rule__SmartContract__Group__6__Impl"
    // InternalBlockchain.g:1608:1: rule__SmartContract__Group__6__Impl : ( '}' ) ;
    public final void rule__SmartContract__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBlockchain.g:1612:1: ( ( '}' ) )
            // InternalBlockchain.g:1613:1: ( '}' )
            {
            // InternalBlockchain.g:1613:1: ( '}' )
            // InternalBlockchain.g:1614:2: '}'
            {
             before(grammarAccess.getSmartContractAccess().getRightCurlyBracketKeyword_6()); 
            match(input,38,FOLLOW_2); 
             after(grammarAccess.getSmartContractAccess().getRightCurlyBracketKeyword_6()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SmartContract__Group__6__Impl"


    // $ANTLR start "rule__SmartContract__Group_3__0"
    // InternalBlockchain.g:1624:1: rule__SmartContract__Group_3__0 : rule__SmartContract__Group_3__0__Impl rule__SmartContract__Group_3__1 ;
    public final void rule__SmartContract__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBlockchain.g:1628:1: ( rule__SmartContract__Group_3__0__Impl rule__SmartContract__Group_3__1 )
            // InternalBlockchain.g:1629:2: rule__SmartContract__Group_3__0__Impl rule__SmartContract__Group_3__1
            {
            pushFollow(FOLLOW_16);
            rule__SmartContract__Group_3__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__SmartContract__Group_3__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SmartContract__Group_3__0"


    // $ANTLR start "rule__SmartContract__Group_3__0__Impl"
    // InternalBlockchain.g:1636:1: rule__SmartContract__Group_3__0__Impl : ( ( rule__SmartContract__EntidadesAssignment_3_0 ) ) ;
    public final void rule__SmartContract__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBlockchain.g:1640:1: ( ( ( rule__SmartContract__EntidadesAssignment_3_0 ) ) )
            // InternalBlockchain.g:1641:1: ( ( rule__SmartContract__EntidadesAssignment_3_0 ) )
            {
            // InternalBlockchain.g:1641:1: ( ( rule__SmartContract__EntidadesAssignment_3_0 ) )
            // InternalBlockchain.g:1642:2: ( rule__SmartContract__EntidadesAssignment_3_0 )
            {
             before(grammarAccess.getSmartContractAccess().getEntidadesAssignment_3_0()); 
            // InternalBlockchain.g:1643:2: ( rule__SmartContract__EntidadesAssignment_3_0 )
            // InternalBlockchain.g:1643:3: rule__SmartContract__EntidadesAssignment_3_0
            {
            pushFollow(FOLLOW_2);
            rule__SmartContract__EntidadesAssignment_3_0();

            state._fsp--;


            }

             after(grammarAccess.getSmartContractAccess().getEntidadesAssignment_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SmartContract__Group_3__0__Impl"


    // $ANTLR start "rule__SmartContract__Group_3__1"
    // InternalBlockchain.g:1651:1: rule__SmartContract__Group_3__1 : rule__SmartContract__Group_3__1__Impl ;
    public final void rule__SmartContract__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBlockchain.g:1655:1: ( rule__SmartContract__Group_3__1__Impl )
            // InternalBlockchain.g:1656:2: rule__SmartContract__Group_3__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__SmartContract__Group_3__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SmartContract__Group_3__1"


    // $ANTLR start "rule__SmartContract__Group_3__1__Impl"
    // InternalBlockchain.g:1662:1: rule__SmartContract__Group_3__1__Impl : ( ( rule__SmartContract__EntidadesAssignment_3_1 )* ) ;
    public final void rule__SmartContract__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBlockchain.g:1666:1: ( ( ( rule__SmartContract__EntidadesAssignment_3_1 )* ) )
            // InternalBlockchain.g:1667:1: ( ( rule__SmartContract__EntidadesAssignment_3_1 )* )
            {
            // InternalBlockchain.g:1667:1: ( ( rule__SmartContract__EntidadesAssignment_3_1 )* )
            // InternalBlockchain.g:1668:2: ( rule__SmartContract__EntidadesAssignment_3_1 )*
            {
             before(grammarAccess.getSmartContractAccess().getEntidadesAssignment_3_1()); 
            // InternalBlockchain.g:1669:2: ( rule__SmartContract__EntidadesAssignment_3_1 )*
            loop17:
            do {
                int alt17=2;
                alt17 = dfa17.predict(input);
                switch (alt17) {
            	case 1 :
            	    // InternalBlockchain.g:1669:3: rule__SmartContract__EntidadesAssignment_3_1
            	    {
            	    pushFollow(FOLLOW_13);
            	    rule__SmartContract__EntidadesAssignment_3_1();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop17;
                }
            } while (true);

             after(grammarAccess.getSmartContractAccess().getEntidadesAssignment_3_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SmartContract__Group_3__1__Impl"


    // $ANTLR start "rule__SmartContract__Group_4__0"
    // InternalBlockchain.g:1678:1: rule__SmartContract__Group_4__0 : rule__SmartContract__Group_4__0__Impl rule__SmartContract__Group_4__1 ;
    public final void rule__SmartContract__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBlockchain.g:1682:1: ( rule__SmartContract__Group_4__0__Impl rule__SmartContract__Group_4__1 )
            // InternalBlockchain.g:1683:2: rule__SmartContract__Group_4__0__Impl rule__SmartContract__Group_4__1
            {
            pushFollow(FOLLOW_8);
            rule__SmartContract__Group_4__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__SmartContract__Group_4__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SmartContract__Group_4__0"


    // $ANTLR start "rule__SmartContract__Group_4__0__Impl"
    // InternalBlockchain.g:1690:1: rule__SmartContract__Group_4__0__Impl : ( ( rule__SmartContract__EstadoAssignment_4_0 ) ) ;
    public final void rule__SmartContract__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBlockchain.g:1694:1: ( ( ( rule__SmartContract__EstadoAssignment_4_0 ) ) )
            // InternalBlockchain.g:1695:1: ( ( rule__SmartContract__EstadoAssignment_4_0 ) )
            {
            // InternalBlockchain.g:1695:1: ( ( rule__SmartContract__EstadoAssignment_4_0 ) )
            // InternalBlockchain.g:1696:2: ( rule__SmartContract__EstadoAssignment_4_0 )
            {
             before(grammarAccess.getSmartContractAccess().getEstadoAssignment_4_0()); 
            // InternalBlockchain.g:1697:2: ( rule__SmartContract__EstadoAssignment_4_0 )
            // InternalBlockchain.g:1697:3: rule__SmartContract__EstadoAssignment_4_0
            {
            pushFollow(FOLLOW_2);
            rule__SmartContract__EstadoAssignment_4_0();

            state._fsp--;


            }

             after(grammarAccess.getSmartContractAccess().getEstadoAssignment_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SmartContract__Group_4__0__Impl"


    // $ANTLR start "rule__SmartContract__Group_4__1"
    // InternalBlockchain.g:1705:1: rule__SmartContract__Group_4__1 : rule__SmartContract__Group_4__1__Impl ;
    public final void rule__SmartContract__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBlockchain.g:1709:1: ( rule__SmartContract__Group_4__1__Impl )
            // InternalBlockchain.g:1710:2: rule__SmartContract__Group_4__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__SmartContract__Group_4__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SmartContract__Group_4__1"


    // $ANTLR start "rule__SmartContract__Group_4__1__Impl"
    // InternalBlockchain.g:1716:1: rule__SmartContract__Group_4__1__Impl : ( ( rule__SmartContract__Group_4_1__0 )* ) ;
    public final void rule__SmartContract__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBlockchain.g:1720:1: ( ( ( rule__SmartContract__Group_4_1__0 )* ) )
            // InternalBlockchain.g:1721:1: ( ( rule__SmartContract__Group_4_1__0 )* )
            {
            // InternalBlockchain.g:1721:1: ( ( rule__SmartContract__Group_4_1__0 )* )
            // InternalBlockchain.g:1722:2: ( rule__SmartContract__Group_4_1__0 )*
            {
             before(grammarAccess.getSmartContractAccess().getGroup_4_1()); 
            // InternalBlockchain.g:1723:2: ( rule__SmartContract__Group_4_1__0 )*
            loop18:
            do {
                int alt18=2;
                int LA18_0 = input.LA(1);

                if ( (LA18_0==39) ) {
                    alt18=1;
                }


                switch (alt18) {
            	case 1 :
            	    // InternalBlockchain.g:1723:3: rule__SmartContract__Group_4_1__0
            	    {
            	    pushFollow(FOLLOW_9);
            	    rule__SmartContract__Group_4_1__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop18;
                }
            } while (true);

             after(grammarAccess.getSmartContractAccess().getGroup_4_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SmartContract__Group_4__1__Impl"


    // $ANTLR start "rule__SmartContract__Group_4_1__0"
    // InternalBlockchain.g:1732:1: rule__SmartContract__Group_4_1__0 : rule__SmartContract__Group_4_1__0__Impl rule__SmartContract__Group_4_1__1 ;
    public final void rule__SmartContract__Group_4_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBlockchain.g:1736:1: ( rule__SmartContract__Group_4_1__0__Impl rule__SmartContract__Group_4_1__1 )
            // InternalBlockchain.g:1737:2: rule__SmartContract__Group_4_1__0__Impl rule__SmartContract__Group_4_1__1
            {
            pushFollow(FOLLOW_17);
            rule__SmartContract__Group_4_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__SmartContract__Group_4_1__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SmartContract__Group_4_1__0"


    // $ANTLR start "rule__SmartContract__Group_4_1__0__Impl"
    // InternalBlockchain.g:1744:1: rule__SmartContract__Group_4_1__0__Impl : ( ',' ) ;
    public final void rule__SmartContract__Group_4_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBlockchain.g:1748:1: ( ( ',' ) )
            // InternalBlockchain.g:1749:1: ( ',' )
            {
            // InternalBlockchain.g:1749:1: ( ',' )
            // InternalBlockchain.g:1750:2: ','
            {
             before(grammarAccess.getSmartContractAccess().getCommaKeyword_4_1_0()); 
            match(input,39,FOLLOW_2); 
             after(grammarAccess.getSmartContractAccess().getCommaKeyword_4_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SmartContract__Group_4_1__0__Impl"


    // $ANTLR start "rule__SmartContract__Group_4_1__1"
    // InternalBlockchain.g:1759:1: rule__SmartContract__Group_4_1__1 : rule__SmartContract__Group_4_1__1__Impl ;
    public final void rule__SmartContract__Group_4_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBlockchain.g:1763:1: ( rule__SmartContract__Group_4_1__1__Impl )
            // InternalBlockchain.g:1764:2: rule__SmartContract__Group_4_1__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__SmartContract__Group_4_1__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SmartContract__Group_4_1__1"


    // $ANTLR start "rule__SmartContract__Group_4_1__1__Impl"
    // InternalBlockchain.g:1770:1: rule__SmartContract__Group_4_1__1__Impl : ( ( rule__SmartContract__EstadoAssignment_4_1_1 ) ) ;
    public final void rule__SmartContract__Group_4_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBlockchain.g:1774:1: ( ( ( rule__SmartContract__EstadoAssignment_4_1_1 ) ) )
            // InternalBlockchain.g:1775:1: ( ( rule__SmartContract__EstadoAssignment_4_1_1 ) )
            {
            // InternalBlockchain.g:1775:1: ( ( rule__SmartContract__EstadoAssignment_4_1_1 ) )
            // InternalBlockchain.g:1776:2: ( rule__SmartContract__EstadoAssignment_4_1_1 )
            {
             before(grammarAccess.getSmartContractAccess().getEstadoAssignment_4_1_1()); 
            // InternalBlockchain.g:1777:2: ( rule__SmartContract__EstadoAssignment_4_1_1 )
            // InternalBlockchain.g:1777:3: rule__SmartContract__EstadoAssignment_4_1_1
            {
            pushFollow(FOLLOW_2);
            rule__SmartContract__EstadoAssignment_4_1_1();

            state._fsp--;


            }

             after(grammarAccess.getSmartContractAccess().getEstadoAssignment_4_1_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SmartContract__Group_4_1__1__Impl"


    // $ANTLR start "rule__SmartContract__Group_5__0"
    // InternalBlockchain.g:1786:1: rule__SmartContract__Group_5__0 : rule__SmartContract__Group_5__0__Impl rule__SmartContract__Group_5__1 ;
    public final void rule__SmartContract__Group_5__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBlockchain.g:1790:1: ( rule__SmartContract__Group_5__0__Impl rule__SmartContract__Group_5__1 )
            // InternalBlockchain.g:1791:2: rule__SmartContract__Group_5__0__Impl rule__SmartContract__Group_5__1
            {
            pushFollow(FOLLOW_8);
            rule__SmartContract__Group_5__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__SmartContract__Group_5__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SmartContract__Group_5__0"


    // $ANTLR start "rule__SmartContract__Group_5__0__Impl"
    // InternalBlockchain.g:1798:1: rule__SmartContract__Group_5__0__Impl : ( ( rule__SmartContract__OperacionesAssignment_5_0 ) ) ;
    public final void rule__SmartContract__Group_5__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBlockchain.g:1802:1: ( ( ( rule__SmartContract__OperacionesAssignment_5_0 ) ) )
            // InternalBlockchain.g:1803:1: ( ( rule__SmartContract__OperacionesAssignment_5_0 ) )
            {
            // InternalBlockchain.g:1803:1: ( ( rule__SmartContract__OperacionesAssignment_5_0 ) )
            // InternalBlockchain.g:1804:2: ( rule__SmartContract__OperacionesAssignment_5_0 )
            {
             before(grammarAccess.getSmartContractAccess().getOperacionesAssignment_5_0()); 
            // InternalBlockchain.g:1805:2: ( rule__SmartContract__OperacionesAssignment_5_0 )
            // InternalBlockchain.g:1805:3: rule__SmartContract__OperacionesAssignment_5_0
            {
            pushFollow(FOLLOW_2);
            rule__SmartContract__OperacionesAssignment_5_0();

            state._fsp--;


            }

             after(grammarAccess.getSmartContractAccess().getOperacionesAssignment_5_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SmartContract__Group_5__0__Impl"


    // $ANTLR start "rule__SmartContract__Group_5__1"
    // InternalBlockchain.g:1813:1: rule__SmartContract__Group_5__1 : rule__SmartContract__Group_5__1__Impl ;
    public final void rule__SmartContract__Group_5__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBlockchain.g:1817:1: ( rule__SmartContract__Group_5__1__Impl )
            // InternalBlockchain.g:1818:2: rule__SmartContract__Group_5__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__SmartContract__Group_5__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SmartContract__Group_5__1"


    // $ANTLR start "rule__SmartContract__Group_5__1__Impl"
    // InternalBlockchain.g:1824:1: rule__SmartContract__Group_5__1__Impl : ( ( rule__SmartContract__Group_5_1__0 )* ) ;
    public final void rule__SmartContract__Group_5__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBlockchain.g:1828:1: ( ( ( rule__SmartContract__Group_5_1__0 )* ) )
            // InternalBlockchain.g:1829:1: ( ( rule__SmartContract__Group_5_1__0 )* )
            {
            // InternalBlockchain.g:1829:1: ( ( rule__SmartContract__Group_5_1__0 )* )
            // InternalBlockchain.g:1830:2: ( rule__SmartContract__Group_5_1__0 )*
            {
             before(grammarAccess.getSmartContractAccess().getGroup_5_1()); 
            // InternalBlockchain.g:1831:2: ( rule__SmartContract__Group_5_1__0 )*
            loop19:
            do {
                int alt19=2;
                int LA19_0 = input.LA(1);

                if ( (LA19_0==39) ) {
                    alt19=1;
                }


                switch (alt19) {
            	case 1 :
            	    // InternalBlockchain.g:1831:3: rule__SmartContract__Group_5_1__0
            	    {
            	    pushFollow(FOLLOW_9);
            	    rule__SmartContract__Group_5_1__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop19;
                }
            } while (true);

             after(grammarAccess.getSmartContractAccess().getGroup_5_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SmartContract__Group_5__1__Impl"


    // $ANTLR start "rule__SmartContract__Group_5_1__0"
    // InternalBlockchain.g:1840:1: rule__SmartContract__Group_5_1__0 : rule__SmartContract__Group_5_1__0__Impl rule__SmartContract__Group_5_1__1 ;
    public final void rule__SmartContract__Group_5_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBlockchain.g:1844:1: ( rule__SmartContract__Group_5_1__0__Impl rule__SmartContract__Group_5_1__1 )
            // InternalBlockchain.g:1845:2: rule__SmartContract__Group_5_1__0__Impl rule__SmartContract__Group_5_1__1
            {
            pushFollow(FOLLOW_18);
            rule__SmartContract__Group_5_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__SmartContract__Group_5_1__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SmartContract__Group_5_1__0"


    // $ANTLR start "rule__SmartContract__Group_5_1__0__Impl"
    // InternalBlockchain.g:1852:1: rule__SmartContract__Group_5_1__0__Impl : ( ',' ) ;
    public final void rule__SmartContract__Group_5_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBlockchain.g:1856:1: ( ( ',' ) )
            // InternalBlockchain.g:1857:1: ( ',' )
            {
            // InternalBlockchain.g:1857:1: ( ',' )
            // InternalBlockchain.g:1858:2: ','
            {
             before(grammarAccess.getSmartContractAccess().getCommaKeyword_5_1_0()); 
            match(input,39,FOLLOW_2); 
             after(grammarAccess.getSmartContractAccess().getCommaKeyword_5_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SmartContract__Group_5_1__0__Impl"


    // $ANTLR start "rule__SmartContract__Group_5_1__1"
    // InternalBlockchain.g:1867:1: rule__SmartContract__Group_5_1__1 : rule__SmartContract__Group_5_1__1__Impl ;
    public final void rule__SmartContract__Group_5_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBlockchain.g:1871:1: ( rule__SmartContract__Group_5_1__1__Impl )
            // InternalBlockchain.g:1872:2: rule__SmartContract__Group_5_1__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__SmartContract__Group_5_1__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SmartContract__Group_5_1__1"


    // $ANTLR start "rule__SmartContract__Group_5_1__1__Impl"
    // InternalBlockchain.g:1878:1: rule__SmartContract__Group_5_1__1__Impl : ( ( rule__SmartContract__OperacionesAssignment_5_1_1 ) ) ;
    public final void rule__SmartContract__Group_5_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBlockchain.g:1882:1: ( ( ( rule__SmartContract__OperacionesAssignment_5_1_1 ) ) )
            // InternalBlockchain.g:1883:1: ( ( rule__SmartContract__OperacionesAssignment_5_1_1 ) )
            {
            // InternalBlockchain.g:1883:1: ( ( rule__SmartContract__OperacionesAssignment_5_1_1 ) )
            // InternalBlockchain.g:1884:2: ( rule__SmartContract__OperacionesAssignment_5_1_1 )
            {
             before(grammarAccess.getSmartContractAccess().getOperacionesAssignment_5_1_1()); 
            // InternalBlockchain.g:1885:2: ( rule__SmartContract__OperacionesAssignment_5_1_1 )
            // InternalBlockchain.g:1885:3: rule__SmartContract__OperacionesAssignment_5_1_1
            {
            pushFollow(FOLLOW_2);
            rule__SmartContract__OperacionesAssignment_5_1_1();

            state._fsp--;


            }

             after(grammarAccess.getSmartContractAccess().getOperacionesAssignment_5_1_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SmartContract__Group_5_1__1__Impl"


    // $ANTLR start "rule__Entidad__Group__0"
    // InternalBlockchain.g:1894:1: rule__Entidad__Group__0 : rule__Entidad__Group__0__Impl rule__Entidad__Group__1 ;
    public final void rule__Entidad__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBlockchain.g:1898:1: ( rule__Entidad__Group__0__Impl rule__Entidad__Group__1 )
            // InternalBlockchain.g:1899:2: rule__Entidad__Group__0__Impl rule__Entidad__Group__1
            {
            pushFollow(FOLLOW_16);
            rule__Entidad__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Entidad__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Entidad__Group__0"


    // $ANTLR start "rule__Entidad__Group__0__Impl"
    // InternalBlockchain.g:1906:1: rule__Entidad__Group__0__Impl : ( () ) ;
    public final void rule__Entidad__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBlockchain.g:1910:1: ( ( () ) )
            // InternalBlockchain.g:1911:1: ( () )
            {
            // InternalBlockchain.g:1911:1: ( () )
            // InternalBlockchain.g:1912:2: ()
            {
             before(grammarAccess.getEntidadAccess().getEntidadAction_0()); 
            // InternalBlockchain.g:1913:2: ()
            // InternalBlockchain.g:1913:3: 
            {
            }

             after(grammarAccess.getEntidadAccess().getEntidadAction_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Entidad__Group__0__Impl"


    // $ANTLR start "rule__Entidad__Group__1"
    // InternalBlockchain.g:1921:1: rule__Entidad__Group__1 : rule__Entidad__Group__1__Impl rule__Entidad__Group__2 ;
    public final void rule__Entidad__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBlockchain.g:1925:1: ( rule__Entidad__Group__1__Impl rule__Entidad__Group__2 )
            // InternalBlockchain.g:1926:2: rule__Entidad__Group__1__Impl rule__Entidad__Group__2
            {
            pushFollow(FOLLOW_4);
            rule__Entidad__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Entidad__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Entidad__Group__1"


    // $ANTLR start "rule__Entidad__Group__1__Impl"
    // InternalBlockchain.g:1933:1: rule__Entidad__Group__1__Impl : ( 'Entidad' ) ;
    public final void rule__Entidad__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBlockchain.g:1937:1: ( ( 'Entidad' ) )
            // InternalBlockchain.g:1938:1: ( 'Entidad' )
            {
            // InternalBlockchain.g:1938:1: ( 'Entidad' )
            // InternalBlockchain.g:1939:2: 'Entidad'
            {
             before(grammarAccess.getEntidadAccess().getEntidadKeyword_1()); 
            match(input,42,FOLLOW_2); 
             after(grammarAccess.getEntidadAccess().getEntidadKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Entidad__Group__1__Impl"


    // $ANTLR start "rule__Entidad__Group__2"
    // InternalBlockchain.g:1948:1: rule__Entidad__Group__2 : rule__Entidad__Group__2__Impl rule__Entidad__Group__3 ;
    public final void rule__Entidad__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBlockchain.g:1952:1: ( rule__Entidad__Group__2__Impl rule__Entidad__Group__3 )
            // InternalBlockchain.g:1953:2: rule__Entidad__Group__2__Impl rule__Entidad__Group__3
            {
            pushFollow(FOLLOW_5);
            rule__Entidad__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Entidad__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Entidad__Group__2"


    // $ANTLR start "rule__Entidad__Group__2__Impl"
    // InternalBlockchain.g:1960:1: rule__Entidad__Group__2__Impl : ( ( rule__Entidad__NameAssignment_2 ) ) ;
    public final void rule__Entidad__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBlockchain.g:1964:1: ( ( ( rule__Entidad__NameAssignment_2 ) ) )
            // InternalBlockchain.g:1965:1: ( ( rule__Entidad__NameAssignment_2 ) )
            {
            // InternalBlockchain.g:1965:1: ( ( rule__Entidad__NameAssignment_2 ) )
            // InternalBlockchain.g:1966:2: ( rule__Entidad__NameAssignment_2 )
            {
             before(grammarAccess.getEntidadAccess().getNameAssignment_2()); 
            // InternalBlockchain.g:1967:2: ( rule__Entidad__NameAssignment_2 )
            // InternalBlockchain.g:1967:3: rule__Entidad__NameAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__Entidad__NameAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getEntidadAccess().getNameAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Entidad__Group__2__Impl"


    // $ANTLR start "rule__Entidad__Group__3"
    // InternalBlockchain.g:1975:1: rule__Entidad__Group__3 : rule__Entidad__Group__3__Impl rule__Entidad__Group__4 ;
    public final void rule__Entidad__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBlockchain.g:1979:1: ( rule__Entidad__Group__3__Impl rule__Entidad__Group__4 )
            // InternalBlockchain.g:1980:2: rule__Entidad__Group__3__Impl rule__Entidad__Group__4
            {
            pushFollow(FOLLOW_19);
            rule__Entidad__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Entidad__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Entidad__Group__3"


    // $ANTLR start "rule__Entidad__Group__3__Impl"
    // InternalBlockchain.g:1987:1: rule__Entidad__Group__3__Impl : ( '{' ) ;
    public final void rule__Entidad__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBlockchain.g:1991:1: ( ( '{' ) )
            // InternalBlockchain.g:1992:1: ( '{' )
            {
            // InternalBlockchain.g:1992:1: ( '{' )
            // InternalBlockchain.g:1993:2: '{'
            {
             before(grammarAccess.getEntidadAccess().getLeftCurlyBracketKeyword_3()); 
            match(input,37,FOLLOW_2); 
             after(grammarAccess.getEntidadAccess().getLeftCurlyBracketKeyword_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Entidad__Group__3__Impl"


    // $ANTLR start "rule__Entidad__Group__4"
    // InternalBlockchain.g:2002:1: rule__Entidad__Group__4 : rule__Entidad__Group__4__Impl rule__Entidad__Group__5 ;
    public final void rule__Entidad__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBlockchain.g:2006:1: ( rule__Entidad__Group__4__Impl rule__Entidad__Group__5 )
            // InternalBlockchain.g:2007:2: rule__Entidad__Group__4__Impl rule__Entidad__Group__5
            {
            pushFollow(FOLLOW_19);
            rule__Entidad__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Entidad__Group__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Entidad__Group__4"


    // $ANTLR start "rule__Entidad__Group__4__Impl"
    // InternalBlockchain.g:2014:1: rule__Entidad__Group__4__Impl : ( ( rule__Entidad__Group_4__0 )* ) ;
    public final void rule__Entidad__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBlockchain.g:2018:1: ( ( ( rule__Entidad__Group_4__0 )* ) )
            // InternalBlockchain.g:2019:1: ( ( rule__Entidad__Group_4__0 )* )
            {
            // InternalBlockchain.g:2019:1: ( ( rule__Entidad__Group_4__0 )* )
            // InternalBlockchain.g:2020:2: ( rule__Entidad__Group_4__0 )*
            {
             before(grammarAccess.getEntidadAccess().getGroup_4()); 
            // InternalBlockchain.g:2021:2: ( rule__Entidad__Group_4__0 )*
            loop20:
            do {
                int alt20=2;
                int LA20_0 = input.LA(1);

                if ( ((LA20_0>=RULE_STRING && LA20_0<=RULE_ID)) ) {
                    alt20=1;
                }


                switch (alt20) {
            	case 1 :
            	    // InternalBlockchain.g:2021:3: rule__Entidad__Group_4__0
            	    {
            	    pushFollow(FOLLOW_20);
            	    rule__Entidad__Group_4__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop20;
                }
            } while (true);

             after(grammarAccess.getEntidadAccess().getGroup_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Entidad__Group__4__Impl"


    // $ANTLR start "rule__Entidad__Group__5"
    // InternalBlockchain.g:2029:1: rule__Entidad__Group__5 : rule__Entidad__Group__5__Impl ;
    public final void rule__Entidad__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBlockchain.g:2033:1: ( rule__Entidad__Group__5__Impl )
            // InternalBlockchain.g:2034:2: rule__Entidad__Group__5__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Entidad__Group__5__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Entidad__Group__5"


    // $ANTLR start "rule__Entidad__Group__5__Impl"
    // InternalBlockchain.g:2040:1: rule__Entidad__Group__5__Impl : ( '}' ) ;
    public final void rule__Entidad__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBlockchain.g:2044:1: ( ( '}' ) )
            // InternalBlockchain.g:2045:1: ( '}' )
            {
            // InternalBlockchain.g:2045:1: ( '}' )
            // InternalBlockchain.g:2046:2: '}'
            {
             before(grammarAccess.getEntidadAccess().getRightCurlyBracketKeyword_5()); 
            match(input,38,FOLLOW_2); 
             after(grammarAccess.getEntidadAccess().getRightCurlyBracketKeyword_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Entidad__Group__5__Impl"


    // $ANTLR start "rule__Entidad__Group_4__0"
    // InternalBlockchain.g:2056:1: rule__Entidad__Group_4__0 : rule__Entidad__Group_4__0__Impl rule__Entidad__Group_4__1 ;
    public final void rule__Entidad__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBlockchain.g:2060:1: ( rule__Entidad__Group_4__0__Impl rule__Entidad__Group_4__1 )
            // InternalBlockchain.g:2061:2: rule__Entidad__Group_4__0__Impl rule__Entidad__Group_4__1
            {
            pushFollow(FOLLOW_4);
            rule__Entidad__Group_4__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Entidad__Group_4__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Entidad__Group_4__0"


    // $ANTLR start "rule__Entidad__Group_4__0__Impl"
    // InternalBlockchain.g:2068:1: rule__Entidad__Group_4__0__Impl : ( ( rule__Entidad__AtributosAssignment_4_0 ) ) ;
    public final void rule__Entidad__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBlockchain.g:2072:1: ( ( ( rule__Entidad__AtributosAssignment_4_0 ) ) )
            // InternalBlockchain.g:2073:1: ( ( rule__Entidad__AtributosAssignment_4_0 ) )
            {
            // InternalBlockchain.g:2073:1: ( ( rule__Entidad__AtributosAssignment_4_0 ) )
            // InternalBlockchain.g:2074:2: ( rule__Entidad__AtributosAssignment_4_0 )
            {
             before(grammarAccess.getEntidadAccess().getAtributosAssignment_4_0()); 
            // InternalBlockchain.g:2075:2: ( rule__Entidad__AtributosAssignment_4_0 )
            // InternalBlockchain.g:2075:3: rule__Entidad__AtributosAssignment_4_0
            {
            pushFollow(FOLLOW_2);
            rule__Entidad__AtributosAssignment_4_0();

            state._fsp--;


            }

             after(grammarAccess.getEntidadAccess().getAtributosAssignment_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Entidad__Group_4__0__Impl"


    // $ANTLR start "rule__Entidad__Group_4__1"
    // InternalBlockchain.g:2083:1: rule__Entidad__Group_4__1 : rule__Entidad__Group_4__1__Impl ;
    public final void rule__Entidad__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBlockchain.g:2087:1: ( rule__Entidad__Group_4__1__Impl )
            // InternalBlockchain.g:2088:2: rule__Entidad__Group_4__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Entidad__Group_4__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Entidad__Group_4__1"


    // $ANTLR start "rule__Entidad__Group_4__1__Impl"
    // InternalBlockchain.g:2094:1: rule__Entidad__Group_4__1__Impl : ( ( rule__Entidad__AtributosAssignment_4_1 )* ) ;
    public final void rule__Entidad__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBlockchain.g:2098:1: ( ( ( rule__Entidad__AtributosAssignment_4_1 )* ) )
            // InternalBlockchain.g:2099:1: ( ( rule__Entidad__AtributosAssignment_4_1 )* )
            {
            // InternalBlockchain.g:2099:1: ( ( rule__Entidad__AtributosAssignment_4_1 )* )
            // InternalBlockchain.g:2100:2: ( rule__Entidad__AtributosAssignment_4_1 )*
            {
             before(grammarAccess.getEntidadAccess().getAtributosAssignment_4_1()); 
            // InternalBlockchain.g:2101:2: ( rule__Entidad__AtributosAssignment_4_1 )*
            loop21:
            do {
                int alt21=2;
                int LA21_0 = input.LA(1);

                if ( (LA21_0==RULE_STRING) ) {
                    int LA21_2 = input.LA(2);

                    if ( (LA21_2==RULE_STRING) ) {
                        alt21=1;
                    }
                    else if ( (LA21_2==RULE_ID) ) {
                        alt21=1;
                    }


                }
                else if ( (LA21_0==RULE_ID) ) {
                    int LA21_3 = input.LA(2);

                    if ( (LA21_3==RULE_STRING) ) {
                        alt21=1;
                    }
                    else if ( (LA21_3==RULE_ID) ) {
                        alt21=1;
                    }


                }


                switch (alt21) {
            	case 1 :
            	    // InternalBlockchain.g:2101:3: rule__Entidad__AtributosAssignment_4_1
            	    {
            	    pushFollow(FOLLOW_20);
            	    rule__Entidad__AtributosAssignment_4_1();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop21;
                }
            } while (true);

             after(grammarAccess.getEntidadAccess().getAtributosAssignment_4_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Entidad__Group_4__1__Impl"


    // $ANTLR start "rule__Operacion__Group__0"
    // InternalBlockchain.g:2110:1: rule__Operacion__Group__0 : rule__Operacion__Group__0__Impl rule__Operacion__Group__1 ;
    public final void rule__Operacion__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBlockchain.g:2114:1: ( rule__Operacion__Group__0__Impl rule__Operacion__Group__1 )
            // InternalBlockchain.g:2115:2: rule__Operacion__Group__0__Impl rule__Operacion__Group__1
            {
            pushFollow(FOLLOW_18);
            rule__Operacion__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Operacion__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Operacion__Group__0"


    // $ANTLR start "rule__Operacion__Group__0__Impl"
    // InternalBlockchain.g:2122:1: rule__Operacion__Group__0__Impl : ( () ) ;
    public final void rule__Operacion__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBlockchain.g:2126:1: ( ( () ) )
            // InternalBlockchain.g:2127:1: ( () )
            {
            // InternalBlockchain.g:2127:1: ( () )
            // InternalBlockchain.g:2128:2: ()
            {
             before(grammarAccess.getOperacionAccess().getOperacionAction_0()); 
            // InternalBlockchain.g:2129:2: ()
            // InternalBlockchain.g:2129:3: 
            {
            }

             after(grammarAccess.getOperacionAccess().getOperacionAction_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Operacion__Group__0__Impl"


    // $ANTLR start "rule__Operacion__Group__1"
    // InternalBlockchain.g:2137:1: rule__Operacion__Group__1 : rule__Operacion__Group__1__Impl rule__Operacion__Group__2 ;
    public final void rule__Operacion__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBlockchain.g:2141:1: ( rule__Operacion__Group__1__Impl rule__Operacion__Group__2 )
            // InternalBlockchain.g:2142:2: rule__Operacion__Group__1__Impl rule__Operacion__Group__2
            {
            pushFollow(FOLLOW_21);
            rule__Operacion__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Operacion__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Operacion__Group__1"


    // $ANTLR start "rule__Operacion__Group__1__Impl"
    // InternalBlockchain.g:2149:1: rule__Operacion__Group__1__Impl : ( 'Operacion' ) ;
    public final void rule__Operacion__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBlockchain.g:2153:1: ( ( 'Operacion' ) )
            // InternalBlockchain.g:2154:1: ( 'Operacion' )
            {
            // InternalBlockchain.g:2154:1: ( 'Operacion' )
            // InternalBlockchain.g:2155:2: 'Operacion'
            {
             before(grammarAccess.getOperacionAccess().getOperacionKeyword_1()); 
            match(input,43,FOLLOW_2); 
             after(grammarAccess.getOperacionAccess().getOperacionKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Operacion__Group__1__Impl"


    // $ANTLR start "rule__Operacion__Group__2"
    // InternalBlockchain.g:2164:1: rule__Operacion__Group__2 : rule__Operacion__Group__2__Impl rule__Operacion__Group__3 ;
    public final void rule__Operacion__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBlockchain.g:2168:1: ( rule__Operacion__Group__2__Impl rule__Operacion__Group__3 )
            // InternalBlockchain.g:2169:2: rule__Operacion__Group__2__Impl rule__Operacion__Group__3
            {
            pushFollow(FOLLOW_4);
            rule__Operacion__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Operacion__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Operacion__Group__2"


    // $ANTLR start "rule__Operacion__Group__2__Impl"
    // InternalBlockchain.g:2176:1: rule__Operacion__Group__2__Impl : ( ( ( rule__Operacion__Group_2__0 ) ) ( ( rule__Operacion__Group_2__0 )* ) ) ;
    public final void rule__Operacion__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBlockchain.g:2180:1: ( ( ( ( rule__Operacion__Group_2__0 ) ) ( ( rule__Operacion__Group_2__0 )* ) ) )
            // InternalBlockchain.g:2181:1: ( ( ( rule__Operacion__Group_2__0 ) ) ( ( rule__Operacion__Group_2__0 )* ) )
            {
            // InternalBlockchain.g:2181:1: ( ( ( rule__Operacion__Group_2__0 ) ) ( ( rule__Operacion__Group_2__0 )* ) )
            // InternalBlockchain.g:2182:2: ( ( rule__Operacion__Group_2__0 ) ) ( ( rule__Operacion__Group_2__0 )* )
            {
            // InternalBlockchain.g:2182:2: ( ( rule__Operacion__Group_2__0 ) )
            // InternalBlockchain.g:2183:3: ( rule__Operacion__Group_2__0 )
            {
             before(grammarAccess.getOperacionAccess().getGroup_2()); 
            // InternalBlockchain.g:2184:3: ( rule__Operacion__Group_2__0 )
            // InternalBlockchain.g:2184:4: rule__Operacion__Group_2__0
            {
            pushFollow(FOLLOW_22);
            rule__Operacion__Group_2__0();

            state._fsp--;


            }

             after(grammarAccess.getOperacionAccess().getGroup_2()); 

            }

            // InternalBlockchain.g:2187:2: ( ( rule__Operacion__Group_2__0 )* )
            // InternalBlockchain.g:2188:3: ( rule__Operacion__Group_2__0 )*
            {
             before(grammarAccess.getOperacionAccess().getGroup_2()); 
            // InternalBlockchain.g:2189:3: ( rule__Operacion__Group_2__0 )*
            loop22:
            do {
                int alt22=2;
                int LA22_0 = input.LA(1);

                if ( (LA22_0==47) ) {
                    alt22=1;
                }


                switch (alt22) {
            	case 1 :
            	    // InternalBlockchain.g:2189:4: rule__Operacion__Group_2__0
            	    {
            	    pushFollow(FOLLOW_22);
            	    rule__Operacion__Group_2__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop22;
                }
            } while (true);

             after(grammarAccess.getOperacionAccess().getGroup_2()); 

            }


            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Operacion__Group__2__Impl"


    // $ANTLR start "rule__Operacion__Group__3"
    // InternalBlockchain.g:2198:1: rule__Operacion__Group__3 : rule__Operacion__Group__3__Impl rule__Operacion__Group__4 ;
    public final void rule__Operacion__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBlockchain.g:2202:1: ( rule__Operacion__Group__3__Impl rule__Operacion__Group__4 )
            // InternalBlockchain.g:2203:2: rule__Operacion__Group__3__Impl rule__Operacion__Group__4
            {
            pushFollow(FOLLOW_23);
            rule__Operacion__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Operacion__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Operacion__Group__3"


    // $ANTLR start "rule__Operacion__Group__3__Impl"
    // InternalBlockchain.g:2210:1: rule__Operacion__Group__3__Impl : ( ( rule__Operacion__NameAssignment_3 ) ) ;
    public final void rule__Operacion__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBlockchain.g:2214:1: ( ( ( rule__Operacion__NameAssignment_3 ) ) )
            // InternalBlockchain.g:2215:1: ( ( rule__Operacion__NameAssignment_3 ) )
            {
            // InternalBlockchain.g:2215:1: ( ( rule__Operacion__NameAssignment_3 ) )
            // InternalBlockchain.g:2216:2: ( rule__Operacion__NameAssignment_3 )
            {
             before(grammarAccess.getOperacionAccess().getNameAssignment_3()); 
            // InternalBlockchain.g:2217:2: ( rule__Operacion__NameAssignment_3 )
            // InternalBlockchain.g:2217:3: rule__Operacion__NameAssignment_3
            {
            pushFollow(FOLLOW_2);
            rule__Operacion__NameAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getOperacionAccess().getNameAssignment_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Operacion__Group__3__Impl"


    // $ANTLR start "rule__Operacion__Group__4"
    // InternalBlockchain.g:2225:1: rule__Operacion__Group__4 : rule__Operacion__Group__4__Impl rule__Operacion__Group__5 ;
    public final void rule__Operacion__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBlockchain.g:2229:1: ( rule__Operacion__Group__4__Impl rule__Operacion__Group__5 )
            // InternalBlockchain.g:2230:2: rule__Operacion__Group__4__Impl rule__Operacion__Group__5
            {
            pushFollow(FOLLOW_24);
            rule__Operacion__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Operacion__Group__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Operacion__Group__4"


    // $ANTLR start "rule__Operacion__Group__4__Impl"
    // InternalBlockchain.g:2237:1: rule__Operacion__Group__4__Impl : ( '(' ) ;
    public final void rule__Operacion__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBlockchain.g:2241:1: ( ( '(' ) )
            // InternalBlockchain.g:2242:1: ( '(' )
            {
            // InternalBlockchain.g:2242:1: ( '(' )
            // InternalBlockchain.g:2243:2: '('
            {
             before(grammarAccess.getOperacionAccess().getLeftParenthesisKeyword_4()); 
            match(input,44,FOLLOW_2); 
             after(grammarAccess.getOperacionAccess().getLeftParenthesisKeyword_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Operacion__Group__4__Impl"


    // $ANTLR start "rule__Operacion__Group__5"
    // InternalBlockchain.g:2252:1: rule__Operacion__Group__5 : rule__Operacion__Group__5__Impl rule__Operacion__Group__6 ;
    public final void rule__Operacion__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBlockchain.g:2256:1: ( rule__Operacion__Group__5__Impl rule__Operacion__Group__6 )
            // InternalBlockchain.g:2257:2: rule__Operacion__Group__5__Impl rule__Operacion__Group__6
            {
            pushFollow(FOLLOW_24);
            rule__Operacion__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Operacion__Group__6();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Operacion__Group__5"


    // $ANTLR start "rule__Operacion__Group__5__Impl"
    // InternalBlockchain.g:2264:1: rule__Operacion__Group__5__Impl : ( ( rule__Operacion__Group_5__0 )? ) ;
    public final void rule__Operacion__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBlockchain.g:2268:1: ( ( ( rule__Operacion__Group_5__0 )? ) )
            // InternalBlockchain.g:2269:1: ( ( rule__Operacion__Group_5__0 )? )
            {
            // InternalBlockchain.g:2269:1: ( ( rule__Operacion__Group_5__0 )? )
            // InternalBlockchain.g:2270:2: ( rule__Operacion__Group_5__0 )?
            {
             before(grammarAccess.getOperacionAccess().getGroup_5()); 
            // InternalBlockchain.g:2271:2: ( rule__Operacion__Group_5__0 )?
            int alt23=2;
            int LA23_0 = input.LA(1);

            if ( ((LA23_0>=RULE_STRING && LA23_0<=RULE_ID)) ) {
                alt23=1;
            }
            switch (alt23) {
                case 1 :
                    // InternalBlockchain.g:2271:3: rule__Operacion__Group_5__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Operacion__Group_5__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getOperacionAccess().getGroup_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Operacion__Group__5__Impl"


    // $ANTLR start "rule__Operacion__Group__6"
    // InternalBlockchain.g:2279:1: rule__Operacion__Group__6 : rule__Operacion__Group__6__Impl rule__Operacion__Group__7 ;
    public final void rule__Operacion__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBlockchain.g:2283:1: ( rule__Operacion__Group__6__Impl rule__Operacion__Group__7 )
            // InternalBlockchain.g:2284:2: rule__Operacion__Group__6__Impl rule__Operacion__Group__7
            {
            pushFollow(FOLLOW_25);
            rule__Operacion__Group__6__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Operacion__Group__7();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Operacion__Group__6"


    // $ANTLR start "rule__Operacion__Group__6__Impl"
    // InternalBlockchain.g:2291:1: rule__Operacion__Group__6__Impl : ( ')' ) ;
    public final void rule__Operacion__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBlockchain.g:2295:1: ( ( ')' ) )
            // InternalBlockchain.g:2296:1: ( ')' )
            {
            // InternalBlockchain.g:2296:1: ( ')' )
            // InternalBlockchain.g:2297:2: ')'
            {
             before(grammarAccess.getOperacionAccess().getRightParenthesisKeyword_6()); 
            match(input,45,FOLLOW_2); 
             after(grammarAccess.getOperacionAccess().getRightParenthesisKeyword_6()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Operacion__Group__6__Impl"


    // $ANTLR start "rule__Operacion__Group__7"
    // InternalBlockchain.g:2306:1: rule__Operacion__Group__7 : rule__Operacion__Group__7__Impl rule__Operacion__Group__8 ;
    public final void rule__Operacion__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBlockchain.g:2310:1: ( rule__Operacion__Group__7__Impl rule__Operacion__Group__8 )
            // InternalBlockchain.g:2311:2: rule__Operacion__Group__7__Impl rule__Operacion__Group__8
            {
            pushFollow(FOLLOW_25);
            rule__Operacion__Group__7__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Operacion__Group__8();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Operacion__Group__7"


    // $ANTLR start "rule__Operacion__Group__7__Impl"
    // InternalBlockchain.g:2318:1: rule__Operacion__Group__7__Impl : ( ( rule__Operacion__Group_7__0 )? ) ;
    public final void rule__Operacion__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBlockchain.g:2322:1: ( ( ( rule__Operacion__Group_7__0 )? ) )
            // InternalBlockchain.g:2323:1: ( ( rule__Operacion__Group_7__0 )? )
            {
            // InternalBlockchain.g:2323:1: ( ( rule__Operacion__Group_7__0 )? )
            // InternalBlockchain.g:2324:2: ( rule__Operacion__Group_7__0 )?
            {
             before(grammarAccess.getOperacionAccess().getGroup_7()); 
            // InternalBlockchain.g:2325:2: ( rule__Operacion__Group_7__0 )?
            int alt24=2;
            int LA24_0 = input.LA(1);

            if ( (LA24_0==48) ) {
                alt24=1;
            }
            switch (alt24) {
                case 1 :
                    // InternalBlockchain.g:2325:3: rule__Operacion__Group_7__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Operacion__Group_7__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getOperacionAccess().getGroup_7()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Operacion__Group__7__Impl"


    // $ANTLR start "rule__Operacion__Group__8"
    // InternalBlockchain.g:2333:1: rule__Operacion__Group__8 : rule__Operacion__Group__8__Impl rule__Operacion__Group__9 ;
    public final void rule__Operacion__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBlockchain.g:2337:1: ( rule__Operacion__Group__8__Impl rule__Operacion__Group__9 )
            // InternalBlockchain.g:2338:2: rule__Operacion__Group__8__Impl rule__Operacion__Group__9
            {
            pushFollow(FOLLOW_26);
            rule__Operacion__Group__8__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Operacion__Group__9();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Operacion__Group__8"


    // $ANTLR start "rule__Operacion__Group__8__Impl"
    // InternalBlockchain.g:2345:1: rule__Operacion__Group__8__Impl : ( '{' ) ;
    public final void rule__Operacion__Group__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBlockchain.g:2349:1: ( ( '{' ) )
            // InternalBlockchain.g:2350:1: ( '{' )
            {
            // InternalBlockchain.g:2350:1: ( '{' )
            // InternalBlockchain.g:2351:2: '{'
            {
             before(grammarAccess.getOperacionAccess().getLeftCurlyBracketKeyword_8()); 
            match(input,37,FOLLOW_2); 
             after(grammarAccess.getOperacionAccess().getLeftCurlyBracketKeyword_8()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Operacion__Group__8__Impl"


    // $ANTLR start "rule__Operacion__Group__9"
    // InternalBlockchain.g:2360:1: rule__Operacion__Group__9 : rule__Operacion__Group__9__Impl rule__Operacion__Group__10 ;
    public final void rule__Operacion__Group__9() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBlockchain.g:2364:1: ( rule__Operacion__Group__9__Impl rule__Operacion__Group__10 )
            // InternalBlockchain.g:2365:2: rule__Operacion__Group__9__Impl rule__Operacion__Group__10
            {
            pushFollow(FOLLOW_26);
            rule__Operacion__Group__9__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Operacion__Group__10();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Operacion__Group__9"


    // $ANTLR start "rule__Operacion__Group__9__Impl"
    // InternalBlockchain.g:2372:1: rule__Operacion__Group__9__Impl : ( ( 'return' )? ) ;
    public final void rule__Operacion__Group__9__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBlockchain.g:2376:1: ( ( ( 'return' )? ) )
            // InternalBlockchain.g:2377:1: ( ( 'return' )? )
            {
            // InternalBlockchain.g:2377:1: ( ( 'return' )? )
            // InternalBlockchain.g:2378:2: ( 'return' )?
            {
             before(grammarAccess.getOperacionAccess().getReturnKeyword_9()); 
            // InternalBlockchain.g:2379:2: ( 'return' )?
            int alt25=2;
            int LA25_0 = input.LA(1);

            if ( (LA25_0==46) ) {
                alt25=1;
            }
            switch (alt25) {
                case 1 :
                    // InternalBlockchain.g:2379:3: 'return'
                    {
                    match(input,46,FOLLOW_2); 

                    }
                    break;

            }

             after(grammarAccess.getOperacionAccess().getReturnKeyword_9()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Operacion__Group__9__Impl"


    // $ANTLR start "rule__Operacion__Group__10"
    // InternalBlockchain.g:2387:1: rule__Operacion__Group__10 : rule__Operacion__Group__10__Impl rule__Operacion__Group__11 ;
    public final void rule__Operacion__Group__10() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBlockchain.g:2391:1: ( rule__Operacion__Group__10__Impl rule__Operacion__Group__11 )
            // InternalBlockchain.g:2392:2: rule__Operacion__Group__10__Impl rule__Operacion__Group__11
            {
            pushFollow(FOLLOW_26);
            rule__Operacion__Group__10__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Operacion__Group__11();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Operacion__Group__10"


    // $ANTLR start "rule__Operacion__Group__10__Impl"
    // InternalBlockchain.g:2399:1: rule__Operacion__Group__10__Impl : ( ( rule__Operacion__Group_10__0 )? ) ;
    public final void rule__Operacion__Group__10__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBlockchain.g:2403:1: ( ( ( rule__Operacion__Group_10__0 )? ) )
            // InternalBlockchain.g:2404:1: ( ( rule__Operacion__Group_10__0 )? )
            {
            // InternalBlockchain.g:2404:1: ( ( rule__Operacion__Group_10__0 )? )
            // InternalBlockchain.g:2405:2: ( rule__Operacion__Group_10__0 )?
            {
             before(grammarAccess.getOperacionAccess().getGroup_10()); 
            // InternalBlockchain.g:2406:2: ( rule__Operacion__Group_10__0 )?
            int alt26=2;
            int LA26_0 = input.LA(1);

            if ( ((LA26_0>=RULE_STRING && LA26_0<=RULE_ID)||(LA26_0>=12 && LA26_0<=13)||(LA26_0>=49 && LA26_0<=51)||LA26_0==54||(LA26_0>=58 && LA26_0<=60)) ) {
                alt26=1;
            }
            switch (alt26) {
                case 1 :
                    // InternalBlockchain.g:2406:3: rule__Operacion__Group_10__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Operacion__Group_10__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getOperacionAccess().getGroup_10()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Operacion__Group__10__Impl"


    // $ANTLR start "rule__Operacion__Group__11"
    // InternalBlockchain.g:2414:1: rule__Operacion__Group__11 : rule__Operacion__Group__11__Impl ;
    public final void rule__Operacion__Group__11() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBlockchain.g:2418:1: ( rule__Operacion__Group__11__Impl )
            // InternalBlockchain.g:2419:2: rule__Operacion__Group__11__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Operacion__Group__11__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Operacion__Group__11"


    // $ANTLR start "rule__Operacion__Group__11__Impl"
    // InternalBlockchain.g:2425:1: rule__Operacion__Group__11__Impl : ( '}' ) ;
    public final void rule__Operacion__Group__11__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBlockchain.g:2429:1: ( ( '}' ) )
            // InternalBlockchain.g:2430:1: ( '}' )
            {
            // InternalBlockchain.g:2430:1: ( '}' )
            // InternalBlockchain.g:2431:2: '}'
            {
             before(grammarAccess.getOperacionAccess().getRightCurlyBracketKeyword_11()); 
            match(input,38,FOLLOW_2); 
             after(grammarAccess.getOperacionAccess().getRightCurlyBracketKeyword_11()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Operacion__Group__11__Impl"


    // $ANTLR start "rule__Operacion__Group_2__0"
    // InternalBlockchain.g:2441:1: rule__Operacion__Group_2__0 : rule__Operacion__Group_2__0__Impl rule__Operacion__Group_2__1 ;
    public final void rule__Operacion__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBlockchain.g:2445:1: ( rule__Operacion__Group_2__0__Impl rule__Operacion__Group_2__1 )
            // InternalBlockchain.g:2446:2: rule__Operacion__Group_2__0__Impl rule__Operacion__Group_2__1
            {
            pushFollow(FOLLOW_27);
            rule__Operacion__Group_2__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Operacion__Group_2__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Operacion__Group_2__0"


    // $ANTLR start "rule__Operacion__Group_2__0__Impl"
    // InternalBlockchain.g:2453:1: rule__Operacion__Group_2__0__Impl : ( 'isUd=' ) ;
    public final void rule__Operacion__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBlockchain.g:2457:1: ( ( 'isUd=' ) )
            // InternalBlockchain.g:2458:1: ( 'isUd=' )
            {
            // InternalBlockchain.g:2458:1: ( 'isUd=' )
            // InternalBlockchain.g:2459:2: 'isUd='
            {
             before(grammarAccess.getOperacionAccess().getIsUdKeyword_2_0()); 
            match(input,47,FOLLOW_2); 
             after(grammarAccess.getOperacionAccess().getIsUdKeyword_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Operacion__Group_2__0__Impl"


    // $ANTLR start "rule__Operacion__Group_2__1"
    // InternalBlockchain.g:2468:1: rule__Operacion__Group_2__1 : rule__Operacion__Group_2__1__Impl ;
    public final void rule__Operacion__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBlockchain.g:2472:1: ( rule__Operacion__Group_2__1__Impl )
            // InternalBlockchain.g:2473:2: rule__Operacion__Group_2__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Operacion__Group_2__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Operacion__Group_2__1"


    // $ANTLR start "rule__Operacion__Group_2__1__Impl"
    // InternalBlockchain.g:2479:1: rule__Operacion__Group_2__1__Impl : ( ( rule__Operacion__EsUserDefinedAssignment_2_1 ) ) ;
    public final void rule__Operacion__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBlockchain.g:2483:1: ( ( ( rule__Operacion__EsUserDefinedAssignment_2_1 ) ) )
            // InternalBlockchain.g:2484:1: ( ( rule__Operacion__EsUserDefinedAssignment_2_1 ) )
            {
            // InternalBlockchain.g:2484:1: ( ( rule__Operacion__EsUserDefinedAssignment_2_1 ) )
            // InternalBlockchain.g:2485:2: ( rule__Operacion__EsUserDefinedAssignment_2_1 )
            {
             before(grammarAccess.getOperacionAccess().getEsUserDefinedAssignment_2_1()); 
            // InternalBlockchain.g:2486:2: ( rule__Operacion__EsUserDefinedAssignment_2_1 )
            // InternalBlockchain.g:2486:3: rule__Operacion__EsUserDefinedAssignment_2_1
            {
            pushFollow(FOLLOW_2);
            rule__Operacion__EsUserDefinedAssignment_2_1();

            state._fsp--;


            }

             after(grammarAccess.getOperacionAccess().getEsUserDefinedAssignment_2_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Operacion__Group_2__1__Impl"


    // $ANTLR start "rule__Operacion__Group_5__0"
    // InternalBlockchain.g:2495:1: rule__Operacion__Group_5__0 : rule__Operacion__Group_5__0__Impl rule__Operacion__Group_5__1 ;
    public final void rule__Operacion__Group_5__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBlockchain.g:2499:1: ( rule__Operacion__Group_5__0__Impl rule__Operacion__Group_5__1 )
            // InternalBlockchain.g:2500:2: rule__Operacion__Group_5__0__Impl rule__Operacion__Group_5__1
            {
            pushFollow(FOLLOW_8);
            rule__Operacion__Group_5__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Operacion__Group_5__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Operacion__Group_5__0"


    // $ANTLR start "rule__Operacion__Group_5__0__Impl"
    // InternalBlockchain.g:2507:1: rule__Operacion__Group_5__0__Impl : ( ( rule__Operacion__ParametrosAssignment_5_0 ) ) ;
    public final void rule__Operacion__Group_5__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBlockchain.g:2511:1: ( ( ( rule__Operacion__ParametrosAssignment_5_0 ) ) )
            // InternalBlockchain.g:2512:1: ( ( rule__Operacion__ParametrosAssignment_5_0 ) )
            {
            // InternalBlockchain.g:2512:1: ( ( rule__Operacion__ParametrosAssignment_5_0 ) )
            // InternalBlockchain.g:2513:2: ( rule__Operacion__ParametrosAssignment_5_0 )
            {
             before(grammarAccess.getOperacionAccess().getParametrosAssignment_5_0()); 
            // InternalBlockchain.g:2514:2: ( rule__Operacion__ParametrosAssignment_5_0 )
            // InternalBlockchain.g:2514:3: rule__Operacion__ParametrosAssignment_5_0
            {
            pushFollow(FOLLOW_2);
            rule__Operacion__ParametrosAssignment_5_0();

            state._fsp--;


            }

             after(grammarAccess.getOperacionAccess().getParametrosAssignment_5_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Operacion__Group_5__0__Impl"


    // $ANTLR start "rule__Operacion__Group_5__1"
    // InternalBlockchain.g:2522:1: rule__Operacion__Group_5__1 : rule__Operacion__Group_5__1__Impl ;
    public final void rule__Operacion__Group_5__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBlockchain.g:2526:1: ( rule__Operacion__Group_5__1__Impl )
            // InternalBlockchain.g:2527:2: rule__Operacion__Group_5__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Operacion__Group_5__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Operacion__Group_5__1"


    // $ANTLR start "rule__Operacion__Group_5__1__Impl"
    // InternalBlockchain.g:2533:1: rule__Operacion__Group_5__1__Impl : ( ( rule__Operacion__Group_5_1__0 )* ) ;
    public final void rule__Operacion__Group_5__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBlockchain.g:2537:1: ( ( ( rule__Operacion__Group_5_1__0 )* ) )
            // InternalBlockchain.g:2538:1: ( ( rule__Operacion__Group_5_1__0 )* )
            {
            // InternalBlockchain.g:2538:1: ( ( rule__Operacion__Group_5_1__0 )* )
            // InternalBlockchain.g:2539:2: ( rule__Operacion__Group_5_1__0 )*
            {
             before(grammarAccess.getOperacionAccess().getGroup_5_1()); 
            // InternalBlockchain.g:2540:2: ( rule__Operacion__Group_5_1__0 )*
            loop27:
            do {
                int alt27=2;
                int LA27_0 = input.LA(1);

                if ( (LA27_0==39) ) {
                    alt27=1;
                }


                switch (alt27) {
            	case 1 :
            	    // InternalBlockchain.g:2540:3: rule__Operacion__Group_5_1__0
            	    {
            	    pushFollow(FOLLOW_9);
            	    rule__Operacion__Group_5_1__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop27;
                }
            } while (true);

             after(grammarAccess.getOperacionAccess().getGroup_5_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Operacion__Group_5__1__Impl"


    // $ANTLR start "rule__Operacion__Group_5_1__0"
    // InternalBlockchain.g:2549:1: rule__Operacion__Group_5_1__0 : rule__Operacion__Group_5_1__0__Impl rule__Operacion__Group_5_1__1 ;
    public final void rule__Operacion__Group_5_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBlockchain.g:2553:1: ( rule__Operacion__Group_5_1__0__Impl rule__Operacion__Group_5_1__1 )
            // InternalBlockchain.g:2554:2: rule__Operacion__Group_5_1__0__Impl rule__Operacion__Group_5_1__1
            {
            pushFollow(FOLLOW_4);
            rule__Operacion__Group_5_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Operacion__Group_5_1__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Operacion__Group_5_1__0"


    // $ANTLR start "rule__Operacion__Group_5_1__0__Impl"
    // InternalBlockchain.g:2561:1: rule__Operacion__Group_5_1__0__Impl : ( ',' ) ;
    public final void rule__Operacion__Group_5_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBlockchain.g:2565:1: ( ( ',' ) )
            // InternalBlockchain.g:2566:1: ( ',' )
            {
            // InternalBlockchain.g:2566:1: ( ',' )
            // InternalBlockchain.g:2567:2: ','
            {
             before(grammarAccess.getOperacionAccess().getCommaKeyword_5_1_0()); 
            match(input,39,FOLLOW_2); 
             after(grammarAccess.getOperacionAccess().getCommaKeyword_5_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Operacion__Group_5_1__0__Impl"


    // $ANTLR start "rule__Operacion__Group_5_1__1"
    // InternalBlockchain.g:2576:1: rule__Operacion__Group_5_1__1 : rule__Operacion__Group_5_1__1__Impl ;
    public final void rule__Operacion__Group_5_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBlockchain.g:2580:1: ( rule__Operacion__Group_5_1__1__Impl )
            // InternalBlockchain.g:2581:2: rule__Operacion__Group_5_1__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Operacion__Group_5_1__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Operacion__Group_5_1__1"


    // $ANTLR start "rule__Operacion__Group_5_1__1__Impl"
    // InternalBlockchain.g:2587:1: rule__Operacion__Group_5_1__1__Impl : ( ( rule__Operacion__ParametrosAssignment_5_1_1 ) ) ;
    public final void rule__Operacion__Group_5_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBlockchain.g:2591:1: ( ( ( rule__Operacion__ParametrosAssignment_5_1_1 ) ) )
            // InternalBlockchain.g:2592:1: ( ( rule__Operacion__ParametrosAssignment_5_1_1 ) )
            {
            // InternalBlockchain.g:2592:1: ( ( rule__Operacion__ParametrosAssignment_5_1_1 ) )
            // InternalBlockchain.g:2593:2: ( rule__Operacion__ParametrosAssignment_5_1_1 )
            {
             before(grammarAccess.getOperacionAccess().getParametrosAssignment_5_1_1()); 
            // InternalBlockchain.g:2594:2: ( rule__Operacion__ParametrosAssignment_5_1_1 )
            // InternalBlockchain.g:2594:3: rule__Operacion__ParametrosAssignment_5_1_1
            {
            pushFollow(FOLLOW_2);
            rule__Operacion__ParametrosAssignment_5_1_1();

            state._fsp--;


            }

             after(grammarAccess.getOperacionAccess().getParametrosAssignment_5_1_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Operacion__Group_5_1__1__Impl"


    // $ANTLR start "rule__Operacion__Group_7__0"
    // InternalBlockchain.g:2603:1: rule__Operacion__Group_7__0 : rule__Operacion__Group_7__0__Impl rule__Operacion__Group_7__1 ;
    public final void rule__Operacion__Group_7__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBlockchain.g:2607:1: ( rule__Operacion__Group_7__0__Impl rule__Operacion__Group_7__1 )
            // InternalBlockchain.g:2608:2: rule__Operacion__Group_7__0__Impl rule__Operacion__Group_7__1
            {
            pushFollow(FOLLOW_4);
            rule__Operacion__Group_7__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Operacion__Group_7__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Operacion__Group_7__0"


    // $ANTLR start "rule__Operacion__Group_7__0__Impl"
    // InternalBlockchain.g:2615:1: rule__Operacion__Group_7__0__Impl : ( ':' ) ;
    public final void rule__Operacion__Group_7__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBlockchain.g:2619:1: ( ( ':' ) )
            // InternalBlockchain.g:2620:1: ( ':' )
            {
            // InternalBlockchain.g:2620:1: ( ':' )
            // InternalBlockchain.g:2621:2: ':'
            {
             before(grammarAccess.getOperacionAccess().getColonKeyword_7_0()); 
            match(input,48,FOLLOW_2); 
             after(grammarAccess.getOperacionAccess().getColonKeyword_7_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Operacion__Group_7__0__Impl"


    // $ANTLR start "rule__Operacion__Group_7__1"
    // InternalBlockchain.g:2630:1: rule__Operacion__Group_7__1 : rule__Operacion__Group_7__1__Impl ;
    public final void rule__Operacion__Group_7__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBlockchain.g:2634:1: ( rule__Operacion__Group_7__1__Impl )
            // InternalBlockchain.g:2635:2: rule__Operacion__Group_7__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Operacion__Group_7__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Operacion__Group_7__1"


    // $ANTLR start "rule__Operacion__Group_7__1__Impl"
    // InternalBlockchain.g:2641:1: rule__Operacion__Group_7__1__Impl : ( ( rule__Operacion__RetornoAssignment_7_1 ) ) ;
    public final void rule__Operacion__Group_7__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBlockchain.g:2645:1: ( ( ( rule__Operacion__RetornoAssignment_7_1 ) ) )
            // InternalBlockchain.g:2646:1: ( ( rule__Operacion__RetornoAssignment_7_1 ) )
            {
            // InternalBlockchain.g:2646:1: ( ( rule__Operacion__RetornoAssignment_7_1 ) )
            // InternalBlockchain.g:2647:2: ( rule__Operacion__RetornoAssignment_7_1 )
            {
             before(grammarAccess.getOperacionAccess().getRetornoAssignment_7_1()); 
            // InternalBlockchain.g:2648:2: ( rule__Operacion__RetornoAssignment_7_1 )
            // InternalBlockchain.g:2648:3: rule__Operacion__RetornoAssignment_7_1
            {
            pushFollow(FOLLOW_2);
            rule__Operacion__RetornoAssignment_7_1();

            state._fsp--;


            }

             after(grammarAccess.getOperacionAccess().getRetornoAssignment_7_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Operacion__Group_7__1__Impl"


    // $ANTLR start "rule__Operacion__Group_10__0"
    // InternalBlockchain.g:2657:1: rule__Operacion__Group_10__0 : rule__Operacion__Group_10__0__Impl rule__Operacion__Group_10__1 ;
    public final void rule__Operacion__Group_10__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBlockchain.g:2661:1: ( rule__Operacion__Group_10__0__Impl rule__Operacion__Group_10__1 )
            // InternalBlockchain.g:2662:2: rule__Operacion__Group_10__0__Impl rule__Operacion__Group_10__1
            {
            pushFollow(FOLLOW_28);
            rule__Operacion__Group_10__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Operacion__Group_10__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Operacion__Group_10__0"


    // $ANTLR start "rule__Operacion__Group_10__0__Impl"
    // InternalBlockchain.g:2669:1: rule__Operacion__Group_10__0__Impl : ( ( rule__Operacion__SentenciaAssignment_10_0 ) ) ;
    public final void rule__Operacion__Group_10__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBlockchain.g:2673:1: ( ( ( rule__Operacion__SentenciaAssignment_10_0 ) ) )
            // InternalBlockchain.g:2674:1: ( ( rule__Operacion__SentenciaAssignment_10_0 ) )
            {
            // InternalBlockchain.g:2674:1: ( ( rule__Operacion__SentenciaAssignment_10_0 ) )
            // InternalBlockchain.g:2675:2: ( rule__Operacion__SentenciaAssignment_10_0 )
            {
             before(grammarAccess.getOperacionAccess().getSentenciaAssignment_10_0()); 
            // InternalBlockchain.g:2676:2: ( rule__Operacion__SentenciaAssignment_10_0 )
            // InternalBlockchain.g:2676:3: rule__Operacion__SentenciaAssignment_10_0
            {
            pushFollow(FOLLOW_2);
            rule__Operacion__SentenciaAssignment_10_0();

            state._fsp--;


            }

             after(grammarAccess.getOperacionAccess().getSentenciaAssignment_10_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Operacion__Group_10__0__Impl"


    // $ANTLR start "rule__Operacion__Group_10__1"
    // InternalBlockchain.g:2684:1: rule__Operacion__Group_10__1 : rule__Operacion__Group_10__1__Impl ;
    public final void rule__Operacion__Group_10__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBlockchain.g:2688:1: ( rule__Operacion__Group_10__1__Impl )
            // InternalBlockchain.g:2689:2: rule__Operacion__Group_10__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Operacion__Group_10__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Operacion__Group_10__1"


    // $ANTLR start "rule__Operacion__Group_10__1__Impl"
    // InternalBlockchain.g:2695:1: rule__Operacion__Group_10__1__Impl : ( ( rule__Operacion__SentenciaAssignment_10_1 )* ) ;
    public final void rule__Operacion__Group_10__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBlockchain.g:2699:1: ( ( ( rule__Operacion__SentenciaAssignment_10_1 )* ) )
            // InternalBlockchain.g:2700:1: ( ( rule__Operacion__SentenciaAssignment_10_1 )* )
            {
            // InternalBlockchain.g:2700:1: ( ( rule__Operacion__SentenciaAssignment_10_1 )* )
            // InternalBlockchain.g:2701:2: ( rule__Operacion__SentenciaAssignment_10_1 )*
            {
             before(grammarAccess.getOperacionAccess().getSentenciaAssignment_10_1()); 
            // InternalBlockchain.g:2702:2: ( rule__Operacion__SentenciaAssignment_10_1 )*
            loop28:
            do {
                int alt28=2;
                int LA28_0 = input.LA(1);

                if ( ((LA28_0>=RULE_STRING && LA28_0<=RULE_ID)||(LA28_0>=12 && LA28_0<=13)||(LA28_0>=49 && LA28_0<=51)||LA28_0==54||(LA28_0>=58 && LA28_0<=60)) ) {
                    alt28=1;
                }


                switch (alt28) {
            	case 1 :
            	    // InternalBlockchain.g:2702:3: rule__Operacion__SentenciaAssignment_10_1
            	    {
            	    pushFollow(FOLLOW_29);
            	    rule__Operacion__SentenciaAssignment_10_1();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop28;
                }
            } while (true);

             after(grammarAccess.getOperacionAccess().getSentenciaAssignment_10_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Operacion__Group_10__1__Impl"


    // $ANTLR start "rule__Estado__Group__0"
    // InternalBlockchain.g:2711:1: rule__Estado__Group__0 : rule__Estado__Group__0__Impl rule__Estado__Group__1 ;
    public final void rule__Estado__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBlockchain.g:2715:1: ( rule__Estado__Group__0__Impl rule__Estado__Group__1 )
            // InternalBlockchain.g:2716:2: rule__Estado__Group__0__Impl rule__Estado__Group__1
            {
            pushFollow(FOLLOW_30);
            rule__Estado__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Estado__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Estado__Group__0"


    // $ANTLR start "rule__Estado__Group__0__Impl"
    // InternalBlockchain.g:2723:1: rule__Estado__Group__0__Impl : ( 'Estado' ) ;
    public final void rule__Estado__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBlockchain.g:2727:1: ( ( 'Estado' ) )
            // InternalBlockchain.g:2728:1: ( 'Estado' )
            {
            // InternalBlockchain.g:2728:1: ( 'Estado' )
            // InternalBlockchain.g:2729:2: 'Estado'
            {
             before(grammarAccess.getEstadoAccess().getEstadoKeyword_0()); 
            match(input,49,FOLLOW_2); 
             after(grammarAccess.getEstadoAccess().getEstadoKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Estado__Group__0__Impl"


    // $ANTLR start "rule__Estado__Group__1"
    // InternalBlockchain.g:2738:1: rule__Estado__Group__1 : rule__Estado__Group__1__Impl rule__Estado__Group__2 ;
    public final void rule__Estado__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBlockchain.g:2742:1: ( rule__Estado__Group__1__Impl rule__Estado__Group__2 )
            // InternalBlockchain.g:2743:2: rule__Estado__Group__1__Impl rule__Estado__Group__2
            {
            pushFollow(FOLLOW_4);
            rule__Estado__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Estado__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Estado__Group__1"


    // $ANTLR start "rule__Estado__Group__1__Impl"
    // InternalBlockchain.g:2750:1: rule__Estado__Group__1__Impl : ( ( rule__Estado__TipodatoAssignment_1 ) ) ;
    public final void rule__Estado__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBlockchain.g:2754:1: ( ( ( rule__Estado__TipodatoAssignment_1 ) ) )
            // InternalBlockchain.g:2755:1: ( ( rule__Estado__TipodatoAssignment_1 ) )
            {
            // InternalBlockchain.g:2755:1: ( ( rule__Estado__TipodatoAssignment_1 ) )
            // InternalBlockchain.g:2756:2: ( rule__Estado__TipodatoAssignment_1 )
            {
             before(grammarAccess.getEstadoAccess().getTipodatoAssignment_1()); 
            // InternalBlockchain.g:2757:2: ( rule__Estado__TipodatoAssignment_1 )
            // InternalBlockchain.g:2757:3: rule__Estado__TipodatoAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__Estado__TipodatoAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getEstadoAccess().getTipodatoAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Estado__Group__1__Impl"


    // $ANTLR start "rule__Estado__Group__2"
    // InternalBlockchain.g:2765:1: rule__Estado__Group__2 : rule__Estado__Group__2__Impl ;
    public final void rule__Estado__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBlockchain.g:2769:1: ( rule__Estado__Group__2__Impl )
            // InternalBlockchain.g:2770:2: rule__Estado__Group__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Estado__Group__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Estado__Group__2"


    // $ANTLR start "rule__Estado__Group__2__Impl"
    // InternalBlockchain.g:2776:1: rule__Estado__Group__2__Impl : ( ( rule__Estado__NameAssignment_2 ) ) ;
    public final void rule__Estado__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBlockchain.g:2780:1: ( ( ( rule__Estado__NameAssignment_2 ) ) )
            // InternalBlockchain.g:2781:1: ( ( rule__Estado__NameAssignment_2 ) )
            {
            // InternalBlockchain.g:2781:1: ( ( rule__Estado__NameAssignment_2 ) )
            // InternalBlockchain.g:2782:2: ( rule__Estado__NameAssignment_2 )
            {
             before(grammarAccess.getEstadoAccess().getNameAssignment_2()); 
            // InternalBlockchain.g:2783:2: ( rule__Estado__NameAssignment_2 )
            // InternalBlockchain.g:2783:3: rule__Estado__NameAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__Estado__NameAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getEstadoAccess().getNameAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Estado__Group__2__Impl"


    // $ANTLR start "rule__Atributo__Group__0"
    // InternalBlockchain.g:2792:1: rule__Atributo__Group__0 : rule__Atributo__Group__0__Impl rule__Atributo__Group__1 ;
    public final void rule__Atributo__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBlockchain.g:2796:1: ( rule__Atributo__Group__0__Impl rule__Atributo__Group__1 )
            // InternalBlockchain.g:2797:2: rule__Atributo__Group__0__Impl rule__Atributo__Group__1
            {
            pushFollow(FOLLOW_4);
            rule__Atributo__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Atributo__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Atributo__Group__0"


    // $ANTLR start "rule__Atributo__Group__0__Impl"
    // InternalBlockchain.g:2804:1: rule__Atributo__Group__0__Impl : ( ( rule__Atributo__TipodatoAssignment_0 ) ) ;
    public final void rule__Atributo__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBlockchain.g:2808:1: ( ( ( rule__Atributo__TipodatoAssignment_0 ) ) )
            // InternalBlockchain.g:2809:1: ( ( rule__Atributo__TipodatoAssignment_0 ) )
            {
            // InternalBlockchain.g:2809:1: ( ( rule__Atributo__TipodatoAssignment_0 ) )
            // InternalBlockchain.g:2810:2: ( rule__Atributo__TipodatoAssignment_0 )
            {
             before(grammarAccess.getAtributoAccess().getTipodatoAssignment_0()); 
            // InternalBlockchain.g:2811:2: ( rule__Atributo__TipodatoAssignment_0 )
            // InternalBlockchain.g:2811:3: rule__Atributo__TipodatoAssignment_0
            {
            pushFollow(FOLLOW_2);
            rule__Atributo__TipodatoAssignment_0();

            state._fsp--;


            }

             after(grammarAccess.getAtributoAccess().getTipodatoAssignment_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Atributo__Group__0__Impl"


    // $ANTLR start "rule__Atributo__Group__1"
    // InternalBlockchain.g:2819:1: rule__Atributo__Group__1 : rule__Atributo__Group__1__Impl ;
    public final void rule__Atributo__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBlockchain.g:2823:1: ( rule__Atributo__Group__1__Impl )
            // InternalBlockchain.g:2824:2: rule__Atributo__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Atributo__Group__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Atributo__Group__1"


    // $ANTLR start "rule__Atributo__Group__1__Impl"
    // InternalBlockchain.g:2830:1: rule__Atributo__Group__1__Impl : ( ( rule__Atributo__NameAssignment_1 ) ) ;
    public final void rule__Atributo__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBlockchain.g:2834:1: ( ( ( rule__Atributo__NameAssignment_1 ) ) )
            // InternalBlockchain.g:2835:1: ( ( rule__Atributo__NameAssignment_1 ) )
            {
            // InternalBlockchain.g:2835:1: ( ( rule__Atributo__NameAssignment_1 ) )
            // InternalBlockchain.g:2836:2: ( rule__Atributo__NameAssignment_1 )
            {
             before(grammarAccess.getAtributoAccess().getNameAssignment_1()); 
            // InternalBlockchain.g:2837:2: ( rule__Atributo__NameAssignment_1 )
            // InternalBlockchain.g:2837:3: rule__Atributo__NameAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__Atributo__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getAtributoAccess().getNameAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Atributo__Group__1__Impl"


    // $ANTLR start "rule__Parametro__Group__0"
    // InternalBlockchain.g:2846:1: rule__Parametro__Group__0 : rule__Parametro__Group__0__Impl rule__Parametro__Group__1 ;
    public final void rule__Parametro__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBlockchain.g:2850:1: ( rule__Parametro__Group__0__Impl rule__Parametro__Group__1 )
            // InternalBlockchain.g:2851:2: rule__Parametro__Group__0__Impl rule__Parametro__Group__1
            {
            pushFollow(FOLLOW_4);
            rule__Parametro__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Parametro__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Parametro__Group__0"


    // $ANTLR start "rule__Parametro__Group__0__Impl"
    // InternalBlockchain.g:2858:1: rule__Parametro__Group__0__Impl : ( ( rule__Parametro__TipodatoAssignment_0 ) ) ;
    public final void rule__Parametro__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBlockchain.g:2862:1: ( ( ( rule__Parametro__TipodatoAssignment_0 ) ) )
            // InternalBlockchain.g:2863:1: ( ( rule__Parametro__TipodatoAssignment_0 ) )
            {
            // InternalBlockchain.g:2863:1: ( ( rule__Parametro__TipodatoAssignment_0 ) )
            // InternalBlockchain.g:2864:2: ( rule__Parametro__TipodatoAssignment_0 )
            {
             before(grammarAccess.getParametroAccess().getTipodatoAssignment_0()); 
            // InternalBlockchain.g:2865:2: ( rule__Parametro__TipodatoAssignment_0 )
            // InternalBlockchain.g:2865:3: rule__Parametro__TipodatoAssignment_0
            {
            pushFollow(FOLLOW_2);
            rule__Parametro__TipodatoAssignment_0();

            state._fsp--;


            }

             after(grammarAccess.getParametroAccess().getTipodatoAssignment_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Parametro__Group__0__Impl"


    // $ANTLR start "rule__Parametro__Group__1"
    // InternalBlockchain.g:2873:1: rule__Parametro__Group__1 : rule__Parametro__Group__1__Impl ;
    public final void rule__Parametro__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBlockchain.g:2877:1: ( rule__Parametro__Group__1__Impl )
            // InternalBlockchain.g:2878:2: rule__Parametro__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Parametro__Group__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Parametro__Group__1"


    // $ANTLR start "rule__Parametro__Group__1__Impl"
    // InternalBlockchain.g:2884:1: rule__Parametro__Group__1__Impl : ( ( rule__Parametro__NameAssignment_1 ) ) ;
    public final void rule__Parametro__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBlockchain.g:2888:1: ( ( ( rule__Parametro__NameAssignment_1 ) ) )
            // InternalBlockchain.g:2889:1: ( ( rule__Parametro__NameAssignment_1 ) )
            {
            // InternalBlockchain.g:2889:1: ( ( rule__Parametro__NameAssignment_1 ) )
            // InternalBlockchain.g:2890:2: ( rule__Parametro__NameAssignment_1 )
            {
             before(grammarAccess.getParametroAccess().getNameAssignment_1()); 
            // InternalBlockchain.g:2891:2: ( rule__Parametro__NameAssignment_1 )
            // InternalBlockchain.g:2891:3: rule__Parametro__NameAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__Parametro__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getParametroAccess().getNameAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Parametro__Group__1__Impl"


    // $ANTLR start "rule__ExpresionLogica__Group__0"
    // InternalBlockchain.g:2900:1: rule__ExpresionLogica__Group__0 : rule__ExpresionLogica__Group__0__Impl rule__ExpresionLogica__Group__1 ;
    public final void rule__ExpresionLogica__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBlockchain.g:2904:1: ( rule__ExpresionLogica__Group__0__Impl rule__ExpresionLogica__Group__1 )
            // InternalBlockchain.g:2905:2: rule__ExpresionLogica__Group__0__Impl rule__ExpresionLogica__Group__1
            {
            pushFollow(FOLLOW_31);
            rule__ExpresionLogica__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ExpresionLogica__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExpresionLogica__Group__0"


    // $ANTLR start "rule__ExpresionLogica__Group__0__Impl"
    // InternalBlockchain.g:2912:1: rule__ExpresionLogica__Group__0__Impl : ( 'ExpLog' ) ;
    public final void rule__ExpresionLogica__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBlockchain.g:2916:1: ( ( 'ExpLog' ) )
            // InternalBlockchain.g:2917:1: ( 'ExpLog' )
            {
            // InternalBlockchain.g:2917:1: ( 'ExpLog' )
            // InternalBlockchain.g:2918:2: 'ExpLog'
            {
             before(grammarAccess.getExpresionLogicaAccess().getExpLogKeyword_0()); 
            match(input,50,FOLLOW_2); 
             after(grammarAccess.getExpresionLogicaAccess().getExpLogKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExpresionLogica__Group__0__Impl"


    // $ANTLR start "rule__ExpresionLogica__Group__1"
    // InternalBlockchain.g:2927:1: rule__ExpresionLogica__Group__1 : rule__ExpresionLogica__Group__1__Impl rule__ExpresionLogica__Group__2 ;
    public final void rule__ExpresionLogica__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBlockchain.g:2931:1: ( rule__ExpresionLogica__Group__1__Impl rule__ExpresionLogica__Group__2 )
            // InternalBlockchain.g:2932:2: rule__ExpresionLogica__Group__1__Impl rule__ExpresionLogica__Group__2
            {
            pushFollow(FOLLOW_31);
            rule__ExpresionLogica__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ExpresionLogica__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExpresionLogica__Group__1"


    // $ANTLR start "rule__ExpresionLogica__Group__1__Impl"
    // InternalBlockchain.g:2939:1: rule__ExpresionLogica__Group__1__Impl : ( ( '(' )? ) ;
    public final void rule__ExpresionLogica__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBlockchain.g:2943:1: ( ( ( '(' )? ) )
            // InternalBlockchain.g:2944:1: ( ( '(' )? )
            {
            // InternalBlockchain.g:2944:1: ( ( '(' )? )
            // InternalBlockchain.g:2945:2: ( '(' )?
            {
             before(grammarAccess.getExpresionLogicaAccess().getLeftParenthesisKeyword_1()); 
            // InternalBlockchain.g:2946:2: ( '(' )?
            int alt29=2;
            int LA29_0 = input.LA(1);

            if ( (LA29_0==44) ) {
                alt29=1;
            }
            switch (alt29) {
                case 1 :
                    // InternalBlockchain.g:2946:3: '('
                    {
                    match(input,44,FOLLOW_2); 

                    }
                    break;

            }

             after(grammarAccess.getExpresionLogicaAccess().getLeftParenthesisKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExpresionLogica__Group__1__Impl"


    // $ANTLR start "rule__ExpresionLogica__Group__2"
    // InternalBlockchain.g:2954:1: rule__ExpresionLogica__Group__2 : rule__ExpresionLogica__Group__2__Impl rule__ExpresionLogica__Group__3 ;
    public final void rule__ExpresionLogica__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBlockchain.g:2958:1: ( rule__ExpresionLogica__Group__2__Impl rule__ExpresionLogica__Group__3 )
            // InternalBlockchain.g:2959:2: rule__ExpresionLogica__Group__2__Impl rule__ExpresionLogica__Group__3
            {
            pushFollow(FOLLOW_31);
            rule__ExpresionLogica__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ExpresionLogica__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExpresionLogica__Group__2"


    // $ANTLR start "rule__ExpresionLogica__Group__2__Impl"
    // InternalBlockchain.g:2966:1: rule__ExpresionLogica__Group__2__Impl : ( ( rule__ExpresionLogica__Group_2__0 )? ) ;
    public final void rule__ExpresionLogica__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBlockchain.g:2970:1: ( ( ( rule__ExpresionLogica__Group_2__0 )? ) )
            // InternalBlockchain.g:2971:1: ( ( rule__ExpresionLogica__Group_2__0 )? )
            {
            // InternalBlockchain.g:2971:1: ( ( rule__ExpresionLogica__Group_2__0 )? )
            // InternalBlockchain.g:2972:2: ( rule__ExpresionLogica__Group_2__0 )?
            {
             before(grammarAccess.getExpresionLogicaAccess().getGroup_2()); 
            // InternalBlockchain.g:2973:2: ( rule__ExpresionLogica__Group_2__0 )?
            int alt30=2;
            int LA30_0 = input.LA(1);

            if ( (LA30_0==51) ) {
                alt30=1;
            }
            switch (alt30) {
                case 1 :
                    // InternalBlockchain.g:2973:3: rule__ExpresionLogica__Group_2__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__ExpresionLogica__Group_2__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getExpresionLogicaAccess().getGroup_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExpresionLogica__Group__2__Impl"


    // $ANTLR start "rule__ExpresionLogica__Group__3"
    // InternalBlockchain.g:2981:1: rule__ExpresionLogica__Group__3 : rule__ExpresionLogica__Group__3__Impl rule__ExpresionLogica__Group__4 ;
    public final void rule__ExpresionLogica__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBlockchain.g:2985:1: ( rule__ExpresionLogica__Group__3__Impl rule__ExpresionLogica__Group__4 )
            // InternalBlockchain.g:2986:2: rule__ExpresionLogica__Group__3__Impl rule__ExpresionLogica__Group__4
            {
            pushFollow(FOLLOW_32);
            rule__ExpresionLogica__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ExpresionLogica__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExpresionLogica__Group__3"


    // $ANTLR start "rule__ExpresionLogica__Group__3__Impl"
    // InternalBlockchain.g:2993:1: rule__ExpresionLogica__Group__3__Impl : ( ( rule__ExpresionLogica__LadoIzqAssignment_3 ) ) ;
    public final void rule__ExpresionLogica__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBlockchain.g:2997:1: ( ( ( rule__ExpresionLogica__LadoIzqAssignment_3 ) ) )
            // InternalBlockchain.g:2998:1: ( ( rule__ExpresionLogica__LadoIzqAssignment_3 ) )
            {
            // InternalBlockchain.g:2998:1: ( ( rule__ExpresionLogica__LadoIzqAssignment_3 ) )
            // InternalBlockchain.g:2999:2: ( rule__ExpresionLogica__LadoIzqAssignment_3 )
            {
             before(grammarAccess.getExpresionLogicaAccess().getLadoIzqAssignment_3()); 
            // InternalBlockchain.g:3000:2: ( rule__ExpresionLogica__LadoIzqAssignment_3 )
            // InternalBlockchain.g:3000:3: rule__ExpresionLogica__LadoIzqAssignment_3
            {
            pushFollow(FOLLOW_2);
            rule__ExpresionLogica__LadoIzqAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getExpresionLogicaAccess().getLadoIzqAssignment_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExpresionLogica__Group__3__Impl"


    // $ANTLR start "rule__ExpresionLogica__Group__4"
    // InternalBlockchain.g:3008:1: rule__ExpresionLogica__Group__4 : rule__ExpresionLogica__Group__4__Impl rule__ExpresionLogica__Group__5 ;
    public final void rule__ExpresionLogica__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBlockchain.g:3012:1: ( rule__ExpresionLogica__Group__4__Impl rule__ExpresionLogica__Group__5 )
            // InternalBlockchain.g:3013:2: rule__ExpresionLogica__Group__4__Impl rule__ExpresionLogica__Group__5
            {
            pushFollow(FOLLOW_4);
            rule__ExpresionLogica__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ExpresionLogica__Group__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExpresionLogica__Group__4"


    // $ANTLR start "rule__ExpresionLogica__Group__4__Impl"
    // InternalBlockchain.g:3020:1: rule__ExpresionLogica__Group__4__Impl : ( ( ( rule__ExpresionLogica__OperadorAssignment_4 ) ) ( ( rule__ExpresionLogica__OperadorAssignment_4 )* ) ) ;
    public final void rule__ExpresionLogica__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBlockchain.g:3024:1: ( ( ( ( rule__ExpresionLogica__OperadorAssignment_4 ) ) ( ( rule__ExpresionLogica__OperadorAssignment_4 )* ) ) )
            // InternalBlockchain.g:3025:1: ( ( ( rule__ExpresionLogica__OperadorAssignment_4 ) ) ( ( rule__ExpresionLogica__OperadorAssignment_4 )* ) )
            {
            // InternalBlockchain.g:3025:1: ( ( ( rule__ExpresionLogica__OperadorAssignment_4 ) ) ( ( rule__ExpresionLogica__OperadorAssignment_4 )* ) )
            // InternalBlockchain.g:3026:2: ( ( rule__ExpresionLogica__OperadorAssignment_4 ) ) ( ( rule__ExpresionLogica__OperadorAssignment_4 )* )
            {
            // InternalBlockchain.g:3026:2: ( ( rule__ExpresionLogica__OperadorAssignment_4 ) )
            // InternalBlockchain.g:3027:3: ( rule__ExpresionLogica__OperadorAssignment_4 )
            {
             before(grammarAccess.getExpresionLogicaAccess().getOperadorAssignment_4()); 
            // InternalBlockchain.g:3028:3: ( rule__ExpresionLogica__OperadorAssignment_4 )
            // InternalBlockchain.g:3028:4: rule__ExpresionLogica__OperadorAssignment_4
            {
            pushFollow(FOLLOW_33);
            rule__ExpresionLogica__OperadorAssignment_4();

            state._fsp--;


            }

             after(grammarAccess.getExpresionLogicaAccess().getOperadorAssignment_4()); 

            }

            // InternalBlockchain.g:3031:2: ( ( rule__ExpresionLogica__OperadorAssignment_4 )* )
            // InternalBlockchain.g:3032:3: ( rule__ExpresionLogica__OperadorAssignment_4 )*
            {
             before(grammarAccess.getExpresionLogicaAccess().getOperadorAssignment_4()); 
            // InternalBlockchain.g:3033:3: ( rule__ExpresionLogica__OperadorAssignment_4 )*
            loop31:
            do {
                int alt31=2;
                int LA31_0 = input.LA(1);

                if ( ((LA31_0>=16 && LA31_0<=23)) ) {
                    alt31=1;
                }


                switch (alt31) {
            	case 1 :
            	    // InternalBlockchain.g:3033:4: rule__ExpresionLogica__OperadorAssignment_4
            	    {
            	    pushFollow(FOLLOW_33);
            	    rule__ExpresionLogica__OperadorAssignment_4();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop31;
                }
            } while (true);

             after(grammarAccess.getExpresionLogicaAccess().getOperadorAssignment_4()); 

            }


            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExpresionLogica__Group__4__Impl"


    // $ANTLR start "rule__ExpresionLogica__Group__5"
    // InternalBlockchain.g:3042:1: rule__ExpresionLogica__Group__5 : rule__ExpresionLogica__Group__5__Impl rule__ExpresionLogica__Group__6 ;
    public final void rule__ExpresionLogica__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBlockchain.g:3046:1: ( rule__ExpresionLogica__Group__5__Impl rule__ExpresionLogica__Group__6 )
            // InternalBlockchain.g:3047:2: rule__ExpresionLogica__Group__5__Impl rule__ExpresionLogica__Group__6
            {
            pushFollow(FOLLOW_34);
            rule__ExpresionLogica__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ExpresionLogica__Group__6();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExpresionLogica__Group__5"


    // $ANTLR start "rule__ExpresionLogica__Group__5__Impl"
    // InternalBlockchain.g:3054:1: rule__ExpresionLogica__Group__5__Impl : ( ( rule__ExpresionLogica__LadoDerAssignment_5 ) ) ;
    public final void rule__ExpresionLogica__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBlockchain.g:3058:1: ( ( ( rule__ExpresionLogica__LadoDerAssignment_5 ) ) )
            // InternalBlockchain.g:3059:1: ( ( rule__ExpresionLogica__LadoDerAssignment_5 ) )
            {
            // InternalBlockchain.g:3059:1: ( ( rule__ExpresionLogica__LadoDerAssignment_5 ) )
            // InternalBlockchain.g:3060:2: ( rule__ExpresionLogica__LadoDerAssignment_5 )
            {
             before(grammarAccess.getExpresionLogicaAccess().getLadoDerAssignment_5()); 
            // InternalBlockchain.g:3061:2: ( rule__ExpresionLogica__LadoDerAssignment_5 )
            // InternalBlockchain.g:3061:3: rule__ExpresionLogica__LadoDerAssignment_5
            {
            pushFollow(FOLLOW_2);
            rule__ExpresionLogica__LadoDerAssignment_5();

            state._fsp--;


            }

             after(grammarAccess.getExpresionLogicaAccess().getLadoDerAssignment_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExpresionLogica__Group__5__Impl"


    // $ANTLR start "rule__ExpresionLogica__Group__6"
    // InternalBlockchain.g:3069:1: rule__ExpresionLogica__Group__6 : rule__ExpresionLogica__Group__6__Impl ;
    public final void rule__ExpresionLogica__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBlockchain.g:3073:1: ( rule__ExpresionLogica__Group__6__Impl )
            // InternalBlockchain.g:3074:2: rule__ExpresionLogica__Group__6__Impl
            {
            pushFollow(FOLLOW_2);
            rule__ExpresionLogica__Group__6__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExpresionLogica__Group__6"


    // $ANTLR start "rule__ExpresionLogica__Group__6__Impl"
    // InternalBlockchain.g:3080:1: rule__ExpresionLogica__Group__6__Impl : ( ( ')' )? ) ;
    public final void rule__ExpresionLogica__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBlockchain.g:3084:1: ( ( ( ')' )? ) )
            // InternalBlockchain.g:3085:1: ( ( ')' )? )
            {
            // InternalBlockchain.g:3085:1: ( ( ')' )? )
            // InternalBlockchain.g:3086:2: ( ')' )?
            {
             before(grammarAccess.getExpresionLogicaAccess().getRightParenthesisKeyword_6()); 
            // InternalBlockchain.g:3087:2: ( ')' )?
            int alt32=2;
            int LA32_0 = input.LA(1);

            if ( (LA32_0==45) ) {
                alt32=1;
            }
            switch (alt32) {
                case 1 :
                    // InternalBlockchain.g:3087:3: ')'
                    {
                    match(input,45,FOLLOW_2); 

                    }
                    break;

            }

             after(grammarAccess.getExpresionLogicaAccess().getRightParenthesisKeyword_6()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExpresionLogica__Group__6__Impl"


    // $ANTLR start "rule__ExpresionLogica__Group_2__0"
    // InternalBlockchain.g:3096:1: rule__ExpresionLogica__Group_2__0 : rule__ExpresionLogica__Group_2__0__Impl rule__ExpresionLogica__Group_2__1 ;
    public final void rule__ExpresionLogica__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBlockchain.g:3100:1: ( rule__ExpresionLogica__Group_2__0__Impl rule__ExpresionLogica__Group_2__1 )
            // InternalBlockchain.g:3101:2: rule__ExpresionLogica__Group_2__0__Impl rule__ExpresionLogica__Group_2__1
            {
            pushFollow(FOLLOW_35);
            rule__ExpresionLogica__Group_2__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ExpresionLogica__Group_2__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExpresionLogica__Group_2__0"


    // $ANTLR start "rule__ExpresionLogica__Group_2__0__Impl"
    // InternalBlockchain.g:3108:1: rule__ExpresionLogica__Group_2__0__Impl : ( 'id' ) ;
    public final void rule__ExpresionLogica__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBlockchain.g:3112:1: ( ( 'id' ) )
            // InternalBlockchain.g:3113:1: ( 'id' )
            {
            // InternalBlockchain.g:3113:1: ( 'id' )
            // InternalBlockchain.g:3114:2: 'id'
            {
             before(grammarAccess.getExpresionLogicaAccess().getIdKeyword_2_0()); 
            match(input,51,FOLLOW_2); 
             after(grammarAccess.getExpresionLogicaAccess().getIdKeyword_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExpresionLogica__Group_2__0__Impl"


    // $ANTLR start "rule__ExpresionLogica__Group_2__1"
    // InternalBlockchain.g:3123:1: rule__ExpresionLogica__Group_2__1 : rule__ExpresionLogica__Group_2__1__Impl ;
    public final void rule__ExpresionLogica__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBlockchain.g:3127:1: ( rule__ExpresionLogica__Group_2__1__Impl )
            // InternalBlockchain.g:3128:2: rule__ExpresionLogica__Group_2__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__ExpresionLogica__Group_2__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExpresionLogica__Group_2__1"


    // $ANTLR start "rule__ExpresionLogica__Group_2__1__Impl"
    // InternalBlockchain.g:3134:1: rule__ExpresionLogica__Group_2__1__Impl : ( ( rule__ExpresionLogica__IdAssignment_2_1 ) ) ;
    public final void rule__ExpresionLogica__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBlockchain.g:3138:1: ( ( ( rule__ExpresionLogica__IdAssignment_2_1 ) ) )
            // InternalBlockchain.g:3139:1: ( ( rule__ExpresionLogica__IdAssignment_2_1 ) )
            {
            // InternalBlockchain.g:3139:1: ( ( rule__ExpresionLogica__IdAssignment_2_1 ) )
            // InternalBlockchain.g:3140:2: ( rule__ExpresionLogica__IdAssignment_2_1 )
            {
             before(grammarAccess.getExpresionLogicaAccess().getIdAssignment_2_1()); 
            // InternalBlockchain.g:3141:2: ( rule__ExpresionLogica__IdAssignment_2_1 )
            // InternalBlockchain.g:3141:3: rule__ExpresionLogica__IdAssignment_2_1
            {
            pushFollow(FOLLOW_2);
            rule__ExpresionLogica__IdAssignment_2_1();

            state._fsp--;


            }

             after(grammarAccess.getExpresionLogicaAccess().getIdAssignment_2_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExpresionLogica__Group_2__1__Impl"


    // $ANTLR start "rule__ExpresionAritmetica__Group__0"
    // InternalBlockchain.g:3150:1: rule__ExpresionAritmetica__Group__0 : rule__ExpresionAritmetica__Group__0__Impl rule__ExpresionAritmetica__Group__1 ;
    public final void rule__ExpresionAritmetica__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBlockchain.g:3154:1: ( rule__ExpresionAritmetica__Group__0__Impl rule__ExpresionAritmetica__Group__1 )
            // InternalBlockchain.g:3155:2: rule__ExpresionAritmetica__Group__0__Impl rule__ExpresionAritmetica__Group__1
            {
            pushFollow(FOLLOW_36);
            rule__ExpresionAritmetica__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ExpresionAritmetica__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExpresionAritmetica__Group__0"


    // $ANTLR start "rule__ExpresionAritmetica__Group__0__Impl"
    // InternalBlockchain.g:3162:1: rule__ExpresionAritmetica__Group__0__Impl : ( () ) ;
    public final void rule__ExpresionAritmetica__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBlockchain.g:3166:1: ( ( () ) )
            // InternalBlockchain.g:3167:1: ( () )
            {
            // InternalBlockchain.g:3167:1: ( () )
            // InternalBlockchain.g:3168:2: ()
            {
             before(grammarAccess.getExpresionAritmeticaAccess().getExpresionAritmeticaAction_0()); 
            // InternalBlockchain.g:3169:2: ()
            // InternalBlockchain.g:3169:3: 
            {
            }

             after(grammarAccess.getExpresionAritmeticaAccess().getExpresionAritmeticaAction_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExpresionAritmetica__Group__0__Impl"


    // $ANTLR start "rule__ExpresionAritmetica__Group__1"
    // InternalBlockchain.g:3177:1: rule__ExpresionAritmetica__Group__1 : rule__ExpresionAritmetica__Group__1__Impl rule__ExpresionAritmetica__Group__2 ;
    public final void rule__ExpresionAritmetica__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBlockchain.g:3181:1: ( rule__ExpresionAritmetica__Group__1__Impl rule__ExpresionAritmetica__Group__2 )
            // InternalBlockchain.g:3182:2: rule__ExpresionAritmetica__Group__1__Impl rule__ExpresionAritmetica__Group__2
            {
            pushFollow(FOLLOW_36);
            rule__ExpresionAritmetica__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ExpresionAritmetica__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExpresionAritmetica__Group__1"


    // $ANTLR start "rule__ExpresionAritmetica__Group__1__Impl"
    // InternalBlockchain.g:3189:1: rule__ExpresionAritmetica__Group__1__Impl : ( ( rule__ExpresionAritmetica__Group_1__0 )? ) ;
    public final void rule__ExpresionAritmetica__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBlockchain.g:3193:1: ( ( ( rule__ExpresionAritmetica__Group_1__0 )? ) )
            // InternalBlockchain.g:3194:1: ( ( rule__ExpresionAritmetica__Group_1__0 )? )
            {
            // InternalBlockchain.g:3194:1: ( ( rule__ExpresionAritmetica__Group_1__0 )? )
            // InternalBlockchain.g:3195:2: ( rule__ExpresionAritmetica__Group_1__0 )?
            {
             before(grammarAccess.getExpresionAritmeticaAccess().getGroup_1()); 
            // InternalBlockchain.g:3196:2: ( rule__ExpresionAritmetica__Group_1__0 )?
            int alt33=2;
            int LA33_0 = input.LA(1);

            if ( (LA33_0==51) ) {
                alt33=1;
            }
            switch (alt33) {
                case 1 :
                    // InternalBlockchain.g:3196:3: rule__ExpresionAritmetica__Group_1__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__ExpresionAritmetica__Group_1__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getExpresionAritmeticaAccess().getGroup_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExpresionAritmetica__Group__1__Impl"


    // $ANTLR start "rule__ExpresionAritmetica__Group__2"
    // InternalBlockchain.g:3204:1: rule__ExpresionAritmetica__Group__2 : rule__ExpresionAritmetica__Group__2__Impl rule__ExpresionAritmetica__Group__3 ;
    public final void rule__ExpresionAritmetica__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBlockchain.g:3208:1: ( rule__ExpresionAritmetica__Group__2__Impl rule__ExpresionAritmetica__Group__3 )
            // InternalBlockchain.g:3209:2: rule__ExpresionAritmetica__Group__2__Impl rule__ExpresionAritmetica__Group__3
            {
            pushFollow(FOLLOW_37);
            rule__ExpresionAritmetica__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ExpresionAritmetica__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExpresionAritmetica__Group__2"


    // $ANTLR start "rule__ExpresionAritmetica__Group__2__Impl"
    // InternalBlockchain.g:3216:1: rule__ExpresionAritmetica__Group__2__Impl : ( ( rule__ExpresionAritmetica__LadoIzqAssignment_2 ) ) ;
    public final void rule__ExpresionAritmetica__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBlockchain.g:3220:1: ( ( ( rule__ExpresionAritmetica__LadoIzqAssignment_2 ) ) )
            // InternalBlockchain.g:3221:1: ( ( rule__ExpresionAritmetica__LadoIzqAssignment_2 ) )
            {
            // InternalBlockchain.g:3221:1: ( ( rule__ExpresionAritmetica__LadoIzqAssignment_2 ) )
            // InternalBlockchain.g:3222:2: ( rule__ExpresionAritmetica__LadoIzqAssignment_2 )
            {
             before(grammarAccess.getExpresionAritmeticaAccess().getLadoIzqAssignment_2()); 
            // InternalBlockchain.g:3223:2: ( rule__ExpresionAritmetica__LadoIzqAssignment_2 )
            // InternalBlockchain.g:3223:3: rule__ExpresionAritmetica__LadoIzqAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__ExpresionAritmetica__LadoIzqAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getExpresionAritmeticaAccess().getLadoIzqAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExpresionAritmetica__Group__2__Impl"


    // $ANTLR start "rule__ExpresionAritmetica__Group__3"
    // InternalBlockchain.g:3231:1: rule__ExpresionAritmetica__Group__3 : rule__ExpresionAritmetica__Group__3__Impl rule__ExpresionAritmetica__Group__4 ;
    public final void rule__ExpresionAritmetica__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBlockchain.g:3235:1: ( rule__ExpresionAritmetica__Group__3__Impl rule__ExpresionAritmetica__Group__4 )
            // InternalBlockchain.g:3236:2: rule__ExpresionAritmetica__Group__3__Impl rule__ExpresionAritmetica__Group__4
            {
            pushFollow(FOLLOW_4);
            rule__ExpresionAritmetica__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ExpresionAritmetica__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExpresionAritmetica__Group__3"


    // $ANTLR start "rule__ExpresionAritmetica__Group__3__Impl"
    // InternalBlockchain.g:3243:1: rule__ExpresionAritmetica__Group__3__Impl : ( ( ( rule__ExpresionAritmetica__OperadorAssignment_3 ) ) ( ( rule__ExpresionAritmetica__OperadorAssignment_3 )* ) ) ;
    public final void rule__ExpresionAritmetica__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBlockchain.g:3247:1: ( ( ( ( rule__ExpresionAritmetica__OperadorAssignment_3 ) ) ( ( rule__ExpresionAritmetica__OperadorAssignment_3 )* ) ) )
            // InternalBlockchain.g:3248:1: ( ( ( rule__ExpresionAritmetica__OperadorAssignment_3 ) ) ( ( rule__ExpresionAritmetica__OperadorAssignment_3 )* ) )
            {
            // InternalBlockchain.g:3248:1: ( ( ( rule__ExpresionAritmetica__OperadorAssignment_3 ) ) ( ( rule__ExpresionAritmetica__OperadorAssignment_3 )* ) )
            // InternalBlockchain.g:3249:2: ( ( rule__ExpresionAritmetica__OperadorAssignment_3 ) ) ( ( rule__ExpresionAritmetica__OperadorAssignment_3 )* )
            {
            // InternalBlockchain.g:3249:2: ( ( rule__ExpresionAritmetica__OperadorAssignment_3 ) )
            // InternalBlockchain.g:3250:3: ( rule__ExpresionAritmetica__OperadorAssignment_3 )
            {
             before(grammarAccess.getExpresionAritmeticaAccess().getOperadorAssignment_3()); 
            // InternalBlockchain.g:3251:3: ( rule__ExpresionAritmetica__OperadorAssignment_3 )
            // InternalBlockchain.g:3251:4: rule__ExpresionAritmetica__OperadorAssignment_3
            {
            pushFollow(FOLLOW_38);
            rule__ExpresionAritmetica__OperadorAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getExpresionAritmeticaAccess().getOperadorAssignment_3()); 

            }

            // InternalBlockchain.g:3254:2: ( ( rule__ExpresionAritmetica__OperadorAssignment_3 )* )
            // InternalBlockchain.g:3255:3: ( rule__ExpresionAritmetica__OperadorAssignment_3 )*
            {
             before(grammarAccess.getExpresionAritmeticaAccess().getOperadorAssignment_3()); 
            // InternalBlockchain.g:3256:3: ( rule__ExpresionAritmetica__OperadorAssignment_3 )*
            loop34:
            do {
                int alt34=2;
                int LA34_0 = input.LA(1);

                if ( ((LA34_0>=24 && LA34_0<=30)) ) {
                    alt34=1;
                }


                switch (alt34) {
            	case 1 :
            	    // InternalBlockchain.g:3256:4: rule__ExpresionAritmetica__OperadorAssignment_3
            	    {
            	    pushFollow(FOLLOW_38);
            	    rule__ExpresionAritmetica__OperadorAssignment_3();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop34;
                }
            } while (true);

             after(grammarAccess.getExpresionAritmeticaAccess().getOperadorAssignment_3()); 

            }


            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExpresionAritmetica__Group__3__Impl"


    // $ANTLR start "rule__ExpresionAritmetica__Group__4"
    // InternalBlockchain.g:3265:1: rule__ExpresionAritmetica__Group__4 : rule__ExpresionAritmetica__Group__4__Impl ;
    public final void rule__ExpresionAritmetica__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBlockchain.g:3269:1: ( rule__ExpresionAritmetica__Group__4__Impl )
            // InternalBlockchain.g:3270:2: rule__ExpresionAritmetica__Group__4__Impl
            {
            pushFollow(FOLLOW_2);
            rule__ExpresionAritmetica__Group__4__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExpresionAritmetica__Group__4"


    // $ANTLR start "rule__ExpresionAritmetica__Group__4__Impl"
    // InternalBlockchain.g:3276:1: rule__ExpresionAritmetica__Group__4__Impl : ( ( rule__ExpresionAritmetica__LadoDerAssignment_4 ) ) ;
    public final void rule__ExpresionAritmetica__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBlockchain.g:3280:1: ( ( ( rule__ExpresionAritmetica__LadoDerAssignment_4 ) ) )
            // InternalBlockchain.g:3281:1: ( ( rule__ExpresionAritmetica__LadoDerAssignment_4 ) )
            {
            // InternalBlockchain.g:3281:1: ( ( rule__ExpresionAritmetica__LadoDerAssignment_4 ) )
            // InternalBlockchain.g:3282:2: ( rule__ExpresionAritmetica__LadoDerAssignment_4 )
            {
             before(grammarAccess.getExpresionAritmeticaAccess().getLadoDerAssignment_4()); 
            // InternalBlockchain.g:3283:2: ( rule__ExpresionAritmetica__LadoDerAssignment_4 )
            // InternalBlockchain.g:3283:3: rule__ExpresionAritmetica__LadoDerAssignment_4
            {
            pushFollow(FOLLOW_2);
            rule__ExpresionAritmetica__LadoDerAssignment_4();

            state._fsp--;


            }

             after(grammarAccess.getExpresionAritmeticaAccess().getLadoDerAssignment_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExpresionAritmetica__Group__4__Impl"


    // $ANTLR start "rule__ExpresionAritmetica__Group_1__0"
    // InternalBlockchain.g:3292:1: rule__ExpresionAritmetica__Group_1__0 : rule__ExpresionAritmetica__Group_1__0__Impl rule__ExpresionAritmetica__Group_1__1 ;
    public final void rule__ExpresionAritmetica__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBlockchain.g:3296:1: ( rule__ExpresionAritmetica__Group_1__0__Impl rule__ExpresionAritmetica__Group_1__1 )
            // InternalBlockchain.g:3297:2: rule__ExpresionAritmetica__Group_1__0__Impl rule__ExpresionAritmetica__Group_1__1
            {
            pushFollow(FOLLOW_35);
            rule__ExpresionAritmetica__Group_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ExpresionAritmetica__Group_1__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExpresionAritmetica__Group_1__0"


    // $ANTLR start "rule__ExpresionAritmetica__Group_1__0__Impl"
    // InternalBlockchain.g:3304:1: rule__ExpresionAritmetica__Group_1__0__Impl : ( 'id' ) ;
    public final void rule__ExpresionAritmetica__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBlockchain.g:3308:1: ( ( 'id' ) )
            // InternalBlockchain.g:3309:1: ( 'id' )
            {
            // InternalBlockchain.g:3309:1: ( 'id' )
            // InternalBlockchain.g:3310:2: 'id'
            {
             before(grammarAccess.getExpresionAritmeticaAccess().getIdKeyword_1_0()); 
            match(input,51,FOLLOW_2); 
             after(grammarAccess.getExpresionAritmeticaAccess().getIdKeyword_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExpresionAritmetica__Group_1__0__Impl"


    // $ANTLR start "rule__ExpresionAritmetica__Group_1__1"
    // InternalBlockchain.g:3319:1: rule__ExpresionAritmetica__Group_1__1 : rule__ExpresionAritmetica__Group_1__1__Impl ;
    public final void rule__ExpresionAritmetica__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBlockchain.g:3323:1: ( rule__ExpresionAritmetica__Group_1__1__Impl )
            // InternalBlockchain.g:3324:2: rule__ExpresionAritmetica__Group_1__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__ExpresionAritmetica__Group_1__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExpresionAritmetica__Group_1__1"


    // $ANTLR start "rule__ExpresionAritmetica__Group_1__1__Impl"
    // InternalBlockchain.g:3330:1: rule__ExpresionAritmetica__Group_1__1__Impl : ( ( rule__ExpresionAritmetica__IdAssignment_1_1 ) ) ;
    public final void rule__ExpresionAritmetica__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBlockchain.g:3334:1: ( ( ( rule__ExpresionAritmetica__IdAssignment_1_1 ) ) )
            // InternalBlockchain.g:3335:1: ( ( rule__ExpresionAritmetica__IdAssignment_1_1 ) )
            {
            // InternalBlockchain.g:3335:1: ( ( rule__ExpresionAritmetica__IdAssignment_1_1 ) )
            // InternalBlockchain.g:3336:2: ( rule__ExpresionAritmetica__IdAssignment_1_1 )
            {
             before(grammarAccess.getExpresionAritmeticaAccess().getIdAssignment_1_1()); 
            // InternalBlockchain.g:3337:2: ( rule__ExpresionAritmetica__IdAssignment_1_1 )
            // InternalBlockchain.g:3337:3: rule__ExpresionAritmetica__IdAssignment_1_1
            {
            pushFollow(FOLLOW_2);
            rule__ExpresionAritmetica__IdAssignment_1_1();

            state._fsp--;


            }

             after(grammarAccess.getExpresionAritmeticaAccess().getIdAssignment_1_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExpresionAritmetica__Group_1__1__Impl"


    // $ANTLR start "rule__Variable__Group__0"
    // InternalBlockchain.g:3346:1: rule__Variable__Group__0 : rule__Variable__Group__0__Impl rule__Variable__Group__1 ;
    public final void rule__Variable__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBlockchain.g:3350:1: ( rule__Variable__Group__0__Impl rule__Variable__Group__1 )
            // InternalBlockchain.g:3351:2: rule__Variable__Group__0__Impl rule__Variable__Group__1
            {
            pushFollow(FOLLOW_4);
            rule__Variable__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Variable__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Variable__Group__0"


    // $ANTLR start "rule__Variable__Group__0__Impl"
    // InternalBlockchain.g:3358:1: rule__Variable__Group__0__Impl : ( () ) ;
    public final void rule__Variable__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBlockchain.g:3362:1: ( ( () ) )
            // InternalBlockchain.g:3363:1: ( () )
            {
            // InternalBlockchain.g:3363:1: ( () )
            // InternalBlockchain.g:3364:2: ()
            {
             before(grammarAccess.getVariableAccess().getVariableAction_0()); 
            // InternalBlockchain.g:3365:2: ()
            // InternalBlockchain.g:3365:3: 
            {
            }

             after(grammarAccess.getVariableAccess().getVariableAction_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Variable__Group__0__Impl"


    // $ANTLR start "rule__Variable__Group__1"
    // InternalBlockchain.g:3373:1: rule__Variable__Group__1 : rule__Variable__Group__1__Impl rule__Variable__Group__2 ;
    public final void rule__Variable__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBlockchain.g:3377:1: ( rule__Variable__Group__1__Impl rule__Variable__Group__2 )
            // InternalBlockchain.g:3378:2: rule__Variable__Group__1__Impl rule__Variable__Group__2
            {
            pushFollow(FOLLOW_39);
            rule__Variable__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Variable__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Variable__Group__1"


    // $ANTLR start "rule__Variable__Group__1__Impl"
    // InternalBlockchain.g:3385:1: rule__Variable__Group__1__Impl : ( ( rule__Variable__TipodatoAssignment_1 ) ) ;
    public final void rule__Variable__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBlockchain.g:3389:1: ( ( ( rule__Variable__TipodatoAssignment_1 ) ) )
            // InternalBlockchain.g:3390:1: ( ( rule__Variable__TipodatoAssignment_1 ) )
            {
            // InternalBlockchain.g:3390:1: ( ( rule__Variable__TipodatoAssignment_1 ) )
            // InternalBlockchain.g:3391:2: ( rule__Variable__TipodatoAssignment_1 )
            {
             before(grammarAccess.getVariableAccess().getTipodatoAssignment_1()); 
            // InternalBlockchain.g:3392:2: ( rule__Variable__TipodatoAssignment_1 )
            // InternalBlockchain.g:3392:3: rule__Variable__TipodatoAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__Variable__TipodatoAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getVariableAccess().getTipodatoAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Variable__Group__1__Impl"


    // $ANTLR start "rule__Variable__Group__2"
    // InternalBlockchain.g:3400:1: rule__Variable__Group__2 : rule__Variable__Group__2__Impl rule__Variable__Group__3 ;
    public final void rule__Variable__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBlockchain.g:3404:1: ( rule__Variable__Group__2__Impl rule__Variable__Group__3 )
            // InternalBlockchain.g:3405:2: rule__Variable__Group__2__Impl rule__Variable__Group__3
            {
            pushFollow(FOLLOW_4);
            rule__Variable__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Variable__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Variable__Group__2"


    // $ANTLR start "rule__Variable__Group__2__Impl"
    // InternalBlockchain.g:3412:1: rule__Variable__Group__2__Impl : ( 'var' ) ;
    public final void rule__Variable__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBlockchain.g:3416:1: ( ( 'var' ) )
            // InternalBlockchain.g:3417:1: ( 'var' )
            {
            // InternalBlockchain.g:3417:1: ( 'var' )
            // InternalBlockchain.g:3418:2: 'var'
            {
             before(grammarAccess.getVariableAccess().getVarKeyword_2()); 
            match(input,52,FOLLOW_2); 
             after(grammarAccess.getVariableAccess().getVarKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Variable__Group__2__Impl"


    // $ANTLR start "rule__Variable__Group__3"
    // InternalBlockchain.g:3427:1: rule__Variable__Group__3 : rule__Variable__Group__3__Impl rule__Variable__Group__4 ;
    public final void rule__Variable__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBlockchain.g:3431:1: ( rule__Variable__Group__3__Impl rule__Variable__Group__4 )
            // InternalBlockchain.g:3432:2: rule__Variable__Group__3__Impl rule__Variable__Group__4
            {
            pushFollow(FOLLOW_40);
            rule__Variable__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Variable__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Variable__Group__3"


    // $ANTLR start "rule__Variable__Group__3__Impl"
    // InternalBlockchain.g:3439:1: rule__Variable__Group__3__Impl : ( ( rule__Variable__NameAssignment_3 ) ) ;
    public final void rule__Variable__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBlockchain.g:3443:1: ( ( ( rule__Variable__NameAssignment_3 ) ) )
            // InternalBlockchain.g:3444:1: ( ( rule__Variable__NameAssignment_3 ) )
            {
            // InternalBlockchain.g:3444:1: ( ( rule__Variable__NameAssignment_3 ) )
            // InternalBlockchain.g:3445:2: ( rule__Variable__NameAssignment_3 )
            {
             before(grammarAccess.getVariableAccess().getNameAssignment_3()); 
            // InternalBlockchain.g:3446:2: ( rule__Variable__NameAssignment_3 )
            // InternalBlockchain.g:3446:3: rule__Variable__NameAssignment_3
            {
            pushFollow(FOLLOW_2);
            rule__Variable__NameAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getVariableAccess().getNameAssignment_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Variable__Group__3__Impl"


    // $ANTLR start "rule__Variable__Group__4"
    // InternalBlockchain.g:3454:1: rule__Variable__Group__4 : rule__Variable__Group__4__Impl ;
    public final void rule__Variable__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBlockchain.g:3458:1: ( rule__Variable__Group__4__Impl )
            // InternalBlockchain.g:3459:2: rule__Variable__Group__4__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Variable__Group__4__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Variable__Group__4"


    // $ANTLR start "rule__Variable__Group__4__Impl"
    // InternalBlockchain.g:3465:1: rule__Variable__Group__4__Impl : ( ( rule__Variable__Group_4__0 )? ) ;
    public final void rule__Variable__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBlockchain.g:3469:1: ( ( ( rule__Variable__Group_4__0 )? ) )
            // InternalBlockchain.g:3470:1: ( ( rule__Variable__Group_4__0 )? )
            {
            // InternalBlockchain.g:3470:1: ( ( rule__Variable__Group_4__0 )? )
            // InternalBlockchain.g:3471:2: ( rule__Variable__Group_4__0 )?
            {
             before(grammarAccess.getVariableAccess().getGroup_4()); 
            // InternalBlockchain.g:3472:2: ( rule__Variable__Group_4__0 )?
            int alt35=2;
            int LA35_0 = input.LA(1);

            if ( (LA35_0==28) ) {
                alt35=1;
            }
            switch (alt35) {
                case 1 :
                    // InternalBlockchain.g:3472:3: rule__Variable__Group_4__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Variable__Group_4__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getVariableAccess().getGroup_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Variable__Group__4__Impl"


    // $ANTLR start "rule__Variable__Group_4__0"
    // InternalBlockchain.g:3481:1: rule__Variable__Group_4__0 : rule__Variable__Group_4__0__Impl rule__Variable__Group_4__1 ;
    public final void rule__Variable__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBlockchain.g:3485:1: ( rule__Variable__Group_4__0__Impl rule__Variable__Group_4__1 )
            // InternalBlockchain.g:3486:2: rule__Variable__Group_4__0__Impl rule__Variable__Group_4__1
            {
            pushFollow(FOLLOW_41);
            rule__Variable__Group_4__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Variable__Group_4__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Variable__Group_4__0"


    // $ANTLR start "rule__Variable__Group_4__0__Impl"
    // InternalBlockchain.g:3493:1: rule__Variable__Group_4__0__Impl : ( '=' ) ;
    public final void rule__Variable__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBlockchain.g:3497:1: ( ( '=' ) )
            // InternalBlockchain.g:3498:1: ( '=' )
            {
            // InternalBlockchain.g:3498:1: ( '=' )
            // InternalBlockchain.g:3499:2: '='
            {
             before(grammarAccess.getVariableAccess().getEqualsSignKeyword_4_0()); 
            match(input,28,FOLLOW_2); 
             after(grammarAccess.getVariableAccess().getEqualsSignKeyword_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Variable__Group_4__0__Impl"


    // $ANTLR start "rule__Variable__Group_4__1"
    // InternalBlockchain.g:3508:1: rule__Variable__Group_4__1 : rule__Variable__Group_4__1__Impl ;
    public final void rule__Variable__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBlockchain.g:3512:1: ( rule__Variable__Group_4__1__Impl )
            // InternalBlockchain.g:3513:2: rule__Variable__Group_4__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Variable__Group_4__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Variable__Group_4__1"


    // $ANTLR start "rule__Variable__Group_4__1__Impl"
    // InternalBlockchain.g:3519:1: rule__Variable__Group_4__1__Impl : ( 'new' ) ;
    public final void rule__Variable__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBlockchain.g:3523:1: ( ( 'new' ) )
            // InternalBlockchain.g:3524:1: ( 'new' )
            {
            // InternalBlockchain.g:3524:1: ( 'new' )
            // InternalBlockchain.g:3525:2: 'new'
            {
             before(grammarAccess.getVariableAccess().getNewKeyword_4_1()); 
            match(input,53,FOLLOW_2); 
             after(grammarAccess.getVariableAccess().getNewKeyword_4_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Variable__Group_4__1__Impl"


    // $ANTLR start "rule__Condicional__Group__0"
    // InternalBlockchain.g:3535:1: rule__Condicional__Group__0 : rule__Condicional__Group__0__Impl rule__Condicional__Group__1 ;
    public final void rule__Condicional__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBlockchain.g:3539:1: ( rule__Condicional__Group__0__Impl rule__Condicional__Group__1 )
            // InternalBlockchain.g:3540:2: rule__Condicional__Group__0__Impl rule__Condicional__Group__1
            {
            pushFollow(FOLLOW_5);
            rule__Condicional__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Condicional__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Condicional__Group__0"


    // $ANTLR start "rule__Condicional__Group__0__Impl"
    // InternalBlockchain.g:3547:1: rule__Condicional__Group__0__Impl : ( 'Condicional' ) ;
    public final void rule__Condicional__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBlockchain.g:3551:1: ( ( 'Condicional' ) )
            // InternalBlockchain.g:3552:1: ( 'Condicional' )
            {
            // InternalBlockchain.g:3552:1: ( 'Condicional' )
            // InternalBlockchain.g:3553:2: 'Condicional'
            {
             before(grammarAccess.getCondicionalAccess().getCondicionalKeyword_0()); 
            match(input,54,FOLLOW_2); 
             after(grammarAccess.getCondicionalAccess().getCondicionalKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Condicional__Group__0__Impl"


    // $ANTLR start "rule__Condicional__Group__1"
    // InternalBlockchain.g:3562:1: rule__Condicional__Group__1 : rule__Condicional__Group__1__Impl rule__Condicional__Group__2 ;
    public final void rule__Condicional__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBlockchain.g:3566:1: ( rule__Condicional__Group__1__Impl rule__Condicional__Group__2 )
            // InternalBlockchain.g:3567:2: rule__Condicional__Group__1__Impl rule__Condicional__Group__2
            {
            pushFollow(FOLLOW_42);
            rule__Condicional__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Condicional__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Condicional__Group__1"


    // $ANTLR start "rule__Condicional__Group__1__Impl"
    // InternalBlockchain.g:3574:1: rule__Condicional__Group__1__Impl : ( '{' ) ;
    public final void rule__Condicional__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBlockchain.g:3578:1: ( ( '{' ) )
            // InternalBlockchain.g:3579:1: ( '{' )
            {
            // InternalBlockchain.g:3579:1: ( '{' )
            // InternalBlockchain.g:3580:2: '{'
            {
             before(grammarAccess.getCondicionalAccess().getLeftCurlyBracketKeyword_1()); 
            match(input,37,FOLLOW_2); 
             after(grammarAccess.getCondicionalAccess().getLeftCurlyBracketKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Condicional__Group__1__Impl"


    // $ANTLR start "rule__Condicional__Group__2"
    // InternalBlockchain.g:3589:1: rule__Condicional__Group__2 : rule__Condicional__Group__2__Impl rule__Condicional__Group__3 ;
    public final void rule__Condicional__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBlockchain.g:3593:1: ( rule__Condicional__Group__2__Impl rule__Condicional__Group__3 )
            // InternalBlockchain.g:3594:2: rule__Condicional__Group__2__Impl rule__Condicional__Group__3
            {
            pushFollow(FOLLOW_42);
            rule__Condicional__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Condicional__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Condicional__Group__2"


    // $ANTLR start "rule__Condicional__Group__2__Impl"
    // InternalBlockchain.g:3601:1: rule__Condicional__Group__2__Impl : ( ( rule__Condicional__Group_2__0 )? ) ;
    public final void rule__Condicional__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBlockchain.g:3605:1: ( ( ( rule__Condicional__Group_2__0 )? ) )
            // InternalBlockchain.g:3606:1: ( ( rule__Condicional__Group_2__0 )? )
            {
            // InternalBlockchain.g:3606:1: ( ( rule__Condicional__Group_2__0 )? )
            // InternalBlockchain.g:3607:2: ( rule__Condicional__Group_2__0 )?
            {
             before(grammarAccess.getCondicionalAccess().getGroup_2()); 
            // InternalBlockchain.g:3608:2: ( rule__Condicional__Group_2__0 )?
            int alt36=2;
            int LA36_0 = input.LA(1);

            if ( (LA36_0==57) ) {
                alt36=1;
            }
            switch (alt36) {
                case 1 :
                    // InternalBlockchain.g:3608:3: rule__Condicional__Group_2__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Condicional__Group_2__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getCondicionalAccess().getGroup_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Condicional__Group__2__Impl"


    // $ANTLR start "rule__Condicional__Group__3"
    // InternalBlockchain.g:3616:1: rule__Condicional__Group__3 : rule__Condicional__Group__3__Impl rule__Condicional__Group__4 ;
    public final void rule__Condicional__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBlockchain.g:3620:1: ( rule__Condicional__Group__3__Impl rule__Condicional__Group__4 )
            // InternalBlockchain.g:3621:2: rule__Condicional__Group__3__Impl rule__Condicional__Group__4
            {
            pushFollow(FOLLOW_43);
            rule__Condicional__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Condicional__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Condicional__Group__3"


    // $ANTLR start "rule__Condicional__Group__3__Impl"
    // InternalBlockchain.g:3628:1: rule__Condicional__Group__3__Impl : ( 'expresionlogica' ) ;
    public final void rule__Condicional__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBlockchain.g:3632:1: ( ( 'expresionlogica' ) )
            // InternalBlockchain.g:3633:1: ( 'expresionlogica' )
            {
            // InternalBlockchain.g:3633:1: ( 'expresionlogica' )
            // InternalBlockchain.g:3634:2: 'expresionlogica'
            {
             before(grammarAccess.getCondicionalAccess().getExpresionlogicaKeyword_3()); 
            match(input,55,FOLLOW_2); 
             after(grammarAccess.getCondicionalAccess().getExpresionlogicaKeyword_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Condicional__Group__3__Impl"


    // $ANTLR start "rule__Condicional__Group__4"
    // InternalBlockchain.g:3643:1: rule__Condicional__Group__4 : rule__Condicional__Group__4__Impl rule__Condicional__Group__5 ;
    public final void rule__Condicional__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBlockchain.g:3647:1: ( rule__Condicional__Group__4__Impl rule__Condicional__Group__5 )
            // InternalBlockchain.g:3648:2: rule__Condicional__Group__4__Impl rule__Condicional__Group__5
            {
            pushFollow(FOLLOW_44);
            rule__Condicional__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Condicional__Group__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Condicional__Group__4"


    // $ANTLR start "rule__Condicional__Group__4__Impl"
    // InternalBlockchain.g:3655:1: rule__Condicional__Group__4__Impl : ( ( rule__Condicional__ExpresionlogicaAssignment_4 ) ) ;
    public final void rule__Condicional__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBlockchain.g:3659:1: ( ( ( rule__Condicional__ExpresionlogicaAssignment_4 ) ) )
            // InternalBlockchain.g:3660:1: ( ( rule__Condicional__ExpresionlogicaAssignment_4 ) )
            {
            // InternalBlockchain.g:3660:1: ( ( rule__Condicional__ExpresionlogicaAssignment_4 ) )
            // InternalBlockchain.g:3661:2: ( rule__Condicional__ExpresionlogicaAssignment_4 )
            {
             before(grammarAccess.getCondicionalAccess().getExpresionlogicaAssignment_4()); 
            // InternalBlockchain.g:3662:2: ( rule__Condicional__ExpresionlogicaAssignment_4 )
            // InternalBlockchain.g:3662:3: rule__Condicional__ExpresionlogicaAssignment_4
            {
            pushFollow(FOLLOW_2);
            rule__Condicional__ExpresionlogicaAssignment_4();

            state._fsp--;


            }

             after(grammarAccess.getCondicionalAccess().getExpresionlogicaAssignment_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Condicional__Group__4__Impl"


    // $ANTLR start "rule__Condicional__Group__5"
    // InternalBlockchain.g:3670:1: rule__Condicional__Group__5 : rule__Condicional__Group__5__Impl rule__Condicional__Group__6 ;
    public final void rule__Condicional__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBlockchain.g:3674:1: ( rule__Condicional__Group__5__Impl rule__Condicional__Group__6 )
            // InternalBlockchain.g:3675:2: rule__Condicional__Group__5__Impl rule__Condicional__Group__6
            {
            pushFollow(FOLLOW_5);
            rule__Condicional__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Condicional__Group__6();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Condicional__Group__5"


    // $ANTLR start "rule__Condicional__Group__5__Impl"
    // InternalBlockchain.g:3682:1: rule__Condicional__Group__5__Impl : ( 'sentencias' ) ;
    public final void rule__Condicional__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBlockchain.g:3686:1: ( ( 'sentencias' ) )
            // InternalBlockchain.g:3687:1: ( 'sentencias' )
            {
            // InternalBlockchain.g:3687:1: ( 'sentencias' )
            // InternalBlockchain.g:3688:2: 'sentencias'
            {
             before(grammarAccess.getCondicionalAccess().getSentenciasKeyword_5()); 
            match(input,56,FOLLOW_2); 
             after(grammarAccess.getCondicionalAccess().getSentenciasKeyword_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Condicional__Group__5__Impl"


    // $ANTLR start "rule__Condicional__Group__6"
    // InternalBlockchain.g:3697:1: rule__Condicional__Group__6 : rule__Condicional__Group__6__Impl rule__Condicional__Group__7 ;
    public final void rule__Condicional__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBlockchain.g:3701:1: ( rule__Condicional__Group__6__Impl rule__Condicional__Group__7 )
            // InternalBlockchain.g:3702:2: rule__Condicional__Group__6__Impl rule__Condicional__Group__7
            {
            pushFollow(FOLLOW_28);
            rule__Condicional__Group__6__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Condicional__Group__7();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Condicional__Group__6"


    // $ANTLR start "rule__Condicional__Group__6__Impl"
    // InternalBlockchain.g:3709:1: rule__Condicional__Group__6__Impl : ( '{' ) ;
    public final void rule__Condicional__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBlockchain.g:3713:1: ( ( '{' ) )
            // InternalBlockchain.g:3714:1: ( '{' )
            {
            // InternalBlockchain.g:3714:1: ( '{' )
            // InternalBlockchain.g:3715:2: '{'
            {
             before(grammarAccess.getCondicionalAccess().getLeftCurlyBracketKeyword_6()); 
            match(input,37,FOLLOW_2); 
             after(grammarAccess.getCondicionalAccess().getLeftCurlyBracketKeyword_6()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Condicional__Group__6__Impl"


    // $ANTLR start "rule__Condicional__Group__7"
    // InternalBlockchain.g:3724:1: rule__Condicional__Group__7 : rule__Condicional__Group__7__Impl rule__Condicional__Group__8 ;
    public final void rule__Condicional__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBlockchain.g:3728:1: ( rule__Condicional__Group__7__Impl rule__Condicional__Group__8 )
            // InternalBlockchain.g:3729:2: rule__Condicional__Group__7__Impl rule__Condicional__Group__8
            {
            pushFollow(FOLLOW_45);
            rule__Condicional__Group__7__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Condicional__Group__8();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Condicional__Group__7"


    // $ANTLR start "rule__Condicional__Group__7__Impl"
    // InternalBlockchain.g:3736:1: rule__Condicional__Group__7__Impl : ( ( rule__Condicional__SentenciasAssignment_7 ) ) ;
    public final void rule__Condicional__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBlockchain.g:3740:1: ( ( ( rule__Condicional__SentenciasAssignment_7 ) ) )
            // InternalBlockchain.g:3741:1: ( ( rule__Condicional__SentenciasAssignment_7 ) )
            {
            // InternalBlockchain.g:3741:1: ( ( rule__Condicional__SentenciasAssignment_7 ) )
            // InternalBlockchain.g:3742:2: ( rule__Condicional__SentenciasAssignment_7 )
            {
             before(grammarAccess.getCondicionalAccess().getSentenciasAssignment_7()); 
            // InternalBlockchain.g:3743:2: ( rule__Condicional__SentenciasAssignment_7 )
            // InternalBlockchain.g:3743:3: rule__Condicional__SentenciasAssignment_7
            {
            pushFollow(FOLLOW_2);
            rule__Condicional__SentenciasAssignment_7();

            state._fsp--;


            }

             after(grammarAccess.getCondicionalAccess().getSentenciasAssignment_7()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Condicional__Group__7__Impl"


    // $ANTLR start "rule__Condicional__Group__8"
    // InternalBlockchain.g:3751:1: rule__Condicional__Group__8 : rule__Condicional__Group__8__Impl rule__Condicional__Group__9 ;
    public final void rule__Condicional__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBlockchain.g:3755:1: ( rule__Condicional__Group__8__Impl rule__Condicional__Group__9 )
            // InternalBlockchain.g:3756:2: rule__Condicional__Group__8__Impl rule__Condicional__Group__9
            {
            pushFollow(FOLLOW_45);
            rule__Condicional__Group__8__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Condicional__Group__9();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Condicional__Group__8"


    // $ANTLR start "rule__Condicional__Group__8__Impl"
    // InternalBlockchain.g:3763:1: rule__Condicional__Group__8__Impl : ( ( rule__Condicional__Group_8__0 )* ) ;
    public final void rule__Condicional__Group__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBlockchain.g:3767:1: ( ( ( rule__Condicional__Group_8__0 )* ) )
            // InternalBlockchain.g:3768:1: ( ( rule__Condicional__Group_8__0 )* )
            {
            // InternalBlockchain.g:3768:1: ( ( rule__Condicional__Group_8__0 )* )
            // InternalBlockchain.g:3769:2: ( rule__Condicional__Group_8__0 )*
            {
             before(grammarAccess.getCondicionalAccess().getGroup_8()); 
            // InternalBlockchain.g:3770:2: ( rule__Condicional__Group_8__0 )*
            loop37:
            do {
                int alt37=2;
                int LA37_0 = input.LA(1);

                if ( (LA37_0==39) ) {
                    alt37=1;
                }


                switch (alt37) {
            	case 1 :
            	    // InternalBlockchain.g:3770:3: rule__Condicional__Group_8__0
            	    {
            	    pushFollow(FOLLOW_9);
            	    rule__Condicional__Group_8__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop37;
                }
            } while (true);

             after(grammarAccess.getCondicionalAccess().getGroup_8()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Condicional__Group__8__Impl"


    // $ANTLR start "rule__Condicional__Group__9"
    // InternalBlockchain.g:3778:1: rule__Condicional__Group__9 : rule__Condicional__Group__9__Impl rule__Condicional__Group__10 ;
    public final void rule__Condicional__Group__9() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBlockchain.g:3782:1: ( rule__Condicional__Group__9__Impl rule__Condicional__Group__10 )
            // InternalBlockchain.g:3783:2: rule__Condicional__Group__9__Impl rule__Condicional__Group__10
            {
            pushFollow(FOLLOW_46);
            rule__Condicional__Group__9__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Condicional__Group__10();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Condicional__Group__9"


    // $ANTLR start "rule__Condicional__Group__9__Impl"
    // InternalBlockchain.g:3790:1: rule__Condicional__Group__9__Impl : ( '}' ) ;
    public final void rule__Condicional__Group__9__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBlockchain.g:3794:1: ( ( '}' ) )
            // InternalBlockchain.g:3795:1: ( '}' )
            {
            // InternalBlockchain.g:3795:1: ( '}' )
            // InternalBlockchain.g:3796:2: '}'
            {
             before(grammarAccess.getCondicionalAccess().getRightCurlyBracketKeyword_9()); 
            match(input,38,FOLLOW_2); 
             after(grammarAccess.getCondicionalAccess().getRightCurlyBracketKeyword_9()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Condicional__Group__9__Impl"


    // $ANTLR start "rule__Condicional__Group__10"
    // InternalBlockchain.g:3805:1: rule__Condicional__Group__10 : rule__Condicional__Group__10__Impl rule__Condicional__Group__11 ;
    public final void rule__Condicional__Group__10() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBlockchain.g:3809:1: ( rule__Condicional__Group__10__Impl rule__Condicional__Group__11 )
            // InternalBlockchain.g:3810:2: rule__Condicional__Group__10__Impl rule__Condicional__Group__11
            {
            pushFollow(FOLLOW_46);
            rule__Condicional__Group__10__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Condicional__Group__11();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Condicional__Group__10"


    // $ANTLR start "rule__Condicional__Group__10__Impl"
    // InternalBlockchain.g:3817:1: rule__Condicional__Group__10__Impl : ( ( rule__Condicional__Group_10__0 )? ) ;
    public final void rule__Condicional__Group__10__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBlockchain.g:3821:1: ( ( ( rule__Condicional__Group_10__0 )? ) )
            // InternalBlockchain.g:3822:1: ( ( rule__Condicional__Group_10__0 )? )
            {
            // InternalBlockchain.g:3822:1: ( ( rule__Condicional__Group_10__0 )? )
            // InternalBlockchain.g:3823:2: ( rule__Condicional__Group_10__0 )?
            {
             before(grammarAccess.getCondicionalAccess().getGroup_10()); 
            // InternalBlockchain.g:3824:2: ( rule__Condicional__Group_10__0 )?
            int alt38=2;
            int LA38_0 = input.LA(1);

            if ( (LA38_0==32) ) {
                alt38=1;
            }
            switch (alt38) {
                case 1 :
                    // InternalBlockchain.g:3824:3: rule__Condicional__Group_10__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Condicional__Group_10__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getCondicionalAccess().getGroup_10()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Condicional__Group__10__Impl"


    // $ANTLR start "rule__Condicional__Group__11"
    // InternalBlockchain.g:3832:1: rule__Condicional__Group__11 : rule__Condicional__Group__11__Impl ;
    public final void rule__Condicional__Group__11() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBlockchain.g:3836:1: ( rule__Condicional__Group__11__Impl )
            // InternalBlockchain.g:3837:2: rule__Condicional__Group__11__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Condicional__Group__11__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Condicional__Group__11"


    // $ANTLR start "rule__Condicional__Group__11__Impl"
    // InternalBlockchain.g:3843:1: rule__Condicional__Group__11__Impl : ( '}' ) ;
    public final void rule__Condicional__Group__11__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBlockchain.g:3847:1: ( ( '}' ) )
            // InternalBlockchain.g:3848:1: ( '}' )
            {
            // InternalBlockchain.g:3848:1: ( '}' )
            // InternalBlockchain.g:3849:2: '}'
            {
             before(grammarAccess.getCondicionalAccess().getRightCurlyBracketKeyword_11()); 
            match(input,38,FOLLOW_2); 
             after(grammarAccess.getCondicionalAccess().getRightCurlyBracketKeyword_11()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Condicional__Group__11__Impl"


    // $ANTLR start "rule__Condicional__Group_2__0"
    // InternalBlockchain.g:3859:1: rule__Condicional__Group_2__0 : rule__Condicional__Group_2__0__Impl rule__Condicional__Group_2__1 ;
    public final void rule__Condicional__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBlockchain.g:3863:1: ( rule__Condicional__Group_2__0__Impl rule__Condicional__Group_2__1 )
            // InternalBlockchain.g:3864:2: rule__Condicional__Group_2__0__Impl rule__Condicional__Group_2__1
            {
            pushFollow(FOLLOW_47);
            rule__Condicional__Group_2__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Condicional__Group_2__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Condicional__Group_2__0"


    // $ANTLR start "rule__Condicional__Group_2__0__Impl"
    // InternalBlockchain.g:3871:1: rule__Condicional__Group_2__0__Impl : ( 'tipoCondicional' ) ;
    public final void rule__Condicional__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBlockchain.g:3875:1: ( ( 'tipoCondicional' ) )
            // InternalBlockchain.g:3876:1: ( 'tipoCondicional' )
            {
            // InternalBlockchain.g:3876:1: ( 'tipoCondicional' )
            // InternalBlockchain.g:3877:2: 'tipoCondicional'
            {
             before(grammarAccess.getCondicionalAccess().getTipoCondicionalKeyword_2_0()); 
            match(input,57,FOLLOW_2); 
             after(grammarAccess.getCondicionalAccess().getTipoCondicionalKeyword_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Condicional__Group_2__0__Impl"


    // $ANTLR start "rule__Condicional__Group_2__1"
    // InternalBlockchain.g:3886:1: rule__Condicional__Group_2__1 : rule__Condicional__Group_2__1__Impl ;
    public final void rule__Condicional__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBlockchain.g:3890:1: ( rule__Condicional__Group_2__1__Impl )
            // InternalBlockchain.g:3891:2: rule__Condicional__Group_2__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Condicional__Group_2__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Condicional__Group_2__1"


    // $ANTLR start "rule__Condicional__Group_2__1__Impl"
    // InternalBlockchain.g:3897:1: rule__Condicional__Group_2__1__Impl : ( ( rule__Condicional__TipoCondicionalAssignment_2_1 ) ) ;
    public final void rule__Condicional__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBlockchain.g:3901:1: ( ( ( rule__Condicional__TipoCondicionalAssignment_2_1 ) ) )
            // InternalBlockchain.g:3902:1: ( ( rule__Condicional__TipoCondicionalAssignment_2_1 ) )
            {
            // InternalBlockchain.g:3902:1: ( ( rule__Condicional__TipoCondicionalAssignment_2_1 ) )
            // InternalBlockchain.g:3903:2: ( rule__Condicional__TipoCondicionalAssignment_2_1 )
            {
             before(grammarAccess.getCondicionalAccess().getTipoCondicionalAssignment_2_1()); 
            // InternalBlockchain.g:3904:2: ( rule__Condicional__TipoCondicionalAssignment_2_1 )
            // InternalBlockchain.g:3904:3: rule__Condicional__TipoCondicionalAssignment_2_1
            {
            pushFollow(FOLLOW_2);
            rule__Condicional__TipoCondicionalAssignment_2_1();

            state._fsp--;


            }

             after(grammarAccess.getCondicionalAccess().getTipoCondicionalAssignment_2_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Condicional__Group_2__1__Impl"


    // $ANTLR start "rule__Condicional__Group_8__0"
    // InternalBlockchain.g:3913:1: rule__Condicional__Group_8__0 : rule__Condicional__Group_8__0__Impl rule__Condicional__Group_8__1 ;
    public final void rule__Condicional__Group_8__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBlockchain.g:3917:1: ( rule__Condicional__Group_8__0__Impl rule__Condicional__Group_8__1 )
            // InternalBlockchain.g:3918:2: rule__Condicional__Group_8__0__Impl rule__Condicional__Group_8__1
            {
            pushFollow(FOLLOW_28);
            rule__Condicional__Group_8__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Condicional__Group_8__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Condicional__Group_8__0"


    // $ANTLR start "rule__Condicional__Group_8__0__Impl"
    // InternalBlockchain.g:3925:1: rule__Condicional__Group_8__0__Impl : ( ',' ) ;
    public final void rule__Condicional__Group_8__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBlockchain.g:3929:1: ( ( ',' ) )
            // InternalBlockchain.g:3930:1: ( ',' )
            {
            // InternalBlockchain.g:3930:1: ( ',' )
            // InternalBlockchain.g:3931:2: ','
            {
             before(grammarAccess.getCondicionalAccess().getCommaKeyword_8_0()); 
            match(input,39,FOLLOW_2); 
             after(grammarAccess.getCondicionalAccess().getCommaKeyword_8_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Condicional__Group_8__0__Impl"


    // $ANTLR start "rule__Condicional__Group_8__1"
    // InternalBlockchain.g:3940:1: rule__Condicional__Group_8__1 : rule__Condicional__Group_8__1__Impl ;
    public final void rule__Condicional__Group_8__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBlockchain.g:3944:1: ( rule__Condicional__Group_8__1__Impl )
            // InternalBlockchain.g:3945:2: rule__Condicional__Group_8__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Condicional__Group_8__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Condicional__Group_8__1"


    // $ANTLR start "rule__Condicional__Group_8__1__Impl"
    // InternalBlockchain.g:3951:1: rule__Condicional__Group_8__1__Impl : ( ( rule__Condicional__SentenciasAssignment_8_1 ) ) ;
    public final void rule__Condicional__Group_8__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBlockchain.g:3955:1: ( ( ( rule__Condicional__SentenciasAssignment_8_1 ) ) )
            // InternalBlockchain.g:3956:1: ( ( rule__Condicional__SentenciasAssignment_8_1 ) )
            {
            // InternalBlockchain.g:3956:1: ( ( rule__Condicional__SentenciasAssignment_8_1 ) )
            // InternalBlockchain.g:3957:2: ( rule__Condicional__SentenciasAssignment_8_1 )
            {
             before(grammarAccess.getCondicionalAccess().getSentenciasAssignment_8_1()); 
            // InternalBlockchain.g:3958:2: ( rule__Condicional__SentenciasAssignment_8_1 )
            // InternalBlockchain.g:3958:3: rule__Condicional__SentenciasAssignment_8_1
            {
            pushFollow(FOLLOW_2);
            rule__Condicional__SentenciasAssignment_8_1();

            state._fsp--;


            }

             after(grammarAccess.getCondicionalAccess().getSentenciasAssignment_8_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Condicional__Group_8__1__Impl"


    // $ANTLR start "rule__Condicional__Group_10__0"
    // InternalBlockchain.g:3967:1: rule__Condicional__Group_10__0 : rule__Condicional__Group_10__0__Impl rule__Condicional__Group_10__1 ;
    public final void rule__Condicional__Group_10__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBlockchain.g:3971:1: ( rule__Condicional__Group_10__0__Impl rule__Condicional__Group_10__1 )
            // InternalBlockchain.g:3972:2: rule__Condicional__Group_10__0__Impl rule__Condicional__Group_10__1
            {
            pushFollow(FOLLOW_5);
            rule__Condicional__Group_10__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Condicional__Group_10__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Condicional__Group_10__0"


    // $ANTLR start "rule__Condicional__Group_10__0__Impl"
    // InternalBlockchain.g:3979:1: rule__Condicional__Group_10__0__Impl : ( 'else' ) ;
    public final void rule__Condicional__Group_10__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBlockchain.g:3983:1: ( ( 'else' ) )
            // InternalBlockchain.g:3984:1: ( 'else' )
            {
            // InternalBlockchain.g:3984:1: ( 'else' )
            // InternalBlockchain.g:3985:2: 'else'
            {
             before(grammarAccess.getCondicionalAccess().getElseKeyword_10_0()); 
            match(input,32,FOLLOW_2); 
             after(grammarAccess.getCondicionalAccess().getElseKeyword_10_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Condicional__Group_10__0__Impl"


    // $ANTLR start "rule__Condicional__Group_10__1"
    // InternalBlockchain.g:3994:1: rule__Condicional__Group_10__1 : rule__Condicional__Group_10__1__Impl rule__Condicional__Group_10__2 ;
    public final void rule__Condicional__Group_10__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBlockchain.g:3998:1: ( rule__Condicional__Group_10__1__Impl rule__Condicional__Group_10__2 )
            // InternalBlockchain.g:3999:2: rule__Condicional__Group_10__1__Impl rule__Condicional__Group_10__2
            {
            pushFollow(FOLLOW_48);
            rule__Condicional__Group_10__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Condicional__Group_10__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Condicional__Group_10__1"


    // $ANTLR start "rule__Condicional__Group_10__1__Impl"
    // InternalBlockchain.g:4006:1: rule__Condicional__Group_10__1__Impl : ( '{' ) ;
    public final void rule__Condicional__Group_10__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBlockchain.g:4010:1: ( ( '{' ) )
            // InternalBlockchain.g:4011:1: ( '{' )
            {
            // InternalBlockchain.g:4011:1: ( '{' )
            // InternalBlockchain.g:4012:2: '{'
            {
             before(grammarAccess.getCondicionalAccess().getLeftCurlyBracketKeyword_10_1()); 
            match(input,37,FOLLOW_2); 
             after(grammarAccess.getCondicionalAccess().getLeftCurlyBracketKeyword_10_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Condicional__Group_10__1__Impl"


    // $ANTLR start "rule__Condicional__Group_10__2"
    // InternalBlockchain.g:4021:1: rule__Condicional__Group_10__2 : rule__Condicional__Group_10__2__Impl rule__Condicional__Group_10__3 ;
    public final void rule__Condicional__Group_10__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBlockchain.g:4025:1: ( rule__Condicional__Group_10__2__Impl rule__Condicional__Group_10__3 )
            // InternalBlockchain.g:4026:2: rule__Condicional__Group_10__2__Impl rule__Condicional__Group_10__3
            {
            pushFollow(FOLLOW_45);
            rule__Condicional__Group_10__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Condicional__Group_10__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Condicional__Group_10__2"


    // $ANTLR start "rule__Condicional__Group_10__2__Impl"
    // InternalBlockchain.g:4033:1: rule__Condicional__Group_10__2__Impl : ( ( rule__Condicional__ElseAssignment_10_2 ) ) ;
    public final void rule__Condicional__Group_10__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBlockchain.g:4037:1: ( ( ( rule__Condicional__ElseAssignment_10_2 ) ) )
            // InternalBlockchain.g:4038:1: ( ( rule__Condicional__ElseAssignment_10_2 ) )
            {
            // InternalBlockchain.g:4038:1: ( ( rule__Condicional__ElseAssignment_10_2 ) )
            // InternalBlockchain.g:4039:2: ( rule__Condicional__ElseAssignment_10_2 )
            {
             before(grammarAccess.getCondicionalAccess().getElseAssignment_10_2()); 
            // InternalBlockchain.g:4040:2: ( rule__Condicional__ElseAssignment_10_2 )
            // InternalBlockchain.g:4040:3: rule__Condicional__ElseAssignment_10_2
            {
            pushFollow(FOLLOW_2);
            rule__Condicional__ElseAssignment_10_2();

            state._fsp--;


            }

             after(grammarAccess.getCondicionalAccess().getElseAssignment_10_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Condicional__Group_10__2__Impl"


    // $ANTLR start "rule__Condicional__Group_10__3"
    // InternalBlockchain.g:4048:1: rule__Condicional__Group_10__3 : rule__Condicional__Group_10__3__Impl rule__Condicional__Group_10__4 ;
    public final void rule__Condicional__Group_10__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBlockchain.g:4052:1: ( rule__Condicional__Group_10__3__Impl rule__Condicional__Group_10__4 )
            // InternalBlockchain.g:4053:2: rule__Condicional__Group_10__3__Impl rule__Condicional__Group_10__4
            {
            pushFollow(FOLLOW_45);
            rule__Condicional__Group_10__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Condicional__Group_10__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Condicional__Group_10__3"


    // $ANTLR start "rule__Condicional__Group_10__3__Impl"
    // InternalBlockchain.g:4060:1: rule__Condicional__Group_10__3__Impl : ( ( rule__Condicional__Group_10_3__0 )* ) ;
    public final void rule__Condicional__Group_10__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBlockchain.g:4064:1: ( ( ( rule__Condicional__Group_10_3__0 )* ) )
            // InternalBlockchain.g:4065:1: ( ( rule__Condicional__Group_10_3__0 )* )
            {
            // InternalBlockchain.g:4065:1: ( ( rule__Condicional__Group_10_3__0 )* )
            // InternalBlockchain.g:4066:2: ( rule__Condicional__Group_10_3__0 )*
            {
             before(grammarAccess.getCondicionalAccess().getGroup_10_3()); 
            // InternalBlockchain.g:4067:2: ( rule__Condicional__Group_10_3__0 )*
            loop39:
            do {
                int alt39=2;
                int LA39_0 = input.LA(1);

                if ( (LA39_0==39) ) {
                    alt39=1;
                }


                switch (alt39) {
            	case 1 :
            	    // InternalBlockchain.g:4067:3: rule__Condicional__Group_10_3__0
            	    {
            	    pushFollow(FOLLOW_9);
            	    rule__Condicional__Group_10_3__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop39;
                }
            } while (true);

             after(grammarAccess.getCondicionalAccess().getGroup_10_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Condicional__Group_10__3__Impl"


    // $ANTLR start "rule__Condicional__Group_10__4"
    // InternalBlockchain.g:4075:1: rule__Condicional__Group_10__4 : rule__Condicional__Group_10__4__Impl ;
    public final void rule__Condicional__Group_10__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBlockchain.g:4079:1: ( rule__Condicional__Group_10__4__Impl )
            // InternalBlockchain.g:4080:2: rule__Condicional__Group_10__4__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Condicional__Group_10__4__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Condicional__Group_10__4"


    // $ANTLR start "rule__Condicional__Group_10__4__Impl"
    // InternalBlockchain.g:4086:1: rule__Condicional__Group_10__4__Impl : ( '}' ) ;
    public final void rule__Condicional__Group_10__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBlockchain.g:4090:1: ( ( '}' ) )
            // InternalBlockchain.g:4091:1: ( '}' )
            {
            // InternalBlockchain.g:4091:1: ( '}' )
            // InternalBlockchain.g:4092:2: '}'
            {
             before(grammarAccess.getCondicionalAccess().getRightCurlyBracketKeyword_10_4()); 
            match(input,38,FOLLOW_2); 
             after(grammarAccess.getCondicionalAccess().getRightCurlyBracketKeyword_10_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Condicional__Group_10__4__Impl"


    // $ANTLR start "rule__Condicional__Group_10_3__0"
    // InternalBlockchain.g:4102:1: rule__Condicional__Group_10_3__0 : rule__Condicional__Group_10_3__0__Impl rule__Condicional__Group_10_3__1 ;
    public final void rule__Condicional__Group_10_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBlockchain.g:4106:1: ( rule__Condicional__Group_10_3__0__Impl rule__Condicional__Group_10_3__1 )
            // InternalBlockchain.g:4107:2: rule__Condicional__Group_10_3__0__Impl rule__Condicional__Group_10_3__1
            {
            pushFollow(FOLLOW_48);
            rule__Condicional__Group_10_3__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Condicional__Group_10_3__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Condicional__Group_10_3__0"


    // $ANTLR start "rule__Condicional__Group_10_3__0__Impl"
    // InternalBlockchain.g:4114:1: rule__Condicional__Group_10_3__0__Impl : ( ',' ) ;
    public final void rule__Condicional__Group_10_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBlockchain.g:4118:1: ( ( ',' ) )
            // InternalBlockchain.g:4119:1: ( ',' )
            {
            // InternalBlockchain.g:4119:1: ( ',' )
            // InternalBlockchain.g:4120:2: ','
            {
             before(grammarAccess.getCondicionalAccess().getCommaKeyword_10_3_0()); 
            match(input,39,FOLLOW_2); 
             after(grammarAccess.getCondicionalAccess().getCommaKeyword_10_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Condicional__Group_10_3__0__Impl"


    // $ANTLR start "rule__Condicional__Group_10_3__1"
    // InternalBlockchain.g:4129:1: rule__Condicional__Group_10_3__1 : rule__Condicional__Group_10_3__1__Impl ;
    public final void rule__Condicional__Group_10_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBlockchain.g:4133:1: ( rule__Condicional__Group_10_3__1__Impl )
            // InternalBlockchain.g:4134:2: rule__Condicional__Group_10_3__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Condicional__Group_10_3__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Condicional__Group_10_3__1"


    // $ANTLR start "rule__Condicional__Group_10_3__1__Impl"
    // InternalBlockchain.g:4140:1: rule__Condicional__Group_10_3__1__Impl : ( ( rule__Condicional__ElseAssignment_10_3_1 ) ) ;
    public final void rule__Condicional__Group_10_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBlockchain.g:4144:1: ( ( ( rule__Condicional__ElseAssignment_10_3_1 ) ) )
            // InternalBlockchain.g:4145:1: ( ( rule__Condicional__ElseAssignment_10_3_1 ) )
            {
            // InternalBlockchain.g:4145:1: ( ( rule__Condicional__ElseAssignment_10_3_1 ) )
            // InternalBlockchain.g:4146:2: ( rule__Condicional__ElseAssignment_10_3_1 )
            {
             before(grammarAccess.getCondicionalAccess().getElseAssignment_10_3_1()); 
            // InternalBlockchain.g:4147:2: ( rule__Condicional__ElseAssignment_10_3_1 )
            // InternalBlockchain.g:4147:3: rule__Condicional__ElseAssignment_10_3_1
            {
            pushFollow(FOLLOW_2);
            rule__Condicional__ElseAssignment_10_3_1();

            state._fsp--;


            }

             after(grammarAccess.getCondicionalAccess().getElseAssignment_10_3_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Condicional__Group_10_3__1__Impl"


    // $ANTLR start "rule__ExpresionNumerica__Group__0"
    // InternalBlockchain.g:4156:1: rule__ExpresionNumerica__Group__0 : rule__ExpresionNumerica__Group__0__Impl rule__ExpresionNumerica__Group__1 ;
    public final void rule__ExpresionNumerica__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBlockchain.g:4160:1: ( rule__ExpresionNumerica__Group__0__Impl rule__ExpresionNumerica__Group__1 )
            // InternalBlockchain.g:4161:2: rule__ExpresionNumerica__Group__0__Impl rule__ExpresionNumerica__Group__1
            {
            pushFollow(FOLLOW_49);
            rule__ExpresionNumerica__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ExpresionNumerica__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExpresionNumerica__Group__0"


    // $ANTLR start "rule__ExpresionNumerica__Group__0__Impl"
    // InternalBlockchain.g:4168:1: rule__ExpresionNumerica__Group__0__Impl : ( () ) ;
    public final void rule__ExpresionNumerica__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBlockchain.g:4172:1: ( ( () ) )
            // InternalBlockchain.g:4173:1: ( () )
            {
            // InternalBlockchain.g:4173:1: ( () )
            // InternalBlockchain.g:4174:2: ()
            {
             before(grammarAccess.getExpresionNumericaAccess().getExpresionNumericaAction_0()); 
            // InternalBlockchain.g:4175:2: ()
            // InternalBlockchain.g:4175:3: 
            {
            }

             after(grammarAccess.getExpresionNumericaAccess().getExpresionNumericaAction_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExpresionNumerica__Group__0__Impl"


    // $ANTLR start "rule__ExpresionNumerica__Group__1"
    // InternalBlockchain.g:4183:1: rule__ExpresionNumerica__Group__1 : rule__ExpresionNumerica__Group__1__Impl rule__ExpresionNumerica__Group__2 ;
    public final void rule__ExpresionNumerica__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBlockchain.g:4187:1: ( rule__ExpresionNumerica__Group__1__Impl rule__ExpresionNumerica__Group__2 )
            // InternalBlockchain.g:4188:2: rule__ExpresionNumerica__Group__1__Impl rule__ExpresionNumerica__Group__2
            {
            pushFollow(FOLLOW_50);
            rule__ExpresionNumerica__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ExpresionNumerica__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExpresionNumerica__Group__1"


    // $ANTLR start "rule__ExpresionNumerica__Group__1__Impl"
    // InternalBlockchain.g:4195:1: rule__ExpresionNumerica__Group__1__Impl : ( 'ExpNum' ) ;
    public final void rule__ExpresionNumerica__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBlockchain.g:4199:1: ( ( 'ExpNum' ) )
            // InternalBlockchain.g:4200:1: ( 'ExpNum' )
            {
            // InternalBlockchain.g:4200:1: ( 'ExpNum' )
            // InternalBlockchain.g:4201:2: 'ExpNum'
            {
             before(grammarAccess.getExpresionNumericaAccess().getExpNumKeyword_1()); 
            match(input,58,FOLLOW_2); 
             after(grammarAccess.getExpresionNumericaAccess().getExpNumKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExpresionNumerica__Group__1__Impl"


    // $ANTLR start "rule__ExpresionNumerica__Group__2"
    // InternalBlockchain.g:4210:1: rule__ExpresionNumerica__Group__2 : rule__ExpresionNumerica__Group__2__Impl ;
    public final void rule__ExpresionNumerica__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBlockchain.g:4214:1: ( rule__ExpresionNumerica__Group__2__Impl )
            // InternalBlockchain.g:4215:2: rule__ExpresionNumerica__Group__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__ExpresionNumerica__Group__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExpresionNumerica__Group__2"


    // $ANTLR start "rule__ExpresionNumerica__Group__2__Impl"
    // InternalBlockchain.g:4221:1: rule__ExpresionNumerica__Group__2__Impl : ( ( rule__ExpresionNumerica__ValueAssignment_2 )? ) ;
    public final void rule__ExpresionNumerica__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBlockchain.g:4225:1: ( ( ( rule__ExpresionNumerica__ValueAssignment_2 )? ) )
            // InternalBlockchain.g:4226:1: ( ( rule__ExpresionNumerica__ValueAssignment_2 )? )
            {
            // InternalBlockchain.g:4226:1: ( ( rule__ExpresionNumerica__ValueAssignment_2 )? )
            // InternalBlockchain.g:4227:2: ( rule__ExpresionNumerica__ValueAssignment_2 )?
            {
             before(grammarAccess.getExpresionNumericaAccess().getValueAssignment_2()); 
            // InternalBlockchain.g:4228:2: ( rule__ExpresionNumerica__ValueAssignment_2 )?
            int alt40=2;
            int LA40_0 = input.LA(1);

            if ( (LA40_0==RULE_INT||LA40_0==11||LA40_0==25) ) {
                alt40=1;
            }
            switch (alt40) {
                case 1 :
                    // InternalBlockchain.g:4228:3: rule__ExpresionNumerica__ValueAssignment_2
                    {
                    pushFollow(FOLLOW_2);
                    rule__ExpresionNumerica__ValueAssignment_2();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getExpresionNumericaAccess().getValueAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExpresionNumerica__Group__2__Impl"


    // $ANTLR start "rule__ExpresionReferenciada__Group__0"
    // InternalBlockchain.g:4237:1: rule__ExpresionReferenciada__Group__0 : rule__ExpresionReferenciada__Group__0__Impl rule__ExpresionReferenciada__Group__1 ;
    public final void rule__ExpresionReferenciada__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBlockchain.g:4241:1: ( rule__ExpresionReferenciada__Group__0__Impl rule__ExpresionReferenciada__Group__1 )
            // InternalBlockchain.g:4242:2: rule__ExpresionReferenciada__Group__0__Impl rule__ExpresionReferenciada__Group__1
            {
            pushFollow(FOLLOW_51);
            rule__ExpresionReferenciada__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ExpresionReferenciada__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExpresionReferenciada__Group__0"


    // $ANTLR start "rule__ExpresionReferenciada__Group__0__Impl"
    // InternalBlockchain.g:4249:1: rule__ExpresionReferenciada__Group__0__Impl : ( () ) ;
    public final void rule__ExpresionReferenciada__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBlockchain.g:4253:1: ( ( () ) )
            // InternalBlockchain.g:4254:1: ( () )
            {
            // InternalBlockchain.g:4254:1: ( () )
            // InternalBlockchain.g:4255:2: ()
            {
             before(grammarAccess.getExpresionReferenciadaAccess().getExpresionReferenciadaAction_0()); 
            // InternalBlockchain.g:4256:2: ()
            // InternalBlockchain.g:4256:3: 
            {
            }

             after(grammarAccess.getExpresionReferenciadaAccess().getExpresionReferenciadaAction_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExpresionReferenciada__Group__0__Impl"


    // $ANTLR start "rule__ExpresionReferenciada__Group__1"
    // InternalBlockchain.g:4264:1: rule__ExpresionReferenciada__Group__1 : rule__ExpresionReferenciada__Group__1__Impl rule__ExpresionReferenciada__Group__2 ;
    public final void rule__ExpresionReferenciada__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBlockchain.g:4268:1: ( rule__ExpresionReferenciada__Group__1__Impl rule__ExpresionReferenciada__Group__2 )
            // InternalBlockchain.g:4269:2: rule__ExpresionReferenciada__Group__1__Impl rule__ExpresionReferenciada__Group__2
            {
            pushFollow(FOLLOW_36);
            rule__ExpresionReferenciada__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ExpresionReferenciada__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExpresionReferenciada__Group__1"


    // $ANTLR start "rule__ExpresionReferenciada__Group__1__Impl"
    // InternalBlockchain.g:4276:1: rule__ExpresionReferenciada__Group__1__Impl : ( 'ExpRef' ) ;
    public final void rule__ExpresionReferenciada__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBlockchain.g:4280:1: ( ( 'ExpRef' ) )
            // InternalBlockchain.g:4281:1: ( 'ExpRef' )
            {
            // InternalBlockchain.g:4281:1: ( 'ExpRef' )
            // InternalBlockchain.g:4282:2: 'ExpRef'
            {
             before(grammarAccess.getExpresionReferenciadaAccess().getExpRefKeyword_1()); 
            match(input,59,FOLLOW_2); 
             after(grammarAccess.getExpresionReferenciadaAccess().getExpRefKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExpresionReferenciada__Group__1__Impl"


    // $ANTLR start "rule__ExpresionReferenciada__Group__2"
    // InternalBlockchain.g:4291:1: rule__ExpresionReferenciada__Group__2 : rule__ExpresionReferenciada__Group__2__Impl rule__ExpresionReferenciada__Group__3 ;
    public final void rule__ExpresionReferenciada__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBlockchain.g:4295:1: ( rule__ExpresionReferenciada__Group__2__Impl rule__ExpresionReferenciada__Group__3 )
            // InternalBlockchain.g:4296:2: rule__ExpresionReferenciada__Group__2__Impl rule__ExpresionReferenciada__Group__3
            {
            pushFollow(FOLLOW_36);
            rule__ExpresionReferenciada__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ExpresionReferenciada__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExpresionReferenciada__Group__2"


    // $ANTLR start "rule__ExpresionReferenciada__Group__2__Impl"
    // InternalBlockchain.g:4303:1: rule__ExpresionReferenciada__Group__2__Impl : ( ( rule__ExpresionReferenciada__Group_2__0 )? ) ;
    public final void rule__ExpresionReferenciada__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBlockchain.g:4307:1: ( ( ( rule__ExpresionReferenciada__Group_2__0 )? ) )
            // InternalBlockchain.g:4308:1: ( ( rule__ExpresionReferenciada__Group_2__0 )? )
            {
            // InternalBlockchain.g:4308:1: ( ( rule__ExpresionReferenciada__Group_2__0 )? )
            // InternalBlockchain.g:4309:2: ( rule__ExpresionReferenciada__Group_2__0 )?
            {
             before(grammarAccess.getExpresionReferenciadaAccess().getGroup_2()); 
            // InternalBlockchain.g:4310:2: ( rule__ExpresionReferenciada__Group_2__0 )?
            int alt41=2;
            int LA41_0 = input.LA(1);

            if ( (LA41_0==51) ) {
                int LA41_1 = input.LA(2);

                if ( (LA41_1==25) ) {
                    int LA41_3 = input.LA(3);

                    if ( (LA41_3==RULE_INT) ) {
                        alt41=1;
                    }
                }
                else if ( (LA41_1==RULE_INT) ) {
                    alt41=1;
                }
            }
            switch (alt41) {
                case 1 :
                    // InternalBlockchain.g:4310:3: rule__ExpresionReferenciada__Group_2__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__ExpresionReferenciada__Group_2__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getExpresionReferenciadaAccess().getGroup_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExpresionReferenciada__Group__2__Impl"


    // $ANTLR start "rule__ExpresionReferenciada__Group__3"
    // InternalBlockchain.g:4318:1: rule__ExpresionReferenciada__Group__3 : rule__ExpresionReferenciada__Group__3__Impl rule__ExpresionReferenciada__Group__4 ;
    public final void rule__ExpresionReferenciada__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBlockchain.g:4322:1: ( rule__ExpresionReferenciada__Group__3__Impl rule__ExpresionReferenciada__Group__4 )
            // InternalBlockchain.g:4323:2: rule__ExpresionReferenciada__Group__3__Impl rule__ExpresionReferenciada__Group__4
            {
            pushFollow(FOLLOW_36);
            rule__ExpresionReferenciada__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ExpresionReferenciada__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExpresionReferenciada__Group__3"


    // $ANTLR start "rule__ExpresionReferenciada__Group__3__Impl"
    // InternalBlockchain.g:4330:1: rule__ExpresionReferenciada__Group__3__Impl : ( ( rule__ExpresionReferenciada__EntReferenciadaAssignment_3 )? ) ;
    public final void rule__ExpresionReferenciada__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBlockchain.g:4334:1: ( ( ( rule__ExpresionReferenciada__EntReferenciadaAssignment_3 )? ) )
            // InternalBlockchain.g:4335:1: ( ( rule__ExpresionReferenciada__EntReferenciadaAssignment_3 )? )
            {
            // InternalBlockchain.g:4335:1: ( ( rule__ExpresionReferenciada__EntReferenciadaAssignment_3 )? )
            // InternalBlockchain.g:4336:2: ( rule__ExpresionReferenciada__EntReferenciadaAssignment_3 )?
            {
             before(grammarAccess.getExpresionReferenciadaAccess().getEntReferenciadaAssignment_3()); 
            // InternalBlockchain.g:4337:2: ( rule__ExpresionReferenciada__EntReferenciadaAssignment_3 )?
            int alt42=2;
            int LA42_0 = input.LA(1);

            if ( (LA42_0==RULE_STRING) ) {
                alt42=1;
            }
            else if ( (LA42_0==RULE_ID) ) {
                alt42=1;
            }
            switch (alt42) {
                case 1 :
                    // InternalBlockchain.g:4337:3: rule__ExpresionReferenciada__EntReferenciadaAssignment_3
                    {
                    pushFollow(FOLLOW_2);
                    rule__ExpresionReferenciada__EntReferenciadaAssignment_3();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getExpresionReferenciadaAccess().getEntReferenciadaAssignment_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExpresionReferenciada__Group__3__Impl"


    // $ANTLR start "rule__ExpresionReferenciada__Group__4"
    // InternalBlockchain.g:4345:1: rule__ExpresionReferenciada__Group__4 : rule__ExpresionReferenciada__Group__4__Impl ;
    public final void rule__ExpresionReferenciada__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBlockchain.g:4349:1: ( rule__ExpresionReferenciada__Group__4__Impl )
            // InternalBlockchain.g:4350:2: rule__ExpresionReferenciada__Group__4__Impl
            {
            pushFollow(FOLLOW_2);
            rule__ExpresionReferenciada__Group__4__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExpresionReferenciada__Group__4"


    // $ANTLR start "rule__ExpresionReferenciada__Group__4__Impl"
    // InternalBlockchain.g:4356:1: rule__ExpresionReferenciada__Group__4__Impl : ( ( rule__ExpresionReferenciada__AtrReferenciadoAssignment_4 )? ) ;
    public final void rule__ExpresionReferenciada__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBlockchain.g:4360:1: ( ( ( rule__ExpresionReferenciada__AtrReferenciadoAssignment_4 )? ) )
            // InternalBlockchain.g:4361:1: ( ( rule__ExpresionReferenciada__AtrReferenciadoAssignment_4 )? )
            {
            // InternalBlockchain.g:4361:1: ( ( rule__ExpresionReferenciada__AtrReferenciadoAssignment_4 )? )
            // InternalBlockchain.g:4362:2: ( rule__ExpresionReferenciada__AtrReferenciadoAssignment_4 )?
            {
             before(grammarAccess.getExpresionReferenciadaAccess().getAtrReferenciadoAssignment_4()); 
            // InternalBlockchain.g:4363:2: ( rule__ExpresionReferenciada__AtrReferenciadoAssignment_4 )?
            int alt43=2;
            int LA43_0 = input.LA(1);

            if ( (LA43_0==RULE_STRING) ) {
                alt43=1;
            }
            else if ( (LA43_0==RULE_ID) ) {
                alt43=1;
            }
            switch (alt43) {
                case 1 :
                    // InternalBlockchain.g:4363:3: rule__ExpresionReferenciada__AtrReferenciadoAssignment_4
                    {
                    pushFollow(FOLLOW_2);
                    rule__ExpresionReferenciada__AtrReferenciadoAssignment_4();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getExpresionReferenciadaAccess().getAtrReferenciadoAssignment_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExpresionReferenciada__Group__4__Impl"


    // $ANTLR start "rule__ExpresionReferenciada__Group_2__0"
    // InternalBlockchain.g:4372:1: rule__ExpresionReferenciada__Group_2__0 : rule__ExpresionReferenciada__Group_2__0__Impl rule__ExpresionReferenciada__Group_2__1 ;
    public final void rule__ExpresionReferenciada__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBlockchain.g:4376:1: ( rule__ExpresionReferenciada__Group_2__0__Impl rule__ExpresionReferenciada__Group_2__1 )
            // InternalBlockchain.g:4377:2: rule__ExpresionReferenciada__Group_2__0__Impl rule__ExpresionReferenciada__Group_2__1
            {
            pushFollow(FOLLOW_35);
            rule__ExpresionReferenciada__Group_2__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ExpresionReferenciada__Group_2__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExpresionReferenciada__Group_2__0"


    // $ANTLR start "rule__ExpresionReferenciada__Group_2__0__Impl"
    // InternalBlockchain.g:4384:1: rule__ExpresionReferenciada__Group_2__0__Impl : ( 'id' ) ;
    public final void rule__ExpresionReferenciada__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBlockchain.g:4388:1: ( ( 'id' ) )
            // InternalBlockchain.g:4389:1: ( 'id' )
            {
            // InternalBlockchain.g:4389:1: ( 'id' )
            // InternalBlockchain.g:4390:2: 'id'
            {
             before(grammarAccess.getExpresionReferenciadaAccess().getIdKeyword_2_0()); 
            match(input,51,FOLLOW_2); 
             after(grammarAccess.getExpresionReferenciadaAccess().getIdKeyword_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExpresionReferenciada__Group_2__0__Impl"


    // $ANTLR start "rule__ExpresionReferenciada__Group_2__1"
    // InternalBlockchain.g:4399:1: rule__ExpresionReferenciada__Group_2__1 : rule__ExpresionReferenciada__Group_2__1__Impl ;
    public final void rule__ExpresionReferenciada__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBlockchain.g:4403:1: ( rule__ExpresionReferenciada__Group_2__1__Impl )
            // InternalBlockchain.g:4404:2: rule__ExpresionReferenciada__Group_2__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__ExpresionReferenciada__Group_2__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExpresionReferenciada__Group_2__1"


    // $ANTLR start "rule__ExpresionReferenciada__Group_2__1__Impl"
    // InternalBlockchain.g:4410:1: rule__ExpresionReferenciada__Group_2__1__Impl : ( ( rule__ExpresionReferenciada__IdAssignment_2_1 ) ) ;
    public final void rule__ExpresionReferenciada__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBlockchain.g:4414:1: ( ( ( rule__ExpresionReferenciada__IdAssignment_2_1 ) ) )
            // InternalBlockchain.g:4415:1: ( ( rule__ExpresionReferenciada__IdAssignment_2_1 ) )
            {
            // InternalBlockchain.g:4415:1: ( ( rule__ExpresionReferenciada__IdAssignment_2_1 ) )
            // InternalBlockchain.g:4416:2: ( rule__ExpresionReferenciada__IdAssignment_2_1 )
            {
             before(grammarAccess.getExpresionReferenciadaAccess().getIdAssignment_2_1()); 
            // InternalBlockchain.g:4417:2: ( rule__ExpresionReferenciada__IdAssignment_2_1 )
            // InternalBlockchain.g:4417:3: rule__ExpresionReferenciada__IdAssignment_2_1
            {
            pushFollow(FOLLOW_2);
            rule__ExpresionReferenciada__IdAssignment_2_1();

            state._fsp--;


            }

             after(grammarAccess.getExpresionReferenciadaAccess().getIdAssignment_2_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExpresionReferenciada__Group_2__1__Impl"


    // $ANTLR start "rule__ExpresionRelacional__Group__0"
    // InternalBlockchain.g:4426:1: rule__ExpresionRelacional__Group__0 : rule__ExpresionRelacional__Group__0__Impl rule__ExpresionRelacional__Group__1 ;
    public final void rule__ExpresionRelacional__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBlockchain.g:4430:1: ( rule__ExpresionRelacional__Group__0__Impl rule__ExpresionRelacional__Group__1 )
            // InternalBlockchain.g:4431:2: rule__ExpresionRelacional__Group__0__Impl rule__ExpresionRelacional__Group__1
            {
            pushFollow(FOLLOW_5);
            rule__ExpresionRelacional__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ExpresionRelacional__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExpresionRelacional__Group__0"


    // $ANTLR start "rule__ExpresionRelacional__Group__0__Impl"
    // InternalBlockchain.g:4438:1: rule__ExpresionRelacional__Group__0__Impl : ( 'ExpRel' ) ;
    public final void rule__ExpresionRelacional__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBlockchain.g:4442:1: ( ( 'ExpRel' ) )
            // InternalBlockchain.g:4443:1: ( 'ExpRel' )
            {
            // InternalBlockchain.g:4443:1: ( 'ExpRel' )
            // InternalBlockchain.g:4444:2: 'ExpRel'
            {
             before(grammarAccess.getExpresionRelacionalAccess().getExpRelKeyword_0()); 
            match(input,60,FOLLOW_2); 
             after(grammarAccess.getExpresionRelacionalAccess().getExpRelKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExpresionRelacional__Group__0__Impl"


    // $ANTLR start "rule__ExpresionRelacional__Group__1"
    // InternalBlockchain.g:4453:1: rule__ExpresionRelacional__Group__1 : rule__ExpresionRelacional__Group__1__Impl rule__ExpresionRelacional__Group__2 ;
    public final void rule__ExpresionRelacional__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBlockchain.g:4457:1: ( rule__ExpresionRelacional__Group__1__Impl rule__ExpresionRelacional__Group__2 )
            // InternalBlockchain.g:4458:2: rule__ExpresionRelacional__Group__1__Impl rule__ExpresionRelacional__Group__2
            {
            pushFollow(FOLLOW_36);
            rule__ExpresionRelacional__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ExpresionRelacional__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExpresionRelacional__Group__1"


    // $ANTLR start "rule__ExpresionRelacional__Group__1__Impl"
    // InternalBlockchain.g:4465:1: rule__ExpresionRelacional__Group__1__Impl : ( '{' ) ;
    public final void rule__ExpresionRelacional__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBlockchain.g:4469:1: ( ( '{' ) )
            // InternalBlockchain.g:4470:1: ( '{' )
            {
            // InternalBlockchain.g:4470:1: ( '{' )
            // InternalBlockchain.g:4471:2: '{'
            {
             before(grammarAccess.getExpresionRelacionalAccess().getLeftCurlyBracketKeyword_1()); 
            match(input,37,FOLLOW_2); 
             after(grammarAccess.getExpresionRelacionalAccess().getLeftCurlyBracketKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExpresionRelacional__Group__1__Impl"


    // $ANTLR start "rule__ExpresionRelacional__Group__2"
    // InternalBlockchain.g:4480:1: rule__ExpresionRelacional__Group__2 : rule__ExpresionRelacional__Group__2__Impl rule__ExpresionRelacional__Group__3 ;
    public final void rule__ExpresionRelacional__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBlockchain.g:4484:1: ( rule__ExpresionRelacional__Group__2__Impl rule__ExpresionRelacional__Group__3 )
            // InternalBlockchain.g:4485:2: rule__ExpresionRelacional__Group__2__Impl rule__ExpresionRelacional__Group__3
            {
            pushFollow(FOLLOW_36);
            rule__ExpresionRelacional__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ExpresionRelacional__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExpresionRelacional__Group__2"


    // $ANTLR start "rule__ExpresionRelacional__Group__2__Impl"
    // InternalBlockchain.g:4492:1: rule__ExpresionRelacional__Group__2__Impl : ( ( rule__ExpresionRelacional__Group_2__0 )? ) ;
    public final void rule__ExpresionRelacional__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBlockchain.g:4496:1: ( ( ( rule__ExpresionRelacional__Group_2__0 )? ) )
            // InternalBlockchain.g:4497:1: ( ( rule__ExpresionRelacional__Group_2__0 )? )
            {
            // InternalBlockchain.g:4497:1: ( ( rule__ExpresionRelacional__Group_2__0 )? )
            // InternalBlockchain.g:4498:2: ( rule__ExpresionRelacional__Group_2__0 )?
            {
             before(grammarAccess.getExpresionRelacionalAccess().getGroup_2()); 
            // InternalBlockchain.g:4499:2: ( rule__ExpresionRelacional__Group_2__0 )?
            int alt44=2;
            int LA44_0 = input.LA(1);

            if ( (LA44_0==51) ) {
                alt44=1;
            }
            switch (alt44) {
                case 1 :
                    // InternalBlockchain.g:4499:3: rule__ExpresionRelacional__Group_2__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__ExpresionRelacional__Group_2__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getExpresionRelacionalAccess().getGroup_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExpresionRelacional__Group__2__Impl"


    // $ANTLR start "rule__ExpresionRelacional__Group__3"
    // InternalBlockchain.g:4507:1: rule__ExpresionRelacional__Group__3 : rule__ExpresionRelacional__Group__3__Impl rule__ExpresionRelacional__Group__4 ;
    public final void rule__ExpresionRelacional__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBlockchain.g:4511:1: ( rule__ExpresionRelacional__Group__3__Impl rule__ExpresionRelacional__Group__4 )
            // InternalBlockchain.g:4512:2: rule__ExpresionRelacional__Group__3__Impl rule__ExpresionRelacional__Group__4
            {
            pushFollow(FOLLOW_52);
            rule__ExpresionRelacional__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ExpresionRelacional__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExpresionRelacional__Group__3"


    // $ANTLR start "rule__ExpresionRelacional__Group__3__Impl"
    // InternalBlockchain.g:4519:1: rule__ExpresionRelacional__Group__3__Impl : ( ( rule__ExpresionRelacional__LadoIzqAssignment_3 ) ) ;
    public final void rule__ExpresionRelacional__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBlockchain.g:4523:1: ( ( ( rule__ExpresionRelacional__LadoIzqAssignment_3 ) ) )
            // InternalBlockchain.g:4524:1: ( ( rule__ExpresionRelacional__LadoIzqAssignment_3 ) )
            {
            // InternalBlockchain.g:4524:1: ( ( rule__ExpresionRelacional__LadoIzqAssignment_3 ) )
            // InternalBlockchain.g:4525:2: ( rule__ExpresionRelacional__LadoIzqAssignment_3 )
            {
             before(grammarAccess.getExpresionRelacionalAccess().getLadoIzqAssignment_3()); 
            // InternalBlockchain.g:4526:2: ( rule__ExpresionRelacional__LadoIzqAssignment_3 )
            // InternalBlockchain.g:4526:3: rule__ExpresionRelacional__LadoIzqAssignment_3
            {
            pushFollow(FOLLOW_2);
            rule__ExpresionRelacional__LadoIzqAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getExpresionRelacionalAccess().getLadoIzqAssignment_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExpresionRelacional__Group__3__Impl"


    // $ANTLR start "rule__ExpresionRelacional__Group__4"
    // InternalBlockchain.g:4534:1: rule__ExpresionRelacional__Group__4 : rule__ExpresionRelacional__Group__4__Impl rule__ExpresionRelacional__Group__5 ;
    public final void rule__ExpresionRelacional__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBlockchain.g:4538:1: ( rule__ExpresionRelacional__Group__4__Impl rule__ExpresionRelacional__Group__5 )
            // InternalBlockchain.g:4539:2: rule__ExpresionRelacional__Group__4__Impl rule__ExpresionRelacional__Group__5
            {
            pushFollow(FOLLOW_52);
            rule__ExpresionRelacional__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ExpresionRelacional__Group__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExpresionRelacional__Group__4"


    // $ANTLR start "rule__ExpresionRelacional__Group__4__Impl"
    // InternalBlockchain.g:4546:1: rule__ExpresionRelacional__Group__4__Impl : ( ( rule__ExpresionRelacional__OperadorRelacionalAssignment_4 )? ) ;
    public final void rule__ExpresionRelacional__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBlockchain.g:4550:1: ( ( ( rule__ExpresionRelacional__OperadorRelacionalAssignment_4 )? ) )
            // InternalBlockchain.g:4551:1: ( ( rule__ExpresionRelacional__OperadorRelacionalAssignment_4 )? )
            {
            // InternalBlockchain.g:4551:1: ( ( rule__ExpresionRelacional__OperadorRelacionalAssignment_4 )? )
            // InternalBlockchain.g:4552:2: ( rule__ExpresionRelacional__OperadorRelacionalAssignment_4 )?
            {
             before(grammarAccess.getExpresionRelacionalAccess().getOperadorRelacionalAssignment_4()); 
            // InternalBlockchain.g:4553:2: ( rule__ExpresionRelacional__OperadorRelacionalAssignment_4 )?
            int alt45=2;
            int LA45_0 = input.LA(1);

            if ( (LA45_0==11) ) {
                alt45=1;
            }
            switch (alt45) {
                case 1 :
                    // InternalBlockchain.g:4553:3: rule__ExpresionRelacional__OperadorRelacionalAssignment_4
                    {
                    pushFollow(FOLLOW_2);
                    rule__ExpresionRelacional__OperadorRelacionalAssignment_4();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getExpresionRelacionalAccess().getOperadorRelacionalAssignment_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExpresionRelacional__Group__4__Impl"


    // $ANTLR start "rule__ExpresionRelacional__Group__5"
    // InternalBlockchain.g:4561:1: rule__ExpresionRelacional__Group__5 : rule__ExpresionRelacional__Group__5__Impl rule__ExpresionRelacional__Group__6 ;
    public final void rule__ExpresionRelacional__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBlockchain.g:4565:1: ( rule__ExpresionRelacional__Group__5__Impl rule__ExpresionRelacional__Group__6 )
            // InternalBlockchain.g:4566:2: rule__ExpresionRelacional__Group__5__Impl rule__ExpresionRelacional__Group__6
            {
            pushFollow(FOLLOW_53);
            rule__ExpresionRelacional__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ExpresionRelacional__Group__6();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExpresionRelacional__Group__5"


    // $ANTLR start "rule__ExpresionRelacional__Group__5__Impl"
    // InternalBlockchain.g:4573:1: rule__ExpresionRelacional__Group__5__Impl : ( ( rule__ExpresionRelacional__LadoDerAssignment_5 ) ) ;
    public final void rule__ExpresionRelacional__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBlockchain.g:4577:1: ( ( ( rule__ExpresionRelacional__LadoDerAssignment_5 ) ) )
            // InternalBlockchain.g:4578:1: ( ( rule__ExpresionRelacional__LadoDerAssignment_5 ) )
            {
            // InternalBlockchain.g:4578:1: ( ( rule__ExpresionRelacional__LadoDerAssignment_5 ) )
            // InternalBlockchain.g:4579:2: ( rule__ExpresionRelacional__LadoDerAssignment_5 )
            {
             before(grammarAccess.getExpresionRelacionalAccess().getLadoDerAssignment_5()); 
            // InternalBlockchain.g:4580:2: ( rule__ExpresionRelacional__LadoDerAssignment_5 )
            // InternalBlockchain.g:4580:3: rule__ExpresionRelacional__LadoDerAssignment_5
            {
            pushFollow(FOLLOW_2);
            rule__ExpresionRelacional__LadoDerAssignment_5();

            state._fsp--;


            }

             after(grammarAccess.getExpresionRelacionalAccess().getLadoDerAssignment_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExpresionRelacional__Group__5__Impl"


    // $ANTLR start "rule__ExpresionRelacional__Group__6"
    // InternalBlockchain.g:4588:1: rule__ExpresionRelacional__Group__6 : rule__ExpresionRelacional__Group__6__Impl ;
    public final void rule__ExpresionRelacional__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBlockchain.g:4592:1: ( rule__ExpresionRelacional__Group__6__Impl )
            // InternalBlockchain.g:4593:2: rule__ExpresionRelacional__Group__6__Impl
            {
            pushFollow(FOLLOW_2);
            rule__ExpresionRelacional__Group__6__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExpresionRelacional__Group__6"


    // $ANTLR start "rule__ExpresionRelacional__Group__6__Impl"
    // InternalBlockchain.g:4599:1: rule__ExpresionRelacional__Group__6__Impl : ( '}' ) ;
    public final void rule__ExpresionRelacional__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBlockchain.g:4603:1: ( ( '}' ) )
            // InternalBlockchain.g:4604:1: ( '}' )
            {
            // InternalBlockchain.g:4604:1: ( '}' )
            // InternalBlockchain.g:4605:2: '}'
            {
             before(grammarAccess.getExpresionRelacionalAccess().getRightCurlyBracketKeyword_6()); 
            match(input,38,FOLLOW_2); 
             after(grammarAccess.getExpresionRelacionalAccess().getRightCurlyBracketKeyword_6()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExpresionRelacional__Group__6__Impl"


    // $ANTLR start "rule__ExpresionRelacional__Group_2__0"
    // InternalBlockchain.g:4615:1: rule__ExpresionRelacional__Group_2__0 : rule__ExpresionRelacional__Group_2__0__Impl rule__ExpresionRelacional__Group_2__1 ;
    public final void rule__ExpresionRelacional__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBlockchain.g:4619:1: ( rule__ExpresionRelacional__Group_2__0__Impl rule__ExpresionRelacional__Group_2__1 )
            // InternalBlockchain.g:4620:2: rule__ExpresionRelacional__Group_2__0__Impl rule__ExpresionRelacional__Group_2__1
            {
            pushFollow(FOLLOW_35);
            rule__ExpresionRelacional__Group_2__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ExpresionRelacional__Group_2__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExpresionRelacional__Group_2__0"


    // $ANTLR start "rule__ExpresionRelacional__Group_2__0__Impl"
    // InternalBlockchain.g:4627:1: rule__ExpresionRelacional__Group_2__0__Impl : ( 'id' ) ;
    public final void rule__ExpresionRelacional__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBlockchain.g:4631:1: ( ( 'id' ) )
            // InternalBlockchain.g:4632:1: ( 'id' )
            {
            // InternalBlockchain.g:4632:1: ( 'id' )
            // InternalBlockchain.g:4633:2: 'id'
            {
             before(grammarAccess.getExpresionRelacionalAccess().getIdKeyword_2_0()); 
            match(input,51,FOLLOW_2); 
             after(grammarAccess.getExpresionRelacionalAccess().getIdKeyword_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExpresionRelacional__Group_2__0__Impl"


    // $ANTLR start "rule__ExpresionRelacional__Group_2__1"
    // InternalBlockchain.g:4642:1: rule__ExpresionRelacional__Group_2__1 : rule__ExpresionRelacional__Group_2__1__Impl ;
    public final void rule__ExpresionRelacional__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBlockchain.g:4646:1: ( rule__ExpresionRelacional__Group_2__1__Impl )
            // InternalBlockchain.g:4647:2: rule__ExpresionRelacional__Group_2__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__ExpresionRelacional__Group_2__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExpresionRelacional__Group_2__1"


    // $ANTLR start "rule__ExpresionRelacional__Group_2__1__Impl"
    // InternalBlockchain.g:4653:1: rule__ExpresionRelacional__Group_2__1__Impl : ( ( rule__ExpresionRelacional__IdAssignment_2_1 ) ) ;
    public final void rule__ExpresionRelacional__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBlockchain.g:4657:1: ( ( ( rule__ExpresionRelacional__IdAssignment_2_1 ) ) )
            // InternalBlockchain.g:4658:1: ( ( rule__ExpresionRelacional__IdAssignment_2_1 ) )
            {
            // InternalBlockchain.g:4658:1: ( ( rule__ExpresionRelacional__IdAssignment_2_1 ) )
            // InternalBlockchain.g:4659:2: ( rule__ExpresionRelacional__IdAssignment_2_1 )
            {
             before(grammarAccess.getExpresionRelacionalAccess().getIdAssignment_2_1()); 
            // InternalBlockchain.g:4660:2: ( rule__ExpresionRelacional__IdAssignment_2_1 )
            // InternalBlockchain.g:4660:3: rule__ExpresionRelacional__IdAssignment_2_1
            {
            pushFollow(FOLLOW_2);
            rule__ExpresionRelacional__IdAssignment_2_1();

            state._fsp--;


            }

             after(grammarAccess.getExpresionRelacionalAccess().getIdAssignment_2_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExpresionRelacional__Group_2__1__Impl"


    // $ANTLR start "rule__EInt__Group__0"
    // InternalBlockchain.g:4669:1: rule__EInt__Group__0 : rule__EInt__Group__0__Impl rule__EInt__Group__1 ;
    public final void rule__EInt__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBlockchain.g:4673:1: ( rule__EInt__Group__0__Impl rule__EInt__Group__1 )
            // InternalBlockchain.g:4674:2: rule__EInt__Group__0__Impl rule__EInt__Group__1
            {
            pushFollow(FOLLOW_35);
            rule__EInt__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__EInt__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EInt__Group__0"


    // $ANTLR start "rule__EInt__Group__0__Impl"
    // InternalBlockchain.g:4681:1: rule__EInt__Group__0__Impl : ( ( '-' )? ) ;
    public final void rule__EInt__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBlockchain.g:4685:1: ( ( ( '-' )? ) )
            // InternalBlockchain.g:4686:1: ( ( '-' )? )
            {
            // InternalBlockchain.g:4686:1: ( ( '-' )? )
            // InternalBlockchain.g:4687:2: ( '-' )?
            {
             before(grammarAccess.getEIntAccess().getHyphenMinusKeyword_0()); 
            // InternalBlockchain.g:4688:2: ( '-' )?
            int alt46=2;
            int LA46_0 = input.LA(1);

            if ( (LA46_0==25) ) {
                alt46=1;
            }
            switch (alt46) {
                case 1 :
                    // InternalBlockchain.g:4688:3: '-'
                    {
                    match(input,25,FOLLOW_2); 

                    }
                    break;

            }

             after(grammarAccess.getEIntAccess().getHyphenMinusKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EInt__Group__0__Impl"


    // $ANTLR start "rule__EInt__Group__1"
    // InternalBlockchain.g:4696:1: rule__EInt__Group__1 : rule__EInt__Group__1__Impl ;
    public final void rule__EInt__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBlockchain.g:4700:1: ( rule__EInt__Group__1__Impl )
            // InternalBlockchain.g:4701:2: rule__EInt__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__EInt__Group__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EInt__Group__1"


    // $ANTLR start "rule__EInt__Group__1__Impl"
    // InternalBlockchain.g:4707:1: rule__EInt__Group__1__Impl : ( RULE_INT ) ;
    public final void rule__EInt__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBlockchain.g:4711:1: ( ( RULE_INT ) )
            // InternalBlockchain.g:4712:1: ( RULE_INT )
            {
            // InternalBlockchain.g:4712:1: ( RULE_INT )
            // InternalBlockchain.g:4713:2: RULE_INT
            {
             before(grammarAccess.getEIntAccess().getINTTerminalRuleCall_1()); 
            match(input,RULE_INT,FOLLOW_2); 
             after(grammarAccess.getEIntAccess().getINTTerminalRuleCall_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EInt__Group__1__Impl"


    // $ANTLR start "rule__EDouble__Group__0"
    // InternalBlockchain.g:4723:1: rule__EDouble__Group__0 : rule__EDouble__Group__0__Impl rule__EDouble__Group__1 ;
    public final void rule__EDouble__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBlockchain.g:4727:1: ( rule__EDouble__Group__0__Impl rule__EDouble__Group__1 )
            // InternalBlockchain.g:4728:2: rule__EDouble__Group__0__Impl rule__EDouble__Group__1
            {
            pushFollow(FOLLOW_50);
            rule__EDouble__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__EDouble__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EDouble__Group__0"


    // $ANTLR start "rule__EDouble__Group__0__Impl"
    // InternalBlockchain.g:4735:1: rule__EDouble__Group__0__Impl : ( ( '-' )? ) ;
    public final void rule__EDouble__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBlockchain.g:4739:1: ( ( ( '-' )? ) )
            // InternalBlockchain.g:4740:1: ( ( '-' )? )
            {
            // InternalBlockchain.g:4740:1: ( ( '-' )? )
            // InternalBlockchain.g:4741:2: ( '-' )?
            {
             before(grammarAccess.getEDoubleAccess().getHyphenMinusKeyword_0()); 
            // InternalBlockchain.g:4742:2: ( '-' )?
            int alt47=2;
            int LA47_0 = input.LA(1);

            if ( (LA47_0==25) ) {
                alt47=1;
            }
            switch (alt47) {
                case 1 :
                    // InternalBlockchain.g:4742:3: '-'
                    {
                    match(input,25,FOLLOW_2); 

                    }
                    break;

            }

             after(grammarAccess.getEDoubleAccess().getHyphenMinusKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EDouble__Group__0__Impl"


    // $ANTLR start "rule__EDouble__Group__1"
    // InternalBlockchain.g:4750:1: rule__EDouble__Group__1 : rule__EDouble__Group__1__Impl rule__EDouble__Group__2 ;
    public final void rule__EDouble__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBlockchain.g:4754:1: ( rule__EDouble__Group__1__Impl rule__EDouble__Group__2 )
            // InternalBlockchain.g:4755:2: rule__EDouble__Group__1__Impl rule__EDouble__Group__2
            {
            pushFollow(FOLLOW_50);
            rule__EDouble__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__EDouble__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EDouble__Group__1"


    // $ANTLR start "rule__EDouble__Group__1__Impl"
    // InternalBlockchain.g:4762:1: rule__EDouble__Group__1__Impl : ( ( RULE_INT )? ) ;
    public final void rule__EDouble__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBlockchain.g:4766:1: ( ( ( RULE_INT )? ) )
            // InternalBlockchain.g:4767:1: ( ( RULE_INT )? )
            {
            // InternalBlockchain.g:4767:1: ( ( RULE_INT )? )
            // InternalBlockchain.g:4768:2: ( RULE_INT )?
            {
             before(grammarAccess.getEDoubleAccess().getINTTerminalRuleCall_1()); 
            // InternalBlockchain.g:4769:2: ( RULE_INT )?
            int alt48=2;
            int LA48_0 = input.LA(1);

            if ( (LA48_0==RULE_INT) ) {
                alt48=1;
            }
            switch (alt48) {
                case 1 :
                    // InternalBlockchain.g:4769:3: RULE_INT
                    {
                    match(input,RULE_INT,FOLLOW_2); 

                    }
                    break;

            }

             after(grammarAccess.getEDoubleAccess().getINTTerminalRuleCall_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EDouble__Group__1__Impl"


    // $ANTLR start "rule__EDouble__Group__2"
    // InternalBlockchain.g:4777:1: rule__EDouble__Group__2 : rule__EDouble__Group__2__Impl rule__EDouble__Group__3 ;
    public final void rule__EDouble__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBlockchain.g:4781:1: ( rule__EDouble__Group__2__Impl rule__EDouble__Group__3 )
            // InternalBlockchain.g:4782:2: rule__EDouble__Group__2__Impl rule__EDouble__Group__3
            {
            pushFollow(FOLLOW_54);
            rule__EDouble__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__EDouble__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EDouble__Group__2"


    // $ANTLR start "rule__EDouble__Group__2__Impl"
    // InternalBlockchain.g:4789:1: rule__EDouble__Group__2__Impl : ( '.' ) ;
    public final void rule__EDouble__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBlockchain.g:4793:1: ( ( '.' ) )
            // InternalBlockchain.g:4794:1: ( '.' )
            {
            // InternalBlockchain.g:4794:1: ( '.' )
            // InternalBlockchain.g:4795:2: '.'
            {
             before(grammarAccess.getEDoubleAccess().getFullStopKeyword_2()); 
            match(input,11,FOLLOW_2); 
             after(grammarAccess.getEDoubleAccess().getFullStopKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EDouble__Group__2__Impl"


    // $ANTLR start "rule__EDouble__Group__3"
    // InternalBlockchain.g:4804:1: rule__EDouble__Group__3 : rule__EDouble__Group__3__Impl rule__EDouble__Group__4 ;
    public final void rule__EDouble__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBlockchain.g:4808:1: ( rule__EDouble__Group__3__Impl rule__EDouble__Group__4 )
            // InternalBlockchain.g:4809:2: rule__EDouble__Group__3__Impl rule__EDouble__Group__4
            {
            pushFollow(FOLLOW_55);
            rule__EDouble__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__EDouble__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EDouble__Group__3"


    // $ANTLR start "rule__EDouble__Group__3__Impl"
    // InternalBlockchain.g:4816:1: rule__EDouble__Group__3__Impl : ( RULE_INT ) ;
    public final void rule__EDouble__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBlockchain.g:4820:1: ( ( RULE_INT ) )
            // InternalBlockchain.g:4821:1: ( RULE_INT )
            {
            // InternalBlockchain.g:4821:1: ( RULE_INT )
            // InternalBlockchain.g:4822:2: RULE_INT
            {
             before(grammarAccess.getEDoubleAccess().getINTTerminalRuleCall_3()); 
            match(input,RULE_INT,FOLLOW_2); 
             after(grammarAccess.getEDoubleAccess().getINTTerminalRuleCall_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EDouble__Group__3__Impl"


    // $ANTLR start "rule__EDouble__Group__4"
    // InternalBlockchain.g:4831:1: rule__EDouble__Group__4 : rule__EDouble__Group__4__Impl ;
    public final void rule__EDouble__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBlockchain.g:4835:1: ( rule__EDouble__Group__4__Impl )
            // InternalBlockchain.g:4836:2: rule__EDouble__Group__4__Impl
            {
            pushFollow(FOLLOW_2);
            rule__EDouble__Group__4__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EDouble__Group__4"


    // $ANTLR start "rule__EDouble__Group__4__Impl"
    // InternalBlockchain.g:4842:1: rule__EDouble__Group__4__Impl : ( ( rule__EDouble__Group_4__0 )? ) ;
    public final void rule__EDouble__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBlockchain.g:4846:1: ( ( ( rule__EDouble__Group_4__0 )? ) )
            // InternalBlockchain.g:4847:1: ( ( rule__EDouble__Group_4__0 )? )
            {
            // InternalBlockchain.g:4847:1: ( ( rule__EDouble__Group_4__0 )? )
            // InternalBlockchain.g:4848:2: ( rule__EDouble__Group_4__0 )?
            {
             before(grammarAccess.getEDoubleAccess().getGroup_4()); 
            // InternalBlockchain.g:4849:2: ( rule__EDouble__Group_4__0 )?
            int alt49=2;
            int LA49_0 = input.LA(1);

            if ( ((LA49_0>=14 && LA49_0<=15)) ) {
                alt49=1;
            }
            switch (alt49) {
                case 1 :
                    // InternalBlockchain.g:4849:3: rule__EDouble__Group_4__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__EDouble__Group_4__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getEDoubleAccess().getGroup_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EDouble__Group__4__Impl"


    // $ANTLR start "rule__EDouble__Group_4__0"
    // InternalBlockchain.g:4858:1: rule__EDouble__Group_4__0 : rule__EDouble__Group_4__0__Impl rule__EDouble__Group_4__1 ;
    public final void rule__EDouble__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBlockchain.g:4862:1: ( rule__EDouble__Group_4__0__Impl rule__EDouble__Group_4__1 )
            // InternalBlockchain.g:4863:2: rule__EDouble__Group_4__0__Impl rule__EDouble__Group_4__1
            {
            pushFollow(FOLLOW_35);
            rule__EDouble__Group_4__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__EDouble__Group_4__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EDouble__Group_4__0"


    // $ANTLR start "rule__EDouble__Group_4__0__Impl"
    // InternalBlockchain.g:4870:1: rule__EDouble__Group_4__0__Impl : ( ( rule__EDouble__Alternatives_4_0 ) ) ;
    public final void rule__EDouble__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBlockchain.g:4874:1: ( ( ( rule__EDouble__Alternatives_4_0 ) ) )
            // InternalBlockchain.g:4875:1: ( ( rule__EDouble__Alternatives_4_0 ) )
            {
            // InternalBlockchain.g:4875:1: ( ( rule__EDouble__Alternatives_4_0 ) )
            // InternalBlockchain.g:4876:2: ( rule__EDouble__Alternatives_4_0 )
            {
             before(grammarAccess.getEDoubleAccess().getAlternatives_4_0()); 
            // InternalBlockchain.g:4877:2: ( rule__EDouble__Alternatives_4_0 )
            // InternalBlockchain.g:4877:3: rule__EDouble__Alternatives_4_0
            {
            pushFollow(FOLLOW_2);
            rule__EDouble__Alternatives_4_0();

            state._fsp--;


            }

             after(grammarAccess.getEDoubleAccess().getAlternatives_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EDouble__Group_4__0__Impl"


    // $ANTLR start "rule__EDouble__Group_4__1"
    // InternalBlockchain.g:4885:1: rule__EDouble__Group_4__1 : rule__EDouble__Group_4__1__Impl rule__EDouble__Group_4__2 ;
    public final void rule__EDouble__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBlockchain.g:4889:1: ( rule__EDouble__Group_4__1__Impl rule__EDouble__Group_4__2 )
            // InternalBlockchain.g:4890:2: rule__EDouble__Group_4__1__Impl rule__EDouble__Group_4__2
            {
            pushFollow(FOLLOW_35);
            rule__EDouble__Group_4__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__EDouble__Group_4__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EDouble__Group_4__1"


    // $ANTLR start "rule__EDouble__Group_4__1__Impl"
    // InternalBlockchain.g:4897:1: rule__EDouble__Group_4__1__Impl : ( ( '-' )? ) ;
    public final void rule__EDouble__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBlockchain.g:4901:1: ( ( ( '-' )? ) )
            // InternalBlockchain.g:4902:1: ( ( '-' )? )
            {
            // InternalBlockchain.g:4902:1: ( ( '-' )? )
            // InternalBlockchain.g:4903:2: ( '-' )?
            {
             before(grammarAccess.getEDoubleAccess().getHyphenMinusKeyword_4_1()); 
            // InternalBlockchain.g:4904:2: ( '-' )?
            int alt50=2;
            int LA50_0 = input.LA(1);

            if ( (LA50_0==25) ) {
                alt50=1;
            }
            switch (alt50) {
                case 1 :
                    // InternalBlockchain.g:4904:3: '-'
                    {
                    match(input,25,FOLLOW_2); 

                    }
                    break;

            }

             after(grammarAccess.getEDoubleAccess().getHyphenMinusKeyword_4_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EDouble__Group_4__1__Impl"


    // $ANTLR start "rule__EDouble__Group_4__2"
    // InternalBlockchain.g:4912:1: rule__EDouble__Group_4__2 : rule__EDouble__Group_4__2__Impl ;
    public final void rule__EDouble__Group_4__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBlockchain.g:4916:1: ( rule__EDouble__Group_4__2__Impl )
            // InternalBlockchain.g:4917:2: rule__EDouble__Group_4__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__EDouble__Group_4__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EDouble__Group_4__2"


    // $ANTLR start "rule__EDouble__Group_4__2__Impl"
    // InternalBlockchain.g:4923:1: rule__EDouble__Group_4__2__Impl : ( RULE_INT ) ;
    public final void rule__EDouble__Group_4__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBlockchain.g:4927:1: ( ( RULE_INT ) )
            // InternalBlockchain.g:4928:1: ( RULE_INT )
            {
            // InternalBlockchain.g:4928:1: ( RULE_INT )
            // InternalBlockchain.g:4929:2: RULE_INT
            {
             before(grammarAccess.getEDoubleAccess().getINTTerminalRuleCall_4_2()); 
            match(input,RULE_INT,FOLLOW_2); 
             after(grammarAccess.getEDoubleAccess().getINTTerminalRuleCall_4_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EDouble__Group_4__2__Impl"


    // $ANTLR start "rule__Primitivo__Group__0"
    // InternalBlockchain.g:4939:1: rule__Primitivo__Group__0 : rule__Primitivo__Group__0__Impl rule__Primitivo__Group__1 ;
    public final void rule__Primitivo__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBlockchain.g:4943:1: ( rule__Primitivo__Group__0__Impl rule__Primitivo__Group__1 )
            // InternalBlockchain.g:4944:2: rule__Primitivo__Group__0__Impl rule__Primitivo__Group__1
            {
            pushFollow(FOLLOW_56);
            rule__Primitivo__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Primitivo__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Primitivo__Group__0"


    // $ANTLR start "rule__Primitivo__Group__0__Impl"
    // InternalBlockchain.g:4951:1: rule__Primitivo__Group__0__Impl : ( () ) ;
    public final void rule__Primitivo__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBlockchain.g:4955:1: ( ( () ) )
            // InternalBlockchain.g:4956:1: ( () )
            {
            // InternalBlockchain.g:4956:1: ( () )
            // InternalBlockchain.g:4957:2: ()
            {
             before(grammarAccess.getPrimitivoAccess().getPrimitivoAction_0()); 
            // InternalBlockchain.g:4958:2: ()
            // InternalBlockchain.g:4958:3: 
            {
            }

             after(grammarAccess.getPrimitivoAccess().getPrimitivoAction_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Primitivo__Group__0__Impl"


    // $ANTLR start "rule__Primitivo__Group__1"
    // InternalBlockchain.g:4966:1: rule__Primitivo__Group__1 : rule__Primitivo__Group__1__Impl rule__Primitivo__Group__2 ;
    public final void rule__Primitivo__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBlockchain.g:4970:1: ( rule__Primitivo__Group__1__Impl rule__Primitivo__Group__2 )
            // InternalBlockchain.g:4971:2: rule__Primitivo__Group__1__Impl rule__Primitivo__Group__2
            {
            pushFollow(FOLLOW_4);
            rule__Primitivo__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Primitivo__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Primitivo__Group__1"


    // $ANTLR start "rule__Primitivo__Group__1__Impl"
    // InternalBlockchain.g:4978:1: rule__Primitivo__Group__1__Impl : ( ( ( rule__Primitivo__TipoAssignment_1 ) ) ( ( rule__Primitivo__TipoAssignment_1 )* ) ) ;
    public final void rule__Primitivo__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBlockchain.g:4982:1: ( ( ( ( rule__Primitivo__TipoAssignment_1 ) ) ( ( rule__Primitivo__TipoAssignment_1 )* ) ) )
            // InternalBlockchain.g:4983:1: ( ( ( rule__Primitivo__TipoAssignment_1 ) ) ( ( rule__Primitivo__TipoAssignment_1 )* ) )
            {
            // InternalBlockchain.g:4983:1: ( ( ( rule__Primitivo__TipoAssignment_1 ) ) ( ( rule__Primitivo__TipoAssignment_1 )* ) )
            // InternalBlockchain.g:4984:2: ( ( rule__Primitivo__TipoAssignment_1 ) ) ( ( rule__Primitivo__TipoAssignment_1 )* )
            {
            // InternalBlockchain.g:4984:2: ( ( rule__Primitivo__TipoAssignment_1 ) )
            // InternalBlockchain.g:4985:3: ( rule__Primitivo__TipoAssignment_1 )
            {
             before(grammarAccess.getPrimitivoAccess().getTipoAssignment_1()); 
            // InternalBlockchain.g:4986:3: ( rule__Primitivo__TipoAssignment_1 )
            // InternalBlockchain.g:4986:4: rule__Primitivo__TipoAssignment_1
            {
            pushFollow(FOLLOW_57);
            rule__Primitivo__TipoAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getPrimitivoAccess().getTipoAssignment_1()); 

            }

            // InternalBlockchain.g:4989:2: ( ( rule__Primitivo__TipoAssignment_1 )* )
            // InternalBlockchain.g:4990:3: ( rule__Primitivo__TipoAssignment_1 )*
            {
             before(grammarAccess.getPrimitivoAccess().getTipoAssignment_1()); 
            // InternalBlockchain.g:4991:3: ( rule__Primitivo__TipoAssignment_1 )*
            loop51:
            do {
                int alt51=2;
                int LA51_0 = input.LA(1);

                if ( ((LA51_0>=33 && LA51_0<=35)) ) {
                    alt51=1;
                }


                switch (alt51) {
            	case 1 :
            	    // InternalBlockchain.g:4991:4: rule__Primitivo__TipoAssignment_1
            	    {
            	    pushFollow(FOLLOW_57);
            	    rule__Primitivo__TipoAssignment_1();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop51;
                }
            } while (true);

             after(grammarAccess.getPrimitivoAccess().getTipoAssignment_1()); 

            }


            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Primitivo__Group__1__Impl"


    // $ANTLR start "rule__Primitivo__Group__2"
    // InternalBlockchain.g:5000:1: rule__Primitivo__Group__2 : rule__Primitivo__Group__2__Impl ;
    public final void rule__Primitivo__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBlockchain.g:5004:1: ( rule__Primitivo__Group__2__Impl )
            // InternalBlockchain.g:5005:2: rule__Primitivo__Group__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Primitivo__Group__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Primitivo__Group__2"


    // $ANTLR start "rule__Primitivo__Group__2__Impl"
    // InternalBlockchain.g:5011:1: rule__Primitivo__Group__2__Impl : ( ( rule__Primitivo__NameAssignment_2 ) ) ;
    public final void rule__Primitivo__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBlockchain.g:5015:1: ( ( ( rule__Primitivo__NameAssignment_2 ) ) )
            // InternalBlockchain.g:5016:1: ( ( rule__Primitivo__NameAssignment_2 ) )
            {
            // InternalBlockchain.g:5016:1: ( ( rule__Primitivo__NameAssignment_2 ) )
            // InternalBlockchain.g:5017:2: ( rule__Primitivo__NameAssignment_2 )
            {
             before(grammarAccess.getPrimitivoAccess().getNameAssignment_2()); 
            // InternalBlockchain.g:5018:2: ( rule__Primitivo__NameAssignment_2 )
            // InternalBlockchain.g:5018:3: rule__Primitivo__NameAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__Primitivo__NameAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getPrimitivoAccess().getNameAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Primitivo__Group__2__Impl"


    // $ANTLR start "rule__Mapa__Group__0"
    // InternalBlockchain.g:5027:1: rule__Mapa__Group__0 : rule__Mapa__Group__0__Impl rule__Mapa__Group__1 ;
    public final void rule__Mapa__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBlockchain.g:5031:1: ( rule__Mapa__Group__0__Impl rule__Mapa__Group__1 )
            // InternalBlockchain.g:5032:2: rule__Mapa__Group__0__Impl rule__Mapa__Group__1
            {
            pushFollow(FOLLOW_58);
            rule__Mapa__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Mapa__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Mapa__Group__0"


    // $ANTLR start "rule__Mapa__Group__0__Impl"
    // InternalBlockchain.g:5039:1: rule__Mapa__Group__0__Impl : ( ( rule__Mapa__NameAssignment_0 ) ) ;
    public final void rule__Mapa__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBlockchain.g:5043:1: ( ( ( rule__Mapa__NameAssignment_0 ) ) )
            // InternalBlockchain.g:5044:1: ( ( rule__Mapa__NameAssignment_0 ) )
            {
            // InternalBlockchain.g:5044:1: ( ( rule__Mapa__NameAssignment_0 ) )
            // InternalBlockchain.g:5045:2: ( rule__Mapa__NameAssignment_0 )
            {
             before(grammarAccess.getMapaAccess().getNameAssignment_0()); 
            // InternalBlockchain.g:5046:2: ( rule__Mapa__NameAssignment_0 )
            // InternalBlockchain.g:5046:3: rule__Mapa__NameAssignment_0
            {
            pushFollow(FOLLOW_2);
            rule__Mapa__NameAssignment_0();

            state._fsp--;


            }

             after(grammarAccess.getMapaAccess().getNameAssignment_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Mapa__Group__0__Impl"


    // $ANTLR start "rule__Mapa__Group__1"
    // InternalBlockchain.g:5054:1: rule__Mapa__Group__1 : rule__Mapa__Group__1__Impl rule__Mapa__Group__2 ;
    public final void rule__Mapa__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBlockchain.g:5058:1: ( rule__Mapa__Group__1__Impl rule__Mapa__Group__2 )
            // InternalBlockchain.g:5059:2: rule__Mapa__Group__1__Impl rule__Mapa__Group__2
            {
            pushFollow(FOLLOW_59);
            rule__Mapa__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Mapa__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Mapa__Group__1"


    // $ANTLR start "rule__Mapa__Group__1__Impl"
    // InternalBlockchain.g:5066:1: rule__Mapa__Group__1__Impl : ( ':' ) ;
    public final void rule__Mapa__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBlockchain.g:5070:1: ( ( ':' ) )
            // InternalBlockchain.g:5071:1: ( ':' )
            {
            // InternalBlockchain.g:5071:1: ( ':' )
            // InternalBlockchain.g:5072:2: ':'
            {
             before(grammarAccess.getMapaAccess().getColonKeyword_1()); 
            match(input,48,FOLLOW_2); 
             after(grammarAccess.getMapaAccess().getColonKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Mapa__Group__1__Impl"


    // $ANTLR start "rule__Mapa__Group__2"
    // InternalBlockchain.g:5081:1: rule__Mapa__Group__2 : rule__Mapa__Group__2__Impl rule__Mapa__Group__3 ;
    public final void rule__Mapa__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBlockchain.g:5085:1: ( rule__Mapa__Group__2__Impl rule__Mapa__Group__3 )
            // InternalBlockchain.g:5086:2: rule__Mapa__Group__2__Impl rule__Mapa__Group__3
            {
            pushFollow(FOLLOW_60);
            rule__Mapa__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Mapa__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Mapa__Group__2"


    // $ANTLR start "rule__Mapa__Group__2__Impl"
    // InternalBlockchain.g:5093:1: rule__Mapa__Group__2__Impl : ( 'Map' ) ;
    public final void rule__Mapa__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBlockchain.g:5097:1: ( ( 'Map' ) )
            // InternalBlockchain.g:5098:1: ( 'Map' )
            {
            // InternalBlockchain.g:5098:1: ( 'Map' )
            // InternalBlockchain.g:5099:2: 'Map'
            {
             before(grammarAccess.getMapaAccess().getMapKeyword_2()); 
            match(input,61,FOLLOW_2); 
             after(grammarAccess.getMapaAccess().getMapKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Mapa__Group__2__Impl"


    // $ANTLR start "rule__Mapa__Group__3"
    // InternalBlockchain.g:5108:1: rule__Mapa__Group__3 : rule__Mapa__Group__3__Impl rule__Mapa__Group__4 ;
    public final void rule__Mapa__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBlockchain.g:5112:1: ( rule__Mapa__Group__3__Impl rule__Mapa__Group__4 )
            // InternalBlockchain.g:5113:2: rule__Mapa__Group__3__Impl rule__Mapa__Group__4
            {
            pushFollow(FOLLOW_4);
            rule__Mapa__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Mapa__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Mapa__Group__3"


    // $ANTLR start "rule__Mapa__Group__3__Impl"
    // InternalBlockchain.g:5120:1: rule__Mapa__Group__3__Impl : ( '<' ) ;
    public final void rule__Mapa__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBlockchain.g:5124:1: ( ( '<' ) )
            // InternalBlockchain.g:5125:1: ( '<' )
            {
            // InternalBlockchain.g:5125:1: ( '<' )
            // InternalBlockchain.g:5126:2: '<'
            {
             before(grammarAccess.getMapaAccess().getLessThanSignKeyword_3()); 
            match(input,19,FOLLOW_2); 
             after(grammarAccess.getMapaAccess().getLessThanSignKeyword_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Mapa__Group__3__Impl"


    // $ANTLR start "rule__Mapa__Group__4"
    // InternalBlockchain.g:5135:1: rule__Mapa__Group__4 : rule__Mapa__Group__4__Impl rule__Mapa__Group__5 ;
    public final void rule__Mapa__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBlockchain.g:5139:1: ( rule__Mapa__Group__4__Impl rule__Mapa__Group__5 )
            // InternalBlockchain.g:5140:2: rule__Mapa__Group__4__Impl rule__Mapa__Group__5
            {
            pushFollow(FOLLOW_8);
            rule__Mapa__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Mapa__Group__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Mapa__Group__4"


    // $ANTLR start "rule__Mapa__Group__4__Impl"
    // InternalBlockchain.g:5147:1: rule__Mapa__Group__4__Impl : ( ( rule__Mapa__TipoDatoKeyAssignment_4 ) ) ;
    public final void rule__Mapa__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBlockchain.g:5151:1: ( ( ( rule__Mapa__TipoDatoKeyAssignment_4 ) ) )
            // InternalBlockchain.g:5152:1: ( ( rule__Mapa__TipoDatoKeyAssignment_4 ) )
            {
            // InternalBlockchain.g:5152:1: ( ( rule__Mapa__TipoDatoKeyAssignment_4 ) )
            // InternalBlockchain.g:5153:2: ( rule__Mapa__TipoDatoKeyAssignment_4 )
            {
             before(grammarAccess.getMapaAccess().getTipoDatoKeyAssignment_4()); 
            // InternalBlockchain.g:5154:2: ( rule__Mapa__TipoDatoKeyAssignment_4 )
            // InternalBlockchain.g:5154:3: rule__Mapa__TipoDatoKeyAssignment_4
            {
            pushFollow(FOLLOW_2);
            rule__Mapa__TipoDatoKeyAssignment_4();

            state._fsp--;


            }

             after(grammarAccess.getMapaAccess().getTipoDatoKeyAssignment_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Mapa__Group__4__Impl"


    // $ANTLR start "rule__Mapa__Group__5"
    // InternalBlockchain.g:5162:1: rule__Mapa__Group__5 : rule__Mapa__Group__5__Impl rule__Mapa__Group__6 ;
    public final void rule__Mapa__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBlockchain.g:5166:1: ( rule__Mapa__Group__5__Impl rule__Mapa__Group__6 )
            // InternalBlockchain.g:5167:2: rule__Mapa__Group__5__Impl rule__Mapa__Group__6
            {
            pushFollow(FOLLOW_4);
            rule__Mapa__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Mapa__Group__6();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Mapa__Group__5"


    // $ANTLR start "rule__Mapa__Group__5__Impl"
    // InternalBlockchain.g:5174:1: rule__Mapa__Group__5__Impl : ( ',' ) ;
    public final void rule__Mapa__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBlockchain.g:5178:1: ( ( ',' ) )
            // InternalBlockchain.g:5179:1: ( ',' )
            {
            // InternalBlockchain.g:5179:1: ( ',' )
            // InternalBlockchain.g:5180:2: ','
            {
             before(grammarAccess.getMapaAccess().getCommaKeyword_5()); 
            match(input,39,FOLLOW_2); 
             after(grammarAccess.getMapaAccess().getCommaKeyword_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Mapa__Group__5__Impl"


    // $ANTLR start "rule__Mapa__Group__6"
    // InternalBlockchain.g:5189:1: rule__Mapa__Group__6 : rule__Mapa__Group__6__Impl rule__Mapa__Group__7 ;
    public final void rule__Mapa__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBlockchain.g:5193:1: ( rule__Mapa__Group__6__Impl rule__Mapa__Group__7 )
            // InternalBlockchain.g:5194:2: rule__Mapa__Group__6__Impl rule__Mapa__Group__7
            {
            pushFollow(FOLLOW_61);
            rule__Mapa__Group__6__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Mapa__Group__7();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Mapa__Group__6"


    // $ANTLR start "rule__Mapa__Group__6__Impl"
    // InternalBlockchain.g:5201:1: rule__Mapa__Group__6__Impl : ( ( rule__Mapa__TipoDatoValueAssignment_6 ) ) ;
    public final void rule__Mapa__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBlockchain.g:5205:1: ( ( ( rule__Mapa__TipoDatoValueAssignment_6 ) ) )
            // InternalBlockchain.g:5206:1: ( ( rule__Mapa__TipoDatoValueAssignment_6 ) )
            {
            // InternalBlockchain.g:5206:1: ( ( rule__Mapa__TipoDatoValueAssignment_6 ) )
            // InternalBlockchain.g:5207:2: ( rule__Mapa__TipoDatoValueAssignment_6 )
            {
             before(grammarAccess.getMapaAccess().getTipoDatoValueAssignment_6()); 
            // InternalBlockchain.g:5208:2: ( rule__Mapa__TipoDatoValueAssignment_6 )
            // InternalBlockchain.g:5208:3: rule__Mapa__TipoDatoValueAssignment_6
            {
            pushFollow(FOLLOW_2);
            rule__Mapa__TipoDatoValueAssignment_6();

            state._fsp--;


            }

             after(grammarAccess.getMapaAccess().getTipoDatoValueAssignment_6()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Mapa__Group__6__Impl"


    // $ANTLR start "rule__Mapa__Group__7"
    // InternalBlockchain.g:5216:1: rule__Mapa__Group__7 : rule__Mapa__Group__7__Impl ;
    public final void rule__Mapa__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBlockchain.g:5220:1: ( rule__Mapa__Group__7__Impl )
            // InternalBlockchain.g:5221:2: rule__Mapa__Group__7__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Mapa__Group__7__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Mapa__Group__7"


    // $ANTLR start "rule__Mapa__Group__7__Impl"
    // InternalBlockchain.g:5227:1: rule__Mapa__Group__7__Impl : ( '>' ) ;
    public final void rule__Mapa__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBlockchain.g:5231:1: ( ( '>' ) )
            // InternalBlockchain.g:5232:1: ( '>' )
            {
            // InternalBlockchain.g:5232:1: ( '>' )
            // InternalBlockchain.g:5233:2: '>'
            {
             before(grammarAccess.getMapaAccess().getGreaterThanSignKeyword_7()); 
            match(input,18,FOLLOW_2); 
             after(grammarAccess.getMapaAccess().getGreaterThanSignKeyword_7()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Mapa__Group__7__Impl"


    // $ANTLR start "rule__Aplicacion__NameAssignment_2"
    // InternalBlockchain.g:5243:1: rule__Aplicacion__NameAssignment_2 : ( ruleEString ) ;
    public final void rule__Aplicacion__NameAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBlockchain.g:5247:1: ( ( ruleEString ) )
            // InternalBlockchain.g:5248:2: ( ruleEString )
            {
            // InternalBlockchain.g:5248:2: ( ruleEString )
            // InternalBlockchain.g:5249:3: ruleEString
            {
             before(grammarAccess.getAplicacionAccess().getNameEStringParserRuleCall_2_0()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getAplicacionAccess().getNameEStringParserRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Aplicacion__NameAssignment_2"


    // $ANTLR start "rule__Aplicacion__SmartcontractAssignment_4_0"
    // InternalBlockchain.g:5258:1: rule__Aplicacion__SmartcontractAssignment_4_0 : ( ruleSmartContract ) ;
    public final void rule__Aplicacion__SmartcontractAssignment_4_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBlockchain.g:5262:1: ( ( ruleSmartContract ) )
            // InternalBlockchain.g:5263:2: ( ruleSmartContract )
            {
            // InternalBlockchain.g:5263:2: ( ruleSmartContract )
            // InternalBlockchain.g:5264:3: ruleSmartContract
            {
             before(grammarAccess.getAplicacionAccess().getSmartcontractSmartContractParserRuleCall_4_0_0()); 
            pushFollow(FOLLOW_2);
            ruleSmartContract();

            state._fsp--;

             after(grammarAccess.getAplicacionAccess().getSmartcontractSmartContractParserRuleCall_4_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Aplicacion__SmartcontractAssignment_4_0"


    // $ANTLR start "rule__Aplicacion__SmartcontractAssignment_4_1_1"
    // InternalBlockchain.g:5273:1: rule__Aplicacion__SmartcontractAssignment_4_1_1 : ( ruleSmartContract ) ;
    public final void rule__Aplicacion__SmartcontractAssignment_4_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBlockchain.g:5277:1: ( ( ruleSmartContract ) )
            // InternalBlockchain.g:5278:2: ( ruleSmartContract )
            {
            // InternalBlockchain.g:5278:2: ( ruleSmartContract )
            // InternalBlockchain.g:5279:3: ruleSmartContract
            {
             before(grammarAccess.getAplicacionAccess().getSmartcontractSmartContractParserRuleCall_4_1_1_0()); 
            pushFollow(FOLLOW_2);
            ruleSmartContract();

            state._fsp--;

             after(grammarAccess.getAplicacionAccess().getSmartcontractSmartContractParserRuleCall_4_1_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Aplicacion__SmartcontractAssignment_4_1_1"


    // $ANTLR start "rule__Aplicacion__TipodatoAssignment_5_1"
    // InternalBlockchain.g:5288:1: rule__Aplicacion__TipodatoAssignment_5_1 : ( ruleTipoDato ) ;
    public final void rule__Aplicacion__TipodatoAssignment_5_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBlockchain.g:5292:1: ( ( ruleTipoDato ) )
            // InternalBlockchain.g:5293:2: ( ruleTipoDato )
            {
            // InternalBlockchain.g:5293:2: ( ruleTipoDato )
            // InternalBlockchain.g:5294:3: ruleTipoDato
            {
             before(grammarAccess.getAplicacionAccess().getTipodatoTipoDatoParserRuleCall_5_1_0()); 
            pushFollow(FOLLOW_2);
            ruleTipoDato();

            state._fsp--;

             after(grammarAccess.getAplicacionAccess().getTipodatoTipoDatoParserRuleCall_5_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Aplicacion__TipodatoAssignment_5_1"


    // $ANTLR start "rule__Aplicacion__TipodatoAssignment_5_2_1"
    // InternalBlockchain.g:5303:1: rule__Aplicacion__TipodatoAssignment_5_2_1 : ( ruleTipoDato ) ;
    public final void rule__Aplicacion__TipodatoAssignment_5_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBlockchain.g:5307:1: ( ( ruleTipoDato ) )
            // InternalBlockchain.g:5308:2: ( ruleTipoDato )
            {
            // InternalBlockchain.g:5308:2: ( ruleTipoDato )
            // InternalBlockchain.g:5309:3: ruleTipoDato
            {
             before(grammarAccess.getAplicacionAccess().getTipodatoTipoDatoParserRuleCall_5_2_1_0()); 
            pushFollow(FOLLOW_2);
            ruleTipoDato();

            state._fsp--;

             after(grammarAccess.getAplicacionAccess().getTipodatoTipoDatoParserRuleCall_5_2_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Aplicacion__TipodatoAssignment_5_2_1"


    // $ANTLR start "rule__SmartContract__NameAssignment_1"
    // InternalBlockchain.g:5318:1: rule__SmartContract__NameAssignment_1 : ( ruleEString ) ;
    public final void rule__SmartContract__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBlockchain.g:5322:1: ( ( ruleEString ) )
            // InternalBlockchain.g:5323:2: ( ruleEString )
            {
            // InternalBlockchain.g:5323:2: ( ruleEString )
            // InternalBlockchain.g:5324:3: ruleEString
            {
             before(grammarAccess.getSmartContractAccess().getNameEStringParserRuleCall_1_0()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getSmartContractAccess().getNameEStringParserRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SmartContract__NameAssignment_1"


    // $ANTLR start "rule__SmartContract__EntidadesAssignment_3_0"
    // InternalBlockchain.g:5333:1: rule__SmartContract__EntidadesAssignment_3_0 : ( ruleEntidad ) ;
    public final void rule__SmartContract__EntidadesAssignment_3_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBlockchain.g:5337:1: ( ( ruleEntidad ) )
            // InternalBlockchain.g:5338:2: ( ruleEntidad )
            {
            // InternalBlockchain.g:5338:2: ( ruleEntidad )
            // InternalBlockchain.g:5339:3: ruleEntidad
            {
             before(grammarAccess.getSmartContractAccess().getEntidadesEntidadParserRuleCall_3_0_0()); 
            pushFollow(FOLLOW_2);
            ruleEntidad();

            state._fsp--;

             after(grammarAccess.getSmartContractAccess().getEntidadesEntidadParserRuleCall_3_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SmartContract__EntidadesAssignment_3_0"


    // $ANTLR start "rule__SmartContract__EntidadesAssignment_3_1"
    // InternalBlockchain.g:5348:1: rule__SmartContract__EntidadesAssignment_3_1 : ( ruleEntidad ) ;
    public final void rule__SmartContract__EntidadesAssignment_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBlockchain.g:5352:1: ( ( ruleEntidad ) )
            // InternalBlockchain.g:5353:2: ( ruleEntidad )
            {
            // InternalBlockchain.g:5353:2: ( ruleEntidad )
            // InternalBlockchain.g:5354:3: ruleEntidad
            {
             before(grammarAccess.getSmartContractAccess().getEntidadesEntidadParserRuleCall_3_1_0()); 
            pushFollow(FOLLOW_2);
            ruleEntidad();

            state._fsp--;

             after(grammarAccess.getSmartContractAccess().getEntidadesEntidadParserRuleCall_3_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SmartContract__EntidadesAssignment_3_1"


    // $ANTLR start "rule__SmartContract__EstadoAssignment_4_0"
    // InternalBlockchain.g:5363:1: rule__SmartContract__EstadoAssignment_4_0 : ( ruleEstado ) ;
    public final void rule__SmartContract__EstadoAssignment_4_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBlockchain.g:5367:1: ( ( ruleEstado ) )
            // InternalBlockchain.g:5368:2: ( ruleEstado )
            {
            // InternalBlockchain.g:5368:2: ( ruleEstado )
            // InternalBlockchain.g:5369:3: ruleEstado
            {
             before(grammarAccess.getSmartContractAccess().getEstadoEstadoParserRuleCall_4_0_0()); 
            pushFollow(FOLLOW_2);
            ruleEstado();

            state._fsp--;

             after(grammarAccess.getSmartContractAccess().getEstadoEstadoParserRuleCall_4_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SmartContract__EstadoAssignment_4_0"


    // $ANTLR start "rule__SmartContract__EstadoAssignment_4_1_1"
    // InternalBlockchain.g:5378:1: rule__SmartContract__EstadoAssignment_4_1_1 : ( ruleEstado ) ;
    public final void rule__SmartContract__EstadoAssignment_4_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBlockchain.g:5382:1: ( ( ruleEstado ) )
            // InternalBlockchain.g:5383:2: ( ruleEstado )
            {
            // InternalBlockchain.g:5383:2: ( ruleEstado )
            // InternalBlockchain.g:5384:3: ruleEstado
            {
             before(grammarAccess.getSmartContractAccess().getEstadoEstadoParserRuleCall_4_1_1_0()); 
            pushFollow(FOLLOW_2);
            ruleEstado();

            state._fsp--;

             after(grammarAccess.getSmartContractAccess().getEstadoEstadoParserRuleCall_4_1_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SmartContract__EstadoAssignment_4_1_1"


    // $ANTLR start "rule__SmartContract__OperacionesAssignment_5_0"
    // InternalBlockchain.g:5393:1: rule__SmartContract__OperacionesAssignment_5_0 : ( ruleOperacion ) ;
    public final void rule__SmartContract__OperacionesAssignment_5_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBlockchain.g:5397:1: ( ( ruleOperacion ) )
            // InternalBlockchain.g:5398:2: ( ruleOperacion )
            {
            // InternalBlockchain.g:5398:2: ( ruleOperacion )
            // InternalBlockchain.g:5399:3: ruleOperacion
            {
             before(grammarAccess.getSmartContractAccess().getOperacionesOperacionParserRuleCall_5_0_0()); 
            pushFollow(FOLLOW_2);
            ruleOperacion();

            state._fsp--;

             after(grammarAccess.getSmartContractAccess().getOperacionesOperacionParserRuleCall_5_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SmartContract__OperacionesAssignment_5_0"


    // $ANTLR start "rule__SmartContract__OperacionesAssignment_5_1_1"
    // InternalBlockchain.g:5408:1: rule__SmartContract__OperacionesAssignment_5_1_1 : ( ruleOperacion ) ;
    public final void rule__SmartContract__OperacionesAssignment_5_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBlockchain.g:5412:1: ( ( ruleOperacion ) )
            // InternalBlockchain.g:5413:2: ( ruleOperacion )
            {
            // InternalBlockchain.g:5413:2: ( ruleOperacion )
            // InternalBlockchain.g:5414:3: ruleOperacion
            {
             before(grammarAccess.getSmartContractAccess().getOperacionesOperacionParserRuleCall_5_1_1_0()); 
            pushFollow(FOLLOW_2);
            ruleOperacion();

            state._fsp--;

             after(grammarAccess.getSmartContractAccess().getOperacionesOperacionParserRuleCall_5_1_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SmartContract__OperacionesAssignment_5_1_1"


    // $ANTLR start "rule__Entidad__NameAssignment_2"
    // InternalBlockchain.g:5423:1: rule__Entidad__NameAssignment_2 : ( ruleEString ) ;
    public final void rule__Entidad__NameAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBlockchain.g:5427:1: ( ( ruleEString ) )
            // InternalBlockchain.g:5428:2: ( ruleEString )
            {
            // InternalBlockchain.g:5428:2: ( ruleEString )
            // InternalBlockchain.g:5429:3: ruleEString
            {
             before(grammarAccess.getEntidadAccess().getNameEStringParserRuleCall_2_0()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getEntidadAccess().getNameEStringParserRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Entidad__NameAssignment_2"


    // $ANTLR start "rule__Entidad__AtributosAssignment_4_0"
    // InternalBlockchain.g:5438:1: rule__Entidad__AtributosAssignment_4_0 : ( ruleAtributo ) ;
    public final void rule__Entidad__AtributosAssignment_4_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBlockchain.g:5442:1: ( ( ruleAtributo ) )
            // InternalBlockchain.g:5443:2: ( ruleAtributo )
            {
            // InternalBlockchain.g:5443:2: ( ruleAtributo )
            // InternalBlockchain.g:5444:3: ruleAtributo
            {
             before(grammarAccess.getEntidadAccess().getAtributosAtributoParserRuleCall_4_0_0()); 
            pushFollow(FOLLOW_2);
            ruleAtributo();

            state._fsp--;

             after(grammarAccess.getEntidadAccess().getAtributosAtributoParserRuleCall_4_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Entidad__AtributosAssignment_4_0"


    // $ANTLR start "rule__Entidad__AtributosAssignment_4_1"
    // InternalBlockchain.g:5453:1: rule__Entidad__AtributosAssignment_4_1 : ( ruleAtributo ) ;
    public final void rule__Entidad__AtributosAssignment_4_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBlockchain.g:5457:1: ( ( ruleAtributo ) )
            // InternalBlockchain.g:5458:2: ( ruleAtributo )
            {
            // InternalBlockchain.g:5458:2: ( ruleAtributo )
            // InternalBlockchain.g:5459:3: ruleAtributo
            {
             before(grammarAccess.getEntidadAccess().getAtributosAtributoParserRuleCall_4_1_0()); 
            pushFollow(FOLLOW_2);
            ruleAtributo();

            state._fsp--;

             after(grammarAccess.getEntidadAccess().getAtributosAtributoParserRuleCall_4_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Entidad__AtributosAssignment_4_1"


    // $ANTLR start "rule__Operacion__EsUserDefinedAssignment_2_1"
    // InternalBlockchain.g:5468:1: rule__Operacion__EsUserDefinedAssignment_2_1 : ( ruleEBoolean ) ;
    public final void rule__Operacion__EsUserDefinedAssignment_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBlockchain.g:5472:1: ( ( ruleEBoolean ) )
            // InternalBlockchain.g:5473:2: ( ruleEBoolean )
            {
            // InternalBlockchain.g:5473:2: ( ruleEBoolean )
            // InternalBlockchain.g:5474:3: ruleEBoolean
            {
             before(grammarAccess.getOperacionAccess().getEsUserDefinedEBooleanParserRuleCall_2_1_0()); 
            pushFollow(FOLLOW_2);
            ruleEBoolean();

            state._fsp--;

             after(grammarAccess.getOperacionAccess().getEsUserDefinedEBooleanParserRuleCall_2_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Operacion__EsUserDefinedAssignment_2_1"


    // $ANTLR start "rule__Operacion__NameAssignment_3"
    // InternalBlockchain.g:5483:1: rule__Operacion__NameAssignment_3 : ( ruleEString ) ;
    public final void rule__Operacion__NameAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBlockchain.g:5487:1: ( ( ruleEString ) )
            // InternalBlockchain.g:5488:2: ( ruleEString )
            {
            // InternalBlockchain.g:5488:2: ( ruleEString )
            // InternalBlockchain.g:5489:3: ruleEString
            {
             before(grammarAccess.getOperacionAccess().getNameEStringParserRuleCall_3_0()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getOperacionAccess().getNameEStringParserRuleCall_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Operacion__NameAssignment_3"


    // $ANTLR start "rule__Operacion__ParametrosAssignment_5_0"
    // InternalBlockchain.g:5498:1: rule__Operacion__ParametrosAssignment_5_0 : ( ruleParametro ) ;
    public final void rule__Operacion__ParametrosAssignment_5_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBlockchain.g:5502:1: ( ( ruleParametro ) )
            // InternalBlockchain.g:5503:2: ( ruleParametro )
            {
            // InternalBlockchain.g:5503:2: ( ruleParametro )
            // InternalBlockchain.g:5504:3: ruleParametro
            {
             before(grammarAccess.getOperacionAccess().getParametrosParametroParserRuleCall_5_0_0()); 
            pushFollow(FOLLOW_2);
            ruleParametro();

            state._fsp--;

             after(grammarAccess.getOperacionAccess().getParametrosParametroParserRuleCall_5_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Operacion__ParametrosAssignment_5_0"


    // $ANTLR start "rule__Operacion__ParametrosAssignment_5_1_1"
    // InternalBlockchain.g:5513:1: rule__Operacion__ParametrosAssignment_5_1_1 : ( ruleParametro ) ;
    public final void rule__Operacion__ParametrosAssignment_5_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBlockchain.g:5517:1: ( ( ruleParametro ) )
            // InternalBlockchain.g:5518:2: ( ruleParametro )
            {
            // InternalBlockchain.g:5518:2: ( ruleParametro )
            // InternalBlockchain.g:5519:3: ruleParametro
            {
             before(grammarAccess.getOperacionAccess().getParametrosParametroParserRuleCall_5_1_1_0()); 
            pushFollow(FOLLOW_2);
            ruleParametro();

            state._fsp--;

             after(grammarAccess.getOperacionAccess().getParametrosParametroParserRuleCall_5_1_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Operacion__ParametrosAssignment_5_1_1"


    // $ANTLR start "rule__Operacion__RetornoAssignment_7_1"
    // InternalBlockchain.g:5528:1: rule__Operacion__RetornoAssignment_7_1 : ( ( ruleEString ) ) ;
    public final void rule__Operacion__RetornoAssignment_7_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBlockchain.g:5532:1: ( ( ( ruleEString ) ) )
            // InternalBlockchain.g:5533:2: ( ( ruleEString ) )
            {
            // InternalBlockchain.g:5533:2: ( ( ruleEString ) )
            // InternalBlockchain.g:5534:3: ( ruleEString )
            {
             before(grammarAccess.getOperacionAccess().getRetornoTipoDatoCrossReference_7_1_0()); 
            // InternalBlockchain.g:5535:3: ( ruleEString )
            // InternalBlockchain.g:5536:4: ruleEString
            {
             before(grammarAccess.getOperacionAccess().getRetornoTipoDatoEStringParserRuleCall_7_1_0_1()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getOperacionAccess().getRetornoTipoDatoEStringParserRuleCall_7_1_0_1()); 

            }

             after(grammarAccess.getOperacionAccess().getRetornoTipoDatoCrossReference_7_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Operacion__RetornoAssignment_7_1"


    // $ANTLR start "rule__Operacion__SentenciaAssignment_10_0"
    // InternalBlockchain.g:5547:1: rule__Operacion__SentenciaAssignment_10_0 : ( ruleSentencia ) ;
    public final void rule__Operacion__SentenciaAssignment_10_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBlockchain.g:5551:1: ( ( ruleSentencia ) )
            // InternalBlockchain.g:5552:2: ( ruleSentencia )
            {
            // InternalBlockchain.g:5552:2: ( ruleSentencia )
            // InternalBlockchain.g:5553:3: ruleSentencia
            {
             before(grammarAccess.getOperacionAccess().getSentenciaSentenciaParserRuleCall_10_0_0()); 
            pushFollow(FOLLOW_2);
            ruleSentencia();

            state._fsp--;

             after(grammarAccess.getOperacionAccess().getSentenciaSentenciaParserRuleCall_10_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Operacion__SentenciaAssignment_10_0"


    // $ANTLR start "rule__Operacion__SentenciaAssignment_10_1"
    // InternalBlockchain.g:5562:1: rule__Operacion__SentenciaAssignment_10_1 : ( ruleSentencia ) ;
    public final void rule__Operacion__SentenciaAssignment_10_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBlockchain.g:5566:1: ( ( ruleSentencia ) )
            // InternalBlockchain.g:5567:2: ( ruleSentencia )
            {
            // InternalBlockchain.g:5567:2: ( ruleSentencia )
            // InternalBlockchain.g:5568:3: ruleSentencia
            {
             before(grammarAccess.getOperacionAccess().getSentenciaSentenciaParserRuleCall_10_1_0()); 
            pushFollow(FOLLOW_2);
            ruleSentencia();

            state._fsp--;

             after(grammarAccess.getOperacionAccess().getSentenciaSentenciaParserRuleCall_10_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Operacion__SentenciaAssignment_10_1"


    // $ANTLR start "rule__Estado__TipodatoAssignment_1"
    // InternalBlockchain.g:5577:1: rule__Estado__TipodatoAssignment_1 : ( ( RULE_ID ) ) ;
    public final void rule__Estado__TipodatoAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBlockchain.g:5581:1: ( ( ( RULE_ID ) ) )
            // InternalBlockchain.g:5582:2: ( ( RULE_ID ) )
            {
            // InternalBlockchain.g:5582:2: ( ( RULE_ID ) )
            // InternalBlockchain.g:5583:3: ( RULE_ID )
            {
             before(grammarAccess.getEstadoAccess().getTipodatoTipoDatoCrossReference_1_0()); 
            // InternalBlockchain.g:5584:3: ( RULE_ID )
            // InternalBlockchain.g:5585:4: RULE_ID
            {
             before(grammarAccess.getEstadoAccess().getTipodatoTipoDatoIDTerminalRuleCall_1_0_1()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getEstadoAccess().getTipodatoTipoDatoIDTerminalRuleCall_1_0_1()); 

            }

             after(grammarAccess.getEstadoAccess().getTipodatoTipoDatoCrossReference_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Estado__TipodatoAssignment_1"


    // $ANTLR start "rule__Estado__NameAssignment_2"
    // InternalBlockchain.g:5596:1: rule__Estado__NameAssignment_2 : ( ruleEString ) ;
    public final void rule__Estado__NameAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBlockchain.g:5600:1: ( ( ruleEString ) )
            // InternalBlockchain.g:5601:2: ( ruleEString )
            {
            // InternalBlockchain.g:5601:2: ( ruleEString )
            // InternalBlockchain.g:5602:3: ruleEString
            {
             before(grammarAccess.getEstadoAccess().getNameEStringParserRuleCall_2_0()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getEstadoAccess().getNameEStringParserRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Estado__NameAssignment_2"


    // $ANTLR start "rule__Atributo__TipodatoAssignment_0"
    // InternalBlockchain.g:5611:1: rule__Atributo__TipodatoAssignment_0 : ( ( ruleEString ) ) ;
    public final void rule__Atributo__TipodatoAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBlockchain.g:5615:1: ( ( ( ruleEString ) ) )
            // InternalBlockchain.g:5616:2: ( ( ruleEString ) )
            {
            // InternalBlockchain.g:5616:2: ( ( ruleEString ) )
            // InternalBlockchain.g:5617:3: ( ruleEString )
            {
             before(grammarAccess.getAtributoAccess().getTipodatoTipoDatoCrossReference_0_0()); 
            // InternalBlockchain.g:5618:3: ( ruleEString )
            // InternalBlockchain.g:5619:4: ruleEString
            {
             before(grammarAccess.getAtributoAccess().getTipodatoTipoDatoEStringParserRuleCall_0_0_1()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getAtributoAccess().getTipodatoTipoDatoEStringParserRuleCall_0_0_1()); 

            }

             after(grammarAccess.getAtributoAccess().getTipodatoTipoDatoCrossReference_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Atributo__TipodatoAssignment_0"


    // $ANTLR start "rule__Atributo__NameAssignment_1"
    // InternalBlockchain.g:5630:1: rule__Atributo__NameAssignment_1 : ( ruleEString ) ;
    public final void rule__Atributo__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBlockchain.g:5634:1: ( ( ruleEString ) )
            // InternalBlockchain.g:5635:2: ( ruleEString )
            {
            // InternalBlockchain.g:5635:2: ( ruleEString )
            // InternalBlockchain.g:5636:3: ruleEString
            {
             before(grammarAccess.getAtributoAccess().getNameEStringParserRuleCall_1_0()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getAtributoAccess().getNameEStringParserRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Atributo__NameAssignment_1"


    // $ANTLR start "rule__Parametro__TipodatoAssignment_0"
    // InternalBlockchain.g:5645:1: rule__Parametro__TipodatoAssignment_0 : ( ( ruleEString ) ) ;
    public final void rule__Parametro__TipodatoAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBlockchain.g:5649:1: ( ( ( ruleEString ) ) )
            // InternalBlockchain.g:5650:2: ( ( ruleEString ) )
            {
            // InternalBlockchain.g:5650:2: ( ( ruleEString ) )
            // InternalBlockchain.g:5651:3: ( ruleEString )
            {
             before(grammarAccess.getParametroAccess().getTipodatoTipoDatoCrossReference_0_0()); 
            // InternalBlockchain.g:5652:3: ( ruleEString )
            // InternalBlockchain.g:5653:4: ruleEString
            {
             before(grammarAccess.getParametroAccess().getTipodatoTipoDatoEStringParserRuleCall_0_0_1()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getParametroAccess().getTipodatoTipoDatoEStringParserRuleCall_0_0_1()); 

            }

             after(grammarAccess.getParametroAccess().getTipodatoTipoDatoCrossReference_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Parametro__TipodatoAssignment_0"


    // $ANTLR start "rule__Parametro__NameAssignment_1"
    // InternalBlockchain.g:5664:1: rule__Parametro__NameAssignment_1 : ( ruleEString ) ;
    public final void rule__Parametro__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBlockchain.g:5668:1: ( ( ruleEString ) )
            // InternalBlockchain.g:5669:2: ( ruleEString )
            {
            // InternalBlockchain.g:5669:2: ( ruleEString )
            // InternalBlockchain.g:5670:3: ruleEString
            {
             before(grammarAccess.getParametroAccess().getNameEStringParserRuleCall_1_0()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getParametroAccess().getNameEStringParserRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Parametro__NameAssignment_1"


    // $ANTLR start "rule__ExpresionLogica__IdAssignment_2_1"
    // InternalBlockchain.g:5679:1: rule__ExpresionLogica__IdAssignment_2_1 : ( ruleEInt ) ;
    public final void rule__ExpresionLogica__IdAssignment_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBlockchain.g:5683:1: ( ( ruleEInt ) )
            // InternalBlockchain.g:5684:2: ( ruleEInt )
            {
            // InternalBlockchain.g:5684:2: ( ruleEInt )
            // InternalBlockchain.g:5685:3: ruleEInt
            {
             before(grammarAccess.getExpresionLogicaAccess().getIdEIntParserRuleCall_2_1_0()); 
            pushFollow(FOLLOW_2);
            ruleEInt();

            state._fsp--;

             after(grammarAccess.getExpresionLogicaAccess().getIdEIntParserRuleCall_2_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExpresionLogica__IdAssignment_2_1"


    // $ANTLR start "rule__ExpresionLogica__LadoIzqAssignment_3"
    // InternalBlockchain.g:5694:1: rule__ExpresionLogica__LadoIzqAssignment_3 : ( ( ruleEString ) ) ;
    public final void rule__ExpresionLogica__LadoIzqAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBlockchain.g:5698:1: ( ( ( ruleEString ) ) )
            // InternalBlockchain.g:5699:2: ( ( ruleEString ) )
            {
            // InternalBlockchain.g:5699:2: ( ( ruleEString ) )
            // InternalBlockchain.g:5700:3: ( ruleEString )
            {
             before(grammarAccess.getExpresionLogicaAccess().getLadoIzqSentenciaCrossReference_3_0()); 
            // InternalBlockchain.g:5701:3: ( ruleEString )
            // InternalBlockchain.g:5702:4: ruleEString
            {
             before(grammarAccess.getExpresionLogicaAccess().getLadoIzqSentenciaEStringParserRuleCall_3_0_1()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getExpresionLogicaAccess().getLadoIzqSentenciaEStringParserRuleCall_3_0_1()); 

            }

             after(grammarAccess.getExpresionLogicaAccess().getLadoIzqSentenciaCrossReference_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExpresionLogica__LadoIzqAssignment_3"


    // $ANTLR start "rule__ExpresionLogica__OperadorAssignment_4"
    // InternalBlockchain.g:5713:1: rule__ExpresionLogica__OperadorAssignment_4 : ( ruleOperadorLogico ) ;
    public final void rule__ExpresionLogica__OperadorAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBlockchain.g:5717:1: ( ( ruleOperadorLogico ) )
            // InternalBlockchain.g:5718:2: ( ruleOperadorLogico )
            {
            // InternalBlockchain.g:5718:2: ( ruleOperadorLogico )
            // InternalBlockchain.g:5719:3: ruleOperadorLogico
            {
             before(grammarAccess.getExpresionLogicaAccess().getOperadorOperadorLogicoEnumRuleCall_4_0()); 
            pushFollow(FOLLOW_2);
            ruleOperadorLogico();

            state._fsp--;

             after(grammarAccess.getExpresionLogicaAccess().getOperadorOperadorLogicoEnumRuleCall_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExpresionLogica__OperadorAssignment_4"


    // $ANTLR start "rule__ExpresionLogica__LadoDerAssignment_5"
    // InternalBlockchain.g:5728:1: rule__ExpresionLogica__LadoDerAssignment_5 : ( ( ruleEString ) ) ;
    public final void rule__ExpresionLogica__LadoDerAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBlockchain.g:5732:1: ( ( ( ruleEString ) ) )
            // InternalBlockchain.g:5733:2: ( ( ruleEString ) )
            {
            // InternalBlockchain.g:5733:2: ( ( ruleEString ) )
            // InternalBlockchain.g:5734:3: ( ruleEString )
            {
             before(grammarAccess.getExpresionLogicaAccess().getLadoDerSentenciaCrossReference_5_0()); 
            // InternalBlockchain.g:5735:3: ( ruleEString )
            // InternalBlockchain.g:5736:4: ruleEString
            {
             before(grammarAccess.getExpresionLogicaAccess().getLadoDerSentenciaEStringParserRuleCall_5_0_1()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getExpresionLogicaAccess().getLadoDerSentenciaEStringParserRuleCall_5_0_1()); 

            }

             after(grammarAccess.getExpresionLogicaAccess().getLadoDerSentenciaCrossReference_5_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExpresionLogica__LadoDerAssignment_5"


    // $ANTLR start "rule__ExpresionAritmetica__IdAssignment_1_1"
    // InternalBlockchain.g:5747:1: rule__ExpresionAritmetica__IdAssignment_1_1 : ( ruleEInt ) ;
    public final void rule__ExpresionAritmetica__IdAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBlockchain.g:5751:1: ( ( ruleEInt ) )
            // InternalBlockchain.g:5752:2: ( ruleEInt )
            {
            // InternalBlockchain.g:5752:2: ( ruleEInt )
            // InternalBlockchain.g:5753:3: ruleEInt
            {
             before(grammarAccess.getExpresionAritmeticaAccess().getIdEIntParserRuleCall_1_1_0()); 
            pushFollow(FOLLOW_2);
            ruleEInt();

            state._fsp--;

             after(grammarAccess.getExpresionAritmeticaAccess().getIdEIntParserRuleCall_1_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExpresionAritmetica__IdAssignment_1_1"


    // $ANTLR start "rule__ExpresionAritmetica__LadoIzqAssignment_2"
    // InternalBlockchain.g:5762:1: rule__ExpresionAritmetica__LadoIzqAssignment_2 : ( ( ruleEString ) ) ;
    public final void rule__ExpresionAritmetica__LadoIzqAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBlockchain.g:5766:1: ( ( ( ruleEString ) ) )
            // InternalBlockchain.g:5767:2: ( ( ruleEString ) )
            {
            // InternalBlockchain.g:5767:2: ( ( ruleEString ) )
            // InternalBlockchain.g:5768:3: ( ruleEString )
            {
             before(grammarAccess.getExpresionAritmeticaAccess().getLadoIzqSentenciaCrossReference_2_0()); 
            // InternalBlockchain.g:5769:3: ( ruleEString )
            // InternalBlockchain.g:5770:4: ruleEString
            {
             before(grammarAccess.getExpresionAritmeticaAccess().getLadoIzqSentenciaEStringParserRuleCall_2_0_1()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getExpresionAritmeticaAccess().getLadoIzqSentenciaEStringParserRuleCall_2_0_1()); 

            }

             after(grammarAccess.getExpresionAritmeticaAccess().getLadoIzqSentenciaCrossReference_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExpresionAritmetica__LadoIzqAssignment_2"


    // $ANTLR start "rule__ExpresionAritmetica__OperadorAssignment_3"
    // InternalBlockchain.g:5781:1: rule__ExpresionAritmetica__OperadorAssignment_3 : ( ruleOperador ) ;
    public final void rule__ExpresionAritmetica__OperadorAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBlockchain.g:5785:1: ( ( ruleOperador ) )
            // InternalBlockchain.g:5786:2: ( ruleOperador )
            {
            // InternalBlockchain.g:5786:2: ( ruleOperador )
            // InternalBlockchain.g:5787:3: ruleOperador
            {
             before(grammarAccess.getExpresionAritmeticaAccess().getOperadorOperadorEnumRuleCall_3_0()); 
            pushFollow(FOLLOW_2);
            ruleOperador();

            state._fsp--;

             after(grammarAccess.getExpresionAritmeticaAccess().getOperadorOperadorEnumRuleCall_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExpresionAritmetica__OperadorAssignment_3"


    // $ANTLR start "rule__ExpresionAritmetica__LadoDerAssignment_4"
    // InternalBlockchain.g:5796:1: rule__ExpresionAritmetica__LadoDerAssignment_4 : ( ( ruleEString ) ) ;
    public final void rule__ExpresionAritmetica__LadoDerAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBlockchain.g:5800:1: ( ( ( ruleEString ) ) )
            // InternalBlockchain.g:5801:2: ( ( ruleEString ) )
            {
            // InternalBlockchain.g:5801:2: ( ( ruleEString ) )
            // InternalBlockchain.g:5802:3: ( ruleEString )
            {
             before(grammarAccess.getExpresionAritmeticaAccess().getLadoDerSentenciaCrossReference_4_0()); 
            // InternalBlockchain.g:5803:3: ( ruleEString )
            // InternalBlockchain.g:5804:4: ruleEString
            {
             before(grammarAccess.getExpresionAritmeticaAccess().getLadoDerSentenciaEStringParserRuleCall_4_0_1()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getExpresionAritmeticaAccess().getLadoDerSentenciaEStringParserRuleCall_4_0_1()); 

            }

             after(grammarAccess.getExpresionAritmeticaAccess().getLadoDerSentenciaCrossReference_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExpresionAritmetica__LadoDerAssignment_4"


    // $ANTLR start "rule__Variable__TipodatoAssignment_1"
    // InternalBlockchain.g:5815:1: rule__Variable__TipodatoAssignment_1 : ( ( ruleEString ) ) ;
    public final void rule__Variable__TipodatoAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBlockchain.g:5819:1: ( ( ( ruleEString ) ) )
            // InternalBlockchain.g:5820:2: ( ( ruleEString ) )
            {
            // InternalBlockchain.g:5820:2: ( ( ruleEString ) )
            // InternalBlockchain.g:5821:3: ( ruleEString )
            {
             before(grammarAccess.getVariableAccess().getTipodatoTipoDatoCrossReference_1_0()); 
            // InternalBlockchain.g:5822:3: ( ruleEString )
            // InternalBlockchain.g:5823:4: ruleEString
            {
             before(grammarAccess.getVariableAccess().getTipodatoTipoDatoEStringParserRuleCall_1_0_1()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getVariableAccess().getTipodatoTipoDatoEStringParserRuleCall_1_0_1()); 

            }

             after(grammarAccess.getVariableAccess().getTipodatoTipoDatoCrossReference_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Variable__TipodatoAssignment_1"


    // $ANTLR start "rule__Variable__NameAssignment_3"
    // InternalBlockchain.g:5834:1: rule__Variable__NameAssignment_3 : ( ruleEString ) ;
    public final void rule__Variable__NameAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBlockchain.g:5838:1: ( ( ruleEString ) )
            // InternalBlockchain.g:5839:2: ( ruleEString )
            {
            // InternalBlockchain.g:5839:2: ( ruleEString )
            // InternalBlockchain.g:5840:3: ruleEString
            {
             before(grammarAccess.getVariableAccess().getNameEStringParserRuleCall_3_0()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getVariableAccess().getNameEStringParserRuleCall_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Variable__NameAssignment_3"


    // $ANTLR start "rule__Condicional__TipoCondicionalAssignment_2_1"
    // InternalBlockchain.g:5849:1: rule__Condicional__TipoCondicionalAssignment_2_1 : ( ruleTipoCondicion ) ;
    public final void rule__Condicional__TipoCondicionalAssignment_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBlockchain.g:5853:1: ( ( ruleTipoCondicion ) )
            // InternalBlockchain.g:5854:2: ( ruleTipoCondicion )
            {
            // InternalBlockchain.g:5854:2: ( ruleTipoCondicion )
            // InternalBlockchain.g:5855:3: ruleTipoCondicion
            {
             before(grammarAccess.getCondicionalAccess().getTipoCondicionalTipoCondicionEnumRuleCall_2_1_0()); 
            pushFollow(FOLLOW_2);
            ruleTipoCondicion();

            state._fsp--;

             after(grammarAccess.getCondicionalAccess().getTipoCondicionalTipoCondicionEnumRuleCall_2_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Condicional__TipoCondicionalAssignment_2_1"


    // $ANTLR start "rule__Condicional__ExpresionlogicaAssignment_4"
    // InternalBlockchain.g:5864:1: rule__Condicional__ExpresionlogicaAssignment_4 : ( ruleExpresionLogica ) ;
    public final void rule__Condicional__ExpresionlogicaAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBlockchain.g:5868:1: ( ( ruleExpresionLogica ) )
            // InternalBlockchain.g:5869:2: ( ruleExpresionLogica )
            {
            // InternalBlockchain.g:5869:2: ( ruleExpresionLogica )
            // InternalBlockchain.g:5870:3: ruleExpresionLogica
            {
             before(grammarAccess.getCondicionalAccess().getExpresionlogicaExpresionLogicaParserRuleCall_4_0()); 
            pushFollow(FOLLOW_2);
            ruleExpresionLogica();

            state._fsp--;

             after(grammarAccess.getCondicionalAccess().getExpresionlogicaExpresionLogicaParserRuleCall_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Condicional__ExpresionlogicaAssignment_4"


    // $ANTLR start "rule__Condicional__SentenciasAssignment_7"
    // InternalBlockchain.g:5879:1: rule__Condicional__SentenciasAssignment_7 : ( ruleSentencia ) ;
    public final void rule__Condicional__SentenciasAssignment_7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBlockchain.g:5883:1: ( ( ruleSentencia ) )
            // InternalBlockchain.g:5884:2: ( ruleSentencia )
            {
            // InternalBlockchain.g:5884:2: ( ruleSentencia )
            // InternalBlockchain.g:5885:3: ruleSentencia
            {
             before(grammarAccess.getCondicionalAccess().getSentenciasSentenciaParserRuleCall_7_0()); 
            pushFollow(FOLLOW_2);
            ruleSentencia();

            state._fsp--;

             after(grammarAccess.getCondicionalAccess().getSentenciasSentenciaParserRuleCall_7_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Condicional__SentenciasAssignment_7"


    // $ANTLR start "rule__Condicional__SentenciasAssignment_8_1"
    // InternalBlockchain.g:5894:1: rule__Condicional__SentenciasAssignment_8_1 : ( ruleSentencia ) ;
    public final void rule__Condicional__SentenciasAssignment_8_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBlockchain.g:5898:1: ( ( ruleSentencia ) )
            // InternalBlockchain.g:5899:2: ( ruleSentencia )
            {
            // InternalBlockchain.g:5899:2: ( ruleSentencia )
            // InternalBlockchain.g:5900:3: ruleSentencia
            {
             before(grammarAccess.getCondicionalAccess().getSentenciasSentenciaParserRuleCall_8_1_0()); 
            pushFollow(FOLLOW_2);
            ruleSentencia();

            state._fsp--;

             after(grammarAccess.getCondicionalAccess().getSentenciasSentenciaParserRuleCall_8_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Condicional__SentenciasAssignment_8_1"


    // $ANTLR start "rule__Condicional__ElseAssignment_10_2"
    // InternalBlockchain.g:5909:1: rule__Condicional__ElseAssignment_10_2 : ( ruleCondicional ) ;
    public final void rule__Condicional__ElseAssignment_10_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBlockchain.g:5913:1: ( ( ruleCondicional ) )
            // InternalBlockchain.g:5914:2: ( ruleCondicional )
            {
            // InternalBlockchain.g:5914:2: ( ruleCondicional )
            // InternalBlockchain.g:5915:3: ruleCondicional
            {
             before(grammarAccess.getCondicionalAccess().getElseCondicionalParserRuleCall_10_2_0()); 
            pushFollow(FOLLOW_2);
            ruleCondicional();

            state._fsp--;

             after(grammarAccess.getCondicionalAccess().getElseCondicionalParserRuleCall_10_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Condicional__ElseAssignment_10_2"


    // $ANTLR start "rule__Condicional__ElseAssignment_10_3_1"
    // InternalBlockchain.g:5924:1: rule__Condicional__ElseAssignment_10_3_1 : ( ruleCondicional ) ;
    public final void rule__Condicional__ElseAssignment_10_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBlockchain.g:5928:1: ( ( ruleCondicional ) )
            // InternalBlockchain.g:5929:2: ( ruleCondicional )
            {
            // InternalBlockchain.g:5929:2: ( ruleCondicional )
            // InternalBlockchain.g:5930:3: ruleCondicional
            {
             before(grammarAccess.getCondicionalAccess().getElseCondicionalParserRuleCall_10_3_1_0()); 
            pushFollow(FOLLOW_2);
            ruleCondicional();

            state._fsp--;

             after(grammarAccess.getCondicionalAccess().getElseCondicionalParserRuleCall_10_3_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Condicional__ElseAssignment_10_3_1"


    // $ANTLR start "rule__ExpresionNumerica__ValueAssignment_2"
    // InternalBlockchain.g:5939:1: rule__ExpresionNumerica__ValueAssignment_2 : ( ruleEDouble ) ;
    public final void rule__ExpresionNumerica__ValueAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBlockchain.g:5943:1: ( ( ruleEDouble ) )
            // InternalBlockchain.g:5944:2: ( ruleEDouble )
            {
            // InternalBlockchain.g:5944:2: ( ruleEDouble )
            // InternalBlockchain.g:5945:3: ruleEDouble
            {
             before(grammarAccess.getExpresionNumericaAccess().getValueEDoubleParserRuleCall_2_0()); 
            pushFollow(FOLLOW_2);
            ruleEDouble();

            state._fsp--;

             after(grammarAccess.getExpresionNumericaAccess().getValueEDoubleParserRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExpresionNumerica__ValueAssignment_2"


    // $ANTLR start "rule__ExpresionReferenciada__IdAssignment_2_1"
    // InternalBlockchain.g:5954:1: rule__ExpresionReferenciada__IdAssignment_2_1 : ( ruleEInt ) ;
    public final void rule__ExpresionReferenciada__IdAssignment_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBlockchain.g:5958:1: ( ( ruleEInt ) )
            // InternalBlockchain.g:5959:2: ( ruleEInt )
            {
            // InternalBlockchain.g:5959:2: ( ruleEInt )
            // InternalBlockchain.g:5960:3: ruleEInt
            {
             before(grammarAccess.getExpresionReferenciadaAccess().getIdEIntParserRuleCall_2_1_0()); 
            pushFollow(FOLLOW_2);
            ruleEInt();

            state._fsp--;

             after(grammarAccess.getExpresionReferenciadaAccess().getIdEIntParserRuleCall_2_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExpresionReferenciada__IdAssignment_2_1"


    // $ANTLR start "rule__ExpresionReferenciada__EntReferenciadaAssignment_3"
    // InternalBlockchain.g:5969:1: rule__ExpresionReferenciada__EntReferenciadaAssignment_3 : ( ( ruleEString ) ) ;
    public final void rule__ExpresionReferenciada__EntReferenciadaAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBlockchain.g:5973:1: ( ( ( ruleEString ) ) )
            // InternalBlockchain.g:5974:2: ( ( ruleEString ) )
            {
            // InternalBlockchain.g:5974:2: ( ( ruleEString ) )
            // InternalBlockchain.g:5975:3: ( ruleEString )
            {
             before(grammarAccess.getExpresionReferenciadaAccess().getEntReferenciadaEntidadCrossReference_3_0()); 
            // InternalBlockchain.g:5976:3: ( ruleEString )
            // InternalBlockchain.g:5977:4: ruleEString
            {
             before(grammarAccess.getExpresionReferenciadaAccess().getEntReferenciadaEntidadEStringParserRuleCall_3_0_1()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getExpresionReferenciadaAccess().getEntReferenciadaEntidadEStringParserRuleCall_3_0_1()); 

            }

             after(grammarAccess.getExpresionReferenciadaAccess().getEntReferenciadaEntidadCrossReference_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExpresionReferenciada__EntReferenciadaAssignment_3"


    // $ANTLR start "rule__ExpresionReferenciada__AtrReferenciadoAssignment_4"
    // InternalBlockchain.g:5988:1: rule__ExpresionReferenciada__AtrReferenciadoAssignment_4 : ( ( ruleEString ) ) ;
    public final void rule__ExpresionReferenciada__AtrReferenciadoAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBlockchain.g:5992:1: ( ( ( ruleEString ) ) )
            // InternalBlockchain.g:5993:2: ( ( ruleEString ) )
            {
            // InternalBlockchain.g:5993:2: ( ( ruleEString ) )
            // InternalBlockchain.g:5994:3: ( ruleEString )
            {
             before(grammarAccess.getExpresionReferenciadaAccess().getAtrReferenciadoAtributoCrossReference_4_0()); 
            // InternalBlockchain.g:5995:3: ( ruleEString )
            // InternalBlockchain.g:5996:4: ruleEString
            {
             before(grammarAccess.getExpresionReferenciadaAccess().getAtrReferenciadoAtributoEStringParserRuleCall_4_0_1()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getExpresionReferenciadaAccess().getAtrReferenciadoAtributoEStringParserRuleCall_4_0_1()); 

            }

             after(grammarAccess.getExpresionReferenciadaAccess().getAtrReferenciadoAtributoCrossReference_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExpresionReferenciada__AtrReferenciadoAssignment_4"


    // $ANTLR start "rule__ExpresionRelacional__IdAssignment_2_1"
    // InternalBlockchain.g:6007:1: rule__ExpresionRelacional__IdAssignment_2_1 : ( ruleEInt ) ;
    public final void rule__ExpresionRelacional__IdAssignment_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBlockchain.g:6011:1: ( ( ruleEInt ) )
            // InternalBlockchain.g:6012:2: ( ruleEInt )
            {
            // InternalBlockchain.g:6012:2: ( ruleEInt )
            // InternalBlockchain.g:6013:3: ruleEInt
            {
             before(grammarAccess.getExpresionRelacionalAccess().getIdEIntParserRuleCall_2_1_0()); 
            pushFollow(FOLLOW_2);
            ruleEInt();

            state._fsp--;

             after(grammarAccess.getExpresionRelacionalAccess().getIdEIntParserRuleCall_2_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExpresionRelacional__IdAssignment_2_1"


    // $ANTLR start "rule__ExpresionRelacional__LadoIzqAssignment_3"
    // InternalBlockchain.g:6022:1: rule__ExpresionRelacional__LadoIzqAssignment_3 : ( ( ruleEString ) ) ;
    public final void rule__ExpresionRelacional__LadoIzqAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBlockchain.g:6026:1: ( ( ( ruleEString ) ) )
            // InternalBlockchain.g:6027:2: ( ( ruleEString ) )
            {
            // InternalBlockchain.g:6027:2: ( ( ruleEString ) )
            // InternalBlockchain.g:6028:3: ( ruleEString )
            {
             before(grammarAccess.getExpresionRelacionalAccess().getLadoIzqSentenciaCrossReference_3_0()); 
            // InternalBlockchain.g:6029:3: ( ruleEString )
            // InternalBlockchain.g:6030:4: ruleEString
            {
             before(grammarAccess.getExpresionRelacionalAccess().getLadoIzqSentenciaEStringParserRuleCall_3_0_1()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getExpresionRelacionalAccess().getLadoIzqSentenciaEStringParserRuleCall_3_0_1()); 

            }

             after(grammarAccess.getExpresionRelacionalAccess().getLadoIzqSentenciaCrossReference_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExpresionRelacional__LadoIzqAssignment_3"


    // $ANTLR start "rule__ExpresionRelacional__OperadorRelacionalAssignment_4"
    // InternalBlockchain.g:6041:1: rule__ExpresionRelacional__OperadorRelacionalAssignment_4 : ( ruleOperadorRelacion ) ;
    public final void rule__ExpresionRelacional__OperadorRelacionalAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBlockchain.g:6045:1: ( ( ruleOperadorRelacion ) )
            // InternalBlockchain.g:6046:2: ( ruleOperadorRelacion )
            {
            // InternalBlockchain.g:6046:2: ( ruleOperadorRelacion )
            // InternalBlockchain.g:6047:3: ruleOperadorRelacion
            {
             before(grammarAccess.getExpresionRelacionalAccess().getOperadorRelacionalOperadorRelacionEnumRuleCall_4_0()); 
            pushFollow(FOLLOW_2);
            ruleOperadorRelacion();

            state._fsp--;

             after(grammarAccess.getExpresionRelacionalAccess().getOperadorRelacionalOperadorRelacionEnumRuleCall_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExpresionRelacional__OperadorRelacionalAssignment_4"


    // $ANTLR start "rule__ExpresionRelacional__LadoDerAssignment_5"
    // InternalBlockchain.g:6056:1: rule__ExpresionRelacional__LadoDerAssignment_5 : ( ( ruleEString ) ) ;
    public final void rule__ExpresionRelacional__LadoDerAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBlockchain.g:6060:1: ( ( ( ruleEString ) ) )
            // InternalBlockchain.g:6061:2: ( ( ruleEString ) )
            {
            // InternalBlockchain.g:6061:2: ( ( ruleEString ) )
            // InternalBlockchain.g:6062:3: ( ruleEString )
            {
             before(grammarAccess.getExpresionRelacionalAccess().getLadoDerSentenciaCrossReference_5_0()); 
            // InternalBlockchain.g:6063:3: ( ruleEString )
            // InternalBlockchain.g:6064:4: ruleEString
            {
             before(grammarAccess.getExpresionRelacionalAccess().getLadoDerSentenciaEStringParserRuleCall_5_0_1()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getExpresionRelacionalAccess().getLadoDerSentenciaEStringParserRuleCall_5_0_1()); 

            }

             after(grammarAccess.getExpresionRelacionalAccess().getLadoDerSentenciaCrossReference_5_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExpresionRelacional__LadoDerAssignment_5"


    // $ANTLR start "rule__Primitivo__TipoAssignment_1"
    // InternalBlockchain.g:6075:1: rule__Primitivo__TipoAssignment_1 : ( ruleDatoPrimitivo ) ;
    public final void rule__Primitivo__TipoAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBlockchain.g:6079:1: ( ( ruleDatoPrimitivo ) )
            // InternalBlockchain.g:6080:2: ( ruleDatoPrimitivo )
            {
            // InternalBlockchain.g:6080:2: ( ruleDatoPrimitivo )
            // InternalBlockchain.g:6081:3: ruleDatoPrimitivo
            {
             before(grammarAccess.getPrimitivoAccess().getTipoDatoPrimitivoEnumRuleCall_1_0()); 
            pushFollow(FOLLOW_2);
            ruleDatoPrimitivo();

            state._fsp--;

             after(grammarAccess.getPrimitivoAccess().getTipoDatoPrimitivoEnumRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Primitivo__TipoAssignment_1"


    // $ANTLR start "rule__Primitivo__NameAssignment_2"
    // InternalBlockchain.g:6090:1: rule__Primitivo__NameAssignment_2 : ( ruleEString ) ;
    public final void rule__Primitivo__NameAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBlockchain.g:6094:1: ( ( ruleEString ) )
            // InternalBlockchain.g:6095:2: ( ruleEString )
            {
            // InternalBlockchain.g:6095:2: ( ruleEString )
            // InternalBlockchain.g:6096:3: ruleEString
            {
             before(grammarAccess.getPrimitivoAccess().getNameEStringParserRuleCall_2_0()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getPrimitivoAccess().getNameEStringParserRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Primitivo__NameAssignment_2"


    // $ANTLR start "rule__Mapa__NameAssignment_0"
    // InternalBlockchain.g:6105:1: rule__Mapa__NameAssignment_0 : ( ruleEString ) ;
    public final void rule__Mapa__NameAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBlockchain.g:6109:1: ( ( ruleEString ) )
            // InternalBlockchain.g:6110:2: ( ruleEString )
            {
            // InternalBlockchain.g:6110:2: ( ruleEString )
            // InternalBlockchain.g:6111:3: ruleEString
            {
             before(grammarAccess.getMapaAccess().getNameEStringParserRuleCall_0_0()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getMapaAccess().getNameEStringParserRuleCall_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Mapa__NameAssignment_0"


    // $ANTLR start "rule__Mapa__TipoDatoKeyAssignment_4"
    // InternalBlockchain.g:6120:1: rule__Mapa__TipoDatoKeyAssignment_4 : ( ( ruleEString ) ) ;
    public final void rule__Mapa__TipoDatoKeyAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBlockchain.g:6124:1: ( ( ( ruleEString ) ) )
            // InternalBlockchain.g:6125:2: ( ( ruleEString ) )
            {
            // InternalBlockchain.g:6125:2: ( ( ruleEString ) )
            // InternalBlockchain.g:6126:3: ( ruleEString )
            {
             before(grammarAccess.getMapaAccess().getTipoDatoKeyTipoDatoCrossReference_4_0()); 
            // InternalBlockchain.g:6127:3: ( ruleEString )
            // InternalBlockchain.g:6128:4: ruleEString
            {
             before(grammarAccess.getMapaAccess().getTipoDatoKeyTipoDatoEStringParserRuleCall_4_0_1()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getMapaAccess().getTipoDatoKeyTipoDatoEStringParserRuleCall_4_0_1()); 

            }

             after(grammarAccess.getMapaAccess().getTipoDatoKeyTipoDatoCrossReference_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Mapa__TipoDatoKeyAssignment_4"


    // $ANTLR start "rule__Mapa__TipoDatoValueAssignment_6"
    // InternalBlockchain.g:6139:1: rule__Mapa__TipoDatoValueAssignment_6 : ( ( ruleEString ) ) ;
    public final void rule__Mapa__TipoDatoValueAssignment_6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBlockchain.g:6143:1: ( ( ( ruleEString ) ) )
            // InternalBlockchain.g:6144:2: ( ( ruleEString ) )
            {
            // InternalBlockchain.g:6144:2: ( ( ruleEString ) )
            // InternalBlockchain.g:6145:3: ( ruleEString )
            {
             before(grammarAccess.getMapaAccess().getTipoDatoValueTipoDatoCrossReference_6_0()); 
            // InternalBlockchain.g:6146:3: ( ruleEString )
            // InternalBlockchain.g:6147:4: ruleEString
            {
             before(grammarAccess.getMapaAccess().getTipoDatoValueTipoDatoEStringParserRuleCall_6_0_1()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getMapaAccess().getTipoDatoValueTipoDatoEStringParserRuleCall_6_0_1()); 

            }

             after(grammarAccess.getMapaAccess().getTipoDatoValueTipoDatoCrossReference_6_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Mapa__TipoDatoValueAssignment_6"

    // Delegated rules


    protected DFA2 dfa2 = new DFA2(this);
    protected DFA17 dfa17 = new DFA17(this);
    static final String dfa_1s = "\17\uffff";
    static final String dfa_2s = "\1\uffff\2\14\14\uffff";
    static final String dfa_3s = "\3\4\14\uffff";
    static final String dfa_4s = "\3\74\14\uffff";
    static final String dfa_5s = "\3\uffff\1\2\1\3\1\4\1\6\1\7\1\11\1\12\1\13\1\5\1\10\2\1";
    static final String dfa_6s = "\17\uffff}>";
    static final String[] dfa_7s = {
            "\1\1\1\2\6\uffff\2\10\43\uffff\1\3\1\4\1\5\2\uffff\1\6\3\uffff\1\7\1\11\1\12",
            "\1\15\1\16\6\uffff\2\14\12\uffff\7\5\7\uffff\2\14\11\uffff\3\14\1\13\1\uffff\1\14\3\uffff\3\14",
            "\1\15\1\16\6\uffff\2\14\12\uffff\7\5\7\uffff\2\14\11\uffff\3\14\1\13\1\uffff\1\14\3\uffff\3\14",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            ""
    };

    static final short[] dfa_1 = DFA.unpackEncodedString(dfa_1s);
    static final short[] dfa_2 = DFA.unpackEncodedString(dfa_2s);
    static final char[] dfa_3 = DFA.unpackEncodedStringToUnsignedChars(dfa_3s);
    static final char[] dfa_4 = DFA.unpackEncodedStringToUnsignedChars(dfa_4s);
    static final short[] dfa_5 = DFA.unpackEncodedString(dfa_5s);
    static final short[] dfa_6 = DFA.unpackEncodedString(dfa_6s);
    static final short[][] dfa_7 = unpackEncodedStringArray(dfa_7s);

    class DFA2 extends DFA {

        public DFA2(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 2;
            this.eot = dfa_1;
            this.eof = dfa_2;
            this.min = dfa_3;
            this.max = dfa_4;
            this.accept = dfa_5;
            this.special = dfa_6;
            this.transition = dfa_7;
        }
        public String getDescription() {
            return "709:1: rule__Sentencia__Alternatives : ( ( ruleParametro ) | ( ruleEstado ) | ( ruleExpresionLogica ) | ( ruleExpresionAritmetica ) | ( ruleVariable ) | ( ruleCondicional ) | ( ruleExpresionNumerica ) | ( ruleEString ) | ( ruleEBoolean ) | ( ruleExpresionReferenciada ) | ( ruleExpresionRelacional ) );";
        }
    }
    static final String dfa_8s = "\1\46\1\uffff\1\4\2\45\3\4\1\uffff\6\4";
    static final String dfa_9s = "\1\61\1\uffff\1\5\2\45\1\46\2\5\1\uffff\2\46\2\5\2\46";
    static final String dfa_10s = "\1\uffff\1\2\6\uffff\1\1\6\uffff";
    static final String[] dfa_11s = {
            "\1\1\3\uffff\1\2\1\1\5\uffff\1\1",
            "",
            "\1\3\1\4",
            "\1\5",
            "\1\5",
            "\1\6\1\7\40\uffff\1\10",
            "\1\11\1\12",
            "\1\11\1\12",
            "",
            "\1\13\1\14\40\uffff\1\10",
            "\1\13\1\14\40\uffff\1\10",
            "\1\15\1\16",
            "\1\15\1\16",
            "\1\13\1\14\40\uffff\1\10",
            "\1\13\1\14\40\uffff\1\10"
    };
    static final char[] dfa_8 = DFA.unpackEncodedStringToUnsignedChars(dfa_8s);
    static final char[] dfa_9 = DFA.unpackEncodedStringToUnsignedChars(dfa_9s);
    static final short[] dfa_10 = DFA.unpackEncodedString(dfa_10s);
    static final short[][] dfa_11 = unpackEncodedStringArray(dfa_11s);

    class DFA17 extends DFA {

        public DFA17(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 17;
            this.eot = dfa_1;
            this.eof = dfa_1;
            this.min = dfa_8;
            this.max = dfa_9;
            this.accept = dfa_10;
            this.special = dfa_6;
            this.transition = dfa_11;
        }
        public String getDescription() {
            return "()* loopback of 1669:2: ( rule__SmartContract__EntidadesAssignment_3_1 )*";
        }
    }
 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000001000000000L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000000030L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000002000000000L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000034000000000L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000010000000002L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000008000000000L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000008000000002L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000020000000000L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000040E00000030L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x00020C4000000000L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000040000000002L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0002000000000002L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000080000000002L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000040000000000L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0002000000000000L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x0000080000000000L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x0000004000000030L});
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x0000000000000032L});
    public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x0000800000000000L});
    public static final BitSet FOLLOW_22 = new BitSet(new long[]{0x0000800000000002L});
    public static final BitSet FOLLOW_23 = new BitSet(new long[]{0x0000100000000000L});
    public static final BitSet FOLLOW_24 = new BitSet(new long[]{0x0000200000000030L});
    public static final BitSet FOLLOW_25 = new BitSet(new long[]{0x0001002000000000L});
    public static final BitSet FOLLOW_26 = new BitSet(new long[]{0x1C4E404000003030L});
    public static final BitSet FOLLOW_27 = new BitSet(new long[]{0x0000000000003000L});
    public static final BitSet FOLLOW_28 = new BitSet(new long[]{0x1C4E000000003030L});
    public static final BitSet FOLLOW_29 = new BitSet(new long[]{0x1C4E000000003032L});
    public static final BitSet FOLLOW_30 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_31 = new BitSet(new long[]{0x0008100000000030L});
    public static final BitSet FOLLOW_32 = new BitSet(new long[]{0x0000000000FF0000L});
    public static final BitSet FOLLOW_33 = new BitSet(new long[]{0x0000000000FF0002L});
    public static final BitSet FOLLOW_34 = new BitSet(new long[]{0x0000200000000000L});
    public static final BitSet FOLLOW_35 = new BitSet(new long[]{0x0000000002000040L});
    public static final BitSet FOLLOW_36 = new BitSet(new long[]{0x0008000000000030L});
    public static final BitSet FOLLOW_37 = new BitSet(new long[]{0x000000007F000000L});
    public static final BitSet FOLLOW_38 = new BitSet(new long[]{0x000000007F000002L});
    public static final BitSet FOLLOW_39 = new BitSet(new long[]{0x0010000000000000L});
    public static final BitSet FOLLOW_40 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_41 = new BitSet(new long[]{0x0020000000000000L});
    public static final BitSet FOLLOW_42 = new BitSet(new long[]{0x0280000000000000L});
    public static final BitSet FOLLOW_43 = new BitSet(new long[]{0x0004000000000000L});
    public static final BitSet FOLLOW_44 = new BitSet(new long[]{0x0100000000000000L});
    public static final BitSet FOLLOW_45 = new BitSet(new long[]{0x000000C000000000L});
    public static final BitSet FOLLOW_46 = new BitSet(new long[]{0x0000004100000000L});
    public static final BitSet FOLLOW_47 = new BitSet(new long[]{0x0000000180000000L});
    public static final BitSet FOLLOW_48 = new BitSet(new long[]{0x0040000000000000L});
    public static final BitSet FOLLOW_49 = new BitSet(new long[]{0x0400000000000000L});
    public static final BitSet FOLLOW_50 = new BitSet(new long[]{0x0000000002000840L});
    public static final BitSet FOLLOW_51 = new BitSet(new long[]{0x0800000000000000L});
    public static final BitSet FOLLOW_52 = new BitSet(new long[]{0x0000000000000830L});
    public static final BitSet FOLLOW_53 = new BitSet(new long[]{0x0000004000000000L});
    public static final BitSet FOLLOW_54 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_55 = new BitSet(new long[]{0x000000000000C000L});
    public static final BitSet FOLLOW_56 = new BitSet(new long[]{0x0000000E00000000L});
    public static final BitSet FOLLOW_57 = new BitSet(new long[]{0x0000000E00000002L});
    public static final BitSet FOLLOW_58 = new BitSet(new long[]{0x0001000000000000L});
    public static final BitSet FOLLOW_59 = new BitSet(new long[]{0x2000000000000000L});
    public static final BitSet FOLLOW_60 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_61 = new BitSet(new long[]{0x0000000000040000L});

}