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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_STRING", "RULE_ID", "RULE_INT", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'.'", "'true'", "'false'", "'E'", "'e'", "'=='", "'!='", "'>'", "'<'", "'>='", "'<='", "'&&'", "'||'", "'+'", "'-'", "'*'", "'/'", "'='", "'GET'", "'DELETE'", "'String'", "'uint'", "'Boolean'", "'address'", "'Aplicacion'", "'{'", "'}'", "'tipodato'", "'SmartContract'", "'Entidad'", "'Operacion'", "'('", "')'", "'return'", "'isUd='", "','", "':'", "'Estado'", "'ExpLog'", "'ExpArit'", "'var'", "'if'", "'else'", "'ExpNum'", "'ExpTex'", "'ExpBool'", "'ExpRef'", "'id'", "'ExpRel'", "'Map'"
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


    // $ANTLR start "entryRuleLinea"
    // InternalBlockchain.g:103:1: entryRuleLinea : ruleLinea EOF ;
    public final void entryRuleLinea() throws RecognitionException {
        try {
            // InternalBlockchain.g:104:1: ( ruleLinea EOF )
            // InternalBlockchain.g:105:1: ruleLinea EOF
            {
             before(grammarAccess.getLineaRule()); 
            pushFollow(FOLLOW_1);
            ruleLinea();

            state._fsp--;

             after(grammarAccess.getLineaRule()); 
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
    // $ANTLR end "entryRuleLinea"


    // $ANTLR start "ruleLinea"
    // InternalBlockchain.g:112:1: ruleLinea : ( ( rule__Linea__Alternatives ) ) ;
    public final void ruleLinea() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBlockchain.g:116:2: ( ( ( rule__Linea__Alternatives ) ) )
            // InternalBlockchain.g:117:2: ( ( rule__Linea__Alternatives ) )
            {
            // InternalBlockchain.g:117:2: ( ( rule__Linea__Alternatives ) )
            // InternalBlockchain.g:118:3: ( rule__Linea__Alternatives )
            {
             before(grammarAccess.getLineaAccess().getAlternatives()); 
            // InternalBlockchain.g:119:3: ( rule__Linea__Alternatives )
            // InternalBlockchain.g:119:4: rule__Linea__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__Linea__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getLineaAccess().getAlternatives()); 

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
    // $ANTLR end "ruleLinea"


    // $ANTLR start "entryRuleExpresion"
    // InternalBlockchain.g:128:1: entryRuleExpresion : ruleExpresion EOF ;
    public final void entryRuleExpresion() throws RecognitionException {
        try {
            // InternalBlockchain.g:129:1: ( ruleExpresion EOF )
            // InternalBlockchain.g:130:1: ruleExpresion EOF
            {
             before(grammarAccess.getExpresionRule()); 
            pushFollow(FOLLOW_1);
            ruleExpresion();

            state._fsp--;

             after(grammarAccess.getExpresionRule()); 
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
    // $ANTLR end "entryRuleExpresion"


    // $ANTLR start "ruleExpresion"
    // InternalBlockchain.g:137:1: ruleExpresion : ( ( rule__Expresion__Alternatives ) ) ;
    public final void ruleExpresion() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBlockchain.g:141:2: ( ( ( rule__Expresion__Alternatives ) ) )
            // InternalBlockchain.g:142:2: ( ( rule__Expresion__Alternatives ) )
            {
            // InternalBlockchain.g:142:2: ( ( rule__Expresion__Alternatives ) )
            // InternalBlockchain.g:143:3: ( rule__Expresion__Alternatives )
            {
             before(grammarAccess.getExpresionAccess().getAlternatives()); 
            // InternalBlockchain.g:144:3: ( rule__Expresion__Alternatives )
            // InternalBlockchain.g:144:4: rule__Expresion__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__Expresion__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getExpresionAccess().getAlternatives()); 

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
    // $ANTLR end "ruleExpresion"


    // $ANTLR start "entryRuleSmartContract"
    // InternalBlockchain.g:153:1: entryRuleSmartContract : ruleSmartContract EOF ;
    public final void entryRuleSmartContract() throws RecognitionException {
        try {
            // InternalBlockchain.g:154:1: ( ruleSmartContract EOF )
            // InternalBlockchain.g:155:1: ruleSmartContract EOF
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
    // InternalBlockchain.g:162:1: ruleSmartContract : ( ( rule__SmartContract__Group__0 ) ) ;
    public final void ruleSmartContract() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBlockchain.g:166:2: ( ( ( rule__SmartContract__Group__0 ) ) )
            // InternalBlockchain.g:167:2: ( ( rule__SmartContract__Group__0 ) )
            {
            // InternalBlockchain.g:167:2: ( ( rule__SmartContract__Group__0 ) )
            // InternalBlockchain.g:168:3: ( rule__SmartContract__Group__0 )
            {
             before(grammarAccess.getSmartContractAccess().getGroup()); 
            // InternalBlockchain.g:169:3: ( rule__SmartContract__Group__0 )
            // InternalBlockchain.g:169:4: rule__SmartContract__Group__0
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
    // InternalBlockchain.g:178:1: entryRuleEString : ruleEString EOF ;
    public final void entryRuleEString() throws RecognitionException {
        try {
            // InternalBlockchain.g:179:1: ( ruleEString EOF )
            // InternalBlockchain.g:180:1: ruleEString EOF
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
    // InternalBlockchain.g:187:1: ruleEString : ( ( rule__EString__Alternatives ) ) ;
    public final void ruleEString() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBlockchain.g:191:2: ( ( ( rule__EString__Alternatives ) ) )
            // InternalBlockchain.g:192:2: ( ( rule__EString__Alternatives ) )
            {
            // InternalBlockchain.g:192:2: ( ( rule__EString__Alternatives ) )
            // InternalBlockchain.g:193:3: ( rule__EString__Alternatives )
            {
             before(grammarAccess.getEStringAccess().getAlternatives()); 
            // InternalBlockchain.g:194:3: ( rule__EString__Alternatives )
            // InternalBlockchain.g:194:4: rule__EString__Alternatives
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
    // InternalBlockchain.g:203:1: entryRuleEntidad : ruleEntidad EOF ;
    public final void entryRuleEntidad() throws RecognitionException {
        try {
            // InternalBlockchain.g:204:1: ( ruleEntidad EOF )
            // InternalBlockchain.g:205:1: ruleEntidad EOF
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
    // InternalBlockchain.g:212:1: ruleEntidad : ( ( rule__Entidad__Group__0 ) ) ;
    public final void ruleEntidad() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBlockchain.g:216:2: ( ( ( rule__Entidad__Group__0 ) ) )
            // InternalBlockchain.g:217:2: ( ( rule__Entidad__Group__0 ) )
            {
            // InternalBlockchain.g:217:2: ( ( rule__Entidad__Group__0 ) )
            // InternalBlockchain.g:218:3: ( rule__Entidad__Group__0 )
            {
             before(grammarAccess.getEntidadAccess().getGroup()); 
            // InternalBlockchain.g:219:3: ( rule__Entidad__Group__0 )
            // InternalBlockchain.g:219:4: rule__Entidad__Group__0
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
    // InternalBlockchain.g:228:1: entryRuleOperacion : ruleOperacion EOF ;
    public final void entryRuleOperacion() throws RecognitionException {
        try {
            // InternalBlockchain.g:229:1: ( ruleOperacion EOF )
            // InternalBlockchain.g:230:1: ruleOperacion EOF
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
    // InternalBlockchain.g:237:1: ruleOperacion : ( ( rule__Operacion__Group__0 ) ) ;
    public final void ruleOperacion() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBlockchain.g:241:2: ( ( ( rule__Operacion__Group__0 ) ) )
            // InternalBlockchain.g:242:2: ( ( rule__Operacion__Group__0 ) )
            {
            // InternalBlockchain.g:242:2: ( ( rule__Operacion__Group__0 ) )
            // InternalBlockchain.g:243:3: ( rule__Operacion__Group__0 )
            {
             before(grammarAccess.getOperacionAccess().getGroup()); 
            // InternalBlockchain.g:244:3: ( rule__Operacion__Group__0 )
            // InternalBlockchain.g:244:4: rule__Operacion__Group__0
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
    // InternalBlockchain.g:253:1: entryRuleEstado : ruleEstado EOF ;
    public final void entryRuleEstado() throws RecognitionException {
        try {
            // InternalBlockchain.g:254:1: ( ruleEstado EOF )
            // InternalBlockchain.g:255:1: ruleEstado EOF
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
    // InternalBlockchain.g:262:1: ruleEstado : ( ( rule__Estado__Group__0 ) ) ;
    public final void ruleEstado() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBlockchain.g:266:2: ( ( ( rule__Estado__Group__0 ) ) )
            // InternalBlockchain.g:267:2: ( ( rule__Estado__Group__0 ) )
            {
            // InternalBlockchain.g:267:2: ( ( rule__Estado__Group__0 ) )
            // InternalBlockchain.g:268:3: ( rule__Estado__Group__0 )
            {
             before(grammarAccess.getEstadoAccess().getGroup()); 
            // InternalBlockchain.g:269:3: ( rule__Estado__Group__0 )
            // InternalBlockchain.g:269:4: rule__Estado__Group__0
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
    // InternalBlockchain.g:278:1: entryRuleAtributo : ruleAtributo EOF ;
    public final void entryRuleAtributo() throws RecognitionException {
        try {
            // InternalBlockchain.g:279:1: ( ruleAtributo EOF )
            // InternalBlockchain.g:280:1: ruleAtributo EOF
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
    // InternalBlockchain.g:287:1: ruleAtributo : ( ( rule__Atributo__Group__0 ) ) ;
    public final void ruleAtributo() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBlockchain.g:291:2: ( ( ( rule__Atributo__Group__0 ) ) )
            // InternalBlockchain.g:292:2: ( ( rule__Atributo__Group__0 ) )
            {
            // InternalBlockchain.g:292:2: ( ( rule__Atributo__Group__0 ) )
            // InternalBlockchain.g:293:3: ( rule__Atributo__Group__0 )
            {
             before(grammarAccess.getAtributoAccess().getGroup()); 
            // InternalBlockchain.g:294:3: ( rule__Atributo__Group__0 )
            // InternalBlockchain.g:294:4: rule__Atributo__Group__0
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
    // InternalBlockchain.g:303:1: entryRuleParametro : ruleParametro EOF ;
    public final void entryRuleParametro() throws RecognitionException {
        try {
            // InternalBlockchain.g:304:1: ( ruleParametro EOF )
            // InternalBlockchain.g:305:1: ruleParametro EOF
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
    // InternalBlockchain.g:312:1: ruleParametro : ( ( rule__Parametro__Group__0 ) ) ;
    public final void ruleParametro() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBlockchain.g:316:2: ( ( ( rule__Parametro__Group__0 ) ) )
            // InternalBlockchain.g:317:2: ( ( rule__Parametro__Group__0 ) )
            {
            // InternalBlockchain.g:317:2: ( ( rule__Parametro__Group__0 ) )
            // InternalBlockchain.g:318:3: ( rule__Parametro__Group__0 )
            {
             before(grammarAccess.getParametroAccess().getGroup()); 
            // InternalBlockchain.g:319:3: ( rule__Parametro__Group__0 )
            // InternalBlockchain.g:319:4: rule__Parametro__Group__0
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
    // InternalBlockchain.g:328:1: entryRuleEBoolean : ruleEBoolean EOF ;
    public final void entryRuleEBoolean() throws RecognitionException {
        try {
            // InternalBlockchain.g:329:1: ( ruleEBoolean EOF )
            // InternalBlockchain.g:330:1: ruleEBoolean EOF
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
    // InternalBlockchain.g:337:1: ruleEBoolean : ( ( rule__EBoolean__Alternatives ) ) ;
    public final void ruleEBoolean() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBlockchain.g:341:2: ( ( ( rule__EBoolean__Alternatives ) ) )
            // InternalBlockchain.g:342:2: ( ( rule__EBoolean__Alternatives ) )
            {
            // InternalBlockchain.g:342:2: ( ( rule__EBoolean__Alternatives ) )
            // InternalBlockchain.g:343:3: ( rule__EBoolean__Alternatives )
            {
             before(grammarAccess.getEBooleanAccess().getAlternatives()); 
            // InternalBlockchain.g:344:3: ( rule__EBoolean__Alternatives )
            // InternalBlockchain.g:344:4: rule__EBoolean__Alternatives
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
    // InternalBlockchain.g:353:1: entryRuleExpresionLogica : ruleExpresionLogica EOF ;
    public final void entryRuleExpresionLogica() throws RecognitionException {
        try {
            // InternalBlockchain.g:354:1: ( ruleExpresionLogica EOF )
            // InternalBlockchain.g:355:1: ruleExpresionLogica EOF
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
    // InternalBlockchain.g:362:1: ruleExpresionLogica : ( ( rule__ExpresionLogica__Group__0 ) ) ;
    public final void ruleExpresionLogica() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBlockchain.g:366:2: ( ( ( rule__ExpresionLogica__Group__0 ) ) )
            // InternalBlockchain.g:367:2: ( ( rule__ExpresionLogica__Group__0 ) )
            {
            // InternalBlockchain.g:367:2: ( ( rule__ExpresionLogica__Group__0 ) )
            // InternalBlockchain.g:368:3: ( rule__ExpresionLogica__Group__0 )
            {
             before(grammarAccess.getExpresionLogicaAccess().getGroup()); 
            // InternalBlockchain.g:369:3: ( rule__ExpresionLogica__Group__0 )
            // InternalBlockchain.g:369:4: rule__ExpresionLogica__Group__0
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
    // InternalBlockchain.g:378:1: entryRuleExpresionAritmetica : ruleExpresionAritmetica EOF ;
    public final void entryRuleExpresionAritmetica() throws RecognitionException {
        try {
            // InternalBlockchain.g:379:1: ( ruleExpresionAritmetica EOF )
            // InternalBlockchain.g:380:1: ruleExpresionAritmetica EOF
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
    // InternalBlockchain.g:387:1: ruleExpresionAritmetica : ( ( rule__ExpresionAritmetica__Group__0 ) ) ;
    public final void ruleExpresionAritmetica() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBlockchain.g:391:2: ( ( ( rule__ExpresionAritmetica__Group__0 ) ) )
            // InternalBlockchain.g:392:2: ( ( rule__ExpresionAritmetica__Group__0 ) )
            {
            // InternalBlockchain.g:392:2: ( ( rule__ExpresionAritmetica__Group__0 ) )
            // InternalBlockchain.g:393:3: ( rule__ExpresionAritmetica__Group__0 )
            {
             before(grammarAccess.getExpresionAritmeticaAccess().getGroup()); 
            // InternalBlockchain.g:394:3: ( rule__ExpresionAritmetica__Group__0 )
            // InternalBlockchain.g:394:4: rule__ExpresionAritmetica__Group__0
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
    // InternalBlockchain.g:403:1: entryRuleVariable : ruleVariable EOF ;
    public final void entryRuleVariable() throws RecognitionException {
        try {
            // InternalBlockchain.g:404:1: ( ruleVariable EOF )
            // InternalBlockchain.g:405:1: ruleVariable EOF
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
    // InternalBlockchain.g:412:1: ruleVariable : ( ( rule__Variable__Group__0 ) ) ;
    public final void ruleVariable() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBlockchain.g:416:2: ( ( ( rule__Variable__Group__0 ) ) )
            // InternalBlockchain.g:417:2: ( ( rule__Variable__Group__0 ) )
            {
            // InternalBlockchain.g:417:2: ( ( rule__Variable__Group__0 ) )
            // InternalBlockchain.g:418:3: ( rule__Variable__Group__0 )
            {
             before(grammarAccess.getVariableAccess().getGroup()); 
            // InternalBlockchain.g:419:3: ( rule__Variable__Group__0 )
            // InternalBlockchain.g:419:4: rule__Variable__Group__0
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
    // InternalBlockchain.g:428:1: entryRuleCondicional : ruleCondicional EOF ;
    public final void entryRuleCondicional() throws RecognitionException {
        try {
            // InternalBlockchain.g:429:1: ( ruleCondicional EOF )
            // InternalBlockchain.g:430:1: ruleCondicional EOF
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
    // InternalBlockchain.g:437:1: ruleCondicional : ( ( rule__Condicional__Group__0 ) ) ;
    public final void ruleCondicional() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBlockchain.g:441:2: ( ( ( rule__Condicional__Group__0 ) ) )
            // InternalBlockchain.g:442:2: ( ( rule__Condicional__Group__0 ) )
            {
            // InternalBlockchain.g:442:2: ( ( rule__Condicional__Group__0 ) )
            // InternalBlockchain.g:443:3: ( rule__Condicional__Group__0 )
            {
             before(grammarAccess.getCondicionalAccess().getGroup()); 
            // InternalBlockchain.g:444:3: ( rule__Condicional__Group__0 )
            // InternalBlockchain.g:444:4: rule__Condicional__Group__0
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


    // $ANTLR start "entryRuleElse"
    // InternalBlockchain.g:453:1: entryRuleElse : ruleElse EOF ;
    public final void entryRuleElse() throws RecognitionException {
        try {
            // InternalBlockchain.g:454:1: ( ruleElse EOF )
            // InternalBlockchain.g:455:1: ruleElse EOF
            {
             before(grammarAccess.getElseRule()); 
            pushFollow(FOLLOW_1);
            ruleElse();

            state._fsp--;

             after(grammarAccess.getElseRule()); 
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
    // $ANTLR end "entryRuleElse"


    // $ANTLR start "ruleElse"
    // InternalBlockchain.g:462:1: ruleElse : ( ( rule__Else__Group__0 ) ) ;
    public final void ruleElse() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBlockchain.g:466:2: ( ( ( rule__Else__Group__0 ) ) )
            // InternalBlockchain.g:467:2: ( ( rule__Else__Group__0 ) )
            {
            // InternalBlockchain.g:467:2: ( ( rule__Else__Group__0 ) )
            // InternalBlockchain.g:468:3: ( rule__Else__Group__0 )
            {
             before(grammarAccess.getElseAccess().getGroup()); 
            // InternalBlockchain.g:469:3: ( rule__Else__Group__0 )
            // InternalBlockchain.g:469:4: rule__Else__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Else__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getElseAccess().getGroup()); 

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
    // $ANTLR end "ruleElse"


    // $ANTLR start "entryRuleExpresionNumerica"
    // InternalBlockchain.g:478:1: entryRuleExpresionNumerica : ruleExpresionNumerica EOF ;
    public final void entryRuleExpresionNumerica() throws RecognitionException {
        try {
            // InternalBlockchain.g:479:1: ( ruleExpresionNumerica EOF )
            // InternalBlockchain.g:480:1: ruleExpresionNumerica EOF
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
    // InternalBlockchain.g:487:1: ruleExpresionNumerica : ( ( rule__ExpresionNumerica__Group__0 ) ) ;
    public final void ruleExpresionNumerica() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBlockchain.g:491:2: ( ( ( rule__ExpresionNumerica__Group__0 ) ) )
            // InternalBlockchain.g:492:2: ( ( rule__ExpresionNumerica__Group__0 ) )
            {
            // InternalBlockchain.g:492:2: ( ( rule__ExpresionNumerica__Group__0 ) )
            // InternalBlockchain.g:493:3: ( rule__ExpresionNumerica__Group__0 )
            {
             before(grammarAccess.getExpresionNumericaAccess().getGroup()); 
            // InternalBlockchain.g:494:3: ( rule__ExpresionNumerica__Group__0 )
            // InternalBlockchain.g:494:4: rule__ExpresionNumerica__Group__0
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


    // $ANTLR start "entryRuleExpresionTexto"
    // InternalBlockchain.g:503:1: entryRuleExpresionTexto : ruleExpresionTexto EOF ;
    public final void entryRuleExpresionTexto() throws RecognitionException {
        try {
            // InternalBlockchain.g:504:1: ( ruleExpresionTexto EOF )
            // InternalBlockchain.g:505:1: ruleExpresionTexto EOF
            {
             before(grammarAccess.getExpresionTextoRule()); 
            pushFollow(FOLLOW_1);
            ruleExpresionTexto();

            state._fsp--;

             after(grammarAccess.getExpresionTextoRule()); 
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
    // $ANTLR end "entryRuleExpresionTexto"


    // $ANTLR start "ruleExpresionTexto"
    // InternalBlockchain.g:512:1: ruleExpresionTexto : ( ( rule__ExpresionTexto__Group__0 ) ) ;
    public final void ruleExpresionTexto() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBlockchain.g:516:2: ( ( ( rule__ExpresionTexto__Group__0 ) ) )
            // InternalBlockchain.g:517:2: ( ( rule__ExpresionTexto__Group__0 ) )
            {
            // InternalBlockchain.g:517:2: ( ( rule__ExpresionTexto__Group__0 ) )
            // InternalBlockchain.g:518:3: ( rule__ExpresionTexto__Group__0 )
            {
             before(grammarAccess.getExpresionTextoAccess().getGroup()); 
            // InternalBlockchain.g:519:3: ( rule__ExpresionTexto__Group__0 )
            // InternalBlockchain.g:519:4: rule__ExpresionTexto__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__ExpresionTexto__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getExpresionTextoAccess().getGroup()); 

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
    // $ANTLR end "ruleExpresionTexto"


    // $ANTLR start "entryRuleExpresionBoolean"
    // InternalBlockchain.g:528:1: entryRuleExpresionBoolean : ruleExpresionBoolean EOF ;
    public final void entryRuleExpresionBoolean() throws RecognitionException {
        try {
            // InternalBlockchain.g:529:1: ( ruleExpresionBoolean EOF )
            // InternalBlockchain.g:530:1: ruleExpresionBoolean EOF
            {
             before(grammarAccess.getExpresionBooleanRule()); 
            pushFollow(FOLLOW_1);
            ruleExpresionBoolean();

            state._fsp--;

             after(grammarAccess.getExpresionBooleanRule()); 
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
    // $ANTLR end "entryRuleExpresionBoolean"


    // $ANTLR start "ruleExpresionBoolean"
    // InternalBlockchain.g:537:1: ruleExpresionBoolean : ( ( rule__ExpresionBoolean__Group__0 ) ) ;
    public final void ruleExpresionBoolean() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBlockchain.g:541:2: ( ( ( rule__ExpresionBoolean__Group__0 ) ) )
            // InternalBlockchain.g:542:2: ( ( rule__ExpresionBoolean__Group__0 ) )
            {
            // InternalBlockchain.g:542:2: ( ( rule__ExpresionBoolean__Group__0 ) )
            // InternalBlockchain.g:543:3: ( rule__ExpresionBoolean__Group__0 )
            {
             before(grammarAccess.getExpresionBooleanAccess().getGroup()); 
            // InternalBlockchain.g:544:3: ( rule__ExpresionBoolean__Group__0 )
            // InternalBlockchain.g:544:4: rule__ExpresionBoolean__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__ExpresionBoolean__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getExpresionBooleanAccess().getGroup()); 

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
    // $ANTLR end "ruleExpresionBoolean"


    // $ANTLR start "entryRuleExpresionReferenciada"
    // InternalBlockchain.g:553:1: entryRuleExpresionReferenciada : ruleExpresionReferenciada EOF ;
    public final void entryRuleExpresionReferenciada() throws RecognitionException {
        try {
            // InternalBlockchain.g:554:1: ( ruleExpresionReferenciada EOF )
            // InternalBlockchain.g:555:1: ruleExpresionReferenciada EOF
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
    // InternalBlockchain.g:562:1: ruleExpresionReferenciada : ( ( rule__ExpresionReferenciada__Group__0 ) ) ;
    public final void ruleExpresionReferenciada() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBlockchain.g:566:2: ( ( ( rule__ExpresionReferenciada__Group__0 ) ) )
            // InternalBlockchain.g:567:2: ( ( rule__ExpresionReferenciada__Group__0 ) )
            {
            // InternalBlockchain.g:567:2: ( ( rule__ExpresionReferenciada__Group__0 ) )
            // InternalBlockchain.g:568:3: ( rule__ExpresionReferenciada__Group__0 )
            {
             before(grammarAccess.getExpresionReferenciadaAccess().getGroup()); 
            // InternalBlockchain.g:569:3: ( rule__ExpresionReferenciada__Group__0 )
            // InternalBlockchain.g:569:4: rule__ExpresionReferenciada__Group__0
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
    // InternalBlockchain.g:578:1: entryRuleExpresionRelacional : ruleExpresionRelacional EOF ;
    public final void entryRuleExpresionRelacional() throws RecognitionException {
        try {
            // InternalBlockchain.g:579:1: ( ruleExpresionRelacional EOF )
            // InternalBlockchain.g:580:1: ruleExpresionRelacional EOF
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
    // InternalBlockchain.g:587:1: ruleExpresionRelacional : ( ( rule__ExpresionRelacional__Group__0 ) ) ;
    public final void ruleExpresionRelacional() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBlockchain.g:591:2: ( ( ( rule__ExpresionRelacional__Group__0 ) ) )
            // InternalBlockchain.g:592:2: ( ( rule__ExpresionRelacional__Group__0 ) )
            {
            // InternalBlockchain.g:592:2: ( ( rule__ExpresionRelacional__Group__0 ) )
            // InternalBlockchain.g:593:3: ( rule__ExpresionRelacional__Group__0 )
            {
             before(grammarAccess.getExpresionRelacionalAccess().getGroup()); 
            // InternalBlockchain.g:594:3: ( rule__ExpresionRelacional__Group__0 )
            // InternalBlockchain.g:594:4: rule__ExpresionRelacional__Group__0
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


    // $ANTLR start "entryRuleEDouble"
    // InternalBlockchain.g:603:1: entryRuleEDouble : ruleEDouble EOF ;
    public final void entryRuleEDouble() throws RecognitionException {
        try {
            // InternalBlockchain.g:604:1: ( ruleEDouble EOF )
            // InternalBlockchain.g:605:1: ruleEDouble EOF
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
    // InternalBlockchain.g:612:1: ruleEDouble : ( ( rule__EDouble__Group__0 ) ) ;
    public final void ruleEDouble() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBlockchain.g:616:2: ( ( ( rule__EDouble__Group__0 ) ) )
            // InternalBlockchain.g:617:2: ( ( rule__EDouble__Group__0 ) )
            {
            // InternalBlockchain.g:617:2: ( ( rule__EDouble__Group__0 ) )
            // InternalBlockchain.g:618:3: ( rule__EDouble__Group__0 )
            {
             before(grammarAccess.getEDoubleAccess().getGroup()); 
            // InternalBlockchain.g:619:3: ( rule__EDouble__Group__0 )
            // InternalBlockchain.g:619:4: rule__EDouble__Group__0
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


    // $ANTLR start "entryRuleEInt"
    // InternalBlockchain.g:628:1: entryRuleEInt : ruleEInt EOF ;
    public final void entryRuleEInt() throws RecognitionException {
        try {
            // InternalBlockchain.g:629:1: ( ruleEInt EOF )
            // InternalBlockchain.g:630:1: ruleEInt EOF
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
    // InternalBlockchain.g:637:1: ruleEInt : ( ( rule__EInt__Group__0 ) ) ;
    public final void ruleEInt() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBlockchain.g:641:2: ( ( ( rule__EInt__Group__0 ) ) )
            // InternalBlockchain.g:642:2: ( ( rule__EInt__Group__0 ) )
            {
            // InternalBlockchain.g:642:2: ( ( rule__EInt__Group__0 ) )
            // InternalBlockchain.g:643:3: ( rule__EInt__Group__0 )
            {
             before(grammarAccess.getEIntAccess().getGroup()); 
            // InternalBlockchain.g:644:3: ( rule__EInt__Group__0 )
            // InternalBlockchain.g:644:4: rule__EInt__Group__0
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


    // $ANTLR start "entryRulePrimitivo"
    // InternalBlockchain.g:653:1: entryRulePrimitivo : rulePrimitivo EOF ;
    public final void entryRulePrimitivo() throws RecognitionException {
        try {
            // InternalBlockchain.g:654:1: ( rulePrimitivo EOF )
            // InternalBlockchain.g:655:1: rulePrimitivo EOF
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
    // InternalBlockchain.g:662:1: rulePrimitivo : ( ( rule__Primitivo__Group__0 ) ) ;
    public final void rulePrimitivo() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBlockchain.g:666:2: ( ( ( rule__Primitivo__Group__0 ) ) )
            // InternalBlockchain.g:667:2: ( ( rule__Primitivo__Group__0 ) )
            {
            // InternalBlockchain.g:667:2: ( ( rule__Primitivo__Group__0 ) )
            // InternalBlockchain.g:668:3: ( rule__Primitivo__Group__0 )
            {
             before(grammarAccess.getPrimitivoAccess().getGroup()); 
            // InternalBlockchain.g:669:3: ( rule__Primitivo__Group__0 )
            // InternalBlockchain.g:669:4: rule__Primitivo__Group__0
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
    // InternalBlockchain.g:678:1: entryRuleMapa : ruleMapa EOF ;
    public final void entryRuleMapa() throws RecognitionException {
        try {
            // InternalBlockchain.g:679:1: ( ruleMapa EOF )
            // InternalBlockchain.g:680:1: ruleMapa EOF
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
    // InternalBlockchain.g:687:1: ruleMapa : ( ( rule__Mapa__Group__0 ) ) ;
    public final void ruleMapa() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBlockchain.g:691:2: ( ( ( rule__Mapa__Group__0 ) ) )
            // InternalBlockchain.g:692:2: ( ( rule__Mapa__Group__0 ) )
            {
            // InternalBlockchain.g:692:2: ( ( rule__Mapa__Group__0 ) )
            // InternalBlockchain.g:693:3: ( rule__Mapa__Group__0 )
            {
             before(grammarAccess.getMapaAccess().getGroup()); 
            // InternalBlockchain.g:694:3: ( rule__Mapa__Group__0 )
            // InternalBlockchain.g:694:4: rule__Mapa__Group__0
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
    // InternalBlockchain.g:703:1: ruleOperadorLogico : ( ( rule__OperadorLogico__Alternatives ) ) ;
    public final void ruleOperadorLogico() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBlockchain.g:707:1: ( ( ( rule__OperadorLogico__Alternatives ) ) )
            // InternalBlockchain.g:708:2: ( ( rule__OperadorLogico__Alternatives ) )
            {
            // InternalBlockchain.g:708:2: ( ( rule__OperadorLogico__Alternatives ) )
            // InternalBlockchain.g:709:3: ( rule__OperadorLogico__Alternatives )
            {
             before(grammarAccess.getOperadorLogicoAccess().getAlternatives()); 
            // InternalBlockchain.g:710:3: ( rule__OperadorLogico__Alternatives )
            // InternalBlockchain.g:710:4: rule__OperadorLogico__Alternatives
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
    // InternalBlockchain.g:719:1: ruleOperador : ( ( rule__Operador__Alternatives ) ) ;
    public final void ruleOperador() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBlockchain.g:723:1: ( ( ( rule__Operador__Alternatives ) ) )
            // InternalBlockchain.g:724:2: ( ( rule__Operador__Alternatives ) )
            {
            // InternalBlockchain.g:724:2: ( ( rule__Operador__Alternatives ) )
            // InternalBlockchain.g:725:3: ( rule__Operador__Alternatives )
            {
             before(grammarAccess.getOperadorAccess().getAlternatives()); 
            // InternalBlockchain.g:726:3: ( rule__Operador__Alternatives )
            // InternalBlockchain.g:726:4: rule__Operador__Alternatives
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


    // $ANTLR start "ruleOperadorRelacion"
    // InternalBlockchain.g:735:1: ruleOperadorRelacion : ( ( '.' ) ) ;
    public final void ruleOperadorRelacion() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBlockchain.g:739:1: ( ( ( '.' ) ) )
            // InternalBlockchain.g:740:2: ( ( '.' ) )
            {
            // InternalBlockchain.g:740:2: ( ( '.' ) )
            // InternalBlockchain.g:741:3: ( '.' )
            {
             before(grammarAccess.getOperadorRelacionAccess().getPUNTOEnumLiteralDeclaration()); 
            // InternalBlockchain.g:742:3: ( '.' )
            // InternalBlockchain.g:742:4: '.'
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
    // InternalBlockchain.g:751:1: ruleDatoPrimitivo : ( ( rule__DatoPrimitivo__Alternatives ) ) ;
    public final void ruleDatoPrimitivo() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBlockchain.g:755:1: ( ( ( rule__DatoPrimitivo__Alternatives ) ) )
            // InternalBlockchain.g:756:2: ( ( rule__DatoPrimitivo__Alternatives ) )
            {
            // InternalBlockchain.g:756:2: ( ( rule__DatoPrimitivo__Alternatives ) )
            // InternalBlockchain.g:757:3: ( rule__DatoPrimitivo__Alternatives )
            {
             before(grammarAccess.getDatoPrimitivoAccess().getAlternatives()); 
            // InternalBlockchain.g:758:3: ( rule__DatoPrimitivo__Alternatives )
            // InternalBlockchain.g:758:4: rule__DatoPrimitivo__Alternatives
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
    // InternalBlockchain.g:766:1: rule__TipoDato__Alternatives : ( ( ruleEntidad ) | ( rulePrimitivo ) | ( ruleMapa ) );
    public final void rule__TipoDato__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBlockchain.g:770:1: ( ( ruleEntidad ) | ( rulePrimitivo ) | ( ruleMapa ) )
            int alt1=3;
            switch ( input.LA(1) ) {
            case 40:
                {
                alt1=1;
                }
                break;
            case RULE_STRING:
            case RULE_ID:
            case 31:
            case 32:
            case 33:
            case 34:
                {
                alt1=2;
                }
                break;
            case 60:
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
                    // InternalBlockchain.g:771:2: ( ruleEntidad )
                    {
                    // InternalBlockchain.g:771:2: ( ruleEntidad )
                    // InternalBlockchain.g:772:3: ruleEntidad
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
                    // InternalBlockchain.g:777:2: ( rulePrimitivo )
                    {
                    // InternalBlockchain.g:777:2: ( rulePrimitivo )
                    // InternalBlockchain.g:778:3: rulePrimitivo
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
                    // InternalBlockchain.g:783:2: ( ruleMapa )
                    {
                    // InternalBlockchain.g:783:2: ( ruleMapa )
                    // InternalBlockchain.g:784:3: ruleMapa
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


    // $ANTLR start "rule__Linea__Alternatives"
    // InternalBlockchain.g:793:1: rule__Linea__Alternatives : ( ( ruleExpresion ) | ( ruleVariable ) | ( ruleCondicional ) );
    public final void rule__Linea__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBlockchain.g:797:1: ( ( ruleExpresion ) | ( ruleVariable ) | ( ruleCondicional ) )
            int alt2=3;
            switch ( input.LA(1) ) {
            case 49:
            case 50:
            case 54:
            case 55:
            case 56:
            case 57:
            case 59:
                {
                alt2=1;
                }
                break;
            case 51:
                {
                alt2=2;
                }
                break;
            case 52:
                {
                alt2=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 2, 0, input);

                throw nvae;
            }

            switch (alt2) {
                case 1 :
                    // InternalBlockchain.g:798:2: ( ruleExpresion )
                    {
                    // InternalBlockchain.g:798:2: ( ruleExpresion )
                    // InternalBlockchain.g:799:3: ruleExpresion
                    {
                     before(grammarAccess.getLineaAccess().getExpresionParserRuleCall_0()); 
                    pushFollow(FOLLOW_2);
                    ruleExpresion();

                    state._fsp--;

                     after(grammarAccess.getLineaAccess().getExpresionParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalBlockchain.g:804:2: ( ruleVariable )
                    {
                    // InternalBlockchain.g:804:2: ( ruleVariable )
                    // InternalBlockchain.g:805:3: ruleVariable
                    {
                     before(grammarAccess.getLineaAccess().getVariableParserRuleCall_1()); 
                    pushFollow(FOLLOW_2);
                    ruleVariable();

                    state._fsp--;

                     after(grammarAccess.getLineaAccess().getVariableParserRuleCall_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalBlockchain.g:810:2: ( ruleCondicional )
                    {
                    // InternalBlockchain.g:810:2: ( ruleCondicional )
                    // InternalBlockchain.g:811:3: ruleCondicional
                    {
                     before(grammarAccess.getLineaAccess().getCondicionalParserRuleCall_2()); 
                    pushFollow(FOLLOW_2);
                    ruleCondicional();

                    state._fsp--;

                     after(grammarAccess.getLineaAccess().getCondicionalParserRuleCall_2()); 

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
    // $ANTLR end "rule__Linea__Alternatives"


    // $ANTLR start "rule__Expresion__Alternatives"
    // InternalBlockchain.g:820:1: rule__Expresion__Alternatives : ( ( ruleExpresionLogica ) | ( ruleExpresionAritmetica ) | ( ruleExpresionNumerica ) | ( ruleExpresionTexto ) | ( ruleExpresionBoolean ) | ( ruleExpresionReferenciada ) | ( ruleExpresionRelacional ) );
    public final void rule__Expresion__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBlockchain.g:824:1: ( ( ruleExpresionLogica ) | ( ruleExpresionAritmetica ) | ( ruleExpresionNumerica ) | ( ruleExpresionTexto ) | ( ruleExpresionBoolean ) | ( ruleExpresionReferenciada ) | ( ruleExpresionRelacional ) )
            int alt3=7;
            switch ( input.LA(1) ) {
            case 49:
                {
                alt3=1;
                }
                break;
            case 50:
                {
                alt3=2;
                }
                break;
            case 54:
                {
                alt3=3;
                }
                break;
            case 55:
                {
                alt3=4;
                }
                break;
            case 56:
                {
                alt3=5;
                }
                break;
            case 57:
                {
                alt3=6;
                }
                break;
            case 59:
                {
                alt3=7;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 3, 0, input);

                throw nvae;
            }

            switch (alt3) {
                case 1 :
                    // InternalBlockchain.g:825:2: ( ruleExpresionLogica )
                    {
                    // InternalBlockchain.g:825:2: ( ruleExpresionLogica )
                    // InternalBlockchain.g:826:3: ruleExpresionLogica
                    {
                     before(grammarAccess.getExpresionAccess().getExpresionLogicaParserRuleCall_0()); 
                    pushFollow(FOLLOW_2);
                    ruleExpresionLogica();

                    state._fsp--;

                     after(grammarAccess.getExpresionAccess().getExpresionLogicaParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalBlockchain.g:831:2: ( ruleExpresionAritmetica )
                    {
                    // InternalBlockchain.g:831:2: ( ruleExpresionAritmetica )
                    // InternalBlockchain.g:832:3: ruleExpresionAritmetica
                    {
                     before(grammarAccess.getExpresionAccess().getExpresionAritmeticaParserRuleCall_1()); 
                    pushFollow(FOLLOW_2);
                    ruleExpresionAritmetica();

                    state._fsp--;

                     after(grammarAccess.getExpresionAccess().getExpresionAritmeticaParserRuleCall_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalBlockchain.g:837:2: ( ruleExpresionNumerica )
                    {
                    // InternalBlockchain.g:837:2: ( ruleExpresionNumerica )
                    // InternalBlockchain.g:838:3: ruleExpresionNumerica
                    {
                     before(grammarAccess.getExpresionAccess().getExpresionNumericaParserRuleCall_2()); 
                    pushFollow(FOLLOW_2);
                    ruleExpresionNumerica();

                    state._fsp--;

                     after(grammarAccess.getExpresionAccess().getExpresionNumericaParserRuleCall_2()); 

                    }


                    }
                    break;
                case 4 :
                    // InternalBlockchain.g:843:2: ( ruleExpresionTexto )
                    {
                    // InternalBlockchain.g:843:2: ( ruleExpresionTexto )
                    // InternalBlockchain.g:844:3: ruleExpresionTexto
                    {
                     before(grammarAccess.getExpresionAccess().getExpresionTextoParserRuleCall_3()); 
                    pushFollow(FOLLOW_2);
                    ruleExpresionTexto();

                    state._fsp--;

                     after(grammarAccess.getExpresionAccess().getExpresionTextoParserRuleCall_3()); 

                    }


                    }
                    break;
                case 5 :
                    // InternalBlockchain.g:849:2: ( ruleExpresionBoolean )
                    {
                    // InternalBlockchain.g:849:2: ( ruleExpresionBoolean )
                    // InternalBlockchain.g:850:3: ruleExpresionBoolean
                    {
                     before(grammarAccess.getExpresionAccess().getExpresionBooleanParserRuleCall_4()); 
                    pushFollow(FOLLOW_2);
                    ruleExpresionBoolean();

                    state._fsp--;

                     after(grammarAccess.getExpresionAccess().getExpresionBooleanParserRuleCall_4()); 

                    }


                    }
                    break;
                case 6 :
                    // InternalBlockchain.g:855:2: ( ruleExpresionReferenciada )
                    {
                    // InternalBlockchain.g:855:2: ( ruleExpresionReferenciada )
                    // InternalBlockchain.g:856:3: ruleExpresionReferenciada
                    {
                     before(grammarAccess.getExpresionAccess().getExpresionReferenciadaParserRuleCall_5()); 
                    pushFollow(FOLLOW_2);
                    ruleExpresionReferenciada();

                    state._fsp--;

                     after(grammarAccess.getExpresionAccess().getExpresionReferenciadaParserRuleCall_5()); 

                    }


                    }
                    break;
                case 7 :
                    // InternalBlockchain.g:861:2: ( ruleExpresionRelacional )
                    {
                    // InternalBlockchain.g:861:2: ( ruleExpresionRelacional )
                    // InternalBlockchain.g:862:3: ruleExpresionRelacional
                    {
                     before(grammarAccess.getExpresionAccess().getExpresionRelacionalParserRuleCall_6()); 
                    pushFollow(FOLLOW_2);
                    ruleExpresionRelacional();

                    state._fsp--;

                     after(grammarAccess.getExpresionAccess().getExpresionRelacionalParserRuleCall_6()); 

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
    // $ANTLR end "rule__Expresion__Alternatives"


    // $ANTLR start "rule__EString__Alternatives"
    // InternalBlockchain.g:871:1: rule__EString__Alternatives : ( ( RULE_STRING ) | ( RULE_ID ) );
    public final void rule__EString__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBlockchain.g:875:1: ( ( RULE_STRING ) | ( RULE_ID ) )
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==RULE_STRING) ) {
                alt4=1;
            }
            else if ( (LA4_0==RULE_ID) ) {
                alt4=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 4, 0, input);

                throw nvae;
            }
            switch (alt4) {
                case 1 :
                    // InternalBlockchain.g:876:2: ( RULE_STRING )
                    {
                    // InternalBlockchain.g:876:2: ( RULE_STRING )
                    // InternalBlockchain.g:877:3: RULE_STRING
                    {
                     before(grammarAccess.getEStringAccess().getSTRINGTerminalRuleCall_0()); 
                    match(input,RULE_STRING,FOLLOW_2); 
                     after(grammarAccess.getEStringAccess().getSTRINGTerminalRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalBlockchain.g:882:2: ( RULE_ID )
                    {
                    // InternalBlockchain.g:882:2: ( RULE_ID )
                    // InternalBlockchain.g:883:3: RULE_ID
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
    // InternalBlockchain.g:892:1: rule__EBoolean__Alternatives : ( ( 'true' ) | ( 'false' ) );
    public final void rule__EBoolean__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBlockchain.g:896:1: ( ( 'true' ) | ( 'false' ) )
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==12) ) {
                alt5=1;
            }
            else if ( (LA5_0==13) ) {
                alt5=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 5, 0, input);

                throw nvae;
            }
            switch (alt5) {
                case 1 :
                    // InternalBlockchain.g:897:2: ( 'true' )
                    {
                    // InternalBlockchain.g:897:2: ( 'true' )
                    // InternalBlockchain.g:898:3: 'true'
                    {
                     before(grammarAccess.getEBooleanAccess().getTrueKeyword_0()); 
                    match(input,12,FOLLOW_2); 
                     after(grammarAccess.getEBooleanAccess().getTrueKeyword_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalBlockchain.g:903:2: ( 'false' )
                    {
                    // InternalBlockchain.g:903:2: ( 'false' )
                    // InternalBlockchain.g:904:3: 'false'
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
    // InternalBlockchain.g:913:1: rule__EDouble__Alternatives_4_0 : ( ( 'E' ) | ( 'e' ) );
    public final void rule__EDouble__Alternatives_4_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBlockchain.g:917:1: ( ( 'E' ) | ( 'e' ) )
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==14) ) {
                alt6=1;
            }
            else if ( (LA6_0==15) ) {
                alt6=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 6, 0, input);

                throw nvae;
            }
            switch (alt6) {
                case 1 :
                    // InternalBlockchain.g:918:2: ( 'E' )
                    {
                    // InternalBlockchain.g:918:2: ( 'E' )
                    // InternalBlockchain.g:919:3: 'E'
                    {
                     before(grammarAccess.getEDoubleAccess().getEKeyword_4_0_0()); 
                    match(input,14,FOLLOW_2); 
                     after(grammarAccess.getEDoubleAccess().getEKeyword_4_0_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalBlockchain.g:924:2: ( 'e' )
                    {
                    // InternalBlockchain.g:924:2: ( 'e' )
                    // InternalBlockchain.g:925:3: 'e'
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
    // InternalBlockchain.g:934:1: rule__OperadorLogico__Alternatives : ( ( ( '==' ) ) | ( ( '!=' ) ) | ( ( '>' ) ) | ( ( '<' ) ) | ( ( '>=' ) ) | ( ( '<=' ) ) | ( ( '&&' ) ) | ( ( '||' ) ) );
    public final void rule__OperadorLogico__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBlockchain.g:938:1: ( ( ( '==' ) ) | ( ( '!=' ) ) | ( ( '>' ) ) | ( ( '<' ) ) | ( ( '>=' ) ) | ( ( '<=' ) ) | ( ( '&&' ) ) | ( ( '||' ) ) )
            int alt7=8;
            switch ( input.LA(1) ) {
            case 16:
                {
                alt7=1;
                }
                break;
            case 17:
                {
                alt7=2;
                }
                break;
            case 18:
                {
                alt7=3;
                }
                break;
            case 19:
                {
                alt7=4;
                }
                break;
            case 20:
                {
                alt7=5;
                }
                break;
            case 21:
                {
                alt7=6;
                }
                break;
            case 22:
                {
                alt7=7;
                }
                break;
            case 23:
                {
                alt7=8;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 7, 0, input);

                throw nvae;
            }

            switch (alt7) {
                case 1 :
                    // InternalBlockchain.g:939:2: ( ( '==' ) )
                    {
                    // InternalBlockchain.g:939:2: ( ( '==' ) )
                    // InternalBlockchain.g:940:3: ( '==' )
                    {
                     before(grammarAccess.getOperadorLogicoAccess().getIGUAL_IGUALEnumLiteralDeclaration_0()); 
                    // InternalBlockchain.g:941:3: ( '==' )
                    // InternalBlockchain.g:941:4: '=='
                    {
                    match(input,16,FOLLOW_2); 

                    }

                     after(grammarAccess.getOperadorLogicoAccess().getIGUAL_IGUALEnumLiteralDeclaration_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalBlockchain.g:945:2: ( ( '!=' ) )
                    {
                    // InternalBlockchain.g:945:2: ( ( '!=' ) )
                    // InternalBlockchain.g:946:3: ( '!=' )
                    {
                     before(grammarAccess.getOperadorLogicoAccess().getDIFERENTEEnumLiteralDeclaration_1()); 
                    // InternalBlockchain.g:947:3: ( '!=' )
                    // InternalBlockchain.g:947:4: '!='
                    {
                    match(input,17,FOLLOW_2); 

                    }

                     after(grammarAccess.getOperadorLogicoAccess().getDIFERENTEEnumLiteralDeclaration_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalBlockchain.g:951:2: ( ( '>' ) )
                    {
                    // InternalBlockchain.g:951:2: ( ( '>' ) )
                    // InternalBlockchain.g:952:3: ( '>' )
                    {
                     before(grammarAccess.getOperadorLogicoAccess().getMAYORQUEEnumLiteralDeclaration_2()); 
                    // InternalBlockchain.g:953:3: ( '>' )
                    // InternalBlockchain.g:953:4: '>'
                    {
                    match(input,18,FOLLOW_2); 

                    }

                     after(grammarAccess.getOperadorLogicoAccess().getMAYORQUEEnumLiteralDeclaration_2()); 

                    }


                    }
                    break;
                case 4 :
                    // InternalBlockchain.g:957:2: ( ( '<' ) )
                    {
                    // InternalBlockchain.g:957:2: ( ( '<' ) )
                    // InternalBlockchain.g:958:3: ( '<' )
                    {
                     before(grammarAccess.getOperadorLogicoAccess().getMENORQUEEnumLiteralDeclaration_3()); 
                    // InternalBlockchain.g:959:3: ( '<' )
                    // InternalBlockchain.g:959:4: '<'
                    {
                    match(input,19,FOLLOW_2); 

                    }

                     after(grammarAccess.getOperadorLogicoAccess().getMENORQUEEnumLiteralDeclaration_3()); 

                    }


                    }
                    break;
                case 5 :
                    // InternalBlockchain.g:963:2: ( ( '>=' ) )
                    {
                    // InternalBlockchain.g:963:2: ( ( '>=' ) )
                    // InternalBlockchain.g:964:3: ( '>=' )
                    {
                     before(grammarAccess.getOperadorLogicoAccess().getMAYORIGUALEnumLiteralDeclaration_4()); 
                    // InternalBlockchain.g:965:3: ( '>=' )
                    // InternalBlockchain.g:965:4: '>='
                    {
                    match(input,20,FOLLOW_2); 

                    }

                     after(grammarAccess.getOperadorLogicoAccess().getMAYORIGUALEnumLiteralDeclaration_4()); 

                    }


                    }
                    break;
                case 6 :
                    // InternalBlockchain.g:969:2: ( ( '<=' ) )
                    {
                    // InternalBlockchain.g:969:2: ( ( '<=' ) )
                    // InternalBlockchain.g:970:3: ( '<=' )
                    {
                     before(grammarAccess.getOperadorLogicoAccess().getMENORIGUALEnumLiteralDeclaration_5()); 
                    // InternalBlockchain.g:971:3: ( '<=' )
                    // InternalBlockchain.g:971:4: '<='
                    {
                    match(input,21,FOLLOW_2); 

                    }

                     after(grammarAccess.getOperadorLogicoAccess().getMENORIGUALEnumLiteralDeclaration_5()); 

                    }


                    }
                    break;
                case 7 :
                    // InternalBlockchain.g:975:2: ( ( '&&' ) )
                    {
                    // InternalBlockchain.g:975:2: ( ( '&&' ) )
                    // InternalBlockchain.g:976:3: ( '&&' )
                    {
                     before(grammarAccess.getOperadorLogicoAccess().getANDEnumLiteralDeclaration_6()); 
                    // InternalBlockchain.g:977:3: ( '&&' )
                    // InternalBlockchain.g:977:4: '&&'
                    {
                    match(input,22,FOLLOW_2); 

                    }

                     after(grammarAccess.getOperadorLogicoAccess().getANDEnumLiteralDeclaration_6()); 

                    }


                    }
                    break;
                case 8 :
                    // InternalBlockchain.g:981:2: ( ( '||' ) )
                    {
                    // InternalBlockchain.g:981:2: ( ( '||' ) )
                    // InternalBlockchain.g:982:3: ( '||' )
                    {
                     before(grammarAccess.getOperadorLogicoAccess().getOREnumLiteralDeclaration_7()); 
                    // InternalBlockchain.g:983:3: ( '||' )
                    // InternalBlockchain.g:983:4: '||'
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
    // InternalBlockchain.g:991:1: rule__Operador__Alternatives : ( ( ( '+' ) ) | ( ( '-' ) ) | ( ( '*' ) ) | ( ( '/' ) ) | ( ( '=' ) ) | ( ( 'GET' ) ) | ( ( 'DELETE' ) ) );
    public final void rule__Operador__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBlockchain.g:995:1: ( ( ( '+' ) ) | ( ( '-' ) ) | ( ( '*' ) ) | ( ( '/' ) ) | ( ( '=' ) ) | ( ( 'GET' ) ) | ( ( 'DELETE' ) ) )
            int alt8=7;
            switch ( input.LA(1) ) {
            case 24:
                {
                alt8=1;
                }
                break;
            case 25:
                {
                alt8=2;
                }
                break;
            case 26:
                {
                alt8=3;
                }
                break;
            case 27:
                {
                alt8=4;
                }
                break;
            case 28:
                {
                alt8=5;
                }
                break;
            case 29:
                {
                alt8=6;
                }
                break;
            case 30:
                {
                alt8=7;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 8, 0, input);

                throw nvae;
            }

            switch (alt8) {
                case 1 :
                    // InternalBlockchain.g:996:2: ( ( '+' ) )
                    {
                    // InternalBlockchain.g:996:2: ( ( '+' ) )
                    // InternalBlockchain.g:997:3: ( '+' )
                    {
                     before(grammarAccess.getOperadorAccess().getMASEnumLiteralDeclaration_0()); 
                    // InternalBlockchain.g:998:3: ( '+' )
                    // InternalBlockchain.g:998:4: '+'
                    {
                    match(input,24,FOLLOW_2); 

                    }

                     after(grammarAccess.getOperadorAccess().getMASEnumLiteralDeclaration_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalBlockchain.g:1002:2: ( ( '-' ) )
                    {
                    // InternalBlockchain.g:1002:2: ( ( '-' ) )
                    // InternalBlockchain.g:1003:3: ( '-' )
                    {
                     before(grammarAccess.getOperadorAccess().getMENOSEnumLiteralDeclaration_1()); 
                    // InternalBlockchain.g:1004:3: ( '-' )
                    // InternalBlockchain.g:1004:4: '-'
                    {
                    match(input,25,FOLLOW_2); 

                    }

                     after(grammarAccess.getOperadorAccess().getMENOSEnumLiteralDeclaration_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalBlockchain.g:1008:2: ( ( '*' ) )
                    {
                    // InternalBlockchain.g:1008:2: ( ( '*' ) )
                    // InternalBlockchain.g:1009:3: ( '*' )
                    {
                     before(grammarAccess.getOperadorAccess().getPRODUCTOEnumLiteralDeclaration_2()); 
                    // InternalBlockchain.g:1010:3: ( '*' )
                    // InternalBlockchain.g:1010:4: '*'
                    {
                    match(input,26,FOLLOW_2); 

                    }

                     after(grammarAccess.getOperadorAccess().getPRODUCTOEnumLiteralDeclaration_2()); 

                    }


                    }
                    break;
                case 4 :
                    // InternalBlockchain.g:1014:2: ( ( '/' ) )
                    {
                    // InternalBlockchain.g:1014:2: ( ( '/' ) )
                    // InternalBlockchain.g:1015:3: ( '/' )
                    {
                     before(grammarAccess.getOperadorAccess().getDIVISIONEnumLiteralDeclaration_3()); 
                    // InternalBlockchain.g:1016:3: ( '/' )
                    // InternalBlockchain.g:1016:4: '/'
                    {
                    match(input,27,FOLLOW_2); 

                    }

                     after(grammarAccess.getOperadorAccess().getDIVISIONEnumLiteralDeclaration_3()); 

                    }


                    }
                    break;
                case 5 :
                    // InternalBlockchain.g:1020:2: ( ( '=' ) )
                    {
                    // InternalBlockchain.g:1020:2: ( ( '=' ) )
                    // InternalBlockchain.g:1021:3: ( '=' )
                    {
                     before(grammarAccess.getOperadorAccess().getIGUALEnumLiteralDeclaration_4()); 
                    // InternalBlockchain.g:1022:3: ( '=' )
                    // InternalBlockchain.g:1022:4: '='
                    {
                    match(input,28,FOLLOW_2); 

                    }

                     after(grammarAccess.getOperadorAccess().getIGUALEnumLiteralDeclaration_4()); 

                    }


                    }
                    break;
                case 6 :
                    // InternalBlockchain.g:1026:2: ( ( 'GET' ) )
                    {
                    // InternalBlockchain.g:1026:2: ( ( 'GET' ) )
                    // InternalBlockchain.g:1027:3: ( 'GET' )
                    {
                     before(grammarAccess.getOperadorAccess().getGETEnumLiteralDeclaration_5()); 
                    // InternalBlockchain.g:1028:3: ( 'GET' )
                    // InternalBlockchain.g:1028:4: 'GET'
                    {
                    match(input,29,FOLLOW_2); 

                    }

                     after(grammarAccess.getOperadorAccess().getGETEnumLiteralDeclaration_5()); 

                    }


                    }
                    break;
                case 7 :
                    // InternalBlockchain.g:1032:2: ( ( 'DELETE' ) )
                    {
                    // InternalBlockchain.g:1032:2: ( ( 'DELETE' ) )
                    // InternalBlockchain.g:1033:3: ( 'DELETE' )
                    {
                     before(grammarAccess.getOperadorAccess().getDELETEEnumLiteralDeclaration_6()); 
                    // InternalBlockchain.g:1034:3: ( 'DELETE' )
                    // InternalBlockchain.g:1034:4: 'DELETE'
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


    // $ANTLR start "rule__DatoPrimitivo__Alternatives"
    // InternalBlockchain.g:1042:1: rule__DatoPrimitivo__Alternatives : ( ( ( 'String' ) ) | ( ( 'uint' ) ) | ( ( 'Boolean' ) ) | ( ( 'address' ) ) );
    public final void rule__DatoPrimitivo__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBlockchain.g:1046:1: ( ( ( 'String' ) ) | ( ( 'uint' ) ) | ( ( 'Boolean' ) ) | ( ( 'address' ) ) )
            int alt9=4;
            switch ( input.LA(1) ) {
            case 31:
                {
                alt9=1;
                }
                break;
            case 32:
                {
                alt9=2;
                }
                break;
            case 33:
                {
                alt9=3;
                }
                break;
            case 34:
                {
                alt9=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 9, 0, input);

                throw nvae;
            }

            switch (alt9) {
                case 1 :
                    // InternalBlockchain.g:1047:2: ( ( 'String' ) )
                    {
                    // InternalBlockchain.g:1047:2: ( ( 'String' ) )
                    // InternalBlockchain.g:1048:3: ( 'String' )
                    {
                     before(grammarAccess.getDatoPrimitivoAccess().getSTRINGEnumLiteralDeclaration_0()); 
                    // InternalBlockchain.g:1049:3: ( 'String' )
                    // InternalBlockchain.g:1049:4: 'String'
                    {
                    match(input,31,FOLLOW_2); 

                    }

                     after(grammarAccess.getDatoPrimitivoAccess().getSTRINGEnumLiteralDeclaration_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalBlockchain.g:1053:2: ( ( 'uint' ) )
                    {
                    // InternalBlockchain.g:1053:2: ( ( 'uint' ) )
                    // InternalBlockchain.g:1054:3: ( 'uint' )
                    {
                     before(grammarAccess.getDatoPrimitivoAccess().getNUMERICOEnumLiteralDeclaration_1()); 
                    // InternalBlockchain.g:1055:3: ( 'uint' )
                    // InternalBlockchain.g:1055:4: 'uint'
                    {
                    match(input,32,FOLLOW_2); 

                    }

                     after(grammarAccess.getDatoPrimitivoAccess().getNUMERICOEnumLiteralDeclaration_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalBlockchain.g:1059:2: ( ( 'Boolean' ) )
                    {
                    // InternalBlockchain.g:1059:2: ( ( 'Boolean' ) )
                    // InternalBlockchain.g:1060:3: ( 'Boolean' )
                    {
                     before(grammarAccess.getDatoPrimitivoAccess().getBOOLEANEnumLiteralDeclaration_2()); 
                    // InternalBlockchain.g:1061:3: ( 'Boolean' )
                    // InternalBlockchain.g:1061:4: 'Boolean'
                    {
                    match(input,33,FOLLOW_2); 

                    }

                     after(grammarAccess.getDatoPrimitivoAccess().getBOOLEANEnumLiteralDeclaration_2()); 

                    }


                    }
                    break;
                case 4 :
                    // InternalBlockchain.g:1065:2: ( ( 'address' ) )
                    {
                    // InternalBlockchain.g:1065:2: ( ( 'address' ) )
                    // InternalBlockchain.g:1066:3: ( 'address' )
                    {
                     before(grammarAccess.getDatoPrimitivoAccess().getADDRESSEnumLiteralDeclaration_3()); 
                    // InternalBlockchain.g:1067:3: ( 'address' )
                    // InternalBlockchain.g:1067:4: 'address'
                    {
                    match(input,34,FOLLOW_2); 

                    }

                     after(grammarAccess.getDatoPrimitivoAccess().getADDRESSEnumLiteralDeclaration_3()); 

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
    // InternalBlockchain.g:1075:1: rule__Aplicacion__Group__0 : rule__Aplicacion__Group__0__Impl rule__Aplicacion__Group__1 ;
    public final void rule__Aplicacion__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBlockchain.g:1079:1: ( rule__Aplicacion__Group__0__Impl rule__Aplicacion__Group__1 )
            // InternalBlockchain.g:1080:2: rule__Aplicacion__Group__0__Impl rule__Aplicacion__Group__1
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
    // InternalBlockchain.g:1087:1: rule__Aplicacion__Group__0__Impl : ( () ) ;
    public final void rule__Aplicacion__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBlockchain.g:1091:1: ( ( () ) )
            // InternalBlockchain.g:1092:1: ( () )
            {
            // InternalBlockchain.g:1092:1: ( () )
            // InternalBlockchain.g:1093:2: ()
            {
             before(grammarAccess.getAplicacionAccess().getAplicacionAction_0()); 
            // InternalBlockchain.g:1094:2: ()
            // InternalBlockchain.g:1094:3: 
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
    // InternalBlockchain.g:1102:1: rule__Aplicacion__Group__1 : rule__Aplicacion__Group__1__Impl rule__Aplicacion__Group__2 ;
    public final void rule__Aplicacion__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBlockchain.g:1106:1: ( rule__Aplicacion__Group__1__Impl rule__Aplicacion__Group__2 )
            // InternalBlockchain.g:1107:2: rule__Aplicacion__Group__1__Impl rule__Aplicacion__Group__2
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
    // InternalBlockchain.g:1114:1: rule__Aplicacion__Group__1__Impl : ( 'Aplicacion' ) ;
    public final void rule__Aplicacion__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBlockchain.g:1118:1: ( ( 'Aplicacion' ) )
            // InternalBlockchain.g:1119:1: ( 'Aplicacion' )
            {
            // InternalBlockchain.g:1119:1: ( 'Aplicacion' )
            // InternalBlockchain.g:1120:2: 'Aplicacion'
            {
             before(grammarAccess.getAplicacionAccess().getAplicacionKeyword_1()); 
            match(input,35,FOLLOW_2); 
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
    // InternalBlockchain.g:1129:1: rule__Aplicacion__Group__2 : rule__Aplicacion__Group__2__Impl rule__Aplicacion__Group__3 ;
    public final void rule__Aplicacion__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBlockchain.g:1133:1: ( rule__Aplicacion__Group__2__Impl rule__Aplicacion__Group__3 )
            // InternalBlockchain.g:1134:2: rule__Aplicacion__Group__2__Impl rule__Aplicacion__Group__3
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
    // InternalBlockchain.g:1141:1: rule__Aplicacion__Group__2__Impl : ( ( rule__Aplicacion__NameAssignment_2 ) ) ;
    public final void rule__Aplicacion__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBlockchain.g:1145:1: ( ( ( rule__Aplicacion__NameAssignment_2 ) ) )
            // InternalBlockchain.g:1146:1: ( ( rule__Aplicacion__NameAssignment_2 ) )
            {
            // InternalBlockchain.g:1146:1: ( ( rule__Aplicacion__NameAssignment_2 ) )
            // InternalBlockchain.g:1147:2: ( rule__Aplicacion__NameAssignment_2 )
            {
             before(grammarAccess.getAplicacionAccess().getNameAssignment_2()); 
            // InternalBlockchain.g:1148:2: ( rule__Aplicacion__NameAssignment_2 )
            // InternalBlockchain.g:1148:3: rule__Aplicacion__NameAssignment_2
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
    // InternalBlockchain.g:1156:1: rule__Aplicacion__Group__3 : rule__Aplicacion__Group__3__Impl rule__Aplicacion__Group__4 ;
    public final void rule__Aplicacion__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBlockchain.g:1160:1: ( rule__Aplicacion__Group__3__Impl rule__Aplicacion__Group__4 )
            // InternalBlockchain.g:1161:2: rule__Aplicacion__Group__3__Impl rule__Aplicacion__Group__4
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
    // InternalBlockchain.g:1168:1: rule__Aplicacion__Group__3__Impl : ( '{' ) ;
    public final void rule__Aplicacion__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBlockchain.g:1172:1: ( ( '{' ) )
            // InternalBlockchain.g:1173:1: ( '{' )
            {
            // InternalBlockchain.g:1173:1: ( '{' )
            // InternalBlockchain.g:1174:2: '{'
            {
             before(grammarAccess.getAplicacionAccess().getLeftCurlyBracketKeyword_3()); 
            match(input,36,FOLLOW_2); 
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
    // InternalBlockchain.g:1183:1: rule__Aplicacion__Group__4 : rule__Aplicacion__Group__4__Impl rule__Aplicacion__Group__5 ;
    public final void rule__Aplicacion__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBlockchain.g:1187:1: ( rule__Aplicacion__Group__4__Impl rule__Aplicacion__Group__5 )
            // InternalBlockchain.g:1188:2: rule__Aplicacion__Group__4__Impl rule__Aplicacion__Group__5
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
    // InternalBlockchain.g:1195:1: rule__Aplicacion__Group__4__Impl : ( ( rule__Aplicacion__Group_4__0 )? ) ;
    public final void rule__Aplicacion__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBlockchain.g:1199:1: ( ( ( rule__Aplicacion__Group_4__0 )? ) )
            // InternalBlockchain.g:1200:1: ( ( rule__Aplicacion__Group_4__0 )? )
            {
            // InternalBlockchain.g:1200:1: ( ( rule__Aplicacion__Group_4__0 )? )
            // InternalBlockchain.g:1201:2: ( rule__Aplicacion__Group_4__0 )?
            {
             before(grammarAccess.getAplicacionAccess().getGroup_4()); 
            // InternalBlockchain.g:1202:2: ( rule__Aplicacion__Group_4__0 )?
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0==39) ) {
                alt10=1;
            }
            switch (alt10) {
                case 1 :
                    // InternalBlockchain.g:1202:3: rule__Aplicacion__Group_4__0
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
    // InternalBlockchain.g:1210:1: rule__Aplicacion__Group__5 : rule__Aplicacion__Group__5__Impl rule__Aplicacion__Group__6 ;
    public final void rule__Aplicacion__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBlockchain.g:1214:1: ( rule__Aplicacion__Group__5__Impl rule__Aplicacion__Group__6 )
            // InternalBlockchain.g:1215:2: rule__Aplicacion__Group__5__Impl rule__Aplicacion__Group__6
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
    // InternalBlockchain.g:1222:1: rule__Aplicacion__Group__5__Impl : ( ( rule__Aplicacion__Group_5__0 )* ) ;
    public final void rule__Aplicacion__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBlockchain.g:1226:1: ( ( ( rule__Aplicacion__Group_5__0 )* ) )
            // InternalBlockchain.g:1227:1: ( ( rule__Aplicacion__Group_5__0 )* )
            {
            // InternalBlockchain.g:1227:1: ( ( rule__Aplicacion__Group_5__0 )* )
            // InternalBlockchain.g:1228:2: ( rule__Aplicacion__Group_5__0 )*
            {
             before(grammarAccess.getAplicacionAccess().getGroup_5()); 
            // InternalBlockchain.g:1229:2: ( rule__Aplicacion__Group_5__0 )*
            loop11:
            do {
                int alt11=2;
                int LA11_0 = input.LA(1);

                if ( (LA11_0==38) ) {
                    alt11=1;
                }


                switch (alt11) {
            	case 1 :
            	    // InternalBlockchain.g:1229:3: rule__Aplicacion__Group_5__0
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
    // InternalBlockchain.g:1237:1: rule__Aplicacion__Group__6 : rule__Aplicacion__Group__6__Impl ;
    public final void rule__Aplicacion__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBlockchain.g:1241:1: ( rule__Aplicacion__Group__6__Impl )
            // InternalBlockchain.g:1242:2: rule__Aplicacion__Group__6__Impl
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
    // InternalBlockchain.g:1248:1: rule__Aplicacion__Group__6__Impl : ( '}' ) ;
    public final void rule__Aplicacion__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBlockchain.g:1252:1: ( ( '}' ) )
            // InternalBlockchain.g:1253:1: ( '}' )
            {
            // InternalBlockchain.g:1253:1: ( '}' )
            // InternalBlockchain.g:1254:2: '}'
            {
             before(grammarAccess.getAplicacionAccess().getRightCurlyBracketKeyword_6()); 
            match(input,37,FOLLOW_2); 
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
    // InternalBlockchain.g:1264:1: rule__Aplicacion__Group_4__0 : rule__Aplicacion__Group_4__0__Impl rule__Aplicacion__Group_4__1 ;
    public final void rule__Aplicacion__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBlockchain.g:1268:1: ( rule__Aplicacion__Group_4__0__Impl rule__Aplicacion__Group_4__1 )
            // InternalBlockchain.g:1269:2: rule__Aplicacion__Group_4__0__Impl rule__Aplicacion__Group_4__1
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
    // InternalBlockchain.g:1276:1: rule__Aplicacion__Group_4__0__Impl : ( ( rule__Aplicacion__SmartcontractAssignment_4_0 ) ) ;
    public final void rule__Aplicacion__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBlockchain.g:1280:1: ( ( ( rule__Aplicacion__SmartcontractAssignment_4_0 ) ) )
            // InternalBlockchain.g:1281:1: ( ( rule__Aplicacion__SmartcontractAssignment_4_0 ) )
            {
            // InternalBlockchain.g:1281:1: ( ( rule__Aplicacion__SmartcontractAssignment_4_0 ) )
            // InternalBlockchain.g:1282:2: ( rule__Aplicacion__SmartcontractAssignment_4_0 )
            {
             before(grammarAccess.getAplicacionAccess().getSmartcontractAssignment_4_0()); 
            // InternalBlockchain.g:1283:2: ( rule__Aplicacion__SmartcontractAssignment_4_0 )
            // InternalBlockchain.g:1283:3: rule__Aplicacion__SmartcontractAssignment_4_0
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
    // InternalBlockchain.g:1291:1: rule__Aplicacion__Group_4__1 : rule__Aplicacion__Group_4__1__Impl ;
    public final void rule__Aplicacion__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBlockchain.g:1295:1: ( rule__Aplicacion__Group_4__1__Impl )
            // InternalBlockchain.g:1296:2: rule__Aplicacion__Group_4__1__Impl
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
    // InternalBlockchain.g:1302:1: rule__Aplicacion__Group_4__1__Impl : ( ( rule__Aplicacion__SmartcontractAssignment_4_1 )* ) ;
    public final void rule__Aplicacion__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBlockchain.g:1306:1: ( ( ( rule__Aplicacion__SmartcontractAssignment_4_1 )* ) )
            // InternalBlockchain.g:1307:1: ( ( rule__Aplicacion__SmartcontractAssignment_4_1 )* )
            {
            // InternalBlockchain.g:1307:1: ( ( rule__Aplicacion__SmartcontractAssignment_4_1 )* )
            // InternalBlockchain.g:1308:2: ( rule__Aplicacion__SmartcontractAssignment_4_1 )*
            {
             before(grammarAccess.getAplicacionAccess().getSmartcontractAssignment_4_1()); 
            // InternalBlockchain.g:1309:2: ( rule__Aplicacion__SmartcontractAssignment_4_1 )*
            loop12:
            do {
                int alt12=2;
                int LA12_0 = input.LA(1);

                if ( (LA12_0==39) ) {
                    alt12=1;
                }


                switch (alt12) {
            	case 1 :
            	    // InternalBlockchain.g:1309:3: rule__Aplicacion__SmartcontractAssignment_4_1
            	    {
            	    pushFollow(FOLLOW_9);
            	    rule__Aplicacion__SmartcontractAssignment_4_1();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop12;
                }
            } while (true);

             after(grammarAccess.getAplicacionAccess().getSmartcontractAssignment_4_1()); 

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


    // $ANTLR start "rule__Aplicacion__Group_5__0"
    // InternalBlockchain.g:1318:1: rule__Aplicacion__Group_5__0 : rule__Aplicacion__Group_5__0__Impl rule__Aplicacion__Group_5__1 ;
    public final void rule__Aplicacion__Group_5__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBlockchain.g:1322:1: ( rule__Aplicacion__Group_5__0__Impl rule__Aplicacion__Group_5__1 )
            // InternalBlockchain.g:1323:2: rule__Aplicacion__Group_5__0__Impl rule__Aplicacion__Group_5__1
            {
            pushFollow(FOLLOW_10);
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
    // InternalBlockchain.g:1330:1: rule__Aplicacion__Group_5__0__Impl : ( 'tipodato' ) ;
    public final void rule__Aplicacion__Group_5__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBlockchain.g:1334:1: ( ( 'tipodato' ) )
            // InternalBlockchain.g:1335:1: ( 'tipodato' )
            {
            // InternalBlockchain.g:1335:1: ( 'tipodato' )
            // InternalBlockchain.g:1336:2: 'tipodato'
            {
             before(grammarAccess.getAplicacionAccess().getTipodatoKeyword_5_0()); 
            match(input,38,FOLLOW_2); 
             after(grammarAccess.getAplicacionAccess().getTipodatoKeyword_5_0()); 

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
    // InternalBlockchain.g:1345:1: rule__Aplicacion__Group_5__1 : rule__Aplicacion__Group_5__1__Impl ;
    public final void rule__Aplicacion__Group_5__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBlockchain.g:1349:1: ( rule__Aplicacion__Group_5__1__Impl )
            // InternalBlockchain.g:1350:2: rule__Aplicacion__Group_5__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Aplicacion__Group_5__1__Impl();

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
    // InternalBlockchain.g:1356:1: rule__Aplicacion__Group_5__1__Impl : ( ( rule__Aplicacion__TipodatoAssignment_5_1 ) ) ;
    public final void rule__Aplicacion__Group_5__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBlockchain.g:1360:1: ( ( ( rule__Aplicacion__TipodatoAssignment_5_1 ) ) )
            // InternalBlockchain.g:1361:1: ( ( rule__Aplicacion__TipodatoAssignment_5_1 ) )
            {
            // InternalBlockchain.g:1361:1: ( ( rule__Aplicacion__TipodatoAssignment_5_1 ) )
            // InternalBlockchain.g:1362:2: ( rule__Aplicacion__TipodatoAssignment_5_1 )
            {
             before(grammarAccess.getAplicacionAccess().getTipodatoAssignment_5_1()); 
            // InternalBlockchain.g:1363:2: ( rule__Aplicacion__TipodatoAssignment_5_1 )
            // InternalBlockchain.g:1363:3: rule__Aplicacion__TipodatoAssignment_5_1
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


    // $ANTLR start "rule__SmartContract__Group__0"
    // InternalBlockchain.g:1372:1: rule__SmartContract__Group__0 : rule__SmartContract__Group__0__Impl rule__SmartContract__Group__1 ;
    public final void rule__SmartContract__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBlockchain.g:1376:1: ( rule__SmartContract__Group__0__Impl rule__SmartContract__Group__1 )
            // InternalBlockchain.g:1377:2: rule__SmartContract__Group__0__Impl rule__SmartContract__Group__1
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
    // InternalBlockchain.g:1384:1: rule__SmartContract__Group__0__Impl : ( 'SmartContract' ) ;
    public final void rule__SmartContract__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBlockchain.g:1388:1: ( ( 'SmartContract' ) )
            // InternalBlockchain.g:1389:1: ( 'SmartContract' )
            {
            // InternalBlockchain.g:1389:1: ( 'SmartContract' )
            // InternalBlockchain.g:1390:2: 'SmartContract'
            {
             before(grammarAccess.getSmartContractAccess().getSmartContractKeyword_0()); 
            match(input,39,FOLLOW_2); 
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
    // InternalBlockchain.g:1399:1: rule__SmartContract__Group__1 : rule__SmartContract__Group__1__Impl rule__SmartContract__Group__2 ;
    public final void rule__SmartContract__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBlockchain.g:1403:1: ( rule__SmartContract__Group__1__Impl rule__SmartContract__Group__2 )
            // InternalBlockchain.g:1404:2: rule__SmartContract__Group__1__Impl rule__SmartContract__Group__2
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
    // InternalBlockchain.g:1411:1: rule__SmartContract__Group__1__Impl : ( ( rule__SmartContract__NameAssignment_1 ) ) ;
    public final void rule__SmartContract__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBlockchain.g:1415:1: ( ( ( rule__SmartContract__NameAssignment_1 ) ) )
            // InternalBlockchain.g:1416:1: ( ( rule__SmartContract__NameAssignment_1 ) )
            {
            // InternalBlockchain.g:1416:1: ( ( rule__SmartContract__NameAssignment_1 ) )
            // InternalBlockchain.g:1417:2: ( rule__SmartContract__NameAssignment_1 )
            {
             before(grammarAccess.getSmartContractAccess().getNameAssignment_1()); 
            // InternalBlockchain.g:1418:2: ( rule__SmartContract__NameAssignment_1 )
            // InternalBlockchain.g:1418:3: rule__SmartContract__NameAssignment_1
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
    // InternalBlockchain.g:1426:1: rule__SmartContract__Group__2 : rule__SmartContract__Group__2__Impl rule__SmartContract__Group__3 ;
    public final void rule__SmartContract__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBlockchain.g:1430:1: ( rule__SmartContract__Group__2__Impl rule__SmartContract__Group__3 )
            // InternalBlockchain.g:1431:2: rule__SmartContract__Group__2__Impl rule__SmartContract__Group__3
            {
            pushFollow(FOLLOW_11);
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
    // InternalBlockchain.g:1438:1: rule__SmartContract__Group__2__Impl : ( '{' ) ;
    public final void rule__SmartContract__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBlockchain.g:1442:1: ( ( '{' ) )
            // InternalBlockchain.g:1443:1: ( '{' )
            {
            // InternalBlockchain.g:1443:1: ( '{' )
            // InternalBlockchain.g:1444:2: '{'
            {
             before(grammarAccess.getSmartContractAccess().getLeftCurlyBracketKeyword_2()); 
            match(input,36,FOLLOW_2); 
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
    // InternalBlockchain.g:1453:1: rule__SmartContract__Group__3 : rule__SmartContract__Group__3__Impl rule__SmartContract__Group__4 ;
    public final void rule__SmartContract__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBlockchain.g:1457:1: ( rule__SmartContract__Group__3__Impl rule__SmartContract__Group__4 )
            // InternalBlockchain.g:1458:2: rule__SmartContract__Group__3__Impl rule__SmartContract__Group__4
            {
            pushFollow(FOLLOW_11);
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
    // InternalBlockchain.g:1465:1: rule__SmartContract__Group__3__Impl : ( ( rule__SmartContract__Group_3__0 )? ) ;
    public final void rule__SmartContract__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBlockchain.g:1469:1: ( ( ( rule__SmartContract__Group_3__0 )? ) )
            // InternalBlockchain.g:1470:1: ( ( rule__SmartContract__Group_3__0 )? )
            {
            // InternalBlockchain.g:1470:1: ( ( rule__SmartContract__Group_3__0 )? )
            // InternalBlockchain.g:1471:2: ( rule__SmartContract__Group_3__0 )?
            {
             before(grammarAccess.getSmartContractAccess().getGroup_3()); 
            // InternalBlockchain.g:1472:2: ( rule__SmartContract__Group_3__0 )?
            int alt13=2;
            int LA13_0 = input.LA(1);

            if ( (LA13_0==40) ) {
                alt13=1;
            }
            switch (alt13) {
                case 1 :
                    // InternalBlockchain.g:1472:3: rule__SmartContract__Group_3__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__SmartContract__Group_3__0();

                    state._fsp--;


                    }
                    break;

            }

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
    // InternalBlockchain.g:1480:1: rule__SmartContract__Group__4 : rule__SmartContract__Group__4__Impl rule__SmartContract__Group__5 ;
    public final void rule__SmartContract__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBlockchain.g:1484:1: ( rule__SmartContract__Group__4__Impl rule__SmartContract__Group__5 )
            // InternalBlockchain.g:1485:2: rule__SmartContract__Group__4__Impl rule__SmartContract__Group__5
            {
            pushFollow(FOLLOW_11);
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
    // InternalBlockchain.g:1492:1: rule__SmartContract__Group__4__Impl : ( ( rule__SmartContract__Group_4__0 )? ) ;
    public final void rule__SmartContract__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBlockchain.g:1496:1: ( ( ( rule__SmartContract__Group_4__0 )? ) )
            // InternalBlockchain.g:1497:1: ( ( rule__SmartContract__Group_4__0 )? )
            {
            // InternalBlockchain.g:1497:1: ( ( rule__SmartContract__Group_4__0 )? )
            // InternalBlockchain.g:1498:2: ( rule__SmartContract__Group_4__0 )?
            {
             before(grammarAccess.getSmartContractAccess().getGroup_4()); 
            // InternalBlockchain.g:1499:2: ( rule__SmartContract__Group_4__0 )?
            int alt14=2;
            int LA14_0 = input.LA(1);

            if ( (LA14_0==48) ) {
                alt14=1;
            }
            switch (alt14) {
                case 1 :
                    // InternalBlockchain.g:1499:3: rule__SmartContract__Group_4__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__SmartContract__Group_4__0();

                    state._fsp--;


                    }
                    break;

            }

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
    // InternalBlockchain.g:1507:1: rule__SmartContract__Group__5 : rule__SmartContract__Group__5__Impl rule__SmartContract__Group__6 ;
    public final void rule__SmartContract__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBlockchain.g:1511:1: ( rule__SmartContract__Group__5__Impl rule__SmartContract__Group__6 )
            // InternalBlockchain.g:1512:2: rule__SmartContract__Group__5__Impl rule__SmartContract__Group__6
            {
            pushFollow(FOLLOW_11);
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
    // InternalBlockchain.g:1519:1: rule__SmartContract__Group__5__Impl : ( ( rule__SmartContract__Group_5__0 )? ) ;
    public final void rule__SmartContract__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBlockchain.g:1523:1: ( ( ( rule__SmartContract__Group_5__0 )? ) )
            // InternalBlockchain.g:1524:1: ( ( rule__SmartContract__Group_5__0 )? )
            {
            // InternalBlockchain.g:1524:1: ( ( rule__SmartContract__Group_5__0 )? )
            // InternalBlockchain.g:1525:2: ( rule__SmartContract__Group_5__0 )?
            {
             before(grammarAccess.getSmartContractAccess().getGroup_5()); 
            // InternalBlockchain.g:1526:2: ( rule__SmartContract__Group_5__0 )?
            int alt15=2;
            int LA15_0 = input.LA(1);

            if ( (LA15_0==41) ) {
                alt15=1;
            }
            switch (alt15) {
                case 1 :
                    // InternalBlockchain.g:1526:3: rule__SmartContract__Group_5__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__SmartContract__Group_5__0();

                    state._fsp--;


                    }
                    break;

            }

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
    // InternalBlockchain.g:1534:1: rule__SmartContract__Group__6 : rule__SmartContract__Group__6__Impl ;
    public final void rule__SmartContract__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBlockchain.g:1538:1: ( rule__SmartContract__Group__6__Impl )
            // InternalBlockchain.g:1539:2: rule__SmartContract__Group__6__Impl
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
    // InternalBlockchain.g:1545:1: rule__SmartContract__Group__6__Impl : ( '}' ) ;
    public final void rule__SmartContract__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBlockchain.g:1549:1: ( ( '}' ) )
            // InternalBlockchain.g:1550:1: ( '}' )
            {
            // InternalBlockchain.g:1550:1: ( '}' )
            // InternalBlockchain.g:1551:2: '}'
            {
             before(grammarAccess.getSmartContractAccess().getRightCurlyBracketKeyword_6()); 
            match(input,37,FOLLOW_2); 
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
    // InternalBlockchain.g:1561:1: rule__SmartContract__Group_3__0 : rule__SmartContract__Group_3__0__Impl rule__SmartContract__Group_3__1 ;
    public final void rule__SmartContract__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBlockchain.g:1565:1: ( rule__SmartContract__Group_3__0__Impl rule__SmartContract__Group_3__1 )
            // InternalBlockchain.g:1566:2: rule__SmartContract__Group_3__0__Impl rule__SmartContract__Group_3__1
            {
            pushFollow(FOLLOW_12);
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
    // InternalBlockchain.g:1573:1: rule__SmartContract__Group_3__0__Impl : ( ( rule__SmartContract__EntidadesAssignment_3_0 ) ) ;
    public final void rule__SmartContract__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBlockchain.g:1577:1: ( ( ( rule__SmartContract__EntidadesAssignment_3_0 ) ) )
            // InternalBlockchain.g:1578:1: ( ( rule__SmartContract__EntidadesAssignment_3_0 ) )
            {
            // InternalBlockchain.g:1578:1: ( ( rule__SmartContract__EntidadesAssignment_3_0 ) )
            // InternalBlockchain.g:1579:2: ( rule__SmartContract__EntidadesAssignment_3_0 )
            {
             before(grammarAccess.getSmartContractAccess().getEntidadesAssignment_3_0()); 
            // InternalBlockchain.g:1580:2: ( rule__SmartContract__EntidadesAssignment_3_0 )
            // InternalBlockchain.g:1580:3: rule__SmartContract__EntidadesAssignment_3_0
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
    // InternalBlockchain.g:1588:1: rule__SmartContract__Group_3__1 : rule__SmartContract__Group_3__1__Impl ;
    public final void rule__SmartContract__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBlockchain.g:1592:1: ( rule__SmartContract__Group_3__1__Impl )
            // InternalBlockchain.g:1593:2: rule__SmartContract__Group_3__1__Impl
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
    // InternalBlockchain.g:1599:1: rule__SmartContract__Group_3__1__Impl : ( ( rule__SmartContract__EntidadesAssignment_3_1 )* ) ;
    public final void rule__SmartContract__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBlockchain.g:1603:1: ( ( ( rule__SmartContract__EntidadesAssignment_3_1 )* ) )
            // InternalBlockchain.g:1604:1: ( ( rule__SmartContract__EntidadesAssignment_3_1 )* )
            {
            // InternalBlockchain.g:1604:1: ( ( rule__SmartContract__EntidadesAssignment_3_1 )* )
            // InternalBlockchain.g:1605:2: ( rule__SmartContract__EntidadesAssignment_3_1 )*
            {
             before(grammarAccess.getSmartContractAccess().getEntidadesAssignment_3_1()); 
            // InternalBlockchain.g:1606:2: ( rule__SmartContract__EntidadesAssignment_3_1 )*
            loop16:
            do {
                int alt16=2;
                int LA16_0 = input.LA(1);

                if ( (LA16_0==40) ) {
                    alt16=1;
                }


                switch (alt16) {
            	case 1 :
            	    // InternalBlockchain.g:1606:3: rule__SmartContract__EntidadesAssignment_3_1
            	    {
            	    pushFollow(FOLLOW_13);
            	    rule__SmartContract__EntidadesAssignment_3_1();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop16;
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
    // InternalBlockchain.g:1615:1: rule__SmartContract__Group_4__0 : rule__SmartContract__Group_4__0__Impl rule__SmartContract__Group_4__1 ;
    public final void rule__SmartContract__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBlockchain.g:1619:1: ( rule__SmartContract__Group_4__0__Impl rule__SmartContract__Group_4__1 )
            // InternalBlockchain.g:1620:2: rule__SmartContract__Group_4__0__Impl rule__SmartContract__Group_4__1
            {
            pushFollow(FOLLOW_14);
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
    // InternalBlockchain.g:1627:1: rule__SmartContract__Group_4__0__Impl : ( ( rule__SmartContract__EstadoAssignment_4_0 ) ) ;
    public final void rule__SmartContract__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBlockchain.g:1631:1: ( ( ( rule__SmartContract__EstadoAssignment_4_0 ) ) )
            // InternalBlockchain.g:1632:1: ( ( rule__SmartContract__EstadoAssignment_4_0 ) )
            {
            // InternalBlockchain.g:1632:1: ( ( rule__SmartContract__EstadoAssignment_4_0 ) )
            // InternalBlockchain.g:1633:2: ( rule__SmartContract__EstadoAssignment_4_0 )
            {
             before(grammarAccess.getSmartContractAccess().getEstadoAssignment_4_0()); 
            // InternalBlockchain.g:1634:2: ( rule__SmartContract__EstadoAssignment_4_0 )
            // InternalBlockchain.g:1634:3: rule__SmartContract__EstadoAssignment_4_0
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
    // InternalBlockchain.g:1642:1: rule__SmartContract__Group_4__1 : rule__SmartContract__Group_4__1__Impl ;
    public final void rule__SmartContract__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBlockchain.g:1646:1: ( rule__SmartContract__Group_4__1__Impl )
            // InternalBlockchain.g:1647:2: rule__SmartContract__Group_4__1__Impl
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
    // InternalBlockchain.g:1653:1: rule__SmartContract__Group_4__1__Impl : ( ( rule__SmartContract__EstadoAssignment_4_1 )* ) ;
    public final void rule__SmartContract__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBlockchain.g:1657:1: ( ( ( rule__SmartContract__EstadoAssignment_4_1 )* ) )
            // InternalBlockchain.g:1658:1: ( ( rule__SmartContract__EstadoAssignment_4_1 )* )
            {
            // InternalBlockchain.g:1658:1: ( ( rule__SmartContract__EstadoAssignment_4_1 )* )
            // InternalBlockchain.g:1659:2: ( rule__SmartContract__EstadoAssignment_4_1 )*
            {
             before(grammarAccess.getSmartContractAccess().getEstadoAssignment_4_1()); 
            // InternalBlockchain.g:1660:2: ( rule__SmartContract__EstadoAssignment_4_1 )*
            loop17:
            do {
                int alt17=2;
                int LA17_0 = input.LA(1);

                if ( (LA17_0==48) ) {
                    alt17=1;
                }


                switch (alt17) {
            	case 1 :
            	    // InternalBlockchain.g:1660:3: rule__SmartContract__EstadoAssignment_4_1
            	    {
            	    pushFollow(FOLLOW_15);
            	    rule__SmartContract__EstadoAssignment_4_1();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop17;
                }
            } while (true);

             after(grammarAccess.getSmartContractAccess().getEstadoAssignment_4_1()); 

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


    // $ANTLR start "rule__SmartContract__Group_5__0"
    // InternalBlockchain.g:1669:1: rule__SmartContract__Group_5__0 : rule__SmartContract__Group_5__0__Impl rule__SmartContract__Group_5__1 ;
    public final void rule__SmartContract__Group_5__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBlockchain.g:1673:1: ( rule__SmartContract__Group_5__0__Impl rule__SmartContract__Group_5__1 )
            // InternalBlockchain.g:1674:2: rule__SmartContract__Group_5__0__Impl rule__SmartContract__Group_5__1
            {
            pushFollow(FOLLOW_16);
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
    // InternalBlockchain.g:1681:1: rule__SmartContract__Group_5__0__Impl : ( ( rule__SmartContract__OperacionesAssignment_5_0 ) ) ;
    public final void rule__SmartContract__Group_5__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBlockchain.g:1685:1: ( ( ( rule__SmartContract__OperacionesAssignment_5_0 ) ) )
            // InternalBlockchain.g:1686:1: ( ( rule__SmartContract__OperacionesAssignment_5_0 ) )
            {
            // InternalBlockchain.g:1686:1: ( ( rule__SmartContract__OperacionesAssignment_5_0 ) )
            // InternalBlockchain.g:1687:2: ( rule__SmartContract__OperacionesAssignment_5_0 )
            {
             before(grammarAccess.getSmartContractAccess().getOperacionesAssignment_5_0()); 
            // InternalBlockchain.g:1688:2: ( rule__SmartContract__OperacionesAssignment_5_0 )
            // InternalBlockchain.g:1688:3: rule__SmartContract__OperacionesAssignment_5_0
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
    // InternalBlockchain.g:1696:1: rule__SmartContract__Group_5__1 : rule__SmartContract__Group_5__1__Impl ;
    public final void rule__SmartContract__Group_5__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBlockchain.g:1700:1: ( rule__SmartContract__Group_5__1__Impl )
            // InternalBlockchain.g:1701:2: rule__SmartContract__Group_5__1__Impl
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
    // InternalBlockchain.g:1707:1: rule__SmartContract__Group_5__1__Impl : ( ( rule__SmartContract__OperacionesAssignment_5_1 )* ) ;
    public final void rule__SmartContract__Group_5__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBlockchain.g:1711:1: ( ( ( rule__SmartContract__OperacionesAssignment_5_1 )* ) )
            // InternalBlockchain.g:1712:1: ( ( rule__SmartContract__OperacionesAssignment_5_1 )* )
            {
            // InternalBlockchain.g:1712:1: ( ( rule__SmartContract__OperacionesAssignment_5_1 )* )
            // InternalBlockchain.g:1713:2: ( rule__SmartContract__OperacionesAssignment_5_1 )*
            {
             before(grammarAccess.getSmartContractAccess().getOperacionesAssignment_5_1()); 
            // InternalBlockchain.g:1714:2: ( rule__SmartContract__OperacionesAssignment_5_1 )*
            loop18:
            do {
                int alt18=2;
                int LA18_0 = input.LA(1);

                if ( (LA18_0==41) ) {
                    alt18=1;
                }


                switch (alt18) {
            	case 1 :
            	    // InternalBlockchain.g:1714:3: rule__SmartContract__OperacionesAssignment_5_1
            	    {
            	    pushFollow(FOLLOW_17);
            	    rule__SmartContract__OperacionesAssignment_5_1();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop18;
                }
            } while (true);

             after(grammarAccess.getSmartContractAccess().getOperacionesAssignment_5_1()); 

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


    // $ANTLR start "rule__Entidad__Group__0"
    // InternalBlockchain.g:1723:1: rule__Entidad__Group__0 : rule__Entidad__Group__0__Impl rule__Entidad__Group__1 ;
    public final void rule__Entidad__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBlockchain.g:1727:1: ( rule__Entidad__Group__0__Impl rule__Entidad__Group__1 )
            // InternalBlockchain.g:1728:2: rule__Entidad__Group__0__Impl rule__Entidad__Group__1
            {
            pushFollow(FOLLOW_12);
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
    // InternalBlockchain.g:1735:1: rule__Entidad__Group__0__Impl : ( () ) ;
    public final void rule__Entidad__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBlockchain.g:1739:1: ( ( () ) )
            // InternalBlockchain.g:1740:1: ( () )
            {
            // InternalBlockchain.g:1740:1: ( () )
            // InternalBlockchain.g:1741:2: ()
            {
             before(grammarAccess.getEntidadAccess().getEntidadAction_0()); 
            // InternalBlockchain.g:1742:2: ()
            // InternalBlockchain.g:1742:3: 
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
    // InternalBlockchain.g:1750:1: rule__Entidad__Group__1 : rule__Entidad__Group__1__Impl rule__Entidad__Group__2 ;
    public final void rule__Entidad__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBlockchain.g:1754:1: ( rule__Entidad__Group__1__Impl rule__Entidad__Group__2 )
            // InternalBlockchain.g:1755:2: rule__Entidad__Group__1__Impl rule__Entidad__Group__2
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
    // InternalBlockchain.g:1762:1: rule__Entidad__Group__1__Impl : ( 'Entidad' ) ;
    public final void rule__Entidad__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBlockchain.g:1766:1: ( ( 'Entidad' ) )
            // InternalBlockchain.g:1767:1: ( 'Entidad' )
            {
            // InternalBlockchain.g:1767:1: ( 'Entidad' )
            // InternalBlockchain.g:1768:2: 'Entidad'
            {
             before(grammarAccess.getEntidadAccess().getEntidadKeyword_1()); 
            match(input,40,FOLLOW_2); 
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
    // InternalBlockchain.g:1777:1: rule__Entidad__Group__2 : rule__Entidad__Group__2__Impl rule__Entidad__Group__3 ;
    public final void rule__Entidad__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBlockchain.g:1781:1: ( rule__Entidad__Group__2__Impl rule__Entidad__Group__3 )
            // InternalBlockchain.g:1782:2: rule__Entidad__Group__2__Impl rule__Entidad__Group__3
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
    // InternalBlockchain.g:1789:1: rule__Entidad__Group__2__Impl : ( ( rule__Entidad__NameAssignment_2 ) ) ;
    public final void rule__Entidad__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBlockchain.g:1793:1: ( ( ( rule__Entidad__NameAssignment_2 ) ) )
            // InternalBlockchain.g:1794:1: ( ( rule__Entidad__NameAssignment_2 ) )
            {
            // InternalBlockchain.g:1794:1: ( ( rule__Entidad__NameAssignment_2 ) )
            // InternalBlockchain.g:1795:2: ( rule__Entidad__NameAssignment_2 )
            {
             before(grammarAccess.getEntidadAccess().getNameAssignment_2()); 
            // InternalBlockchain.g:1796:2: ( rule__Entidad__NameAssignment_2 )
            // InternalBlockchain.g:1796:3: rule__Entidad__NameAssignment_2
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
    // InternalBlockchain.g:1804:1: rule__Entidad__Group__3 : rule__Entidad__Group__3__Impl rule__Entidad__Group__4 ;
    public final void rule__Entidad__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBlockchain.g:1808:1: ( rule__Entidad__Group__3__Impl rule__Entidad__Group__4 )
            // InternalBlockchain.g:1809:2: rule__Entidad__Group__3__Impl rule__Entidad__Group__4
            {
            pushFollow(FOLLOW_18);
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
    // InternalBlockchain.g:1816:1: rule__Entidad__Group__3__Impl : ( '{' ) ;
    public final void rule__Entidad__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBlockchain.g:1820:1: ( ( '{' ) )
            // InternalBlockchain.g:1821:1: ( '{' )
            {
            // InternalBlockchain.g:1821:1: ( '{' )
            // InternalBlockchain.g:1822:2: '{'
            {
             before(grammarAccess.getEntidadAccess().getLeftCurlyBracketKeyword_3()); 
            match(input,36,FOLLOW_2); 
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
    // InternalBlockchain.g:1831:1: rule__Entidad__Group__4 : rule__Entidad__Group__4__Impl rule__Entidad__Group__5 ;
    public final void rule__Entidad__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBlockchain.g:1835:1: ( rule__Entidad__Group__4__Impl rule__Entidad__Group__5 )
            // InternalBlockchain.g:1836:2: rule__Entidad__Group__4__Impl rule__Entidad__Group__5
            {
            pushFollow(FOLLOW_18);
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
    // InternalBlockchain.g:1843:1: rule__Entidad__Group__4__Impl : ( ( rule__Entidad__Group_4__0 )? ) ;
    public final void rule__Entidad__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBlockchain.g:1847:1: ( ( ( rule__Entidad__Group_4__0 )? ) )
            // InternalBlockchain.g:1848:1: ( ( rule__Entidad__Group_4__0 )? )
            {
            // InternalBlockchain.g:1848:1: ( ( rule__Entidad__Group_4__0 )? )
            // InternalBlockchain.g:1849:2: ( rule__Entidad__Group_4__0 )?
            {
             before(grammarAccess.getEntidadAccess().getGroup_4()); 
            // InternalBlockchain.g:1850:2: ( rule__Entidad__Group_4__0 )?
            int alt19=2;
            int LA19_0 = input.LA(1);

            if ( ((LA19_0>=RULE_STRING && LA19_0<=RULE_ID)) ) {
                alt19=1;
            }
            switch (alt19) {
                case 1 :
                    // InternalBlockchain.g:1850:3: rule__Entidad__Group_4__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Entidad__Group_4__0();

                    state._fsp--;


                    }
                    break;

            }

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
    // InternalBlockchain.g:1858:1: rule__Entidad__Group__5 : rule__Entidad__Group__5__Impl ;
    public final void rule__Entidad__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBlockchain.g:1862:1: ( rule__Entidad__Group__5__Impl )
            // InternalBlockchain.g:1863:2: rule__Entidad__Group__5__Impl
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
    // InternalBlockchain.g:1869:1: rule__Entidad__Group__5__Impl : ( '}' ) ;
    public final void rule__Entidad__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBlockchain.g:1873:1: ( ( '}' ) )
            // InternalBlockchain.g:1874:1: ( '}' )
            {
            // InternalBlockchain.g:1874:1: ( '}' )
            // InternalBlockchain.g:1875:2: '}'
            {
             before(grammarAccess.getEntidadAccess().getRightCurlyBracketKeyword_5()); 
            match(input,37,FOLLOW_2); 
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
    // InternalBlockchain.g:1885:1: rule__Entidad__Group_4__0 : rule__Entidad__Group_4__0__Impl rule__Entidad__Group_4__1 ;
    public final void rule__Entidad__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBlockchain.g:1889:1: ( rule__Entidad__Group_4__0__Impl rule__Entidad__Group_4__1 )
            // InternalBlockchain.g:1890:2: rule__Entidad__Group_4__0__Impl rule__Entidad__Group_4__1
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
    // InternalBlockchain.g:1897:1: rule__Entidad__Group_4__0__Impl : ( ( rule__Entidad__AtributosAssignment_4_0 ) ) ;
    public final void rule__Entidad__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBlockchain.g:1901:1: ( ( ( rule__Entidad__AtributosAssignment_4_0 ) ) )
            // InternalBlockchain.g:1902:1: ( ( rule__Entidad__AtributosAssignment_4_0 ) )
            {
            // InternalBlockchain.g:1902:1: ( ( rule__Entidad__AtributosAssignment_4_0 ) )
            // InternalBlockchain.g:1903:2: ( rule__Entidad__AtributosAssignment_4_0 )
            {
             before(grammarAccess.getEntidadAccess().getAtributosAssignment_4_0()); 
            // InternalBlockchain.g:1904:2: ( rule__Entidad__AtributosAssignment_4_0 )
            // InternalBlockchain.g:1904:3: rule__Entidad__AtributosAssignment_4_0
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
    // InternalBlockchain.g:1912:1: rule__Entidad__Group_4__1 : rule__Entidad__Group_4__1__Impl ;
    public final void rule__Entidad__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBlockchain.g:1916:1: ( rule__Entidad__Group_4__1__Impl )
            // InternalBlockchain.g:1917:2: rule__Entidad__Group_4__1__Impl
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
    // InternalBlockchain.g:1923:1: rule__Entidad__Group_4__1__Impl : ( ( rule__Entidad__AtributosAssignment_4_1 )* ) ;
    public final void rule__Entidad__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBlockchain.g:1927:1: ( ( ( rule__Entidad__AtributosAssignment_4_1 )* ) )
            // InternalBlockchain.g:1928:1: ( ( rule__Entidad__AtributosAssignment_4_1 )* )
            {
            // InternalBlockchain.g:1928:1: ( ( rule__Entidad__AtributosAssignment_4_1 )* )
            // InternalBlockchain.g:1929:2: ( rule__Entidad__AtributosAssignment_4_1 )*
            {
             before(grammarAccess.getEntidadAccess().getAtributosAssignment_4_1()); 
            // InternalBlockchain.g:1930:2: ( rule__Entidad__AtributosAssignment_4_1 )*
            loop20:
            do {
                int alt20=2;
                int LA20_0 = input.LA(1);

                if ( ((LA20_0>=RULE_STRING && LA20_0<=RULE_ID)) ) {
                    alt20=1;
                }


                switch (alt20) {
            	case 1 :
            	    // InternalBlockchain.g:1930:3: rule__Entidad__AtributosAssignment_4_1
            	    {
            	    pushFollow(FOLLOW_19);
            	    rule__Entidad__AtributosAssignment_4_1();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop20;
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
    // InternalBlockchain.g:1939:1: rule__Operacion__Group__0 : rule__Operacion__Group__0__Impl rule__Operacion__Group__1 ;
    public final void rule__Operacion__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBlockchain.g:1943:1: ( rule__Operacion__Group__0__Impl rule__Operacion__Group__1 )
            // InternalBlockchain.g:1944:2: rule__Operacion__Group__0__Impl rule__Operacion__Group__1
            {
            pushFollow(FOLLOW_20);
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
    // InternalBlockchain.g:1951:1: rule__Operacion__Group__0__Impl : ( 'Operacion' ) ;
    public final void rule__Operacion__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBlockchain.g:1955:1: ( ( 'Operacion' ) )
            // InternalBlockchain.g:1956:1: ( 'Operacion' )
            {
            // InternalBlockchain.g:1956:1: ( 'Operacion' )
            // InternalBlockchain.g:1957:2: 'Operacion'
            {
             before(grammarAccess.getOperacionAccess().getOperacionKeyword_0()); 
            match(input,41,FOLLOW_2); 
             after(grammarAccess.getOperacionAccess().getOperacionKeyword_0()); 

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
    // $ANTLR end "rule__Operacion__Group__0__Impl"


    // $ANTLR start "rule__Operacion__Group__1"
    // InternalBlockchain.g:1966:1: rule__Operacion__Group__1 : rule__Operacion__Group__1__Impl rule__Operacion__Group__2 ;
    public final void rule__Operacion__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBlockchain.g:1970:1: ( rule__Operacion__Group__1__Impl rule__Operacion__Group__2 )
            // InternalBlockchain.g:1971:2: rule__Operacion__Group__1__Impl rule__Operacion__Group__2
            {
            pushFollow(FOLLOW_20);
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
    // InternalBlockchain.g:1978:1: rule__Operacion__Group__1__Impl : ( ( rule__Operacion__Group_1__0 )? ) ;
    public final void rule__Operacion__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBlockchain.g:1982:1: ( ( ( rule__Operacion__Group_1__0 )? ) )
            // InternalBlockchain.g:1983:1: ( ( rule__Operacion__Group_1__0 )? )
            {
            // InternalBlockchain.g:1983:1: ( ( rule__Operacion__Group_1__0 )? )
            // InternalBlockchain.g:1984:2: ( rule__Operacion__Group_1__0 )?
            {
             before(grammarAccess.getOperacionAccess().getGroup_1()); 
            // InternalBlockchain.g:1985:2: ( rule__Operacion__Group_1__0 )?
            int alt21=2;
            int LA21_0 = input.LA(1);

            if ( (LA21_0==45) ) {
                alt21=1;
            }
            switch (alt21) {
                case 1 :
                    // InternalBlockchain.g:1985:3: rule__Operacion__Group_1__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Operacion__Group_1__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getOperacionAccess().getGroup_1()); 

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
    // InternalBlockchain.g:1993:1: rule__Operacion__Group__2 : rule__Operacion__Group__2__Impl rule__Operacion__Group__3 ;
    public final void rule__Operacion__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBlockchain.g:1997:1: ( rule__Operacion__Group__2__Impl rule__Operacion__Group__3 )
            // InternalBlockchain.g:1998:2: rule__Operacion__Group__2__Impl rule__Operacion__Group__3
            {
            pushFollow(FOLLOW_21);
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
    // InternalBlockchain.g:2005:1: rule__Operacion__Group__2__Impl : ( ( rule__Operacion__NameAssignment_2 ) ) ;
    public final void rule__Operacion__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBlockchain.g:2009:1: ( ( ( rule__Operacion__NameAssignment_2 ) ) )
            // InternalBlockchain.g:2010:1: ( ( rule__Operacion__NameAssignment_2 ) )
            {
            // InternalBlockchain.g:2010:1: ( ( rule__Operacion__NameAssignment_2 ) )
            // InternalBlockchain.g:2011:2: ( rule__Operacion__NameAssignment_2 )
            {
             before(grammarAccess.getOperacionAccess().getNameAssignment_2()); 
            // InternalBlockchain.g:2012:2: ( rule__Operacion__NameAssignment_2 )
            // InternalBlockchain.g:2012:3: rule__Operacion__NameAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__Operacion__NameAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getOperacionAccess().getNameAssignment_2()); 

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
    // InternalBlockchain.g:2020:1: rule__Operacion__Group__3 : rule__Operacion__Group__3__Impl rule__Operacion__Group__4 ;
    public final void rule__Operacion__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBlockchain.g:2024:1: ( rule__Operacion__Group__3__Impl rule__Operacion__Group__4 )
            // InternalBlockchain.g:2025:2: rule__Operacion__Group__3__Impl rule__Operacion__Group__4
            {
            pushFollow(FOLLOW_22);
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
    // InternalBlockchain.g:2032:1: rule__Operacion__Group__3__Impl : ( '(' ) ;
    public final void rule__Operacion__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBlockchain.g:2036:1: ( ( '(' ) )
            // InternalBlockchain.g:2037:1: ( '(' )
            {
            // InternalBlockchain.g:2037:1: ( '(' )
            // InternalBlockchain.g:2038:2: '('
            {
             before(grammarAccess.getOperacionAccess().getLeftParenthesisKeyword_3()); 
            match(input,42,FOLLOW_2); 
             after(grammarAccess.getOperacionAccess().getLeftParenthesisKeyword_3()); 

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
    // InternalBlockchain.g:2047:1: rule__Operacion__Group__4 : rule__Operacion__Group__4__Impl rule__Operacion__Group__5 ;
    public final void rule__Operacion__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBlockchain.g:2051:1: ( rule__Operacion__Group__4__Impl rule__Operacion__Group__5 )
            // InternalBlockchain.g:2052:2: rule__Operacion__Group__4__Impl rule__Operacion__Group__5
            {
            pushFollow(FOLLOW_22);
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
    // InternalBlockchain.g:2059:1: rule__Operacion__Group__4__Impl : ( ( rule__Operacion__Group_4__0 )? ) ;
    public final void rule__Operacion__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBlockchain.g:2063:1: ( ( ( rule__Operacion__Group_4__0 )? ) )
            // InternalBlockchain.g:2064:1: ( ( rule__Operacion__Group_4__0 )? )
            {
            // InternalBlockchain.g:2064:1: ( ( rule__Operacion__Group_4__0 )? )
            // InternalBlockchain.g:2065:2: ( rule__Operacion__Group_4__0 )?
            {
             before(grammarAccess.getOperacionAccess().getGroup_4()); 
            // InternalBlockchain.g:2066:2: ( rule__Operacion__Group_4__0 )?
            int alt22=2;
            int LA22_0 = input.LA(1);

            if ( ((LA22_0>=RULE_STRING && LA22_0<=RULE_ID)) ) {
                alt22=1;
            }
            switch (alt22) {
                case 1 :
                    // InternalBlockchain.g:2066:3: rule__Operacion__Group_4__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Operacion__Group_4__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getOperacionAccess().getGroup_4()); 

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
    // InternalBlockchain.g:2074:1: rule__Operacion__Group__5 : rule__Operacion__Group__5__Impl rule__Operacion__Group__6 ;
    public final void rule__Operacion__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBlockchain.g:2078:1: ( rule__Operacion__Group__5__Impl rule__Operacion__Group__6 )
            // InternalBlockchain.g:2079:2: rule__Operacion__Group__5__Impl rule__Operacion__Group__6
            {
            pushFollow(FOLLOW_23);
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
    // InternalBlockchain.g:2086:1: rule__Operacion__Group__5__Impl : ( ')' ) ;
    public final void rule__Operacion__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBlockchain.g:2090:1: ( ( ')' ) )
            // InternalBlockchain.g:2091:1: ( ')' )
            {
            // InternalBlockchain.g:2091:1: ( ')' )
            // InternalBlockchain.g:2092:2: ')'
            {
             before(grammarAccess.getOperacionAccess().getRightParenthesisKeyword_5()); 
            match(input,43,FOLLOW_2); 
             after(grammarAccess.getOperacionAccess().getRightParenthesisKeyword_5()); 

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
    // InternalBlockchain.g:2101:1: rule__Operacion__Group__6 : rule__Operacion__Group__6__Impl rule__Operacion__Group__7 ;
    public final void rule__Operacion__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBlockchain.g:2105:1: ( rule__Operacion__Group__6__Impl rule__Operacion__Group__7 )
            // InternalBlockchain.g:2106:2: rule__Operacion__Group__6__Impl rule__Operacion__Group__7
            {
            pushFollow(FOLLOW_23);
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
    // InternalBlockchain.g:2113:1: rule__Operacion__Group__6__Impl : ( ( rule__Operacion__Group_6__0 )? ) ;
    public final void rule__Operacion__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBlockchain.g:2117:1: ( ( ( rule__Operacion__Group_6__0 )? ) )
            // InternalBlockchain.g:2118:1: ( ( rule__Operacion__Group_6__0 )? )
            {
            // InternalBlockchain.g:2118:1: ( ( rule__Operacion__Group_6__0 )? )
            // InternalBlockchain.g:2119:2: ( rule__Operacion__Group_6__0 )?
            {
             before(grammarAccess.getOperacionAccess().getGroup_6()); 
            // InternalBlockchain.g:2120:2: ( rule__Operacion__Group_6__0 )?
            int alt23=2;
            int LA23_0 = input.LA(1);

            if ( (LA23_0==47) ) {
                alt23=1;
            }
            switch (alt23) {
                case 1 :
                    // InternalBlockchain.g:2120:3: rule__Operacion__Group_6__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Operacion__Group_6__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getOperacionAccess().getGroup_6()); 

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
    // InternalBlockchain.g:2128:1: rule__Operacion__Group__7 : rule__Operacion__Group__7__Impl rule__Operacion__Group__8 ;
    public final void rule__Operacion__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBlockchain.g:2132:1: ( rule__Operacion__Group__7__Impl rule__Operacion__Group__8 )
            // InternalBlockchain.g:2133:2: rule__Operacion__Group__7__Impl rule__Operacion__Group__8
            {
            pushFollow(FOLLOW_24);
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
    // InternalBlockchain.g:2140:1: rule__Operacion__Group__7__Impl : ( '{' ) ;
    public final void rule__Operacion__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBlockchain.g:2144:1: ( ( '{' ) )
            // InternalBlockchain.g:2145:1: ( '{' )
            {
            // InternalBlockchain.g:2145:1: ( '{' )
            // InternalBlockchain.g:2146:2: '{'
            {
             before(grammarAccess.getOperacionAccess().getLeftCurlyBracketKeyword_7()); 
            match(input,36,FOLLOW_2); 
             after(grammarAccess.getOperacionAccess().getLeftCurlyBracketKeyword_7()); 

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
    // InternalBlockchain.g:2155:1: rule__Operacion__Group__8 : rule__Operacion__Group__8__Impl rule__Operacion__Group__9 ;
    public final void rule__Operacion__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBlockchain.g:2159:1: ( rule__Operacion__Group__8__Impl rule__Operacion__Group__9 )
            // InternalBlockchain.g:2160:2: rule__Operacion__Group__8__Impl rule__Operacion__Group__9
            {
            pushFollow(FOLLOW_24);
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
    // InternalBlockchain.g:2167:1: rule__Operacion__Group__8__Impl : ( ( 'return' )? ) ;
    public final void rule__Operacion__Group__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBlockchain.g:2171:1: ( ( ( 'return' )? ) )
            // InternalBlockchain.g:2172:1: ( ( 'return' )? )
            {
            // InternalBlockchain.g:2172:1: ( ( 'return' )? )
            // InternalBlockchain.g:2173:2: ( 'return' )?
            {
             before(grammarAccess.getOperacionAccess().getReturnKeyword_8()); 
            // InternalBlockchain.g:2174:2: ( 'return' )?
            int alt24=2;
            int LA24_0 = input.LA(1);

            if ( (LA24_0==44) ) {
                alt24=1;
            }
            switch (alt24) {
                case 1 :
                    // InternalBlockchain.g:2174:3: 'return'
                    {
                    match(input,44,FOLLOW_2); 

                    }
                    break;

            }

             after(grammarAccess.getOperacionAccess().getReturnKeyword_8()); 

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
    // InternalBlockchain.g:2182:1: rule__Operacion__Group__9 : rule__Operacion__Group__9__Impl rule__Operacion__Group__10 ;
    public final void rule__Operacion__Group__9() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBlockchain.g:2186:1: ( rule__Operacion__Group__9__Impl rule__Operacion__Group__10 )
            // InternalBlockchain.g:2187:2: rule__Operacion__Group__9__Impl rule__Operacion__Group__10
            {
            pushFollow(FOLLOW_24);
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
    // InternalBlockchain.g:2194:1: rule__Operacion__Group__9__Impl : ( ( '(' )* ) ;
    public final void rule__Operacion__Group__9__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBlockchain.g:2198:1: ( ( ( '(' )* ) )
            // InternalBlockchain.g:2199:1: ( ( '(' )* )
            {
            // InternalBlockchain.g:2199:1: ( ( '(' )* )
            // InternalBlockchain.g:2200:2: ( '(' )*
            {
             before(grammarAccess.getOperacionAccess().getLeftParenthesisKeyword_9()); 
            // InternalBlockchain.g:2201:2: ( '(' )*
            loop25:
            do {
                int alt25=2;
                int LA25_0 = input.LA(1);

                if ( (LA25_0==42) ) {
                    alt25=1;
                }


                switch (alt25) {
            	case 1 :
            	    // InternalBlockchain.g:2201:3: '('
            	    {
            	    match(input,42,FOLLOW_25); 

            	    }
            	    break;

            	default :
            	    break loop25;
                }
            } while (true);

             after(grammarAccess.getOperacionAccess().getLeftParenthesisKeyword_9()); 

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
    // InternalBlockchain.g:2209:1: rule__Operacion__Group__10 : rule__Operacion__Group__10__Impl rule__Operacion__Group__11 ;
    public final void rule__Operacion__Group__10() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBlockchain.g:2213:1: ( rule__Operacion__Group__10__Impl rule__Operacion__Group__11 )
            // InternalBlockchain.g:2214:2: rule__Operacion__Group__10__Impl rule__Operacion__Group__11
            {
            pushFollow(FOLLOW_24);
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
    // InternalBlockchain.g:2221:1: rule__Operacion__Group__10__Impl : ( ( rule__Operacion__LineasAssignment_10 )* ) ;
    public final void rule__Operacion__Group__10__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBlockchain.g:2225:1: ( ( ( rule__Operacion__LineasAssignment_10 )* ) )
            // InternalBlockchain.g:2226:1: ( ( rule__Operacion__LineasAssignment_10 )* )
            {
            // InternalBlockchain.g:2226:1: ( ( rule__Operacion__LineasAssignment_10 )* )
            // InternalBlockchain.g:2227:2: ( rule__Operacion__LineasAssignment_10 )*
            {
             before(grammarAccess.getOperacionAccess().getLineasAssignment_10()); 
            // InternalBlockchain.g:2228:2: ( rule__Operacion__LineasAssignment_10 )*
            loop26:
            do {
                int alt26=2;
                int LA26_0 = input.LA(1);

                if ( ((LA26_0>=49 && LA26_0<=52)||(LA26_0>=54 && LA26_0<=57)||LA26_0==59) ) {
                    alt26=1;
                }


                switch (alt26) {
            	case 1 :
            	    // InternalBlockchain.g:2228:3: rule__Operacion__LineasAssignment_10
            	    {
            	    pushFollow(FOLLOW_26);
            	    rule__Operacion__LineasAssignment_10();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop26;
                }
            } while (true);

             after(grammarAccess.getOperacionAccess().getLineasAssignment_10()); 

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
    // InternalBlockchain.g:2236:1: rule__Operacion__Group__11 : rule__Operacion__Group__11__Impl rule__Operacion__Group__12 ;
    public final void rule__Operacion__Group__11() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBlockchain.g:2240:1: ( rule__Operacion__Group__11__Impl rule__Operacion__Group__12 )
            // InternalBlockchain.g:2241:2: rule__Operacion__Group__11__Impl rule__Operacion__Group__12
            {
            pushFollow(FOLLOW_24);
            rule__Operacion__Group__11__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Operacion__Group__12();

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
    // InternalBlockchain.g:2248:1: rule__Operacion__Group__11__Impl : ( ( ')' )* ) ;
    public final void rule__Operacion__Group__11__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBlockchain.g:2252:1: ( ( ( ')' )* ) )
            // InternalBlockchain.g:2253:1: ( ( ')' )* )
            {
            // InternalBlockchain.g:2253:1: ( ( ')' )* )
            // InternalBlockchain.g:2254:2: ( ')' )*
            {
             before(grammarAccess.getOperacionAccess().getRightParenthesisKeyword_11()); 
            // InternalBlockchain.g:2255:2: ( ')' )*
            loop27:
            do {
                int alt27=2;
                int LA27_0 = input.LA(1);

                if ( (LA27_0==43) ) {
                    alt27=1;
                }


                switch (alt27) {
            	case 1 :
            	    // InternalBlockchain.g:2255:3: ')'
            	    {
            	    match(input,43,FOLLOW_27); 

            	    }
            	    break;

            	default :
            	    break loop27;
                }
            } while (true);

             after(grammarAccess.getOperacionAccess().getRightParenthesisKeyword_11()); 

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


    // $ANTLR start "rule__Operacion__Group__12"
    // InternalBlockchain.g:2263:1: rule__Operacion__Group__12 : rule__Operacion__Group__12__Impl ;
    public final void rule__Operacion__Group__12() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBlockchain.g:2267:1: ( rule__Operacion__Group__12__Impl )
            // InternalBlockchain.g:2268:2: rule__Operacion__Group__12__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Operacion__Group__12__Impl();

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
    // $ANTLR end "rule__Operacion__Group__12"


    // $ANTLR start "rule__Operacion__Group__12__Impl"
    // InternalBlockchain.g:2274:1: rule__Operacion__Group__12__Impl : ( '}' ) ;
    public final void rule__Operacion__Group__12__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBlockchain.g:2278:1: ( ( '}' ) )
            // InternalBlockchain.g:2279:1: ( '}' )
            {
            // InternalBlockchain.g:2279:1: ( '}' )
            // InternalBlockchain.g:2280:2: '}'
            {
             before(grammarAccess.getOperacionAccess().getRightCurlyBracketKeyword_12()); 
            match(input,37,FOLLOW_2); 
             after(grammarAccess.getOperacionAccess().getRightCurlyBracketKeyword_12()); 

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
    // $ANTLR end "rule__Operacion__Group__12__Impl"


    // $ANTLR start "rule__Operacion__Group_1__0"
    // InternalBlockchain.g:2290:1: rule__Operacion__Group_1__0 : rule__Operacion__Group_1__0__Impl rule__Operacion__Group_1__1 ;
    public final void rule__Operacion__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBlockchain.g:2294:1: ( rule__Operacion__Group_1__0__Impl rule__Operacion__Group_1__1 )
            // InternalBlockchain.g:2295:2: rule__Operacion__Group_1__0__Impl rule__Operacion__Group_1__1
            {
            pushFollow(FOLLOW_28);
            rule__Operacion__Group_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Operacion__Group_1__1();

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
    // $ANTLR end "rule__Operacion__Group_1__0"


    // $ANTLR start "rule__Operacion__Group_1__0__Impl"
    // InternalBlockchain.g:2302:1: rule__Operacion__Group_1__0__Impl : ( 'isUd=' ) ;
    public final void rule__Operacion__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBlockchain.g:2306:1: ( ( 'isUd=' ) )
            // InternalBlockchain.g:2307:1: ( 'isUd=' )
            {
            // InternalBlockchain.g:2307:1: ( 'isUd=' )
            // InternalBlockchain.g:2308:2: 'isUd='
            {
             before(grammarAccess.getOperacionAccess().getIsUdKeyword_1_0()); 
            match(input,45,FOLLOW_2); 
             after(grammarAccess.getOperacionAccess().getIsUdKeyword_1_0()); 

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
    // $ANTLR end "rule__Operacion__Group_1__0__Impl"


    // $ANTLR start "rule__Operacion__Group_1__1"
    // InternalBlockchain.g:2317:1: rule__Operacion__Group_1__1 : rule__Operacion__Group_1__1__Impl ;
    public final void rule__Operacion__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBlockchain.g:2321:1: ( rule__Operacion__Group_1__1__Impl )
            // InternalBlockchain.g:2322:2: rule__Operacion__Group_1__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Operacion__Group_1__1__Impl();

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
    // $ANTLR end "rule__Operacion__Group_1__1"


    // $ANTLR start "rule__Operacion__Group_1__1__Impl"
    // InternalBlockchain.g:2328:1: rule__Operacion__Group_1__1__Impl : ( ( rule__Operacion__EsUserDefinedAssignment_1_1 ) ) ;
    public final void rule__Operacion__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBlockchain.g:2332:1: ( ( ( rule__Operacion__EsUserDefinedAssignment_1_1 ) ) )
            // InternalBlockchain.g:2333:1: ( ( rule__Operacion__EsUserDefinedAssignment_1_1 ) )
            {
            // InternalBlockchain.g:2333:1: ( ( rule__Operacion__EsUserDefinedAssignment_1_1 ) )
            // InternalBlockchain.g:2334:2: ( rule__Operacion__EsUserDefinedAssignment_1_1 )
            {
             before(grammarAccess.getOperacionAccess().getEsUserDefinedAssignment_1_1()); 
            // InternalBlockchain.g:2335:2: ( rule__Operacion__EsUserDefinedAssignment_1_1 )
            // InternalBlockchain.g:2335:3: rule__Operacion__EsUserDefinedAssignment_1_1
            {
            pushFollow(FOLLOW_2);
            rule__Operacion__EsUserDefinedAssignment_1_1();

            state._fsp--;


            }

             after(grammarAccess.getOperacionAccess().getEsUserDefinedAssignment_1_1()); 

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
    // $ANTLR end "rule__Operacion__Group_1__1__Impl"


    // $ANTLR start "rule__Operacion__Group_4__0"
    // InternalBlockchain.g:2344:1: rule__Operacion__Group_4__0 : rule__Operacion__Group_4__0__Impl rule__Operacion__Group_4__1 ;
    public final void rule__Operacion__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBlockchain.g:2348:1: ( rule__Operacion__Group_4__0__Impl rule__Operacion__Group_4__1 )
            // InternalBlockchain.g:2349:2: rule__Operacion__Group_4__0__Impl rule__Operacion__Group_4__1
            {
            pushFollow(FOLLOW_29);
            rule__Operacion__Group_4__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Operacion__Group_4__1();

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
    // $ANTLR end "rule__Operacion__Group_4__0"


    // $ANTLR start "rule__Operacion__Group_4__0__Impl"
    // InternalBlockchain.g:2356:1: rule__Operacion__Group_4__0__Impl : ( ( rule__Operacion__ParametrosAssignment_4_0 ) ) ;
    public final void rule__Operacion__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBlockchain.g:2360:1: ( ( ( rule__Operacion__ParametrosAssignment_4_0 ) ) )
            // InternalBlockchain.g:2361:1: ( ( rule__Operacion__ParametrosAssignment_4_0 ) )
            {
            // InternalBlockchain.g:2361:1: ( ( rule__Operacion__ParametrosAssignment_4_0 ) )
            // InternalBlockchain.g:2362:2: ( rule__Operacion__ParametrosAssignment_4_0 )
            {
             before(grammarAccess.getOperacionAccess().getParametrosAssignment_4_0()); 
            // InternalBlockchain.g:2363:2: ( rule__Operacion__ParametrosAssignment_4_0 )
            // InternalBlockchain.g:2363:3: rule__Operacion__ParametrosAssignment_4_0
            {
            pushFollow(FOLLOW_2);
            rule__Operacion__ParametrosAssignment_4_0();

            state._fsp--;


            }

             after(grammarAccess.getOperacionAccess().getParametrosAssignment_4_0()); 

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
    // $ANTLR end "rule__Operacion__Group_4__0__Impl"


    // $ANTLR start "rule__Operacion__Group_4__1"
    // InternalBlockchain.g:2371:1: rule__Operacion__Group_4__1 : rule__Operacion__Group_4__1__Impl ;
    public final void rule__Operacion__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBlockchain.g:2375:1: ( rule__Operacion__Group_4__1__Impl )
            // InternalBlockchain.g:2376:2: rule__Operacion__Group_4__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Operacion__Group_4__1__Impl();

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
    // $ANTLR end "rule__Operacion__Group_4__1"


    // $ANTLR start "rule__Operacion__Group_4__1__Impl"
    // InternalBlockchain.g:2382:1: rule__Operacion__Group_4__1__Impl : ( ( rule__Operacion__Group_4_1__0 )* ) ;
    public final void rule__Operacion__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBlockchain.g:2386:1: ( ( ( rule__Operacion__Group_4_1__0 )* ) )
            // InternalBlockchain.g:2387:1: ( ( rule__Operacion__Group_4_1__0 )* )
            {
            // InternalBlockchain.g:2387:1: ( ( rule__Operacion__Group_4_1__0 )* )
            // InternalBlockchain.g:2388:2: ( rule__Operacion__Group_4_1__0 )*
            {
             before(grammarAccess.getOperacionAccess().getGroup_4_1()); 
            // InternalBlockchain.g:2389:2: ( rule__Operacion__Group_4_1__0 )*
            loop28:
            do {
                int alt28=2;
                int LA28_0 = input.LA(1);

                if ( (LA28_0==46) ) {
                    alt28=1;
                }


                switch (alt28) {
            	case 1 :
            	    // InternalBlockchain.g:2389:3: rule__Operacion__Group_4_1__0
            	    {
            	    pushFollow(FOLLOW_30);
            	    rule__Operacion__Group_4_1__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop28;
                }
            } while (true);

             after(grammarAccess.getOperacionAccess().getGroup_4_1()); 

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
    // $ANTLR end "rule__Operacion__Group_4__1__Impl"


    // $ANTLR start "rule__Operacion__Group_4_1__0"
    // InternalBlockchain.g:2398:1: rule__Operacion__Group_4_1__0 : rule__Operacion__Group_4_1__0__Impl rule__Operacion__Group_4_1__1 ;
    public final void rule__Operacion__Group_4_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBlockchain.g:2402:1: ( rule__Operacion__Group_4_1__0__Impl rule__Operacion__Group_4_1__1 )
            // InternalBlockchain.g:2403:2: rule__Operacion__Group_4_1__0__Impl rule__Operacion__Group_4_1__1
            {
            pushFollow(FOLLOW_4);
            rule__Operacion__Group_4_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Operacion__Group_4_1__1();

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
    // $ANTLR end "rule__Operacion__Group_4_1__0"


    // $ANTLR start "rule__Operacion__Group_4_1__0__Impl"
    // InternalBlockchain.g:2410:1: rule__Operacion__Group_4_1__0__Impl : ( ',' ) ;
    public final void rule__Operacion__Group_4_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBlockchain.g:2414:1: ( ( ',' ) )
            // InternalBlockchain.g:2415:1: ( ',' )
            {
            // InternalBlockchain.g:2415:1: ( ',' )
            // InternalBlockchain.g:2416:2: ','
            {
             before(grammarAccess.getOperacionAccess().getCommaKeyword_4_1_0()); 
            match(input,46,FOLLOW_2); 
             after(grammarAccess.getOperacionAccess().getCommaKeyword_4_1_0()); 

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
    // $ANTLR end "rule__Operacion__Group_4_1__0__Impl"


    // $ANTLR start "rule__Operacion__Group_4_1__1"
    // InternalBlockchain.g:2425:1: rule__Operacion__Group_4_1__1 : rule__Operacion__Group_4_1__1__Impl ;
    public final void rule__Operacion__Group_4_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBlockchain.g:2429:1: ( rule__Operacion__Group_4_1__1__Impl )
            // InternalBlockchain.g:2430:2: rule__Operacion__Group_4_1__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Operacion__Group_4_1__1__Impl();

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
    // $ANTLR end "rule__Operacion__Group_4_1__1"


    // $ANTLR start "rule__Operacion__Group_4_1__1__Impl"
    // InternalBlockchain.g:2436:1: rule__Operacion__Group_4_1__1__Impl : ( ( rule__Operacion__ParametrosAssignment_4_1_1 ) ) ;
    public final void rule__Operacion__Group_4_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBlockchain.g:2440:1: ( ( ( rule__Operacion__ParametrosAssignment_4_1_1 ) ) )
            // InternalBlockchain.g:2441:1: ( ( rule__Operacion__ParametrosAssignment_4_1_1 ) )
            {
            // InternalBlockchain.g:2441:1: ( ( rule__Operacion__ParametrosAssignment_4_1_1 ) )
            // InternalBlockchain.g:2442:2: ( rule__Operacion__ParametrosAssignment_4_1_1 )
            {
             before(grammarAccess.getOperacionAccess().getParametrosAssignment_4_1_1()); 
            // InternalBlockchain.g:2443:2: ( rule__Operacion__ParametrosAssignment_4_1_1 )
            // InternalBlockchain.g:2443:3: rule__Operacion__ParametrosAssignment_4_1_1
            {
            pushFollow(FOLLOW_2);
            rule__Operacion__ParametrosAssignment_4_1_1();

            state._fsp--;


            }

             after(grammarAccess.getOperacionAccess().getParametrosAssignment_4_1_1()); 

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
    // $ANTLR end "rule__Operacion__Group_4_1__1__Impl"


    // $ANTLR start "rule__Operacion__Group_6__0"
    // InternalBlockchain.g:2452:1: rule__Operacion__Group_6__0 : rule__Operacion__Group_6__0__Impl rule__Operacion__Group_6__1 ;
    public final void rule__Operacion__Group_6__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBlockchain.g:2456:1: ( rule__Operacion__Group_6__0__Impl rule__Operacion__Group_6__1 )
            // InternalBlockchain.g:2457:2: rule__Operacion__Group_6__0__Impl rule__Operacion__Group_6__1
            {
            pushFollow(FOLLOW_4);
            rule__Operacion__Group_6__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Operacion__Group_6__1();

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
    // $ANTLR end "rule__Operacion__Group_6__0"


    // $ANTLR start "rule__Operacion__Group_6__0__Impl"
    // InternalBlockchain.g:2464:1: rule__Operacion__Group_6__0__Impl : ( ':' ) ;
    public final void rule__Operacion__Group_6__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBlockchain.g:2468:1: ( ( ':' ) )
            // InternalBlockchain.g:2469:1: ( ':' )
            {
            // InternalBlockchain.g:2469:1: ( ':' )
            // InternalBlockchain.g:2470:2: ':'
            {
             before(grammarAccess.getOperacionAccess().getColonKeyword_6_0()); 
            match(input,47,FOLLOW_2); 
             after(grammarAccess.getOperacionAccess().getColonKeyword_6_0()); 

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
    // $ANTLR end "rule__Operacion__Group_6__0__Impl"


    // $ANTLR start "rule__Operacion__Group_6__1"
    // InternalBlockchain.g:2479:1: rule__Operacion__Group_6__1 : rule__Operacion__Group_6__1__Impl ;
    public final void rule__Operacion__Group_6__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBlockchain.g:2483:1: ( rule__Operacion__Group_6__1__Impl )
            // InternalBlockchain.g:2484:2: rule__Operacion__Group_6__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Operacion__Group_6__1__Impl();

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
    // $ANTLR end "rule__Operacion__Group_6__1"


    // $ANTLR start "rule__Operacion__Group_6__1__Impl"
    // InternalBlockchain.g:2490:1: rule__Operacion__Group_6__1__Impl : ( ( rule__Operacion__RetornoAssignment_6_1 ) ) ;
    public final void rule__Operacion__Group_6__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBlockchain.g:2494:1: ( ( ( rule__Operacion__RetornoAssignment_6_1 ) ) )
            // InternalBlockchain.g:2495:1: ( ( rule__Operacion__RetornoAssignment_6_1 ) )
            {
            // InternalBlockchain.g:2495:1: ( ( rule__Operacion__RetornoAssignment_6_1 ) )
            // InternalBlockchain.g:2496:2: ( rule__Operacion__RetornoAssignment_6_1 )
            {
             before(grammarAccess.getOperacionAccess().getRetornoAssignment_6_1()); 
            // InternalBlockchain.g:2497:2: ( rule__Operacion__RetornoAssignment_6_1 )
            // InternalBlockchain.g:2497:3: rule__Operacion__RetornoAssignment_6_1
            {
            pushFollow(FOLLOW_2);
            rule__Operacion__RetornoAssignment_6_1();

            state._fsp--;


            }

             after(grammarAccess.getOperacionAccess().getRetornoAssignment_6_1()); 

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
    // $ANTLR end "rule__Operacion__Group_6__1__Impl"


    // $ANTLR start "rule__Estado__Group__0"
    // InternalBlockchain.g:2506:1: rule__Estado__Group__0 : rule__Estado__Group__0__Impl rule__Estado__Group__1 ;
    public final void rule__Estado__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBlockchain.g:2510:1: ( rule__Estado__Group__0__Impl rule__Estado__Group__1 )
            // InternalBlockchain.g:2511:2: rule__Estado__Group__0__Impl rule__Estado__Group__1
            {
            pushFollow(FOLLOW_4);
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
    // InternalBlockchain.g:2518:1: rule__Estado__Group__0__Impl : ( 'Estado' ) ;
    public final void rule__Estado__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBlockchain.g:2522:1: ( ( 'Estado' ) )
            // InternalBlockchain.g:2523:1: ( 'Estado' )
            {
            // InternalBlockchain.g:2523:1: ( 'Estado' )
            // InternalBlockchain.g:2524:2: 'Estado'
            {
             before(grammarAccess.getEstadoAccess().getEstadoKeyword_0()); 
            match(input,48,FOLLOW_2); 
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
    // InternalBlockchain.g:2533:1: rule__Estado__Group__1 : rule__Estado__Group__1__Impl rule__Estado__Group__2 ;
    public final void rule__Estado__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBlockchain.g:2537:1: ( rule__Estado__Group__1__Impl rule__Estado__Group__2 )
            // InternalBlockchain.g:2538:2: rule__Estado__Group__1__Impl rule__Estado__Group__2
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
    // InternalBlockchain.g:2545:1: rule__Estado__Group__1__Impl : ( ( rule__Estado__TipodatoAssignment_1 ) ) ;
    public final void rule__Estado__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBlockchain.g:2549:1: ( ( ( rule__Estado__TipodatoAssignment_1 ) ) )
            // InternalBlockchain.g:2550:1: ( ( rule__Estado__TipodatoAssignment_1 ) )
            {
            // InternalBlockchain.g:2550:1: ( ( rule__Estado__TipodatoAssignment_1 ) )
            // InternalBlockchain.g:2551:2: ( rule__Estado__TipodatoAssignment_1 )
            {
             before(grammarAccess.getEstadoAccess().getTipodatoAssignment_1()); 
            // InternalBlockchain.g:2552:2: ( rule__Estado__TipodatoAssignment_1 )
            // InternalBlockchain.g:2552:3: rule__Estado__TipodatoAssignment_1
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
    // InternalBlockchain.g:2560:1: rule__Estado__Group__2 : rule__Estado__Group__2__Impl ;
    public final void rule__Estado__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBlockchain.g:2564:1: ( rule__Estado__Group__2__Impl )
            // InternalBlockchain.g:2565:2: rule__Estado__Group__2__Impl
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
    // InternalBlockchain.g:2571:1: rule__Estado__Group__2__Impl : ( ( rule__Estado__NameAssignment_2 ) ) ;
    public final void rule__Estado__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBlockchain.g:2575:1: ( ( ( rule__Estado__NameAssignment_2 ) ) )
            // InternalBlockchain.g:2576:1: ( ( rule__Estado__NameAssignment_2 ) )
            {
            // InternalBlockchain.g:2576:1: ( ( rule__Estado__NameAssignment_2 ) )
            // InternalBlockchain.g:2577:2: ( rule__Estado__NameAssignment_2 )
            {
             before(grammarAccess.getEstadoAccess().getNameAssignment_2()); 
            // InternalBlockchain.g:2578:2: ( rule__Estado__NameAssignment_2 )
            // InternalBlockchain.g:2578:3: rule__Estado__NameAssignment_2
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
    // InternalBlockchain.g:2587:1: rule__Atributo__Group__0 : rule__Atributo__Group__0__Impl rule__Atributo__Group__1 ;
    public final void rule__Atributo__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBlockchain.g:2591:1: ( rule__Atributo__Group__0__Impl rule__Atributo__Group__1 )
            // InternalBlockchain.g:2592:2: rule__Atributo__Group__0__Impl rule__Atributo__Group__1
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
    // InternalBlockchain.g:2599:1: rule__Atributo__Group__0__Impl : ( ( rule__Atributo__TipodatoAssignment_0 ) ) ;
    public final void rule__Atributo__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBlockchain.g:2603:1: ( ( ( rule__Atributo__TipodatoAssignment_0 ) ) )
            // InternalBlockchain.g:2604:1: ( ( rule__Atributo__TipodatoAssignment_0 ) )
            {
            // InternalBlockchain.g:2604:1: ( ( rule__Atributo__TipodatoAssignment_0 ) )
            // InternalBlockchain.g:2605:2: ( rule__Atributo__TipodatoAssignment_0 )
            {
             before(grammarAccess.getAtributoAccess().getTipodatoAssignment_0()); 
            // InternalBlockchain.g:2606:2: ( rule__Atributo__TipodatoAssignment_0 )
            // InternalBlockchain.g:2606:3: rule__Atributo__TipodatoAssignment_0
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
    // InternalBlockchain.g:2614:1: rule__Atributo__Group__1 : rule__Atributo__Group__1__Impl ;
    public final void rule__Atributo__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBlockchain.g:2618:1: ( rule__Atributo__Group__1__Impl )
            // InternalBlockchain.g:2619:2: rule__Atributo__Group__1__Impl
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
    // InternalBlockchain.g:2625:1: rule__Atributo__Group__1__Impl : ( ( rule__Atributo__NameAssignment_1 ) ) ;
    public final void rule__Atributo__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBlockchain.g:2629:1: ( ( ( rule__Atributo__NameAssignment_1 ) ) )
            // InternalBlockchain.g:2630:1: ( ( rule__Atributo__NameAssignment_1 ) )
            {
            // InternalBlockchain.g:2630:1: ( ( rule__Atributo__NameAssignment_1 ) )
            // InternalBlockchain.g:2631:2: ( rule__Atributo__NameAssignment_1 )
            {
             before(grammarAccess.getAtributoAccess().getNameAssignment_1()); 
            // InternalBlockchain.g:2632:2: ( rule__Atributo__NameAssignment_1 )
            // InternalBlockchain.g:2632:3: rule__Atributo__NameAssignment_1
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
    // InternalBlockchain.g:2641:1: rule__Parametro__Group__0 : rule__Parametro__Group__0__Impl rule__Parametro__Group__1 ;
    public final void rule__Parametro__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBlockchain.g:2645:1: ( rule__Parametro__Group__0__Impl rule__Parametro__Group__1 )
            // InternalBlockchain.g:2646:2: rule__Parametro__Group__0__Impl rule__Parametro__Group__1
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
    // InternalBlockchain.g:2653:1: rule__Parametro__Group__0__Impl : ( ( rule__Parametro__TipodatoAssignment_0 ) ) ;
    public final void rule__Parametro__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBlockchain.g:2657:1: ( ( ( rule__Parametro__TipodatoAssignment_0 ) ) )
            // InternalBlockchain.g:2658:1: ( ( rule__Parametro__TipodatoAssignment_0 ) )
            {
            // InternalBlockchain.g:2658:1: ( ( rule__Parametro__TipodatoAssignment_0 ) )
            // InternalBlockchain.g:2659:2: ( rule__Parametro__TipodatoAssignment_0 )
            {
             before(grammarAccess.getParametroAccess().getTipodatoAssignment_0()); 
            // InternalBlockchain.g:2660:2: ( rule__Parametro__TipodatoAssignment_0 )
            // InternalBlockchain.g:2660:3: rule__Parametro__TipodatoAssignment_0
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
    // InternalBlockchain.g:2668:1: rule__Parametro__Group__1 : rule__Parametro__Group__1__Impl ;
    public final void rule__Parametro__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBlockchain.g:2672:1: ( rule__Parametro__Group__1__Impl )
            // InternalBlockchain.g:2673:2: rule__Parametro__Group__1__Impl
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
    // InternalBlockchain.g:2679:1: rule__Parametro__Group__1__Impl : ( ( rule__Parametro__NameAssignment_1 ) ) ;
    public final void rule__Parametro__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBlockchain.g:2683:1: ( ( ( rule__Parametro__NameAssignment_1 ) ) )
            // InternalBlockchain.g:2684:1: ( ( rule__Parametro__NameAssignment_1 ) )
            {
            // InternalBlockchain.g:2684:1: ( ( rule__Parametro__NameAssignment_1 ) )
            // InternalBlockchain.g:2685:2: ( rule__Parametro__NameAssignment_1 )
            {
             before(grammarAccess.getParametroAccess().getNameAssignment_1()); 
            // InternalBlockchain.g:2686:2: ( rule__Parametro__NameAssignment_1 )
            // InternalBlockchain.g:2686:3: rule__Parametro__NameAssignment_1
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
    // InternalBlockchain.g:2695:1: rule__ExpresionLogica__Group__0 : rule__ExpresionLogica__Group__0__Impl rule__ExpresionLogica__Group__1 ;
    public final void rule__ExpresionLogica__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBlockchain.g:2699:1: ( rule__ExpresionLogica__Group__0__Impl rule__ExpresionLogica__Group__1 )
            // InternalBlockchain.g:2700:2: rule__ExpresionLogica__Group__0__Impl rule__ExpresionLogica__Group__1
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
    // InternalBlockchain.g:2707:1: rule__ExpresionLogica__Group__0__Impl : ( 'ExpLog' ) ;
    public final void rule__ExpresionLogica__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBlockchain.g:2711:1: ( ( 'ExpLog' ) )
            // InternalBlockchain.g:2712:1: ( 'ExpLog' )
            {
            // InternalBlockchain.g:2712:1: ( 'ExpLog' )
            // InternalBlockchain.g:2713:2: 'ExpLog'
            {
             before(grammarAccess.getExpresionLogicaAccess().getExpLogKeyword_0()); 
            match(input,49,FOLLOW_2); 
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
    // InternalBlockchain.g:2722:1: rule__ExpresionLogica__Group__1 : rule__ExpresionLogica__Group__1__Impl rule__ExpresionLogica__Group__2 ;
    public final void rule__ExpresionLogica__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBlockchain.g:2726:1: ( rule__ExpresionLogica__Group__1__Impl rule__ExpresionLogica__Group__2 )
            // InternalBlockchain.g:2727:2: rule__ExpresionLogica__Group__1__Impl rule__ExpresionLogica__Group__2
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
    // InternalBlockchain.g:2734:1: rule__ExpresionLogica__Group__1__Impl : ( ( '(' )* ) ;
    public final void rule__ExpresionLogica__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBlockchain.g:2738:1: ( ( ( '(' )* ) )
            // InternalBlockchain.g:2739:1: ( ( '(' )* )
            {
            // InternalBlockchain.g:2739:1: ( ( '(' )* )
            // InternalBlockchain.g:2740:2: ( '(' )*
            {
             before(grammarAccess.getExpresionLogicaAccess().getLeftParenthesisKeyword_1()); 
            // InternalBlockchain.g:2741:2: ( '(' )*
            loop29:
            do {
                int alt29=2;
                int LA29_0 = input.LA(1);

                if ( (LA29_0==42) ) {
                    alt29=1;
                }


                switch (alt29) {
            	case 1 :
            	    // InternalBlockchain.g:2741:3: '('
            	    {
            	    match(input,42,FOLLOW_25); 

            	    }
            	    break;

            	default :
            	    break loop29;
                }
            } while (true);

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
    // InternalBlockchain.g:2749:1: rule__ExpresionLogica__Group__2 : rule__ExpresionLogica__Group__2__Impl rule__ExpresionLogica__Group__3 ;
    public final void rule__ExpresionLogica__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBlockchain.g:2753:1: ( rule__ExpresionLogica__Group__2__Impl rule__ExpresionLogica__Group__3 )
            // InternalBlockchain.g:2754:2: rule__ExpresionLogica__Group__2__Impl rule__ExpresionLogica__Group__3
            {
            pushFollow(FOLLOW_32);
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
    // InternalBlockchain.g:2761:1: rule__ExpresionLogica__Group__2__Impl : ( ( rule__ExpresionLogica__IzqAssignment_2 ) ) ;
    public final void rule__ExpresionLogica__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBlockchain.g:2765:1: ( ( ( rule__ExpresionLogica__IzqAssignment_2 ) ) )
            // InternalBlockchain.g:2766:1: ( ( rule__ExpresionLogica__IzqAssignment_2 ) )
            {
            // InternalBlockchain.g:2766:1: ( ( rule__ExpresionLogica__IzqAssignment_2 ) )
            // InternalBlockchain.g:2767:2: ( rule__ExpresionLogica__IzqAssignment_2 )
            {
             before(grammarAccess.getExpresionLogicaAccess().getIzqAssignment_2()); 
            // InternalBlockchain.g:2768:2: ( rule__ExpresionLogica__IzqAssignment_2 )
            // InternalBlockchain.g:2768:3: rule__ExpresionLogica__IzqAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__ExpresionLogica__IzqAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getExpresionLogicaAccess().getIzqAssignment_2()); 

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
    // InternalBlockchain.g:2776:1: rule__ExpresionLogica__Group__3 : rule__ExpresionLogica__Group__3__Impl rule__ExpresionLogica__Group__4 ;
    public final void rule__ExpresionLogica__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBlockchain.g:2780:1: ( rule__ExpresionLogica__Group__3__Impl rule__ExpresionLogica__Group__4 )
            // InternalBlockchain.g:2781:2: rule__ExpresionLogica__Group__3__Impl rule__ExpresionLogica__Group__4
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
    // InternalBlockchain.g:2788:1: rule__ExpresionLogica__Group__3__Impl : ( ( ')' )* ) ;
    public final void rule__ExpresionLogica__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBlockchain.g:2792:1: ( ( ( ')' )* ) )
            // InternalBlockchain.g:2793:1: ( ( ')' )* )
            {
            // InternalBlockchain.g:2793:1: ( ( ')' )* )
            // InternalBlockchain.g:2794:2: ( ')' )*
            {
             before(grammarAccess.getExpresionLogicaAccess().getRightParenthesisKeyword_3()); 
            // InternalBlockchain.g:2795:2: ( ')' )*
            loop30:
            do {
                int alt30=2;
                int LA30_0 = input.LA(1);

                if ( (LA30_0==43) ) {
                    alt30=1;
                }


                switch (alt30) {
            	case 1 :
            	    // InternalBlockchain.g:2795:3: ')'
            	    {
            	    match(input,43,FOLLOW_27); 

            	    }
            	    break;

            	default :
            	    break loop30;
                }
            } while (true);

             after(grammarAccess.getExpresionLogicaAccess().getRightParenthesisKeyword_3()); 

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
    // InternalBlockchain.g:2803:1: rule__ExpresionLogica__Group__4 : rule__ExpresionLogica__Group__4__Impl rule__ExpresionLogica__Group__5 ;
    public final void rule__ExpresionLogica__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBlockchain.g:2807:1: ( rule__ExpresionLogica__Group__4__Impl rule__ExpresionLogica__Group__5 )
            // InternalBlockchain.g:2808:2: rule__ExpresionLogica__Group__4__Impl rule__ExpresionLogica__Group__5
            {
            pushFollow(FOLLOW_32);
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
    // InternalBlockchain.g:2815:1: rule__ExpresionLogica__Group__4__Impl : ( ( rule__ExpresionLogica__OperadorAssignment_4 )? ) ;
    public final void rule__ExpresionLogica__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBlockchain.g:2819:1: ( ( ( rule__ExpresionLogica__OperadorAssignment_4 )? ) )
            // InternalBlockchain.g:2820:1: ( ( rule__ExpresionLogica__OperadorAssignment_4 )? )
            {
            // InternalBlockchain.g:2820:1: ( ( rule__ExpresionLogica__OperadorAssignment_4 )? )
            // InternalBlockchain.g:2821:2: ( rule__ExpresionLogica__OperadorAssignment_4 )?
            {
             before(grammarAccess.getExpresionLogicaAccess().getOperadorAssignment_4()); 
            // InternalBlockchain.g:2822:2: ( rule__ExpresionLogica__OperadorAssignment_4 )?
            int alt31=2;
            int LA31_0 = input.LA(1);

            if ( ((LA31_0>=16 && LA31_0<=23)) ) {
                alt31=1;
            }
            switch (alt31) {
                case 1 :
                    // InternalBlockchain.g:2822:3: rule__ExpresionLogica__OperadorAssignment_4
                    {
                    pushFollow(FOLLOW_2);
                    rule__ExpresionLogica__OperadorAssignment_4();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getExpresionLogicaAccess().getOperadorAssignment_4()); 

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
    // InternalBlockchain.g:2830:1: rule__ExpresionLogica__Group__5 : rule__ExpresionLogica__Group__5__Impl rule__ExpresionLogica__Group__6 ;
    public final void rule__ExpresionLogica__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBlockchain.g:2834:1: ( rule__ExpresionLogica__Group__5__Impl rule__ExpresionLogica__Group__6 )
            // InternalBlockchain.g:2835:2: rule__ExpresionLogica__Group__5__Impl rule__ExpresionLogica__Group__6
            {
            pushFollow(FOLLOW_32);
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
    // InternalBlockchain.g:2842:1: rule__ExpresionLogica__Group__5__Impl : ( ( '(' )* ) ;
    public final void rule__ExpresionLogica__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBlockchain.g:2846:1: ( ( ( '(' )* ) )
            // InternalBlockchain.g:2847:1: ( ( '(' )* )
            {
            // InternalBlockchain.g:2847:1: ( ( '(' )* )
            // InternalBlockchain.g:2848:2: ( '(' )*
            {
             before(grammarAccess.getExpresionLogicaAccess().getLeftParenthesisKeyword_5()); 
            // InternalBlockchain.g:2849:2: ( '(' )*
            loop32:
            do {
                int alt32=2;
                int LA32_0 = input.LA(1);

                if ( (LA32_0==42) ) {
                    alt32=1;
                }


                switch (alt32) {
            	case 1 :
            	    // InternalBlockchain.g:2849:3: '('
            	    {
            	    match(input,42,FOLLOW_25); 

            	    }
            	    break;

            	default :
            	    break loop32;
                }
            } while (true);

             after(grammarAccess.getExpresionLogicaAccess().getLeftParenthesisKeyword_5()); 

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
    // InternalBlockchain.g:2857:1: rule__ExpresionLogica__Group__6 : rule__ExpresionLogica__Group__6__Impl rule__ExpresionLogica__Group__7 ;
    public final void rule__ExpresionLogica__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBlockchain.g:2861:1: ( rule__ExpresionLogica__Group__6__Impl rule__ExpresionLogica__Group__7 )
            // InternalBlockchain.g:2862:2: rule__ExpresionLogica__Group__6__Impl rule__ExpresionLogica__Group__7
            {
            pushFollow(FOLLOW_33);
            rule__ExpresionLogica__Group__6__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ExpresionLogica__Group__7();

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
    // InternalBlockchain.g:2869:1: rule__ExpresionLogica__Group__6__Impl : ( ( rule__ExpresionLogica__DerAssignment_6 ) ) ;
    public final void rule__ExpresionLogica__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBlockchain.g:2873:1: ( ( ( rule__ExpresionLogica__DerAssignment_6 ) ) )
            // InternalBlockchain.g:2874:1: ( ( rule__ExpresionLogica__DerAssignment_6 ) )
            {
            // InternalBlockchain.g:2874:1: ( ( rule__ExpresionLogica__DerAssignment_6 ) )
            // InternalBlockchain.g:2875:2: ( rule__ExpresionLogica__DerAssignment_6 )
            {
             before(grammarAccess.getExpresionLogicaAccess().getDerAssignment_6()); 
            // InternalBlockchain.g:2876:2: ( rule__ExpresionLogica__DerAssignment_6 )
            // InternalBlockchain.g:2876:3: rule__ExpresionLogica__DerAssignment_6
            {
            pushFollow(FOLLOW_2);
            rule__ExpresionLogica__DerAssignment_6();

            state._fsp--;


            }

             after(grammarAccess.getExpresionLogicaAccess().getDerAssignment_6()); 

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


    // $ANTLR start "rule__ExpresionLogica__Group__7"
    // InternalBlockchain.g:2884:1: rule__ExpresionLogica__Group__7 : rule__ExpresionLogica__Group__7__Impl ;
    public final void rule__ExpresionLogica__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBlockchain.g:2888:1: ( rule__ExpresionLogica__Group__7__Impl )
            // InternalBlockchain.g:2889:2: rule__ExpresionLogica__Group__7__Impl
            {
            pushFollow(FOLLOW_2);
            rule__ExpresionLogica__Group__7__Impl();

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
    // $ANTLR end "rule__ExpresionLogica__Group__7"


    // $ANTLR start "rule__ExpresionLogica__Group__7__Impl"
    // InternalBlockchain.g:2895:1: rule__ExpresionLogica__Group__7__Impl : ( ( ')' )* ) ;
    public final void rule__ExpresionLogica__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBlockchain.g:2899:1: ( ( ( ')' )* ) )
            // InternalBlockchain.g:2900:1: ( ( ')' )* )
            {
            // InternalBlockchain.g:2900:1: ( ( ')' )* )
            // InternalBlockchain.g:2901:2: ( ')' )*
            {
             before(grammarAccess.getExpresionLogicaAccess().getRightParenthesisKeyword_7()); 
            // InternalBlockchain.g:2902:2: ( ')' )*
            loop33:
            do {
                int alt33=2;
                int LA33_0 = input.LA(1);

                if ( (LA33_0==43) ) {
                    alt33=1;
                }


                switch (alt33) {
            	case 1 :
            	    // InternalBlockchain.g:2902:3: ')'
            	    {
            	    match(input,43,FOLLOW_27); 

            	    }
            	    break;

            	default :
            	    break loop33;
                }
            } while (true);

             after(grammarAccess.getExpresionLogicaAccess().getRightParenthesisKeyword_7()); 

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
    // $ANTLR end "rule__ExpresionLogica__Group__7__Impl"


    // $ANTLR start "rule__ExpresionAritmetica__Group__0"
    // InternalBlockchain.g:2911:1: rule__ExpresionAritmetica__Group__0 : rule__ExpresionAritmetica__Group__0__Impl rule__ExpresionAritmetica__Group__1 ;
    public final void rule__ExpresionAritmetica__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBlockchain.g:2915:1: ( rule__ExpresionAritmetica__Group__0__Impl rule__ExpresionAritmetica__Group__1 )
            // InternalBlockchain.g:2916:2: rule__ExpresionAritmetica__Group__0__Impl rule__ExpresionAritmetica__Group__1
            {
            pushFollow(FOLLOW_34);
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
    // InternalBlockchain.g:2923:1: rule__ExpresionAritmetica__Group__0__Impl : ( () ) ;
    public final void rule__ExpresionAritmetica__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBlockchain.g:2927:1: ( ( () ) )
            // InternalBlockchain.g:2928:1: ( () )
            {
            // InternalBlockchain.g:2928:1: ( () )
            // InternalBlockchain.g:2929:2: ()
            {
             before(grammarAccess.getExpresionAritmeticaAccess().getExpresionAritmeticaAction_0()); 
            // InternalBlockchain.g:2930:2: ()
            // InternalBlockchain.g:2930:3: 
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
    // InternalBlockchain.g:2938:1: rule__ExpresionAritmetica__Group__1 : rule__ExpresionAritmetica__Group__1__Impl rule__ExpresionAritmetica__Group__2 ;
    public final void rule__ExpresionAritmetica__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBlockchain.g:2942:1: ( rule__ExpresionAritmetica__Group__1__Impl rule__ExpresionAritmetica__Group__2 )
            // InternalBlockchain.g:2943:2: rule__ExpresionAritmetica__Group__1__Impl rule__ExpresionAritmetica__Group__2
            {
            pushFollow(FOLLOW_31);
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
    // InternalBlockchain.g:2950:1: rule__ExpresionAritmetica__Group__1__Impl : ( 'ExpArit' ) ;
    public final void rule__ExpresionAritmetica__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBlockchain.g:2954:1: ( ( 'ExpArit' ) )
            // InternalBlockchain.g:2955:1: ( 'ExpArit' )
            {
            // InternalBlockchain.g:2955:1: ( 'ExpArit' )
            // InternalBlockchain.g:2956:2: 'ExpArit'
            {
             before(grammarAccess.getExpresionAritmeticaAccess().getExpAritKeyword_1()); 
            match(input,50,FOLLOW_2); 
             after(grammarAccess.getExpresionAritmeticaAccess().getExpAritKeyword_1()); 

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
    // InternalBlockchain.g:2965:1: rule__ExpresionAritmetica__Group__2 : rule__ExpresionAritmetica__Group__2__Impl rule__ExpresionAritmetica__Group__3 ;
    public final void rule__ExpresionAritmetica__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBlockchain.g:2969:1: ( rule__ExpresionAritmetica__Group__2__Impl rule__ExpresionAritmetica__Group__3 )
            // InternalBlockchain.g:2970:2: rule__ExpresionAritmetica__Group__2__Impl rule__ExpresionAritmetica__Group__3
            {
            pushFollow(FOLLOW_31);
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
    // InternalBlockchain.g:2977:1: rule__ExpresionAritmetica__Group__2__Impl : ( ( '(' )* ) ;
    public final void rule__ExpresionAritmetica__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBlockchain.g:2981:1: ( ( ( '(' )* ) )
            // InternalBlockchain.g:2982:1: ( ( '(' )* )
            {
            // InternalBlockchain.g:2982:1: ( ( '(' )* )
            // InternalBlockchain.g:2983:2: ( '(' )*
            {
             before(grammarAccess.getExpresionAritmeticaAccess().getLeftParenthesisKeyword_2()); 
            // InternalBlockchain.g:2984:2: ( '(' )*
            loop34:
            do {
                int alt34=2;
                int LA34_0 = input.LA(1);

                if ( (LA34_0==42) ) {
                    alt34=1;
                }


                switch (alt34) {
            	case 1 :
            	    // InternalBlockchain.g:2984:3: '('
            	    {
            	    match(input,42,FOLLOW_25); 

            	    }
            	    break;

            	default :
            	    break loop34;
                }
            } while (true);

             after(grammarAccess.getExpresionAritmeticaAccess().getLeftParenthesisKeyword_2()); 

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
    // InternalBlockchain.g:2992:1: rule__ExpresionAritmetica__Group__3 : rule__ExpresionAritmetica__Group__3__Impl rule__ExpresionAritmetica__Group__4 ;
    public final void rule__ExpresionAritmetica__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBlockchain.g:2996:1: ( rule__ExpresionAritmetica__Group__3__Impl rule__ExpresionAritmetica__Group__4 )
            // InternalBlockchain.g:2997:2: rule__ExpresionAritmetica__Group__3__Impl rule__ExpresionAritmetica__Group__4
            {
            pushFollow(FOLLOW_35);
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
    // InternalBlockchain.g:3004:1: rule__ExpresionAritmetica__Group__3__Impl : ( ( rule__ExpresionAritmetica__IzqAssignment_3 ) ) ;
    public final void rule__ExpresionAritmetica__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBlockchain.g:3008:1: ( ( ( rule__ExpresionAritmetica__IzqAssignment_3 ) ) )
            // InternalBlockchain.g:3009:1: ( ( rule__ExpresionAritmetica__IzqAssignment_3 ) )
            {
            // InternalBlockchain.g:3009:1: ( ( rule__ExpresionAritmetica__IzqAssignment_3 ) )
            // InternalBlockchain.g:3010:2: ( rule__ExpresionAritmetica__IzqAssignment_3 )
            {
             before(grammarAccess.getExpresionAritmeticaAccess().getIzqAssignment_3()); 
            // InternalBlockchain.g:3011:2: ( rule__ExpresionAritmetica__IzqAssignment_3 )
            // InternalBlockchain.g:3011:3: rule__ExpresionAritmetica__IzqAssignment_3
            {
            pushFollow(FOLLOW_2);
            rule__ExpresionAritmetica__IzqAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getExpresionAritmeticaAccess().getIzqAssignment_3()); 

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
    // InternalBlockchain.g:3019:1: rule__ExpresionAritmetica__Group__4 : rule__ExpresionAritmetica__Group__4__Impl rule__ExpresionAritmetica__Group__5 ;
    public final void rule__ExpresionAritmetica__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBlockchain.g:3023:1: ( rule__ExpresionAritmetica__Group__4__Impl rule__ExpresionAritmetica__Group__5 )
            // InternalBlockchain.g:3024:2: rule__ExpresionAritmetica__Group__4__Impl rule__ExpresionAritmetica__Group__5
            {
            pushFollow(FOLLOW_35);
            rule__ExpresionAritmetica__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ExpresionAritmetica__Group__5();

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
    // InternalBlockchain.g:3031:1: rule__ExpresionAritmetica__Group__4__Impl : ( ( ')' )* ) ;
    public final void rule__ExpresionAritmetica__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBlockchain.g:3035:1: ( ( ( ')' )* ) )
            // InternalBlockchain.g:3036:1: ( ( ')' )* )
            {
            // InternalBlockchain.g:3036:1: ( ( ')' )* )
            // InternalBlockchain.g:3037:2: ( ')' )*
            {
             before(grammarAccess.getExpresionAritmeticaAccess().getRightParenthesisKeyword_4()); 
            // InternalBlockchain.g:3038:2: ( ')' )*
            loop35:
            do {
                int alt35=2;
                int LA35_0 = input.LA(1);

                if ( (LA35_0==43) ) {
                    alt35=1;
                }


                switch (alt35) {
            	case 1 :
            	    // InternalBlockchain.g:3038:3: ')'
            	    {
            	    match(input,43,FOLLOW_27); 

            	    }
            	    break;

            	default :
            	    break loop35;
                }
            } while (true);

             after(grammarAccess.getExpresionAritmeticaAccess().getRightParenthesisKeyword_4()); 

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


    // $ANTLR start "rule__ExpresionAritmetica__Group__5"
    // InternalBlockchain.g:3046:1: rule__ExpresionAritmetica__Group__5 : rule__ExpresionAritmetica__Group__5__Impl rule__ExpresionAritmetica__Group__6 ;
    public final void rule__ExpresionAritmetica__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBlockchain.g:3050:1: ( rule__ExpresionAritmetica__Group__5__Impl rule__ExpresionAritmetica__Group__6 )
            // InternalBlockchain.g:3051:2: rule__ExpresionAritmetica__Group__5__Impl rule__ExpresionAritmetica__Group__6
            {
            pushFollow(FOLLOW_35);
            rule__ExpresionAritmetica__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ExpresionAritmetica__Group__6();

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
    // $ANTLR end "rule__ExpresionAritmetica__Group__5"


    // $ANTLR start "rule__ExpresionAritmetica__Group__5__Impl"
    // InternalBlockchain.g:3058:1: rule__ExpresionAritmetica__Group__5__Impl : ( ( rule__ExpresionAritmetica__OperadorAssignment_5 )? ) ;
    public final void rule__ExpresionAritmetica__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBlockchain.g:3062:1: ( ( ( rule__ExpresionAritmetica__OperadorAssignment_5 )? ) )
            // InternalBlockchain.g:3063:1: ( ( rule__ExpresionAritmetica__OperadorAssignment_5 )? )
            {
            // InternalBlockchain.g:3063:1: ( ( rule__ExpresionAritmetica__OperadorAssignment_5 )? )
            // InternalBlockchain.g:3064:2: ( rule__ExpresionAritmetica__OperadorAssignment_5 )?
            {
             before(grammarAccess.getExpresionAritmeticaAccess().getOperadorAssignment_5()); 
            // InternalBlockchain.g:3065:2: ( rule__ExpresionAritmetica__OperadorAssignment_5 )?
            int alt36=2;
            int LA36_0 = input.LA(1);

            if ( ((LA36_0>=24 && LA36_0<=30)) ) {
                alt36=1;
            }
            switch (alt36) {
                case 1 :
                    // InternalBlockchain.g:3065:3: rule__ExpresionAritmetica__OperadorAssignment_5
                    {
                    pushFollow(FOLLOW_2);
                    rule__ExpresionAritmetica__OperadorAssignment_5();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getExpresionAritmeticaAccess().getOperadorAssignment_5()); 

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
    // $ANTLR end "rule__ExpresionAritmetica__Group__5__Impl"


    // $ANTLR start "rule__ExpresionAritmetica__Group__6"
    // InternalBlockchain.g:3073:1: rule__ExpresionAritmetica__Group__6 : rule__ExpresionAritmetica__Group__6__Impl rule__ExpresionAritmetica__Group__7 ;
    public final void rule__ExpresionAritmetica__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBlockchain.g:3077:1: ( rule__ExpresionAritmetica__Group__6__Impl rule__ExpresionAritmetica__Group__7 )
            // InternalBlockchain.g:3078:2: rule__ExpresionAritmetica__Group__6__Impl rule__ExpresionAritmetica__Group__7
            {
            pushFollow(FOLLOW_35);
            rule__ExpresionAritmetica__Group__6__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ExpresionAritmetica__Group__7();

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
    // $ANTLR end "rule__ExpresionAritmetica__Group__6"


    // $ANTLR start "rule__ExpresionAritmetica__Group__6__Impl"
    // InternalBlockchain.g:3085:1: rule__ExpresionAritmetica__Group__6__Impl : ( ( '(' )* ) ;
    public final void rule__ExpresionAritmetica__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBlockchain.g:3089:1: ( ( ( '(' )* ) )
            // InternalBlockchain.g:3090:1: ( ( '(' )* )
            {
            // InternalBlockchain.g:3090:1: ( ( '(' )* )
            // InternalBlockchain.g:3091:2: ( '(' )*
            {
             before(grammarAccess.getExpresionAritmeticaAccess().getLeftParenthesisKeyword_6()); 
            // InternalBlockchain.g:3092:2: ( '(' )*
            loop37:
            do {
                int alt37=2;
                int LA37_0 = input.LA(1);

                if ( (LA37_0==42) ) {
                    alt37=1;
                }


                switch (alt37) {
            	case 1 :
            	    // InternalBlockchain.g:3092:3: '('
            	    {
            	    match(input,42,FOLLOW_25); 

            	    }
            	    break;

            	default :
            	    break loop37;
                }
            } while (true);

             after(grammarAccess.getExpresionAritmeticaAccess().getLeftParenthesisKeyword_6()); 

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
    // $ANTLR end "rule__ExpresionAritmetica__Group__6__Impl"


    // $ANTLR start "rule__ExpresionAritmetica__Group__7"
    // InternalBlockchain.g:3100:1: rule__ExpresionAritmetica__Group__7 : rule__ExpresionAritmetica__Group__7__Impl rule__ExpresionAritmetica__Group__8 ;
    public final void rule__ExpresionAritmetica__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBlockchain.g:3104:1: ( rule__ExpresionAritmetica__Group__7__Impl rule__ExpresionAritmetica__Group__8 )
            // InternalBlockchain.g:3105:2: rule__ExpresionAritmetica__Group__7__Impl rule__ExpresionAritmetica__Group__8
            {
            pushFollow(FOLLOW_33);
            rule__ExpresionAritmetica__Group__7__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ExpresionAritmetica__Group__8();

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
    // $ANTLR end "rule__ExpresionAritmetica__Group__7"


    // $ANTLR start "rule__ExpresionAritmetica__Group__7__Impl"
    // InternalBlockchain.g:3112:1: rule__ExpresionAritmetica__Group__7__Impl : ( ( rule__ExpresionAritmetica__DerAssignment_7 ) ) ;
    public final void rule__ExpresionAritmetica__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBlockchain.g:3116:1: ( ( ( rule__ExpresionAritmetica__DerAssignment_7 ) ) )
            // InternalBlockchain.g:3117:1: ( ( rule__ExpresionAritmetica__DerAssignment_7 ) )
            {
            // InternalBlockchain.g:3117:1: ( ( rule__ExpresionAritmetica__DerAssignment_7 ) )
            // InternalBlockchain.g:3118:2: ( rule__ExpresionAritmetica__DerAssignment_7 )
            {
             before(grammarAccess.getExpresionAritmeticaAccess().getDerAssignment_7()); 
            // InternalBlockchain.g:3119:2: ( rule__ExpresionAritmetica__DerAssignment_7 )
            // InternalBlockchain.g:3119:3: rule__ExpresionAritmetica__DerAssignment_7
            {
            pushFollow(FOLLOW_2);
            rule__ExpresionAritmetica__DerAssignment_7();

            state._fsp--;


            }

             after(grammarAccess.getExpresionAritmeticaAccess().getDerAssignment_7()); 

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
    // $ANTLR end "rule__ExpresionAritmetica__Group__7__Impl"


    // $ANTLR start "rule__ExpresionAritmetica__Group__8"
    // InternalBlockchain.g:3127:1: rule__ExpresionAritmetica__Group__8 : rule__ExpresionAritmetica__Group__8__Impl ;
    public final void rule__ExpresionAritmetica__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBlockchain.g:3131:1: ( rule__ExpresionAritmetica__Group__8__Impl )
            // InternalBlockchain.g:3132:2: rule__ExpresionAritmetica__Group__8__Impl
            {
            pushFollow(FOLLOW_2);
            rule__ExpresionAritmetica__Group__8__Impl();

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
    // $ANTLR end "rule__ExpresionAritmetica__Group__8"


    // $ANTLR start "rule__ExpresionAritmetica__Group__8__Impl"
    // InternalBlockchain.g:3138:1: rule__ExpresionAritmetica__Group__8__Impl : ( ( ')' )* ) ;
    public final void rule__ExpresionAritmetica__Group__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBlockchain.g:3142:1: ( ( ( ')' )* ) )
            // InternalBlockchain.g:3143:1: ( ( ')' )* )
            {
            // InternalBlockchain.g:3143:1: ( ( ')' )* )
            // InternalBlockchain.g:3144:2: ( ')' )*
            {
             before(grammarAccess.getExpresionAritmeticaAccess().getRightParenthesisKeyword_8()); 
            // InternalBlockchain.g:3145:2: ( ')' )*
            loop38:
            do {
                int alt38=2;
                int LA38_0 = input.LA(1);

                if ( (LA38_0==43) ) {
                    alt38=1;
                }


                switch (alt38) {
            	case 1 :
            	    // InternalBlockchain.g:3145:3: ')'
            	    {
            	    match(input,43,FOLLOW_27); 

            	    }
            	    break;

            	default :
            	    break loop38;
                }
            } while (true);

             after(grammarAccess.getExpresionAritmeticaAccess().getRightParenthesisKeyword_8()); 

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
    // $ANTLR end "rule__ExpresionAritmetica__Group__8__Impl"


    // $ANTLR start "rule__Variable__Group__0"
    // InternalBlockchain.g:3154:1: rule__Variable__Group__0 : rule__Variable__Group__0__Impl rule__Variable__Group__1 ;
    public final void rule__Variable__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBlockchain.g:3158:1: ( rule__Variable__Group__0__Impl rule__Variable__Group__1 )
            // InternalBlockchain.g:3159:2: rule__Variable__Group__0__Impl rule__Variable__Group__1
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
    // InternalBlockchain.g:3166:1: rule__Variable__Group__0__Impl : ( 'var' ) ;
    public final void rule__Variable__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBlockchain.g:3170:1: ( ( 'var' ) )
            // InternalBlockchain.g:3171:1: ( 'var' )
            {
            // InternalBlockchain.g:3171:1: ( 'var' )
            // InternalBlockchain.g:3172:2: 'var'
            {
             before(grammarAccess.getVariableAccess().getVarKeyword_0()); 
            match(input,51,FOLLOW_2); 
             after(grammarAccess.getVariableAccess().getVarKeyword_0()); 

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
    // $ANTLR end "rule__Variable__Group__0__Impl"


    // $ANTLR start "rule__Variable__Group__1"
    // InternalBlockchain.g:3181:1: rule__Variable__Group__1 : rule__Variable__Group__1__Impl rule__Variable__Group__2 ;
    public final void rule__Variable__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBlockchain.g:3185:1: ( rule__Variable__Group__1__Impl rule__Variable__Group__2 )
            // InternalBlockchain.g:3186:2: rule__Variable__Group__1__Impl rule__Variable__Group__2
            {
            pushFollow(FOLLOW_4);
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
    // InternalBlockchain.g:3193:1: rule__Variable__Group__1__Impl : ( ( rule__Variable__TipodatoAssignment_1 ) ) ;
    public final void rule__Variable__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBlockchain.g:3197:1: ( ( ( rule__Variable__TipodatoAssignment_1 ) ) )
            // InternalBlockchain.g:3198:1: ( ( rule__Variable__TipodatoAssignment_1 ) )
            {
            // InternalBlockchain.g:3198:1: ( ( rule__Variable__TipodatoAssignment_1 ) )
            // InternalBlockchain.g:3199:2: ( rule__Variable__TipodatoAssignment_1 )
            {
             before(grammarAccess.getVariableAccess().getTipodatoAssignment_1()); 
            // InternalBlockchain.g:3200:2: ( rule__Variable__TipodatoAssignment_1 )
            // InternalBlockchain.g:3200:3: rule__Variable__TipodatoAssignment_1
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
    // InternalBlockchain.g:3208:1: rule__Variable__Group__2 : rule__Variable__Group__2__Impl ;
    public final void rule__Variable__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBlockchain.g:3212:1: ( rule__Variable__Group__2__Impl )
            // InternalBlockchain.g:3213:2: rule__Variable__Group__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Variable__Group__2__Impl();

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
    // InternalBlockchain.g:3219:1: rule__Variable__Group__2__Impl : ( ( rule__Variable__NameAssignment_2 )? ) ;
    public final void rule__Variable__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBlockchain.g:3223:1: ( ( ( rule__Variable__NameAssignment_2 )? ) )
            // InternalBlockchain.g:3224:1: ( ( rule__Variable__NameAssignment_2 )? )
            {
            // InternalBlockchain.g:3224:1: ( ( rule__Variable__NameAssignment_2 )? )
            // InternalBlockchain.g:3225:2: ( rule__Variable__NameAssignment_2 )?
            {
             before(grammarAccess.getVariableAccess().getNameAssignment_2()); 
            // InternalBlockchain.g:3226:2: ( rule__Variable__NameAssignment_2 )?
            int alt39=2;
            int LA39_0 = input.LA(1);

            if ( ((LA39_0>=RULE_STRING && LA39_0<=RULE_ID)) ) {
                alt39=1;
            }
            switch (alt39) {
                case 1 :
                    // InternalBlockchain.g:3226:3: rule__Variable__NameAssignment_2
                    {
                    pushFollow(FOLLOW_2);
                    rule__Variable__NameAssignment_2();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getVariableAccess().getNameAssignment_2()); 

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


    // $ANTLR start "rule__Condicional__Group__0"
    // InternalBlockchain.g:3235:1: rule__Condicional__Group__0 : rule__Condicional__Group__0__Impl rule__Condicional__Group__1 ;
    public final void rule__Condicional__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBlockchain.g:3239:1: ( rule__Condicional__Group__0__Impl rule__Condicional__Group__1 )
            // InternalBlockchain.g:3240:2: rule__Condicional__Group__0__Impl rule__Condicional__Group__1
            {
            pushFollow(FOLLOW_36);
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
    // InternalBlockchain.g:3247:1: rule__Condicional__Group__0__Impl : ( 'if' ) ;
    public final void rule__Condicional__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBlockchain.g:3251:1: ( ( 'if' ) )
            // InternalBlockchain.g:3252:1: ( 'if' )
            {
            // InternalBlockchain.g:3252:1: ( 'if' )
            // InternalBlockchain.g:3253:2: 'if'
            {
             before(grammarAccess.getCondicionalAccess().getIfKeyword_0()); 
            match(input,52,FOLLOW_2); 
             after(grammarAccess.getCondicionalAccess().getIfKeyword_0()); 

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
    // InternalBlockchain.g:3262:1: rule__Condicional__Group__1 : rule__Condicional__Group__1__Impl rule__Condicional__Group__2 ;
    public final void rule__Condicional__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBlockchain.g:3266:1: ( rule__Condicional__Group__1__Impl rule__Condicional__Group__2 )
            // InternalBlockchain.g:3267:2: rule__Condicional__Group__1__Impl rule__Condicional__Group__2
            {
            pushFollow(FOLLOW_36);
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
    // InternalBlockchain.g:3274:1: rule__Condicional__Group__1__Impl : ( ( rule__Condicional__ExpresionlogicaAssignment_1 )? ) ;
    public final void rule__Condicional__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBlockchain.g:3278:1: ( ( ( rule__Condicional__ExpresionlogicaAssignment_1 )? ) )
            // InternalBlockchain.g:3279:1: ( ( rule__Condicional__ExpresionlogicaAssignment_1 )? )
            {
            // InternalBlockchain.g:3279:1: ( ( rule__Condicional__ExpresionlogicaAssignment_1 )? )
            // InternalBlockchain.g:3280:2: ( rule__Condicional__ExpresionlogicaAssignment_1 )?
            {
             before(grammarAccess.getCondicionalAccess().getExpresionlogicaAssignment_1()); 
            // InternalBlockchain.g:3281:2: ( rule__Condicional__ExpresionlogicaAssignment_1 )?
            int alt40=2;
            int LA40_0 = input.LA(1);

            if ( (LA40_0==49) ) {
                alt40=1;
            }
            switch (alt40) {
                case 1 :
                    // InternalBlockchain.g:3281:3: rule__Condicional__ExpresionlogicaAssignment_1
                    {
                    pushFollow(FOLLOW_2);
                    rule__Condicional__ExpresionlogicaAssignment_1();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getCondicionalAccess().getExpresionlogicaAssignment_1()); 

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
    // InternalBlockchain.g:3289:1: rule__Condicional__Group__2 : rule__Condicional__Group__2__Impl rule__Condicional__Group__3 ;
    public final void rule__Condicional__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBlockchain.g:3293:1: ( rule__Condicional__Group__2__Impl rule__Condicional__Group__3 )
            // InternalBlockchain.g:3294:2: rule__Condicional__Group__2__Impl rule__Condicional__Group__3
            {
            pushFollow(FOLLOW_37);
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
    // InternalBlockchain.g:3301:1: rule__Condicional__Group__2__Impl : ( '{' ) ;
    public final void rule__Condicional__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBlockchain.g:3305:1: ( ( '{' ) )
            // InternalBlockchain.g:3306:1: ( '{' )
            {
            // InternalBlockchain.g:3306:1: ( '{' )
            // InternalBlockchain.g:3307:2: '{'
            {
             before(grammarAccess.getCondicionalAccess().getLeftCurlyBracketKeyword_2()); 
            match(input,36,FOLLOW_2); 
             after(grammarAccess.getCondicionalAccess().getLeftCurlyBracketKeyword_2()); 

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
    // InternalBlockchain.g:3316:1: rule__Condicional__Group__3 : rule__Condicional__Group__3__Impl rule__Condicional__Group__4 ;
    public final void rule__Condicional__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBlockchain.g:3320:1: ( rule__Condicional__Group__3__Impl rule__Condicional__Group__4 )
            // InternalBlockchain.g:3321:2: rule__Condicional__Group__3__Impl rule__Condicional__Group__4
            {
            pushFollow(FOLLOW_37);
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
    // InternalBlockchain.g:3328:1: rule__Condicional__Group__3__Impl : ( ( rule__Condicional__LineasAssignment_3 )* ) ;
    public final void rule__Condicional__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBlockchain.g:3332:1: ( ( ( rule__Condicional__LineasAssignment_3 )* ) )
            // InternalBlockchain.g:3333:1: ( ( rule__Condicional__LineasAssignment_3 )* )
            {
            // InternalBlockchain.g:3333:1: ( ( rule__Condicional__LineasAssignment_3 )* )
            // InternalBlockchain.g:3334:2: ( rule__Condicional__LineasAssignment_3 )*
            {
             before(grammarAccess.getCondicionalAccess().getLineasAssignment_3()); 
            // InternalBlockchain.g:3335:2: ( rule__Condicional__LineasAssignment_3 )*
            loop41:
            do {
                int alt41=2;
                int LA41_0 = input.LA(1);

                if ( ((LA41_0>=49 && LA41_0<=52)||(LA41_0>=54 && LA41_0<=57)||LA41_0==59) ) {
                    alt41=1;
                }


                switch (alt41) {
            	case 1 :
            	    // InternalBlockchain.g:3335:3: rule__Condicional__LineasAssignment_3
            	    {
            	    pushFollow(FOLLOW_26);
            	    rule__Condicional__LineasAssignment_3();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop41;
                }
            } while (true);

             after(grammarAccess.getCondicionalAccess().getLineasAssignment_3()); 

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
    // InternalBlockchain.g:3343:1: rule__Condicional__Group__4 : rule__Condicional__Group__4__Impl rule__Condicional__Group__5 ;
    public final void rule__Condicional__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBlockchain.g:3347:1: ( rule__Condicional__Group__4__Impl rule__Condicional__Group__5 )
            // InternalBlockchain.g:3348:2: rule__Condicional__Group__4__Impl rule__Condicional__Group__5
            {
            pushFollow(FOLLOW_38);
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
    // InternalBlockchain.g:3355:1: rule__Condicional__Group__4__Impl : ( '}' ) ;
    public final void rule__Condicional__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBlockchain.g:3359:1: ( ( '}' ) )
            // InternalBlockchain.g:3360:1: ( '}' )
            {
            // InternalBlockchain.g:3360:1: ( '}' )
            // InternalBlockchain.g:3361:2: '}'
            {
             before(grammarAccess.getCondicionalAccess().getRightCurlyBracketKeyword_4()); 
            match(input,37,FOLLOW_2); 
             after(grammarAccess.getCondicionalAccess().getRightCurlyBracketKeyword_4()); 

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
    // InternalBlockchain.g:3370:1: rule__Condicional__Group__5 : rule__Condicional__Group__5__Impl ;
    public final void rule__Condicional__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBlockchain.g:3374:1: ( rule__Condicional__Group__5__Impl )
            // InternalBlockchain.g:3375:2: rule__Condicional__Group__5__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Condicional__Group__5__Impl();

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
    // InternalBlockchain.g:3381:1: rule__Condicional__Group__5__Impl : ( ( rule__Condicional__ElseAssignment_5 )? ) ;
    public final void rule__Condicional__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBlockchain.g:3385:1: ( ( ( rule__Condicional__ElseAssignment_5 )? ) )
            // InternalBlockchain.g:3386:1: ( ( rule__Condicional__ElseAssignment_5 )? )
            {
            // InternalBlockchain.g:3386:1: ( ( rule__Condicional__ElseAssignment_5 )? )
            // InternalBlockchain.g:3387:2: ( rule__Condicional__ElseAssignment_5 )?
            {
             before(grammarAccess.getCondicionalAccess().getElseAssignment_5()); 
            // InternalBlockchain.g:3388:2: ( rule__Condicional__ElseAssignment_5 )?
            int alt42=2;
            int LA42_0 = input.LA(1);

            if ( (LA42_0==53) ) {
                alt42=1;
            }
            switch (alt42) {
                case 1 :
                    // InternalBlockchain.g:3388:3: rule__Condicional__ElseAssignment_5
                    {
                    pushFollow(FOLLOW_2);
                    rule__Condicional__ElseAssignment_5();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getCondicionalAccess().getElseAssignment_5()); 

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


    // $ANTLR start "rule__Else__Group__0"
    // InternalBlockchain.g:3397:1: rule__Else__Group__0 : rule__Else__Group__0__Impl rule__Else__Group__1 ;
    public final void rule__Else__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBlockchain.g:3401:1: ( rule__Else__Group__0__Impl rule__Else__Group__1 )
            // InternalBlockchain.g:3402:2: rule__Else__Group__0__Impl rule__Else__Group__1
            {
            pushFollow(FOLLOW_5);
            rule__Else__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Else__Group__1();

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
    // $ANTLR end "rule__Else__Group__0"


    // $ANTLR start "rule__Else__Group__0__Impl"
    // InternalBlockchain.g:3409:1: rule__Else__Group__0__Impl : ( 'else' ) ;
    public final void rule__Else__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBlockchain.g:3413:1: ( ( 'else' ) )
            // InternalBlockchain.g:3414:1: ( 'else' )
            {
            // InternalBlockchain.g:3414:1: ( 'else' )
            // InternalBlockchain.g:3415:2: 'else'
            {
             before(grammarAccess.getElseAccess().getElseKeyword_0()); 
            match(input,53,FOLLOW_2); 
             after(grammarAccess.getElseAccess().getElseKeyword_0()); 

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
    // $ANTLR end "rule__Else__Group__0__Impl"


    // $ANTLR start "rule__Else__Group__1"
    // InternalBlockchain.g:3424:1: rule__Else__Group__1 : rule__Else__Group__1__Impl rule__Else__Group__2 ;
    public final void rule__Else__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBlockchain.g:3428:1: ( rule__Else__Group__1__Impl rule__Else__Group__2 )
            // InternalBlockchain.g:3429:2: rule__Else__Group__1__Impl rule__Else__Group__2
            {
            pushFollow(FOLLOW_37);
            rule__Else__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Else__Group__2();

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
    // $ANTLR end "rule__Else__Group__1"


    // $ANTLR start "rule__Else__Group__1__Impl"
    // InternalBlockchain.g:3436:1: rule__Else__Group__1__Impl : ( '{' ) ;
    public final void rule__Else__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBlockchain.g:3440:1: ( ( '{' ) )
            // InternalBlockchain.g:3441:1: ( '{' )
            {
            // InternalBlockchain.g:3441:1: ( '{' )
            // InternalBlockchain.g:3442:2: '{'
            {
             before(grammarAccess.getElseAccess().getLeftCurlyBracketKeyword_1()); 
            match(input,36,FOLLOW_2); 
             after(grammarAccess.getElseAccess().getLeftCurlyBracketKeyword_1()); 

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
    // $ANTLR end "rule__Else__Group__1__Impl"


    // $ANTLR start "rule__Else__Group__2"
    // InternalBlockchain.g:3451:1: rule__Else__Group__2 : rule__Else__Group__2__Impl rule__Else__Group__3 ;
    public final void rule__Else__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBlockchain.g:3455:1: ( rule__Else__Group__2__Impl rule__Else__Group__3 )
            // InternalBlockchain.g:3456:2: rule__Else__Group__2__Impl rule__Else__Group__3
            {
            pushFollow(FOLLOW_37);
            rule__Else__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Else__Group__3();

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
    // $ANTLR end "rule__Else__Group__2"


    // $ANTLR start "rule__Else__Group__2__Impl"
    // InternalBlockchain.g:3463:1: rule__Else__Group__2__Impl : ( ( rule__Else__LineasAssignment_2 )* ) ;
    public final void rule__Else__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBlockchain.g:3467:1: ( ( ( rule__Else__LineasAssignment_2 )* ) )
            // InternalBlockchain.g:3468:1: ( ( rule__Else__LineasAssignment_2 )* )
            {
            // InternalBlockchain.g:3468:1: ( ( rule__Else__LineasAssignment_2 )* )
            // InternalBlockchain.g:3469:2: ( rule__Else__LineasAssignment_2 )*
            {
             before(grammarAccess.getElseAccess().getLineasAssignment_2()); 
            // InternalBlockchain.g:3470:2: ( rule__Else__LineasAssignment_2 )*
            loop43:
            do {
                int alt43=2;
                int LA43_0 = input.LA(1);

                if ( ((LA43_0>=49 && LA43_0<=52)||(LA43_0>=54 && LA43_0<=57)||LA43_0==59) ) {
                    alt43=1;
                }


                switch (alt43) {
            	case 1 :
            	    // InternalBlockchain.g:3470:3: rule__Else__LineasAssignment_2
            	    {
            	    pushFollow(FOLLOW_26);
            	    rule__Else__LineasAssignment_2();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop43;
                }
            } while (true);

             after(grammarAccess.getElseAccess().getLineasAssignment_2()); 

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
    // $ANTLR end "rule__Else__Group__2__Impl"


    // $ANTLR start "rule__Else__Group__3"
    // InternalBlockchain.g:3478:1: rule__Else__Group__3 : rule__Else__Group__3__Impl ;
    public final void rule__Else__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBlockchain.g:3482:1: ( rule__Else__Group__3__Impl )
            // InternalBlockchain.g:3483:2: rule__Else__Group__3__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Else__Group__3__Impl();

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
    // $ANTLR end "rule__Else__Group__3"


    // $ANTLR start "rule__Else__Group__3__Impl"
    // InternalBlockchain.g:3489:1: rule__Else__Group__3__Impl : ( '}' ) ;
    public final void rule__Else__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBlockchain.g:3493:1: ( ( '}' ) )
            // InternalBlockchain.g:3494:1: ( '}' )
            {
            // InternalBlockchain.g:3494:1: ( '}' )
            // InternalBlockchain.g:3495:2: '}'
            {
             before(grammarAccess.getElseAccess().getRightCurlyBracketKeyword_3()); 
            match(input,37,FOLLOW_2); 
             after(grammarAccess.getElseAccess().getRightCurlyBracketKeyword_3()); 

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
    // $ANTLR end "rule__Else__Group__3__Impl"


    // $ANTLR start "rule__ExpresionNumerica__Group__0"
    // InternalBlockchain.g:3505:1: rule__ExpresionNumerica__Group__0 : rule__ExpresionNumerica__Group__0__Impl rule__ExpresionNumerica__Group__1 ;
    public final void rule__ExpresionNumerica__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBlockchain.g:3509:1: ( rule__ExpresionNumerica__Group__0__Impl rule__ExpresionNumerica__Group__1 )
            // InternalBlockchain.g:3510:2: rule__ExpresionNumerica__Group__0__Impl rule__ExpresionNumerica__Group__1
            {
            pushFollow(FOLLOW_39);
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
    // InternalBlockchain.g:3517:1: rule__ExpresionNumerica__Group__0__Impl : ( () ) ;
    public final void rule__ExpresionNumerica__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBlockchain.g:3521:1: ( ( () ) )
            // InternalBlockchain.g:3522:1: ( () )
            {
            // InternalBlockchain.g:3522:1: ( () )
            // InternalBlockchain.g:3523:2: ()
            {
             before(grammarAccess.getExpresionNumericaAccess().getExpresionNumericaAction_0()); 
            // InternalBlockchain.g:3524:2: ()
            // InternalBlockchain.g:3524:3: 
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
    // InternalBlockchain.g:3532:1: rule__ExpresionNumerica__Group__1 : rule__ExpresionNumerica__Group__1__Impl rule__ExpresionNumerica__Group__2 ;
    public final void rule__ExpresionNumerica__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBlockchain.g:3536:1: ( rule__ExpresionNumerica__Group__1__Impl rule__ExpresionNumerica__Group__2 )
            // InternalBlockchain.g:3537:2: rule__ExpresionNumerica__Group__1__Impl rule__ExpresionNumerica__Group__2
            {
            pushFollow(FOLLOW_40);
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
    // InternalBlockchain.g:3544:1: rule__ExpresionNumerica__Group__1__Impl : ( 'ExpNum' ) ;
    public final void rule__ExpresionNumerica__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBlockchain.g:3548:1: ( ( 'ExpNum' ) )
            // InternalBlockchain.g:3549:1: ( 'ExpNum' )
            {
            // InternalBlockchain.g:3549:1: ( 'ExpNum' )
            // InternalBlockchain.g:3550:2: 'ExpNum'
            {
             before(grammarAccess.getExpresionNumericaAccess().getExpNumKeyword_1()); 
            match(input,54,FOLLOW_2); 
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
    // InternalBlockchain.g:3559:1: rule__ExpresionNumerica__Group__2 : rule__ExpresionNumerica__Group__2__Impl ;
    public final void rule__ExpresionNumerica__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBlockchain.g:3563:1: ( rule__ExpresionNumerica__Group__2__Impl )
            // InternalBlockchain.g:3564:2: rule__ExpresionNumerica__Group__2__Impl
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
    // InternalBlockchain.g:3570:1: rule__ExpresionNumerica__Group__2__Impl : ( ( rule__ExpresionNumerica__ValueAssignment_2 )? ) ;
    public final void rule__ExpresionNumerica__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBlockchain.g:3574:1: ( ( ( rule__ExpresionNumerica__ValueAssignment_2 )? ) )
            // InternalBlockchain.g:3575:1: ( ( rule__ExpresionNumerica__ValueAssignment_2 )? )
            {
            // InternalBlockchain.g:3575:1: ( ( rule__ExpresionNumerica__ValueAssignment_2 )? )
            // InternalBlockchain.g:3576:2: ( rule__ExpresionNumerica__ValueAssignment_2 )?
            {
             before(grammarAccess.getExpresionNumericaAccess().getValueAssignment_2()); 
            // InternalBlockchain.g:3577:2: ( rule__ExpresionNumerica__ValueAssignment_2 )?
            int alt44=2;
            switch ( input.LA(1) ) {
                case 25:
                    {
                    int LA44_1 = input.LA(2);

                    if ( (LA44_1==RULE_INT||LA44_1==11) ) {
                        alt44=1;
                    }
                    }
                    break;
                case RULE_INT:
                    {
                    alt44=1;
                    }
                    break;
                case 11:
                    {
                    int LA44_3 = input.LA(2);

                    if ( (LA44_3==RULE_INT) ) {
                        alt44=1;
                    }
                    }
                    break;
            }

            switch (alt44) {
                case 1 :
                    // InternalBlockchain.g:3577:3: rule__ExpresionNumerica__ValueAssignment_2
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


    // $ANTLR start "rule__ExpresionTexto__Group__0"
    // InternalBlockchain.g:3586:1: rule__ExpresionTexto__Group__0 : rule__ExpresionTexto__Group__0__Impl rule__ExpresionTexto__Group__1 ;
    public final void rule__ExpresionTexto__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBlockchain.g:3590:1: ( rule__ExpresionTexto__Group__0__Impl rule__ExpresionTexto__Group__1 )
            // InternalBlockchain.g:3591:2: rule__ExpresionTexto__Group__0__Impl rule__ExpresionTexto__Group__1
            {
            pushFollow(FOLLOW_41);
            rule__ExpresionTexto__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ExpresionTexto__Group__1();

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
    // $ANTLR end "rule__ExpresionTexto__Group__0"


    // $ANTLR start "rule__ExpresionTexto__Group__0__Impl"
    // InternalBlockchain.g:3598:1: rule__ExpresionTexto__Group__0__Impl : ( () ) ;
    public final void rule__ExpresionTexto__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBlockchain.g:3602:1: ( ( () ) )
            // InternalBlockchain.g:3603:1: ( () )
            {
            // InternalBlockchain.g:3603:1: ( () )
            // InternalBlockchain.g:3604:2: ()
            {
             before(grammarAccess.getExpresionTextoAccess().getExpresionTextoAction_0()); 
            // InternalBlockchain.g:3605:2: ()
            // InternalBlockchain.g:3605:3: 
            {
            }

             after(grammarAccess.getExpresionTextoAccess().getExpresionTextoAction_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExpresionTexto__Group__0__Impl"


    // $ANTLR start "rule__ExpresionTexto__Group__1"
    // InternalBlockchain.g:3613:1: rule__ExpresionTexto__Group__1 : rule__ExpresionTexto__Group__1__Impl rule__ExpresionTexto__Group__2 ;
    public final void rule__ExpresionTexto__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBlockchain.g:3617:1: ( rule__ExpresionTexto__Group__1__Impl rule__ExpresionTexto__Group__2 )
            // InternalBlockchain.g:3618:2: rule__ExpresionTexto__Group__1__Impl rule__ExpresionTexto__Group__2
            {
            pushFollow(FOLLOW_4);
            rule__ExpresionTexto__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ExpresionTexto__Group__2();

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
    // $ANTLR end "rule__ExpresionTexto__Group__1"


    // $ANTLR start "rule__ExpresionTexto__Group__1__Impl"
    // InternalBlockchain.g:3625:1: rule__ExpresionTexto__Group__1__Impl : ( 'ExpTex' ) ;
    public final void rule__ExpresionTexto__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBlockchain.g:3629:1: ( ( 'ExpTex' ) )
            // InternalBlockchain.g:3630:1: ( 'ExpTex' )
            {
            // InternalBlockchain.g:3630:1: ( 'ExpTex' )
            // InternalBlockchain.g:3631:2: 'ExpTex'
            {
             before(grammarAccess.getExpresionTextoAccess().getExpTexKeyword_1()); 
            match(input,55,FOLLOW_2); 
             after(grammarAccess.getExpresionTextoAccess().getExpTexKeyword_1()); 

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
    // $ANTLR end "rule__ExpresionTexto__Group__1__Impl"


    // $ANTLR start "rule__ExpresionTexto__Group__2"
    // InternalBlockchain.g:3640:1: rule__ExpresionTexto__Group__2 : rule__ExpresionTexto__Group__2__Impl ;
    public final void rule__ExpresionTexto__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBlockchain.g:3644:1: ( rule__ExpresionTexto__Group__2__Impl )
            // InternalBlockchain.g:3645:2: rule__ExpresionTexto__Group__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__ExpresionTexto__Group__2__Impl();

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
    // $ANTLR end "rule__ExpresionTexto__Group__2"


    // $ANTLR start "rule__ExpresionTexto__Group__2__Impl"
    // InternalBlockchain.g:3651:1: rule__ExpresionTexto__Group__2__Impl : ( ( rule__ExpresionTexto__ValueAssignment_2 )? ) ;
    public final void rule__ExpresionTexto__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBlockchain.g:3655:1: ( ( ( rule__ExpresionTexto__ValueAssignment_2 )? ) )
            // InternalBlockchain.g:3656:1: ( ( rule__ExpresionTexto__ValueAssignment_2 )? )
            {
            // InternalBlockchain.g:3656:1: ( ( rule__ExpresionTexto__ValueAssignment_2 )? )
            // InternalBlockchain.g:3657:2: ( rule__ExpresionTexto__ValueAssignment_2 )?
            {
             before(grammarAccess.getExpresionTextoAccess().getValueAssignment_2()); 
            // InternalBlockchain.g:3658:2: ( rule__ExpresionTexto__ValueAssignment_2 )?
            int alt45=2;
            int LA45_0 = input.LA(1);

            if ( ((LA45_0>=RULE_STRING && LA45_0<=RULE_ID)) ) {
                alt45=1;
            }
            switch (alt45) {
                case 1 :
                    // InternalBlockchain.g:3658:3: rule__ExpresionTexto__ValueAssignment_2
                    {
                    pushFollow(FOLLOW_2);
                    rule__ExpresionTexto__ValueAssignment_2();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getExpresionTextoAccess().getValueAssignment_2()); 

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
    // $ANTLR end "rule__ExpresionTexto__Group__2__Impl"


    // $ANTLR start "rule__ExpresionBoolean__Group__0"
    // InternalBlockchain.g:3667:1: rule__ExpresionBoolean__Group__0 : rule__ExpresionBoolean__Group__0__Impl rule__ExpresionBoolean__Group__1 ;
    public final void rule__ExpresionBoolean__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBlockchain.g:3671:1: ( rule__ExpresionBoolean__Group__0__Impl rule__ExpresionBoolean__Group__1 )
            // InternalBlockchain.g:3672:2: rule__ExpresionBoolean__Group__0__Impl rule__ExpresionBoolean__Group__1
            {
            pushFollow(FOLLOW_42);
            rule__ExpresionBoolean__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ExpresionBoolean__Group__1();

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
    // $ANTLR end "rule__ExpresionBoolean__Group__0"


    // $ANTLR start "rule__ExpresionBoolean__Group__0__Impl"
    // InternalBlockchain.g:3679:1: rule__ExpresionBoolean__Group__0__Impl : ( () ) ;
    public final void rule__ExpresionBoolean__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBlockchain.g:3683:1: ( ( () ) )
            // InternalBlockchain.g:3684:1: ( () )
            {
            // InternalBlockchain.g:3684:1: ( () )
            // InternalBlockchain.g:3685:2: ()
            {
             before(grammarAccess.getExpresionBooleanAccess().getExpresionBooleanAction_0()); 
            // InternalBlockchain.g:3686:2: ()
            // InternalBlockchain.g:3686:3: 
            {
            }

             after(grammarAccess.getExpresionBooleanAccess().getExpresionBooleanAction_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExpresionBoolean__Group__0__Impl"


    // $ANTLR start "rule__ExpresionBoolean__Group__1"
    // InternalBlockchain.g:3694:1: rule__ExpresionBoolean__Group__1 : rule__ExpresionBoolean__Group__1__Impl rule__ExpresionBoolean__Group__2 ;
    public final void rule__ExpresionBoolean__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBlockchain.g:3698:1: ( rule__ExpresionBoolean__Group__1__Impl rule__ExpresionBoolean__Group__2 )
            // InternalBlockchain.g:3699:2: rule__ExpresionBoolean__Group__1__Impl rule__ExpresionBoolean__Group__2
            {
            pushFollow(FOLLOW_28);
            rule__ExpresionBoolean__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ExpresionBoolean__Group__2();

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
    // $ANTLR end "rule__ExpresionBoolean__Group__1"


    // $ANTLR start "rule__ExpresionBoolean__Group__1__Impl"
    // InternalBlockchain.g:3706:1: rule__ExpresionBoolean__Group__1__Impl : ( 'ExpBool' ) ;
    public final void rule__ExpresionBoolean__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBlockchain.g:3710:1: ( ( 'ExpBool' ) )
            // InternalBlockchain.g:3711:1: ( 'ExpBool' )
            {
            // InternalBlockchain.g:3711:1: ( 'ExpBool' )
            // InternalBlockchain.g:3712:2: 'ExpBool'
            {
             before(grammarAccess.getExpresionBooleanAccess().getExpBoolKeyword_1()); 
            match(input,56,FOLLOW_2); 
             after(grammarAccess.getExpresionBooleanAccess().getExpBoolKeyword_1()); 

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
    // $ANTLR end "rule__ExpresionBoolean__Group__1__Impl"


    // $ANTLR start "rule__ExpresionBoolean__Group__2"
    // InternalBlockchain.g:3721:1: rule__ExpresionBoolean__Group__2 : rule__ExpresionBoolean__Group__2__Impl ;
    public final void rule__ExpresionBoolean__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBlockchain.g:3725:1: ( rule__ExpresionBoolean__Group__2__Impl )
            // InternalBlockchain.g:3726:2: rule__ExpresionBoolean__Group__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__ExpresionBoolean__Group__2__Impl();

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
    // $ANTLR end "rule__ExpresionBoolean__Group__2"


    // $ANTLR start "rule__ExpresionBoolean__Group__2__Impl"
    // InternalBlockchain.g:3732:1: rule__ExpresionBoolean__Group__2__Impl : ( ( rule__ExpresionBoolean__ValueAssignment_2 )? ) ;
    public final void rule__ExpresionBoolean__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBlockchain.g:3736:1: ( ( ( rule__ExpresionBoolean__ValueAssignment_2 )? ) )
            // InternalBlockchain.g:3737:1: ( ( rule__ExpresionBoolean__ValueAssignment_2 )? )
            {
            // InternalBlockchain.g:3737:1: ( ( rule__ExpresionBoolean__ValueAssignment_2 )? )
            // InternalBlockchain.g:3738:2: ( rule__ExpresionBoolean__ValueAssignment_2 )?
            {
             before(grammarAccess.getExpresionBooleanAccess().getValueAssignment_2()); 
            // InternalBlockchain.g:3739:2: ( rule__ExpresionBoolean__ValueAssignment_2 )?
            int alt46=2;
            int LA46_0 = input.LA(1);

            if ( ((LA46_0>=12 && LA46_0<=13)) ) {
                alt46=1;
            }
            switch (alt46) {
                case 1 :
                    // InternalBlockchain.g:3739:3: rule__ExpresionBoolean__ValueAssignment_2
                    {
                    pushFollow(FOLLOW_2);
                    rule__ExpresionBoolean__ValueAssignment_2();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getExpresionBooleanAccess().getValueAssignment_2()); 

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
    // $ANTLR end "rule__ExpresionBoolean__Group__2__Impl"


    // $ANTLR start "rule__ExpresionReferenciada__Group__0"
    // InternalBlockchain.g:3748:1: rule__ExpresionReferenciada__Group__0 : rule__ExpresionReferenciada__Group__0__Impl rule__ExpresionReferenciada__Group__1 ;
    public final void rule__ExpresionReferenciada__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBlockchain.g:3752:1: ( rule__ExpresionReferenciada__Group__0__Impl rule__ExpresionReferenciada__Group__1 )
            // InternalBlockchain.g:3753:2: rule__ExpresionReferenciada__Group__0__Impl rule__ExpresionReferenciada__Group__1
            {
            pushFollow(FOLLOW_5);
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
    // InternalBlockchain.g:3760:1: rule__ExpresionReferenciada__Group__0__Impl : ( 'ExpRef' ) ;
    public final void rule__ExpresionReferenciada__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBlockchain.g:3764:1: ( ( 'ExpRef' ) )
            // InternalBlockchain.g:3765:1: ( 'ExpRef' )
            {
            // InternalBlockchain.g:3765:1: ( 'ExpRef' )
            // InternalBlockchain.g:3766:2: 'ExpRef'
            {
             before(grammarAccess.getExpresionReferenciadaAccess().getExpRefKeyword_0()); 
            match(input,57,FOLLOW_2); 
             after(grammarAccess.getExpresionReferenciadaAccess().getExpRefKeyword_0()); 

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
    // $ANTLR end "rule__ExpresionReferenciada__Group__0__Impl"


    // $ANTLR start "rule__ExpresionReferenciada__Group__1"
    // InternalBlockchain.g:3775:1: rule__ExpresionReferenciada__Group__1 : rule__ExpresionReferenciada__Group__1__Impl rule__ExpresionReferenciada__Group__2 ;
    public final void rule__ExpresionReferenciada__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBlockchain.g:3779:1: ( rule__ExpresionReferenciada__Group__1__Impl rule__ExpresionReferenciada__Group__2 )
            // InternalBlockchain.g:3780:2: rule__ExpresionReferenciada__Group__1__Impl rule__ExpresionReferenciada__Group__2
            {
            pushFollow(FOLLOW_43);
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
    // InternalBlockchain.g:3787:1: rule__ExpresionReferenciada__Group__1__Impl : ( '{' ) ;
    public final void rule__ExpresionReferenciada__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBlockchain.g:3791:1: ( ( '{' ) )
            // InternalBlockchain.g:3792:1: ( '{' )
            {
            // InternalBlockchain.g:3792:1: ( '{' )
            // InternalBlockchain.g:3793:2: '{'
            {
             before(grammarAccess.getExpresionReferenciadaAccess().getLeftCurlyBracketKeyword_1()); 
            match(input,36,FOLLOW_2); 
             after(grammarAccess.getExpresionReferenciadaAccess().getLeftCurlyBracketKeyword_1()); 

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
    // InternalBlockchain.g:3802:1: rule__ExpresionReferenciada__Group__2 : rule__ExpresionReferenciada__Group__2__Impl rule__ExpresionReferenciada__Group__3 ;
    public final void rule__ExpresionReferenciada__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBlockchain.g:3806:1: ( rule__ExpresionReferenciada__Group__2__Impl rule__ExpresionReferenciada__Group__3 )
            // InternalBlockchain.g:3807:2: rule__ExpresionReferenciada__Group__2__Impl rule__ExpresionReferenciada__Group__3
            {
            pushFollow(FOLLOW_43);
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
    // InternalBlockchain.g:3814:1: rule__ExpresionReferenciada__Group__2__Impl : ( ( rule__ExpresionReferenciada__Group_2__0 )? ) ;
    public final void rule__ExpresionReferenciada__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBlockchain.g:3818:1: ( ( ( rule__ExpresionReferenciada__Group_2__0 )? ) )
            // InternalBlockchain.g:3819:1: ( ( rule__ExpresionReferenciada__Group_2__0 )? )
            {
            // InternalBlockchain.g:3819:1: ( ( rule__ExpresionReferenciada__Group_2__0 )? )
            // InternalBlockchain.g:3820:2: ( rule__ExpresionReferenciada__Group_2__0 )?
            {
             before(grammarAccess.getExpresionReferenciadaAccess().getGroup_2()); 
            // InternalBlockchain.g:3821:2: ( rule__ExpresionReferenciada__Group_2__0 )?
            int alt47=2;
            int LA47_0 = input.LA(1);

            if ( (LA47_0==58) ) {
                alt47=1;
            }
            switch (alt47) {
                case 1 :
                    // InternalBlockchain.g:3821:3: rule__ExpresionReferenciada__Group_2__0
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
    // InternalBlockchain.g:3829:1: rule__ExpresionReferenciada__Group__3 : rule__ExpresionReferenciada__Group__3__Impl rule__ExpresionReferenciada__Group__4 ;
    public final void rule__ExpresionReferenciada__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBlockchain.g:3833:1: ( rule__ExpresionReferenciada__Group__3__Impl rule__ExpresionReferenciada__Group__4 )
            // InternalBlockchain.g:3834:2: rule__ExpresionReferenciada__Group__3__Impl rule__ExpresionReferenciada__Group__4
            {
            pushFollow(FOLLOW_44);
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
    // InternalBlockchain.g:3841:1: rule__ExpresionReferenciada__Group__3__Impl : ( ( rule__ExpresionReferenciada__ReferenciaAssignment_3 ) ) ;
    public final void rule__ExpresionReferenciada__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBlockchain.g:3845:1: ( ( ( rule__ExpresionReferenciada__ReferenciaAssignment_3 ) ) )
            // InternalBlockchain.g:3846:1: ( ( rule__ExpresionReferenciada__ReferenciaAssignment_3 ) )
            {
            // InternalBlockchain.g:3846:1: ( ( rule__ExpresionReferenciada__ReferenciaAssignment_3 ) )
            // InternalBlockchain.g:3847:2: ( rule__ExpresionReferenciada__ReferenciaAssignment_3 )
            {
             before(grammarAccess.getExpresionReferenciadaAccess().getReferenciaAssignment_3()); 
            // InternalBlockchain.g:3848:2: ( rule__ExpresionReferenciada__ReferenciaAssignment_3 )
            // InternalBlockchain.g:3848:3: rule__ExpresionReferenciada__ReferenciaAssignment_3
            {
            pushFollow(FOLLOW_2);
            rule__ExpresionReferenciada__ReferenciaAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getExpresionReferenciadaAccess().getReferenciaAssignment_3()); 

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
    // InternalBlockchain.g:3856:1: rule__ExpresionReferenciada__Group__4 : rule__ExpresionReferenciada__Group__4__Impl ;
    public final void rule__ExpresionReferenciada__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBlockchain.g:3860:1: ( rule__ExpresionReferenciada__Group__4__Impl )
            // InternalBlockchain.g:3861:2: rule__ExpresionReferenciada__Group__4__Impl
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
    // InternalBlockchain.g:3867:1: rule__ExpresionReferenciada__Group__4__Impl : ( '}' ) ;
    public final void rule__ExpresionReferenciada__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBlockchain.g:3871:1: ( ( '}' ) )
            // InternalBlockchain.g:3872:1: ( '}' )
            {
            // InternalBlockchain.g:3872:1: ( '}' )
            // InternalBlockchain.g:3873:2: '}'
            {
             before(grammarAccess.getExpresionReferenciadaAccess().getRightCurlyBracketKeyword_4()); 
            match(input,37,FOLLOW_2); 
             after(grammarAccess.getExpresionReferenciadaAccess().getRightCurlyBracketKeyword_4()); 

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
    // InternalBlockchain.g:3883:1: rule__ExpresionReferenciada__Group_2__0 : rule__ExpresionReferenciada__Group_2__0__Impl rule__ExpresionReferenciada__Group_2__1 ;
    public final void rule__ExpresionReferenciada__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBlockchain.g:3887:1: ( rule__ExpresionReferenciada__Group_2__0__Impl rule__ExpresionReferenciada__Group_2__1 )
            // InternalBlockchain.g:3888:2: rule__ExpresionReferenciada__Group_2__0__Impl rule__ExpresionReferenciada__Group_2__1
            {
            pushFollow(FOLLOW_45);
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
    // InternalBlockchain.g:3895:1: rule__ExpresionReferenciada__Group_2__0__Impl : ( 'id' ) ;
    public final void rule__ExpresionReferenciada__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBlockchain.g:3899:1: ( ( 'id' ) )
            // InternalBlockchain.g:3900:1: ( 'id' )
            {
            // InternalBlockchain.g:3900:1: ( 'id' )
            // InternalBlockchain.g:3901:2: 'id'
            {
             before(grammarAccess.getExpresionReferenciadaAccess().getIdKeyword_2_0()); 
            match(input,58,FOLLOW_2); 
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
    // InternalBlockchain.g:3910:1: rule__ExpresionReferenciada__Group_2__1 : rule__ExpresionReferenciada__Group_2__1__Impl ;
    public final void rule__ExpresionReferenciada__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBlockchain.g:3914:1: ( rule__ExpresionReferenciada__Group_2__1__Impl )
            // InternalBlockchain.g:3915:2: rule__ExpresionReferenciada__Group_2__1__Impl
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
    // InternalBlockchain.g:3921:1: rule__ExpresionReferenciada__Group_2__1__Impl : ( ( rule__ExpresionReferenciada__IdAssignment_2_1 ) ) ;
    public final void rule__ExpresionReferenciada__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBlockchain.g:3925:1: ( ( ( rule__ExpresionReferenciada__IdAssignment_2_1 ) ) )
            // InternalBlockchain.g:3926:1: ( ( rule__ExpresionReferenciada__IdAssignment_2_1 ) )
            {
            // InternalBlockchain.g:3926:1: ( ( rule__ExpresionReferenciada__IdAssignment_2_1 ) )
            // InternalBlockchain.g:3927:2: ( rule__ExpresionReferenciada__IdAssignment_2_1 )
            {
             before(grammarAccess.getExpresionReferenciadaAccess().getIdAssignment_2_1()); 
            // InternalBlockchain.g:3928:2: ( rule__ExpresionReferenciada__IdAssignment_2_1 )
            // InternalBlockchain.g:3928:3: rule__ExpresionReferenciada__IdAssignment_2_1
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
    // InternalBlockchain.g:3937:1: rule__ExpresionRelacional__Group__0 : rule__ExpresionRelacional__Group__0__Impl rule__ExpresionRelacional__Group__1 ;
    public final void rule__ExpresionRelacional__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBlockchain.g:3941:1: ( rule__ExpresionRelacional__Group__0__Impl rule__ExpresionRelacional__Group__1 )
            // InternalBlockchain.g:3942:2: rule__ExpresionRelacional__Group__0__Impl rule__ExpresionRelacional__Group__1
            {
            pushFollow(FOLLOW_46);
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
    // InternalBlockchain.g:3949:1: rule__ExpresionRelacional__Group__0__Impl : ( 'ExpRel' ) ;
    public final void rule__ExpresionRelacional__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBlockchain.g:3953:1: ( ( 'ExpRel' ) )
            // InternalBlockchain.g:3954:1: ( 'ExpRel' )
            {
            // InternalBlockchain.g:3954:1: ( 'ExpRel' )
            // InternalBlockchain.g:3955:2: 'ExpRel'
            {
             before(grammarAccess.getExpresionRelacionalAccess().getExpRelKeyword_0()); 
            match(input,59,FOLLOW_2); 
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
    // InternalBlockchain.g:3964:1: rule__ExpresionRelacional__Group__1 : rule__ExpresionRelacional__Group__1__Impl rule__ExpresionRelacional__Group__2 ;
    public final void rule__ExpresionRelacional__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBlockchain.g:3968:1: ( rule__ExpresionRelacional__Group__1__Impl rule__ExpresionRelacional__Group__2 )
            // InternalBlockchain.g:3969:2: rule__ExpresionRelacional__Group__1__Impl rule__ExpresionRelacional__Group__2
            {
            pushFollow(FOLLOW_47);
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
    // InternalBlockchain.g:3976:1: rule__ExpresionRelacional__Group__1__Impl : ( ( rule__ExpresionRelacional__IzqAssignment_1 ) ) ;
    public final void rule__ExpresionRelacional__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBlockchain.g:3980:1: ( ( ( rule__ExpresionRelacional__IzqAssignment_1 ) ) )
            // InternalBlockchain.g:3981:1: ( ( rule__ExpresionRelacional__IzqAssignment_1 ) )
            {
            // InternalBlockchain.g:3981:1: ( ( rule__ExpresionRelacional__IzqAssignment_1 ) )
            // InternalBlockchain.g:3982:2: ( rule__ExpresionRelacional__IzqAssignment_1 )
            {
             before(grammarAccess.getExpresionRelacionalAccess().getIzqAssignment_1()); 
            // InternalBlockchain.g:3983:2: ( rule__ExpresionRelacional__IzqAssignment_1 )
            // InternalBlockchain.g:3983:3: rule__ExpresionRelacional__IzqAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__ExpresionRelacional__IzqAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getExpresionRelacionalAccess().getIzqAssignment_1()); 

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
    // InternalBlockchain.g:3991:1: rule__ExpresionRelacional__Group__2 : rule__ExpresionRelacional__Group__2__Impl rule__ExpresionRelacional__Group__3 ;
    public final void rule__ExpresionRelacional__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBlockchain.g:3995:1: ( rule__ExpresionRelacional__Group__2__Impl rule__ExpresionRelacional__Group__3 )
            // InternalBlockchain.g:3996:2: rule__ExpresionRelacional__Group__2__Impl rule__ExpresionRelacional__Group__3
            {
            pushFollow(FOLLOW_47);
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
    // InternalBlockchain.g:4003:1: rule__ExpresionRelacional__Group__2__Impl : ( ( rule__ExpresionRelacional__OperadorRelacionalAssignment_2 )? ) ;
    public final void rule__ExpresionRelacional__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBlockchain.g:4007:1: ( ( ( rule__ExpresionRelacional__OperadorRelacionalAssignment_2 )? ) )
            // InternalBlockchain.g:4008:1: ( ( rule__ExpresionRelacional__OperadorRelacionalAssignment_2 )? )
            {
            // InternalBlockchain.g:4008:1: ( ( rule__ExpresionRelacional__OperadorRelacionalAssignment_2 )? )
            // InternalBlockchain.g:4009:2: ( rule__ExpresionRelacional__OperadorRelacionalAssignment_2 )?
            {
             before(grammarAccess.getExpresionRelacionalAccess().getOperadorRelacionalAssignment_2()); 
            // InternalBlockchain.g:4010:2: ( rule__ExpresionRelacional__OperadorRelacionalAssignment_2 )?
            int alt48=2;
            int LA48_0 = input.LA(1);

            if ( (LA48_0==11) ) {
                alt48=1;
            }
            switch (alt48) {
                case 1 :
                    // InternalBlockchain.g:4010:3: rule__ExpresionRelacional__OperadorRelacionalAssignment_2
                    {
                    pushFollow(FOLLOW_2);
                    rule__ExpresionRelacional__OperadorRelacionalAssignment_2();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getExpresionRelacionalAccess().getOperadorRelacionalAssignment_2()); 

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
    // InternalBlockchain.g:4018:1: rule__ExpresionRelacional__Group__3 : rule__ExpresionRelacional__Group__3__Impl ;
    public final void rule__ExpresionRelacional__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBlockchain.g:4022:1: ( rule__ExpresionRelacional__Group__3__Impl )
            // InternalBlockchain.g:4023:2: rule__ExpresionRelacional__Group__3__Impl
            {
            pushFollow(FOLLOW_2);
            rule__ExpresionRelacional__Group__3__Impl();

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
    // InternalBlockchain.g:4029:1: rule__ExpresionRelacional__Group__3__Impl : ( ( rule__ExpresionRelacional__DerAssignment_3 ) ) ;
    public final void rule__ExpresionRelacional__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBlockchain.g:4033:1: ( ( ( rule__ExpresionRelacional__DerAssignment_3 ) ) )
            // InternalBlockchain.g:4034:1: ( ( rule__ExpresionRelacional__DerAssignment_3 ) )
            {
            // InternalBlockchain.g:4034:1: ( ( rule__ExpresionRelacional__DerAssignment_3 ) )
            // InternalBlockchain.g:4035:2: ( rule__ExpresionRelacional__DerAssignment_3 )
            {
             before(grammarAccess.getExpresionRelacionalAccess().getDerAssignment_3()); 
            // InternalBlockchain.g:4036:2: ( rule__ExpresionRelacional__DerAssignment_3 )
            // InternalBlockchain.g:4036:3: rule__ExpresionRelacional__DerAssignment_3
            {
            pushFollow(FOLLOW_2);
            rule__ExpresionRelacional__DerAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getExpresionRelacionalAccess().getDerAssignment_3()); 

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


    // $ANTLR start "rule__EDouble__Group__0"
    // InternalBlockchain.g:4045:1: rule__EDouble__Group__0 : rule__EDouble__Group__0__Impl rule__EDouble__Group__1 ;
    public final void rule__EDouble__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBlockchain.g:4049:1: ( rule__EDouble__Group__0__Impl rule__EDouble__Group__1 )
            // InternalBlockchain.g:4050:2: rule__EDouble__Group__0__Impl rule__EDouble__Group__1
            {
            pushFollow(FOLLOW_40);
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
    // InternalBlockchain.g:4057:1: rule__EDouble__Group__0__Impl : ( ( '-' )? ) ;
    public final void rule__EDouble__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBlockchain.g:4061:1: ( ( ( '-' )? ) )
            // InternalBlockchain.g:4062:1: ( ( '-' )? )
            {
            // InternalBlockchain.g:4062:1: ( ( '-' )? )
            // InternalBlockchain.g:4063:2: ( '-' )?
            {
             before(grammarAccess.getEDoubleAccess().getHyphenMinusKeyword_0()); 
            // InternalBlockchain.g:4064:2: ( '-' )?
            int alt49=2;
            int LA49_0 = input.LA(1);

            if ( (LA49_0==25) ) {
                alt49=1;
            }
            switch (alt49) {
                case 1 :
                    // InternalBlockchain.g:4064:3: '-'
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
    // InternalBlockchain.g:4072:1: rule__EDouble__Group__1 : rule__EDouble__Group__1__Impl rule__EDouble__Group__2 ;
    public final void rule__EDouble__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBlockchain.g:4076:1: ( rule__EDouble__Group__1__Impl rule__EDouble__Group__2 )
            // InternalBlockchain.g:4077:2: rule__EDouble__Group__1__Impl rule__EDouble__Group__2
            {
            pushFollow(FOLLOW_40);
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
    // InternalBlockchain.g:4084:1: rule__EDouble__Group__1__Impl : ( ( RULE_INT )? ) ;
    public final void rule__EDouble__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBlockchain.g:4088:1: ( ( ( RULE_INT )? ) )
            // InternalBlockchain.g:4089:1: ( ( RULE_INT )? )
            {
            // InternalBlockchain.g:4089:1: ( ( RULE_INT )? )
            // InternalBlockchain.g:4090:2: ( RULE_INT )?
            {
             before(grammarAccess.getEDoubleAccess().getINTTerminalRuleCall_1()); 
            // InternalBlockchain.g:4091:2: ( RULE_INT )?
            int alt50=2;
            int LA50_0 = input.LA(1);

            if ( (LA50_0==RULE_INT) ) {
                alt50=1;
            }
            switch (alt50) {
                case 1 :
                    // InternalBlockchain.g:4091:3: RULE_INT
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
    // InternalBlockchain.g:4099:1: rule__EDouble__Group__2 : rule__EDouble__Group__2__Impl rule__EDouble__Group__3 ;
    public final void rule__EDouble__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBlockchain.g:4103:1: ( rule__EDouble__Group__2__Impl rule__EDouble__Group__3 )
            // InternalBlockchain.g:4104:2: rule__EDouble__Group__2__Impl rule__EDouble__Group__3
            {
            pushFollow(FOLLOW_48);
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
    // InternalBlockchain.g:4111:1: rule__EDouble__Group__2__Impl : ( '.' ) ;
    public final void rule__EDouble__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBlockchain.g:4115:1: ( ( '.' ) )
            // InternalBlockchain.g:4116:1: ( '.' )
            {
            // InternalBlockchain.g:4116:1: ( '.' )
            // InternalBlockchain.g:4117:2: '.'
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
    // InternalBlockchain.g:4126:1: rule__EDouble__Group__3 : rule__EDouble__Group__3__Impl rule__EDouble__Group__4 ;
    public final void rule__EDouble__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBlockchain.g:4130:1: ( rule__EDouble__Group__3__Impl rule__EDouble__Group__4 )
            // InternalBlockchain.g:4131:2: rule__EDouble__Group__3__Impl rule__EDouble__Group__4
            {
            pushFollow(FOLLOW_49);
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
    // InternalBlockchain.g:4138:1: rule__EDouble__Group__3__Impl : ( RULE_INT ) ;
    public final void rule__EDouble__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBlockchain.g:4142:1: ( ( RULE_INT ) )
            // InternalBlockchain.g:4143:1: ( RULE_INT )
            {
            // InternalBlockchain.g:4143:1: ( RULE_INT )
            // InternalBlockchain.g:4144:2: RULE_INT
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
    // InternalBlockchain.g:4153:1: rule__EDouble__Group__4 : rule__EDouble__Group__4__Impl ;
    public final void rule__EDouble__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBlockchain.g:4157:1: ( rule__EDouble__Group__4__Impl )
            // InternalBlockchain.g:4158:2: rule__EDouble__Group__4__Impl
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
    // InternalBlockchain.g:4164:1: rule__EDouble__Group__4__Impl : ( ( rule__EDouble__Group_4__0 )? ) ;
    public final void rule__EDouble__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBlockchain.g:4168:1: ( ( ( rule__EDouble__Group_4__0 )? ) )
            // InternalBlockchain.g:4169:1: ( ( rule__EDouble__Group_4__0 )? )
            {
            // InternalBlockchain.g:4169:1: ( ( rule__EDouble__Group_4__0 )? )
            // InternalBlockchain.g:4170:2: ( rule__EDouble__Group_4__0 )?
            {
             before(grammarAccess.getEDoubleAccess().getGroup_4()); 
            // InternalBlockchain.g:4171:2: ( rule__EDouble__Group_4__0 )?
            int alt51=2;
            int LA51_0 = input.LA(1);

            if ( ((LA51_0>=14 && LA51_0<=15)) ) {
                alt51=1;
            }
            switch (alt51) {
                case 1 :
                    // InternalBlockchain.g:4171:3: rule__EDouble__Group_4__0
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
    // InternalBlockchain.g:4180:1: rule__EDouble__Group_4__0 : rule__EDouble__Group_4__0__Impl rule__EDouble__Group_4__1 ;
    public final void rule__EDouble__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBlockchain.g:4184:1: ( rule__EDouble__Group_4__0__Impl rule__EDouble__Group_4__1 )
            // InternalBlockchain.g:4185:2: rule__EDouble__Group_4__0__Impl rule__EDouble__Group_4__1
            {
            pushFollow(FOLLOW_45);
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
    // InternalBlockchain.g:4192:1: rule__EDouble__Group_4__0__Impl : ( ( rule__EDouble__Alternatives_4_0 ) ) ;
    public final void rule__EDouble__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBlockchain.g:4196:1: ( ( ( rule__EDouble__Alternatives_4_0 ) ) )
            // InternalBlockchain.g:4197:1: ( ( rule__EDouble__Alternatives_4_0 ) )
            {
            // InternalBlockchain.g:4197:1: ( ( rule__EDouble__Alternatives_4_0 ) )
            // InternalBlockchain.g:4198:2: ( rule__EDouble__Alternatives_4_0 )
            {
             before(grammarAccess.getEDoubleAccess().getAlternatives_4_0()); 
            // InternalBlockchain.g:4199:2: ( rule__EDouble__Alternatives_4_0 )
            // InternalBlockchain.g:4199:3: rule__EDouble__Alternatives_4_0
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
    // InternalBlockchain.g:4207:1: rule__EDouble__Group_4__1 : rule__EDouble__Group_4__1__Impl rule__EDouble__Group_4__2 ;
    public final void rule__EDouble__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBlockchain.g:4211:1: ( rule__EDouble__Group_4__1__Impl rule__EDouble__Group_4__2 )
            // InternalBlockchain.g:4212:2: rule__EDouble__Group_4__1__Impl rule__EDouble__Group_4__2
            {
            pushFollow(FOLLOW_45);
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
    // InternalBlockchain.g:4219:1: rule__EDouble__Group_4__1__Impl : ( ( '-' )? ) ;
    public final void rule__EDouble__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBlockchain.g:4223:1: ( ( ( '-' )? ) )
            // InternalBlockchain.g:4224:1: ( ( '-' )? )
            {
            // InternalBlockchain.g:4224:1: ( ( '-' )? )
            // InternalBlockchain.g:4225:2: ( '-' )?
            {
             before(grammarAccess.getEDoubleAccess().getHyphenMinusKeyword_4_1()); 
            // InternalBlockchain.g:4226:2: ( '-' )?
            int alt52=2;
            int LA52_0 = input.LA(1);

            if ( (LA52_0==25) ) {
                alt52=1;
            }
            switch (alt52) {
                case 1 :
                    // InternalBlockchain.g:4226:3: '-'
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
    // InternalBlockchain.g:4234:1: rule__EDouble__Group_4__2 : rule__EDouble__Group_4__2__Impl ;
    public final void rule__EDouble__Group_4__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBlockchain.g:4238:1: ( rule__EDouble__Group_4__2__Impl )
            // InternalBlockchain.g:4239:2: rule__EDouble__Group_4__2__Impl
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
    // InternalBlockchain.g:4245:1: rule__EDouble__Group_4__2__Impl : ( RULE_INT ) ;
    public final void rule__EDouble__Group_4__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBlockchain.g:4249:1: ( ( RULE_INT ) )
            // InternalBlockchain.g:4250:1: ( RULE_INT )
            {
            // InternalBlockchain.g:4250:1: ( RULE_INT )
            // InternalBlockchain.g:4251:2: RULE_INT
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


    // $ANTLR start "rule__EInt__Group__0"
    // InternalBlockchain.g:4261:1: rule__EInt__Group__0 : rule__EInt__Group__0__Impl rule__EInt__Group__1 ;
    public final void rule__EInt__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBlockchain.g:4265:1: ( rule__EInt__Group__0__Impl rule__EInt__Group__1 )
            // InternalBlockchain.g:4266:2: rule__EInt__Group__0__Impl rule__EInt__Group__1
            {
            pushFollow(FOLLOW_45);
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
    // InternalBlockchain.g:4273:1: rule__EInt__Group__0__Impl : ( ( '-' )? ) ;
    public final void rule__EInt__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBlockchain.g:4277:1: ( ( ( '-' )? ) )
            // InternalBlockchain.g:4278:1: ( ( '-' )? )
            {
            // InternalBlockchain.g:4278:1: ( ( '-' )? )
            // InternalBlockchain.g:4279:2: ( '-' )?
            {
             before(grammarAccess.getEIntAccess().getHyphenMinusKeyword_0()); 
            // InternalBlockchain.g:4280:2: ( '-' )?
            int alt53=2;
            int LA53_0 = input.LA(1);

            if ( (LA53_0==25) ) {
                alt53=1;
            }
            switch (alt53) {
                case 1 :
                    // InternalBlockchain.g:4280:3: '-'
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
    // InternalBlockchain.g:4288:1: rule__EInt__Group__1 : rule__EInt__Group__1__Impl ;
    public final void rule__EInt__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBlockchain.g:4292:1: ( rule__EInt__Group__1__Impl )
            // InternalBlockchain.g:4293:2: rule__EInt__Group__1__Impl
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
    // InternalBlockchain.g:4299:1: rule__EInt__Group__1__Impl : ( RULE_INT ) ;
    public final void rule__EInt__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBlockchain.g:4303:1: ( ( RULE_INT ) )
            // InternalBlockchain.g:4304:1: ( RULE_INT )
            {
            // InternalBlockchain.g:4304:1: ( RULE_INT )
            // InternalBlockchain.g:4305:2: RULE_INT
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


    // $ANTLR start "rule__Primitivo__Group__0"
    // InternalBlockchain.g:4315:1: rule__Primitivo__Group__0 : rule__Primitivo__Group__0__Impl rule__Primitivo__Group__1 ;
    public final void rule__Primitivo__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBlockchain.g:4319:1: ( rule__Primitivo__Group__0__Impl rule__Primitivo__Group__1 )
            // InternalBlockchain.g:4320:2: rule__Primitivo__Group__0__Impl rule__Primitivo__Group__1
            {
            pushFollow(FOLLOW_50);
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
    // InternalBlockchain.g:4327:1: rule__Primitivo__Group__0__Impl : ( () ) ;
    public final void rule__Primitivo__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBlockchain.g:4331:1: ( ( () ) )
            // InternalBlockchain.g:4332:1: ( () )
            {
            // InternalBlockchain.g:4332:1: ( () )
            // InternalBlockchain.g:4333:2: ()
            {
             before(grammarAccess.getPrimitivoAccess().getPrimitivoAction_0()); 
            // InternalBlockchain.g:4334:2: ()
            // InternalBlockchain.g:4334:3: 
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
    // InternalBlockchain.g:4342:1: rule__Primitivo__Group__1 : rule__Primitivo__Group__1__Impl rule__Primitivo__Group__2 ;
    public final void rule__Primitivo__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBlockchain.g:4346:1: ( rule__Primitivo__Group__1__Impl rule__Primitivo__Group__2 )
            // InternalBlockchain.g:4347:2: rule__Primitivo__Group__1__Impl rule__Primitivo__Group__2
            {
            pushFollow(FOLLOW_50);
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
    // InternalBlockchain.g:4354:1: rule__Primitivo__Group__1__Impl : ( ( rule__Primitivo__TipoAssignment_1 )? ) ;
    public final void rule__Primitivo__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBlockchain.g:4358:1: ( ( ( rule__Primitivo__TipoAssignment_1 )? ) )
            // InternalBlockchain.g:4359:1: ( ( rule__Primitivo__TipoAssignment_1 )? )
            {
            // InternalBlockchain.g:4359:1: ( ( rule__Primitivo__TipoAssignment_1 )? )
            // InternalBlockchain.g:4360:2: ( rule__Primitivo__TipoAssignment_1 )?
            {
             before(grammarAccess.getPrimitivoAccess().getTipoAssignment_1()); 
            // InternalBlockchain.g:4361:2: ( rule__Primitivo__TipoAssignment_1 )?
            int alt54=2;
            int LA54_0 = input.LA(1);

            if ( ((LA54_0>=31 && LA54_0<=34)) ) {
                alt54=1;
            }
            switch (alt54) {
                case 1 :
                    // InternalBlockchain.g:4361:3: rule__Primitivo__TipoAssignment_1
                    {
                    pushFollow(FOLLOW_2);
                    rule__Primitivo__TipoAssignment_1();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getPrimitivoAccess().getTipoAssignment_1()); 

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
    // InternalBlockchain.g:4369:1: rule__Primitivo__Group__2 : rule__Primitivo__Group__2__Impl ;
    public final void rule__Primitivo__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBlockchain.g:4373:1: ( rule__Primitivo__Group__2__Impl )
            // InternalBlockchain.g:4374:2: rule__Primitivo__Group__2__Impl
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
    // InternalBlockchain.g:4380:1: rule__Primitivo__Group__2__Impl : ( ( rule__Primitivo__NameAssignment_2 ) ) ;
    public final void rule__Primitivo__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBlockchain.g:4384:1: ( ( ( rule__Primitivo__NameAssignment_2 ) ) )
            // InternalBlockchain.g:4385:1: ( ( rule__Primitivo__NameAssignment_2 ) )
            {
            // InternalBlockchain.g:4385:1: ( ( rule__Primitivo__NameAssignment_2 ) )
            // InternalBlockchain.g:4386:2: ( rule__Primitivo__NameAssignment_2 )
            {
             before(grammarAccess.getPrimitivoAccess().getNameAssignment_2()); 
            // InternalBlockchain.g:4387:2: ( rule__Primitivo__NameAssignment_2 )
            // InternalBlockchain.g:4387:3: rule__Primitivo__NameAssignment_2
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
    // InternalBlockchain.g:4396:1: rule__Mapa__Group__0 : rule__Mapa__Group__0__Impl rule__Mapa__Group__1 ;
    public final void rule__Mapa__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBlockchain.g:4400:1: ( rule__Mapa__Group__0__Impl rule__Mapa__Group__1 )
            // InternalBlockchain.g:4401:2: rule__Mapa__Group__0__Impl rule__Mapa__Group__1
            {
            pushFollow(FOLLOW_51);
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
    // InternalBlockchain.g:4408:1: rule__Mapa__Group__0__Impl : ( 'Map' ) ;
    public final void rule__Mapa__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBlockchain.g:4412:1: ( ( 'Map' ) )
            // InternalBlockchain.g:4413:1: ( 'Map' )
            {
            // InternalBlockchain.g:4413:1: ( 'Map' )
            // InternalBlockchain.g:4414:2: 'Map'
            {
             before(grammarAccess.getMapaAccess().getMapKeyword_0()); 
            match(input,60,FOLLOW_2); 
             after(grammarAccess.getMapaAccess().getMapKeyword_0()); 

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
    // InternalBlockchain.g:4423:1: rule__Mapa__Group__1 : rule__Mapa__Group__1__Impl rule__Mapa__Group__2 ;
    public final void rule__Mapa__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBlockchain.g:4427:1: ( rule__Mapa__Group__1__Impl rule__Mapa__Group__2 )
            // InternalBlockchain.g:4428:2: rule__Mapa__Group__1__Impl rule__Mapa__Group__2
            {
            pushFollow(FOLLOW_4);
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
    // InternalBlockchain.g:4435:1: rule__Mapa__Group__1__Impl : ( '<' ) ;
    public final void rule__Mapa__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBlockchain.g:4439:1: ( ( '<' ) )
            // InternalBlockchain.g:4440:1: ( '<' )
            {
            // InternalBlockchain.g:4440:1: ( '<' )
            // InternalBlockchain.g:4441:2: '<'
            {
             before(grammarAccess.getMapaAccess().getLessThanSignKeyword_1()); 
            match(input,19,FOLLOW_2); 
             after(grammarAccess.getMapaAccess().getLessThanSignKeyword_1()); 

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
    // InternalBlockchain.g:4450:1: rule__Mapa__Group__2 : rule__Mapa__Group__2__Impl rule__Mapa__Group__3 ;
    public final void rule__Mapa__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBlockchain.g:4454:1: ( rule__Mapa__Group__2__Impl rule__Mapa__Group__3 )
            // InternalBlockchain.g:4455:2: rule__Mapa__Group__2__Impl rule__Mapa__Group__3
            {
            pushFollow(FOLLOW_29);
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
    // InternalBlockchain.g:4462:1: rule__Mapa__Group__2__Impl : ( ( rule__Mapa__TipoDatoKeyAssignment_2 ) ) ;
    public final void rule__Mapa__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBlockchain.g:4466:1: ( ( ( rule__Mapa__TipoDatoKeyAssignment_2 ) ) )
            // InternalBlockchain.g:4467:1: ( ( rule__Mapa__TipoDatoKeyAssignment_2 ) )
            {
            // InternalBlockchain.g:4467:1: ( ( rule__Mapa__TipoDatoKeyAssignment_2 ) )
            // InternalBlockchain.g:4468:2: ( rule__Mapa__TipoDatoKeyAssignment_2 )
            {
             before(grammarAccess.getMapaAccess().getTipoDatoKeyAssignment_2()); 
            // InternalBlockchain.g:4469:2: ( rule__Mapa__TipoDatoKeyAssignment_2 )
            // InternalBlockchain.g:4469:3: rule__Mapa__TipoDatoKeyAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__Mapa__TipoDatoKeyAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getMapaAccess().getTipoDatoKeyAssignment_2()); 

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
    // InternalBlockchain.g:4477:1: rule__Mapa__Group__3 : rule__Mapa__Group__3__Impl rule__Mapa__Group__4 ;
    public final void rule__Mapa__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBlockchain.g:4481:1: ( rule__Mapa__Group__3__Impl rule__Mapa__Group__4 )
            // InternalBlockchain.g:4482:2: rule__Mapa__Group__3__Impl rule__Mapa__Group__4
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
    // InternalBlockchain.g:4489:1: rule__Mapa__Group__3__Impl : ( ',' ) ;
    public final void rule__Mapa__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBlockchain.g:4493:1: ( ( ',' ) )
            // InternalBlockchain.g:4494:1: ( ',' )
            {
            // InternalBlockchain.g:4494:1: ( ',' )
            // InternalBlockchain.g:4495:2: ','
            {
             before(grammarAccess.getMapaAccess().getCommaKeyword_3()); 
            match(input,46,FOLLOW_2); 
             after(grammarAccess.getMapaAccess().getCommaKeyword_3()); 

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
    // InternalBlockchain.g:4504:1: rule__Mapa__Group__4 : rule__Mapa__Group__4__Impl rule__Mapa__Group__5 ;
    public final void rule__Mapa__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBlockchain.g:4508:1: ( rule__Mapa__Group__4__Impl rule__Mapa__Group__5 )
            // InternalBlockchain.g:4509:2: rule__Mapa__Group__4__Impl rule__Mapa__Group__5
            {
            pushFollow(FOLLOW_52);
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
    // InternalBlockchain.g:4516:1: rule__Mapa__Group__4__Impl : ( ( rule__Mapa__TipoDatoValueAssignment_4 ) ) ;
    public final void rule__Mapa__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBlockchain.g:4520:1: ( ( ( rule__Mapa__TipoDatoValueAssignment_4 ) ) )
            // InternalBlockchain.g:4521:1: ( ( rule__Mapa__TipoDatoValueAssignment_4 ) )
            {
            // InternalBlockchain.g:4521:1: ( ( rule__Mapa__TipoDatoValueAssignment_4 ) )
            // InternalBlockchain.g:4522:2: ( rule__Mapa__TipoDatoValueAssignment_4 )
            {
             before(grammarAccess.getMapaAccess().getTipoDatoValueAssignment_4()); 
            // InternalBlockchain.g:4523:2: ( rule__Mapa__TipoDatoValueAssignment_4 )
            // InternalBlockchain.g:4523:3: rule__Mapa__TipoDatoValueAssignment_4
            {
            pushFollow(FOLLOW_2);
            rule__Mapa__TipoDatoValueAssignment_4();

            state._fsp--;


            }

             after(grammarAccess.getMapaAccess().getTipoDatoValueAssignment_4()); 

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
    // InternalBlockchain.g:4531:1: rule__Mapa__Group__5 : rule__Mapa__Group__5__Impl rule__Mapa__Group__6 ;
    public final void rule__Mapa__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBlockchain.g:4535:1: ( rule__Mapa__Group__5__Impl rule__Mapa__Group__6 )
            // InternalBlockchain.g:4536:2: rule__Mapa__Group__5__Impl rule__Mapa__Group__6
            {
            pushFollow(FOLLOW_53);
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
    // InternalBlockchain.g:4543:1: rule__Mapa__Group__5__Impl : ( '>' ) ;
    public final void rule__Mapa__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBlockchain.g:4547:1: ( ( '>' ) )
            // InternalBlockchain.g:4548:1: ( '>' )
            {
            // InternalBlockchain.g:4548:1: ( '>' )
            // InternalBlockchain.g:4549:2: '>'
            {
             before(grammarAccess.getMapaAccess().getGreaterThanSignKeyword_5()); 
            match(input,18,FOLLOW_2); 
             after(grammarAccess.getMapaAccess().getGreaterThanSignKeyword_5()); 

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
    // InternalBlockchain.g:4558:1: rule__Mapa__Group__6 : rule__Mapa__Group__6__Impl rule__Mapa__Group__7 ;
    public final void rule__Mapa__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBlockchain.g:4562:1: ( rule__Mapa__Group__6__Impl rule__Mapa__Group__7 )
            // InternalBlockchain.g:4563:2: rule__Mapa__Group__6__Impl rule__Mapa__Group__7
            {
            pushFollow(FOLLOW_4);
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
    // InternalBlockchain.g:4570:1: rule__Mapa__Group__6__Impl : ( ':' ) ;
    public final void rule__Mapa__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBlockchain.g:4574:1: ( ( ':' ) )
            // InternalBlockchain.g:4575:1: ( ':' )
            {
            // InternalBlockchain.g:4575:1: ( ':' )
            // InternalBlockchain.g:4576:2: ':'
            {
             before(grammarAccess.getMapaAccess().getColonKeyword_6()); 
            match(input,47,FOLLOW_2); 
             after(grammarAccess.getMapaAccess().getColonKeyword_6()); 

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
    // InternalBlockchain.g:4585:1: rule__Mapa__Group__7 : rule__Mapa__Group__7__Impl ;
    public final void rule__Mapa__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBlockchain.g:4589:1: ( rule__Mapa__Group__7__Impl )
            // InternalBlockchain.g:4590:2: rule__Mapa__Group__7__Impl
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
    // InternalBlockchain.g:4596:1: rule__Mapa__Group__7__Impl : ( ( rule__Mapa__NameAssignment_7 ) ) ;
    public final void rule__Mapa__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBlockchain.g:4600:1: ( ( ( rule__Mapa__NameAssignment_7 ) ) )
            // InternalBlockchain.g:4601:1: ( ( rule__Mapa__NameAssignment_7 ) )
            {
            // InternalBlockchain.g:4601:1: ( ( rule__Mapa__NameAssignment_7 ) )
            // InternalBlockchain.g:4602:2: ( rule__Mapa__NameAssignment_7 )
            {
             before(grammarAccess.getMapaAccess().getNameAssignment_7()); 
            // InternalBlockchain.g:4603:2: ( rule__Mapa__NameAssignment_7 )
            // InternalBlockchain.g:4603:3: rule__Mapa__NameAssignment_7
            {
            pushFollow(FOLLOW_2);
            rule__Mapa__NameAssignment_7();

            state._fsp--;


            }

             after(grammarAccess.getMapaAccess().getNameAssignment_7()); 

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
    // InternalBlockchain.g:4612:1: rule__Aplicacion__NameAssignment_2 : ( ruleEString ) ;
    public final void rule__Aplicacion__NameAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBlockchain.g:4616:1: ( ( ruleEString ) )
            // InternalBlockchain.g:4617:2: ( ruleEString )
            {
            // InternalBlockchain.g:4617:2: ( ruleEString )
            // InternalBlockchain.g:4618:3: ruleEString
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
    // InternalBlockchain.g:4627:1: rule__Aplicacion__SmartcontractAssignment_4_0 : ( ruleSmartContract ) ;
    public final void rule__Aplicacion__SmartcontractAssignment_4_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBlockchain.g:4631:1: ( ( ruleSmartContract ) )
            // InternalBlockchain.g:4632:2: ( ruleSmartContract )
            {
            // InternalBlockchain.g:4632:2: ( ruleSmartContract )
            // InternalBlockchain.g:4633:3: ruleSmartContract
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


    // $ANTLR start "rule__Aplicacion__SmartcontractAssignment_4_1"
    // InternalBlockchain.g:4642:1: rule__Aplicacion__SmartcontractAssignment_4_1 : ( ruleSmartContract ) ;
    public final void rule__Aplicacion__SmartcontractAssignment_4_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBlockchain.g:4646:1: ( ( ruleSmartContract ) )
            // InternalBlockchain.g:4647:2: ( ruleSmartContract )
            {
            // InternalBlockchain.g:4647:2: ( ruleSmartContract )
            // InternalBlockchain.g:4648:3: ruleSmartContract
            {
             before(grammarAccess.getAplicacionAccess().getSmartcontractSmartContractParserRuleCall_4_1_0()); 
            pushFollow(FOLLOW_2);
            ruleSmartContract();

            state._fsp--;

             after(grammarAccess.getAplicacionAccess().getSmartcontractSmartContractParserRuleCall_4_1_0()); 

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
    // $ANTLR end "rule__Aplicacion__SmartcontractAssignment_4_1"


    // $ANTLR start "rule__Aplicacion__TipodatoAssignment_5_1"
    // InternalBlockchain.g:4657:1: rule__Aplicacion__TipodatoAssignment_5_1 : ( ruleTipoDato ) ;
    public final void rule__Aplicacion__TipodatoAssignment_5_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBlockchain.g:4661:1: ( ( ruleTipoDato ) )
            // InternalBlockchain.g:4662:2: ( ruleTipoDato )
            {
            // InternalBlockchain.g:4662:2: ( ruleTipoDato )
            // InternalBlockchain.g:4663:3: ruleTipoDato
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


    // $ANTLR start "rule__SmartContract__NameAssignment_1"
    // InternalBlockchain.g:4672:1: rule__SmartContract__NameAssignment_1 : ( ruleEString ) ;
    public final void rule__SmartContract__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBlockchain.g:4676:1: ( ( ruleEString ) )
            // InternalBlockchain.g:4677:2: ( ruleEString )
            {
            // InternalBlockchain.g:4677:2: ( ruleEString )
            // InternalBlockchain.g:4678:3: ruleEString
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
    // InternalBlockchain.g:4687:1: rule__SmartContract__EntidadesAssignment_3_0 : ( ruleEntidad ) ;
    public final void rule__SmartContract__EntidadesAssignment_3_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBlockchain.g:4691:1: ( ( ruleEntidad ) )
            // InternalBlockchain.g:4692:2: ( ruleEntidad )
            {
            // InternalBlockchain.g:4692:2: ( ruleEntidad )
            // InternalBlockchain.g:4693:3: ruleEntidad
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
    // InternalBlockchain.g:4702:1: rule__SmartContract__EntidadesAssignment_3_1 : ( ruleEntidad ) ;
    public final void rule__SmartContract__EntidadesAssignment_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBlockchain.g:4706:1: ( ( ruleEntidad ) )
            // InternalBlockchain.g:4707:2: ( ruleEntidad )
            {
            // InternalBlockchain.g:4707:2: ( ruleEntidad )
            // InternalBlockchain.g:4708:3: ruleEntidad
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
    // InternalBlockchain.g:4717:1: rule__SmartContract__EstadoAssignment_4_0 : ( ruleEstado ) ;
    public final void rule__SmartContract__EstadoAssignment_4_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBlockchain.g:4721:1: ( ( ruleEstado ) )
            // InternalBlockchain.g:4722:2: ( ruleEstado )
            {
            // InternalBlockchain.g:4722:2: ( ruleEstado )
            // InternalBlockchain.g:4723:3: ruleEstado
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


    // $ANTLR start "rule__SmartContract__EstadoAssignment_4_1"
    // InternalBlockchain.g:4732:1: rule__SmartContract__EstadoAssignment_4_1 : ( ruleEstado ) ;
    public final void rule__SmartContract__EstadoAssignment_4_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBlockchain.g:4736:1: ( ( ruleEstado ) )
            // InternalBlockchain.g:4737:2: ( ruleEstado )
            {
            // InternalBlockchain.g:4737:2: ( ruleEstado )
            // InternalBlockchain.g:4738:3: ruleEstado
            {
             before(grammarAccess.getSmartContractAccess().getEstadoEstadoParserRuleCall_4_1_0()); 
            pushFollow(FOLLOW_2);
            ruleEstado();

            state._fsp--;

             after(grammarAccess.getSmartContractAccess().getEstadoEstadoParserRuleCall_4_1_0()); 

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
    // $ANTLR end "rule__SmartContract__EstadoAssignment_4_1"


    // $ANTLR start "rule__SmartContract__OperacionesAssignment_5_0"
    // InternalBlockchain.g:4747:1: rule__SmartContract__OperacionesAssignment_5_0 : ( ruleOperacion ) ;
    public final void rule__SmartContract__OperacionesAssignment_5_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBlockchain.g:4751:1: ( ( ruleOperacion ) )
            // InternalBlockchain.g:4752:2: ( ruleOperacion )
            {
            // InternalBlockchain.g:4752:2: ( ruleOperacion )
            // InternalBlockchain.g:4753:3: ruleOperacion
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


    // $ANTLR start "rule__SmartContract__OperacionesAssignment_5_1"
    // InternalBlockchain.g:4762:1: rule__SmartContract__OperacionesAssignment_5_1 : ( ruleOperacion ) ;
    public final void rule__SmartContract__OperacionesAssignment_5_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBlockchain.g:4766:1: ( ( ruleOperacion ) )
            // InternalBlockchain.g:4767:2: ( ruleOperacion )
            {
            // InternalBlockchain.g:4767:2: ( ruleOperacion )
            // InternalBlockchain.g:4768:3: ruleOperacion
            {
             before(grammarAccess.getSmartContractAccess().getOperacionesOperacionParserRuleCall_5_1_0()); 
            pushFollow(FOLLOW_2);
            ruleOperacion();

            state._fsp--;

             after(grammarAccess.getSmartContractAccess().getOperacionesOperacionParserRuleCall_5_1_0()); 

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
    // $ANTLR end "rule__SmartContract__OperacionesAssignment_5_1"


    // $ANTLR start "rule__Entidad__NameAssignment_2"
    // InternalBlockchain.g:4777:1: rule__Entidad__NameAssignment_2 : ( ruleEString ) ;
    public final void rule__Entidad__NameAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBlockchain.g:4781:1: ( ( ruleEString ) )
            // InternalBlockchain.g:4782:2: ( ruleEString )
            {
            // InternalBlockchain.g:4782:2: ( ruleEString )
            // InternalBlockchain.g:4783:3: ruleEString
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
    // InternalBlockchain.g:4792:1: rule__Entidad__AtributosAssignment_4_0 : ( ruleAtributo ) ;
    public final void rule__Entidad__AtributosAssignment_4_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBlockchain.g:4796:1: ( ( ruleAtributo ) )
            // InternalBlockchain.g:4797:2: ( ruleAtributo )
            {
            // InternalBlockchain.g:4797:2: ( ruleAtributo )
            // InternalBlockchain.g:4798:3: ruleAtributo
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
    // InternalBlockchain.g:4807:1: rule__Entidad__AtributosAssignment_4_1 : ( ruleAtributo ) ;
    public final void rule__Entidad__AtributosAssignment_4_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBlockchain.g:4811:1: ( ( ruleAtributo ) )
            // InternalBlockchain.g:4812:2: ( ruleAtributo )
            {
            // InternalBlockchain.g:4812:2: ( ruleAtributo )
            // InternalBlockchain.g:4813:3: ruleAtributo
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


    // $ANTLR start "rule__Operacion__EsUserDefinedAssignment_1_1"
    // InternalBlockchain.g:4822:1: rule__Operacion__EsUserDefinedAssignment_1_1 : ( ruleEBoolean ) ;
    public final void rule__Operacion__EsUserDefinedAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBlockchain.g:4826:1: ( ( ruleEBoolean ) )
            // InternalBlockchain.g:4827:2: ( ruleEBoolean )
            {
            // InternalBlockchain.g:4827:2: ( ruleEBoolean )
            // InternalBlockchain.g:4828:3: ruleEBoolean
            {
             before(grammarAccess.getOperacionAccess().getEsUserDefinedEBooleanParserRuleCall_1_1_0()); 
            pushFollow(FOLLOW_2);
            ruleEBoolean();

            state._fsp--;

             after(grammarAccess.getOperacionAccess().getEsUserDefinedEBooleanParserRuleCall_1_1_0()); 

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
    // $ANTLR end "rule__Operacion__EsUserDefinedAssignment_1_1"


    // $ANTLR start "rule__Operacion__NameAssignment_2"
    // InternalBlockchain.g:4837:1: rule__Operacion__NameAssignment_2 : ( ruleEString ) ;
    public final void rule__Operacion__NameAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBlockchain.g:4841:1: ( ( ruleEString ) )
            // InternalBlockchain.g:4842:2: ( ruleEString )
            {
            // InternalBlockchain.g:4842:2: ( ruleEString )
            // InternalBlockchain.g:4843:3: ruleEString
            {
             before(grammarAccess.getOperacionAccess().getNameEStringParserRuleCall_2_0()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getOperacionAccess().getNameEStringParserRuleCall_2_0()); 

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
    // $ANTLR end "rule__Operacion__NameAssignment_2"


    // $ANTLR start "rule__Operacion__ParametrosAssignment_4_0"
    // InternalBlockchain.g:4852:1: rule__Operacion__ParametrosAssignment_4_0 : ( ruleParametro ) ;
    public final void rule__Operacion__ParametrosAssignment_4_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBlockchain.g:4856:1: ( ( ruleParametro ) )
            // InternalBlockchain.g:4857:2: ( ruleParametro )
            {
            // InternalBlockchain.g:4857:2: ( ruleParametro )
            // InternalBlockchain.g:4858:3: ruleParametro
            {
             before(grammarAccess.getOperacionAccess().getParametrosParametroParserRuleCall_4_0_0()); 
            pushFollow(FOLLOW_2);
            ruleParametro();

            state._fsp--;

             after(grammarAccess.getOperacionAccess().getParametrosParametroParserRuleCall_4_0_0()); 

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
    // $ANTLR end "rule__Operacion__ParametrosAssignment_4_0"


    // $ANTLR start "rule__Operacion__ParametrosAssignment_4_1_1"
    // InternalBlockchain.g:4867:1: rule__Operacion__ParametrosAssignment_4_1_1 : ( ruleParametro ) ;
    public final void rule__Operacion__ParametrosAssignment_4_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBlockchain.g:4871:1: ( ( ruleParametro ) )
            // InternalBlockchain.g:4872:2: ( ruleParametro )
            {
            // InternalBlockchain.g:4872:2: ( ruleParametro )
            // InternalBlockchain.g:4873:3: ruleParametro
            {
             before(grammarAccess.getOperacionAccess().getParametrosParametroParserRuleCall_4_1_1_0()); 
            pushFollow(FOLLOW_2);
            ruleParametro();

            state._fsp--;

             after(grammarAccess.getOperacionAccess().getParametrosParametroParserRuleCall_4_1_1_0()); 

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
    // $ANTLR end "rule__Operacion__ParametrosAssignment_4_1_1"


    // $ANTLR start "rule__Operacion__RetornoAssignment_6_1"
    // InternalBlockchain.g:4882:1: rule__Operacion__RetornoAssignment_6_1 : ( ( ruleEString ) ) ;
    public final void rule__Operacion__RetornoAssignment_6_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBlockchain.g:4886:1: ( ( ( ruleEString ) ) )
            // InternalBlockchain.g:4887:2: ( ( ruleEString ) )
            {
            // InternalBlockchain.g:4887:2: ( ( ruleEString ) )
            // InternalBlockchain.g:4888:3: ( ruleEString )
            {
             before(grammarAccess.getOperacionAccess().getRetornoTipoDatoCrossReference_6_1_0()); 
            // InternalBlockchain.g:4889:3: ( ruleEString )
            // InternalBlockchain.g:4890:4: ruleEString
            {
             before(grammarAccess.getOperacionAccess().getRetornoTipoDatoEStringParserRuleCall_6_1_0_1()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getOperacionAccess().getRetornoTipoDatoEStringParserRuleCall_6_1_0_1()); 

            }

             after(grammarAccess.getOperacionAccess().getRetornoTipoDatoCrossReference_6_1_0()); 

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
    // $ANTLR end "rule__Operacion__RetornoAssignment_6_1"


    // $ANTLR start "rule__Operacion__LineasAssignment_10"
    // InternalBlockchain.g:4901:1: rule__Operacion__LineasAssignment_10 : ( ruleLinea ) ;
    public final void rule__Operacion__LineasAssignment_10() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBlockchain.g:4905:1: ( ( ruleLinea ) )
            // InternalBlockchain.g:4906:2: ( ruleLinea )
            {
            // InternalBlockchain.g:4906:2: ( ruleLinea )
            // InternalBlockchain.g:4907:3: ruleLinea
            {
             before(grammarAccess.getOperacionAccess().getLineasLineaParserRuleCall_10_0()); 
            pushFollow(FOLLOW_2);
            ruleLinea();

            state._fsp--;

             after(grammarAccess.getOperacionAccess().getLineasLineaParserRuleCall_10_0()); 

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
    // $ANTLR end "rule__Operacion__LineasAssignment_10"


    // $ANTLR start "rule__Estado__TipodatoAssignment_1"
    // InternalBlockchain.g:4916:1: rule__Estado__TipodatoAssignment_1 : ( ( ruleEString ) ) ;
    public final void rule__Estado__TipodatoAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBlockchain.g:4920:1: ( ( ( ruleEString ) ) )
            // InternalBlockchain.g:4921:2: ( ( ruleEString ) )
            {
            // InternalBlockchain.g:4921:2: ( ( ruleEString ) )
            // InternalBlockchain.g:4922:3: ( ruleEString )
            {
             before(grammarAccess.getEstadoAccess().getTipodatoTipoDatoCrossReference_1_0()); 
            // InternalBlockchain.g:4923:3: ( ruleEString )
            // InternalBlockchain.g:4924:4: ruleEString
            {
             before(grammarAccess.getEstadoAccess().getTipodatoTipoDatoEStringParserRuleCall_1_0_1()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getEstadoAccess().getTipodatoTipoDatoEStringParserRuleCall_1_0_1()); 

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
    // InternalBlockchain.g:4935:1: rule__Estado__NameAssignment_2 : ( ruleEString ) ;
    public final void rule__Estado__NameAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBlockchain.g:4939:1: ( ( ruleEString ) )
            // InternalBlockchain.g:4940:2: ( ruleEString )
            {
            // InternalBlockchain.g:4940:2: ( ruleEString )
            // InternalBlockchain.g:4941:3: ruleEString
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
    // InternalBlockchain.g:4950:1: rule__Atributo__TipodatoAssignment_0 : ( ( ruleEString ) ) ;
    public final void rule__Atributo__TipodatoAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBlockchain.g:4954:1: ( ( ( ruleEString ) ) )
            // InternalBlockchain.g:4955:2: ( ( ruleEString ) )
            {
            // InternalBlockchain.g:4955:2: ( ( ruleEString ) )
            // InternalBlockchain.g:4956:3: ( ruleEString )
            {
             before(grammarAccess.getAtributoAccess().getTipodatoTipoDatoCrossReference_0_0()); 
            // InternalBlockchain.g:4957:3: ( ruleEString )
            // InternalBlockchain.g:4958:4: ruleEString
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
    // InternalBlockchain.g:4969:1: rule__Atributo__NameAssignment_1 : ( ruleEString ) ;
    public final void rule__Atributo__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBlockchain.g:4973:1: ( ( ruleEString ) )
            // InternalBlockchain.g:4974:2: ( ruleEString )
            {
            // InternalBlockchain.g:4974:2: ( ruleEString )
            // InternalBlockchain.g:4975:3: ruleEString
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
    // InternalBlockchain.g:4984:1: rule__Parametro__TipodatoAssignment_0 : ( ( ruleEString ) ) ;
    public final void rule__Parametro__TipodatoAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBlockchain.g:4988:1: ( ( ( ruleEString ) ) )
            // InternalBlockchain.g:4989:2: ( ( ruleEString ) )
            {
            // InternalBlockchain.g:4989:2: ( ( ruleEString ) )
            // InternalBlockchain.g:4990:3: ( ruleEString )
            {
             before(grammarAccess.getParametroAccess().getTipodatoTipoDatoCrossReference_0_0()); 
            // InternalBlockchain.g:4991:3: ( ruleEString )
            // InternalBlockchain.g:4992:4: ruleEString
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
    // InternalBlockchain.g:5003:1: rule__Parametro__NameAssignment_1 : ( ruleEString ) ;
    public final void rule__Parametro__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBlockchain.g:5007:1: ( ( ruleEString ) )
            // InternalBlockchain.g:5008:2: ( ruleEString )
            {
            // InternalBlockchain.g:5008:2: ( ruleEString )
            // InternalBlockchain.g:5009:3: ruleEString
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


    // $ANTLR start "rule__ExpresionLogica__IzqAssignment_2"
    // InternalBlockchain.g:5018:1: rule__ExpresionLogica__IzqAssignment_2 : ( ruleExpresion ) ;
    public final void rule__ExpresionLogica__IzqAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBlockchain.g:5022:1: ( ( ruleExpresion ) )
            // InternalBlockchain.g:5023:2: ( ruleExpresion )
            {
            // InternalBlockchain.g:5023:2: ( ruleExpresion )
            // InternalBlockchain.g:5024:3: ruleExpresion
            {
             before(grammarAccess.getExpresionLogicaAccess().getIzqExpresionParserRuleCall_2_0()); 
            pushFollow(FOLLOW_2);
            ruleExpresion();

            state._fsp--;

             after(grammarAccess.getExpresionLogicaAccess().getIzqExpresionParserRuleCall_2_0()); 

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
    // $ANTLR end "rule__ExpresionLogica__IzqAssignment_2"


    // $ANTLR start "rule__ExpresionLogica__OperadorAssignment_4"
    // InternalBlockchain.g:5033:1: rule__ExpresionLogica__OperadorAssignment_4 : ( ruleOperadorLogico ) ;
    public final void rule__ExpresionLogica__OperadorAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBlockchain.g:5037:1: ( ( ruleOperadorLogico ) )
            // InternalBlockchain.g:5038:2: ( ruleOperadorLogico )
            {
            // InternalBlockchain.g:5038:2: ( ruleOperadorLogico )
            // InternalBlockchain.g:5039:3: ruleOperadorLogico
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


    // $ANTLR start "rule__ExpresionLogica__DerAssignment_6"
    // InternalBlockchain.g:5048:1: rule__ExpresionLogica__DerAssignment_6 : ( ruleExpresion ) ;
    public final void rule__ExpresionLogica__DerAssignment_6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBlockchain.g:5052:1: ( ( ruleExpresion ) )
            // InternalBlockchain.g:5053:2: ( ruleExpresion )
            {
            // InternalBlockchain.g:5053:2: ( ruleExpresion )
            // InternalBlockchain.g:5054:3: ruleExpresion
            {
             before(grammarAccess.getExpresionLogicaAccess().getDerExpresionParserRuleCall_6_0()); 
            pushFollow(FOLLOW_2);
            ruleExpresion();

            state._fsp--;

             after(grammarAccess.getExpresionLogicaAccess().getDerExpresionParserRuleCall_6_0()); 

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
    // $ANTLR end "rule__ExpresionLogica__DerAssignment_6"


    // $ANTLR start "rule__ExpresionAritmetica__IzqAssignment_3"
    // InternalBlockchain.g:5063:1: rule__ExpresionAritmetica__IzqAssignment_3 : ( ruleExpresion ) ;
    public final void rule__ExpresionAritmetica__IzqAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBlockchain.g:5067:1: ( ( ruleExpresion ) )
            // InternalBlockchain.g:5068:2: ( ruleExpresion )
            {
            // InternalBlockchain.g:5068:2: ( ruleExpresion )
            // InternalBlockchain.g:5069:3: ruleExpresion
            {
             before(grammarAccess.getExpresionAritmeticaAccess().getIzqExpresionParserRuleCall_3_0()); 
            pushFollow(FOLLOW_2);
            ruleExpresion();

            state._fsp--;

             after(grammarAccess.getExpresionAritmeticaAccess().getIzqExpresionParserRuleCall_3_0()); 

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
    // $ANTLR end "rule__ExpresionAritmetica__IzqAssignment_3"


    // $ANTLR start "rule__ExpresionAritmetica__OperadorAssignment_5"
    // InternalBlockchain.g:5078:1: rule__ExpresionAritmetica__OperadorAssignment_5 : ( ruleOperador ) ;
    public final void rule__ExpresionAritmetica__OperadorAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBlockchain.g:5082:1: ( ( ruleOperador ) )
            // InternalBlockchain.g:5083:2: ( ruleOperador )
            {
            // InternalBlockchain.g:5083:2: ( ruleOperador )
            // InternalBlockchain.g:5084:3: ruleOperador
            {
             before(grammarAccess.getExpresionAritmeticaAccess().getOperadorOperadorEnumRuleCall_5_0()); 
            pushFollow(FOLLOW_2);
            ruleOperador();

            state._fsp--;

             after(grammarAccess.getExpresionAritmeticaAccess().getOperadorOperadorEnumRuleCall_5_0()); 

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
    // $ANTLR end "rule__ExpresionAritmetica__OperadorAssignment_5"


    // $ANTLR start "rule__ExpresionAritmetica__DerAssignment_7"
    // InternalBlockchain.g:5093:1: rule__ExpresionAritmetica__DerAssignment_7 : ( ruleExpresion ) ;
    public final void rule__ExpresionAritmetica__DerAssignment_7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBlockchain.g:5097:1: ( ( ruleExpresion ) )
            // InternalBlockchain.g:5098:2: ( ruleExpresion )
            {
            // InternalBlockchain.g:5098:2: ( ruleExpresion )
            // InternalBlockchain.g:5099:3: ruleExpresion
            {
             before(grammarAccess.getExpresionAritmeticaAccess().getDerExpresionParserRuleCall_7_0()); 
            pushFollow(FOLLOW_2);
            ruleExpresion();

            state._fsp--;

             after(grammarAccess.getExpresionAritmeticaAccess().getDerExpresionParserRuleCall_7_0()); 

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
    // $ANTLR end "rule__ExpresionAritmetica__DerAssignment_7"


    // $ANTLR start "rule__Variable__TipodatoAssignment_1"
    // InternalBlockchain.g:5108:1: rule__Variable__TipodatoAssignment_1 : ( ( ruleEString ) ) ;
    public final void rule__Variable__TipodatoAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBlockchain.g:5112:1: ( ( ( ruleEString ) ) )
            // InternalBlockchain.g:5113:2: ( ( ruleEString ) )
            {
            // InternalBlockchain.g:5113:2: ( ( ruleEString ) )
            // InternalBlockchain.g:5114:3: ( ruleEString )
            {
             before(grammarAccess.getVariableAccess().getTipodatoTipoDatoCrossReference_1_0()); 
            // InternalBlockchain.g:5115:3: ( ruleEString )
            // InternalBlockchain.g:5116:4: ruleEString
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


    // $ANTLR start "rule__Variable__NameAssignment_2"
    // InternalBlockchain.g:5127:1: rule__Variable__NameAssignment_2 : ( ruleEString ) ;
    public final void rule__Variable__NameAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBlockchain.g:5131:1: ( ( ruleEString ) )
            // InternalBlockchain.g:5132:2: ( ruleEString )
            {
            // InternalBlockchain.g:5132:2: ( ruleEString )
            // InternalBlockchain.g:5133:3: ruleEString
            {
             before(grammarAccess.getVariableAccess().getNameEStringParserRuleCall_2_0()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getVariableAccess().getNameEStringParserRuleCall_2_0()); 

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
    // $ANTLR end "rule__Variable__NameAssignment_2"


    // $ANTLR start "rule__Condicional__ExpresionlogicaAssignment_1"
    // InternalBlockchain.g:5142:1: rule__Condicional__ExpresionlogicaAssignment_1 : ( ruleExpresionLogica ) ;
    public final void rule__Condicional__ExpresionlogicaAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBlockchain.g:5146:1: ( ( ruleExpresionLogica ) )
            // InternalBlockchain.g:5147:2: ( ruleExpresionLogica )
            {
            // InternalBlockchain.g:5147:2: ( ruleExpresionLogica )
            // InternalBlockchain.g:5148:3: ruleExpresionLogica
            {
             before(grammarAccess.getCondicionalAccess().getExpresionlogicaExpresionLogicaParserRuleCall_1_0()); 
            pushFollow(FOLLOW_2);
            ruleExpresionLogica();

            state._fsp--;

             after(grammarAccess.getCondicionalAccess().getExpresionlogicaExpresionLogicaParserRuleCall_1_0()); 

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
    // $ANTLR end "rule__Condicional__ExpresionlogicaAssignment_1"


    // $ANTLR start "rule__Condicional__LineasAssignment_3"
    // InternalBlockchain.g:5157:1: rule__Condicional__LineasAssignment_3 : ( ruleLinea ) ;
    public final void rule__Condicional__LineasAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBlockchain.g:5161:1: ( ( ruleLinea ) )
            // InternalBlockchain.g:5162:2: ( ruleLinea )
            {
            // InternalBlockchain.g:5162:2: ( ruleLinea )
            // InternalBlockchain.g:5163:3: ruleLinea
            {
             before(grammarAccess.getCondicionalAccess().getLineasLineaParserRuleCall_3_0()); 
            pushFollow(FOLLOW_2);
            ruleLinea();

            state._fsp--;

             after(grammarAccess.getCondicionalAccess().getLineasLineaParserRuleCall_3_0()); 

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
    // $ANTLR end "rule__Condicional__LineasAssignment_3"


    // $ANTLR start "rule__Condicional__ElseAssignment_5"
    // InternalBlockchain.g:5172:1: rule__Condicional__ElseAssignment_5 : ( ruleElse ) ;
    public final void rule__Condicional__ElseAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBlockchain.g:5176:1: ( ( ruleElse ) )
            // InternalBlockchain.g:5177:2: ( ruleElse )
            {
            // InternalBlockchain.g:5177:2: ( ruleElse )
            // InternalBlockchain.g:5178:3: ruleElse
            {
             before(grammarAccess.getCondicionalAccess().getElseElseParserRuleCall_5_0()); 
            pushFollow(FOLLOW_2);
            ruleElse();

            state._fsp--;

             after(grammarAccess.getCondicionalAccess().getElseElseParserRuleCall_5_0()); 

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
    // $ANTLR end "rule__Condicional__ElseAssignment_5"


    // $ANTLR start "rule__Else__LineasAssignment_2"
    // InternalBlockchain.g:5187:1: rule__Else__LineasAssignment_2 : ( ruleLinea ) ;
    public final void rule__Else__LineasAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBlockchain.g:5191:1: ( ( ruleLinea ) )
            // InternalBlockchain.g:5192:2: ( ruleLinea )
            {
            // InternalBlockchain.g:5192:2: ( ruleLinea )
            // InternalBlockchain.g:5193:3: ruleLinea
            {
             before(grammarAccess.getElseAccess().getLineasLineaParserRuleCall_2_0()); 
            pushFollow(FOLLOW_2);
            ruleLinea();

            state._fsp--;

             after(grammarAccess.getElseAccess().getLineasLineaParserRuleCall_2_0()); 

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
    // $ANTLR end "rule__Else__LineasAssignment_2"


    // $ANTLR start "rule__ExpresionNumerica__ValueAssignment_2"
    // InternalBlockchain.g:5202:1: rule__ExpresionNumerica__ValueAssignment_2 : ( ruleEDouble ) ;
    public final void rule__ExpresionNumerica__ValueAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBlockchain.g:5206:1: ( ( ruleEDouble ) )
            // InternalBlockchain.g:5207:2: ( ruleEDouble )
            {
            // InternalBlockchain.g:5207:2: ( ruleEDouble )
            // InternalBlockchain.g:5208:3: ruleEDouble
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


    // $ANTLR start "rule__ExpresionTexto__ValueAssignment_2"
    // InternalBlockchain.g:5217:1: rule__ExpresionTexto__ValueAssignment_2 : ( ruleEString ) ;
    public final void rule__ExpresionTexto__ValueAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBlockchain.g:5221:1: ( ( ruleEString ) )
            // InternalBlockchain.g:5222:2: ( ruleEString )
            {
            // InternalBlockchain.g:5222:2: ( ruleEString )
            // InternalBlockchain.g:5223:3: ruleEString
            {
             before(grammarAccess.getExpresionTextoAccess().getValueEStringParserRuleCall_2_0()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getExpresionTextoAccess().getValueEStringParserRuleCall_2_0()); 

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
    // $ANTLR end "rule__ExpresionTexto__ValueAssignment_2"


    // $ANTLR start "rule__ExpresionBoolean__ValueAssignment_2"
    // InternalBlockchain.g:5232:1: rule__ExpresionBoolean__ValueAssignment_2 : ( ruleEBoolean ) ;
    public final void rule__ExpresionBoolean__ValueAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBlockchain.g:5236:1: ( ( ruleEBoolean ) )
            // InternalBlockchain.g:5237:2: ( ruleEBoolean )
            {
            // InternalBlockchain.g:5237:2: ( ruleEBoolean )
            // InternalBlockchain.g:5238:3: ruleEBoolean
            {
             before(grammarAccess.getExpresionBooleanAccess().getValueEBooleanParserRuleCall_2_0()); 
            pushFollow(FOLLOW_2);
            ruleEBoolean();

            state._fsp--;

             after(grammarAccess.getExpresionBooleanAccess().getValueEBooleanParserRuleCall_2_0()); 

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
    // $ANTLR end "rule__ExpresionBoolean__ValueAssignment_2"


    // $ANTLR start "rule__ExpresionReferenciada__IdAssignment_2_1"
    // InternalBlockchain.g:5247:1: rule__ExpresionReferenciada__IdAssignment_2_1 : ( ruleEInt ) ;
    public final void rule__ExpresionReferenciada__IdAssignment_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBlockchain.g:5251:1: ( ( ruleEInt ) )
            // InternalBlockchain.g:5252:2: ( ruleEInt )
            {
            // InternalBlockchain.g:5252:2: ( ruleEInt )
            // InternalBlockchain.g:5253:3: ruleEInt
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


    // $ANTLR start "rule__ExpresionReferenciada__ReferenciaAssignment_3"
    // InternalBlockchain.g:5262:1: rule__ExpresionReferenciada__ReferenciaAssignment_3 : ( ( ruleEString ) ) ;
    public final void rule__ExpresionReferenciada__ReferenciaAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBlockchain.g:5266:1: ( ( ( ruleEString ) ) )
            // InternalBlockchain.g:5267:2: ( ( ruleEString ) )
            {
            // InternalBlockchain.g:5267:2: ( ( ruleEString ) )
            // InternalBlockchain.g:5268:3: ( ruleEString )
            {
             before(grammarAccess.getExpresionReferenciadaAccess().getReferenciaNamedElementCrossReference_3_0()); 
            // InternalBlockchain.g:5269:3: ( ruleEString )
            // InternalBlockchain.g:5270:4: ruleEString
            {
             before(grammarAccess.getExpresionReferenciadaAccess().getReferenciaNamedElementEStringParserRuleCall_3_0_1()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getExpresionReferenciadaAccess().getReferenciaNamedElementEStringParserRuleCall_3_0_1()); 

            }

             after(grammarAccess.getExpresionReferenciadaAccess().getReferenciaNamedElementCrossReference_3_0()); 

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
    // $ANTLR end "rule__ExpresionReferenciada__ReferenciaAssignment_3"


    // $ANTLR start "rule__ExpresionRelacional__IzqAssignment_1"
    // InternalBlockchain.g:5281:1: rule__ExpresionRelacional__IzqAssignment_1 : ( ruleExpresion ) ;
    public final void rule__ExpresionRelacional__IzqAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBlockchain.g:5285:1: ( ( ruleExpresion ) )
            // InternalBlockchain.g:5286:2: ( ruleExpresion )
            {
            // InternalBlockchain.g:5286:2: ( ruleExpresion )
            // InternalBlockchain.g:5287:3: ruleExpresion
            {
             before(grammarAccess.getExpresionRelacionalAccess().getIzqExpresionParserRuleCall_1_0()); 
            pushFollow(FOLLOW_2);
            ruleExpresion();

            state._fsp--;

             after(grammarAccess.getExpresionRelacionalAccess().getIzqExpresionParserRuleCall_1_0()); 

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
    // $ANTLR end "rule__ExpresionRelacional__IzqAssignment_1"


    // $ANTLR start "rule__ExpresionRelacional__OperadorRelacionalAssignment_2"
    // InternalBlockchain.g:5296:1: rule__ExpresionRelacional__OperadorRelacionalAssignment_2 : ( ruleOperadorRelacion ) ;
    public final void rule__ExpresionRelacional__OperadorRelacionalAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBlockchain.g:5300:1: ( ( ruleOperadorRelacion ) )
            // InternalBlockchain.g:5301:2: ( ruleOperadorRelacion )
            {
            // InternalBlockchain.g:5301:2: ( ruleOperadorRelacion )
            // InternalBlockchain.g:5302:3: ruleOperadorRelacion
            {
             before(grammarAccess.getExpresionRelacionalAccess().getOperadorRelacionalOperadorRelacionEnumRuleCall_2_0()); 
            pushFollow(FOLLOW_2);
            ruleOperadorRelacion();

            state._fsp--;

             after(grammarAccess.getExpresionRelacionalAccess().getOperadorRelacionalOperadorRelacionEnumRuleCall_2_0()); 

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
    // $ANTLR end "rule__ExpresionRelacional__OperadorRelacionalAssignment_2"


    // $ANTLR start "rule__ExpresionRelacional__DerAssignment_3"
    // InternalBlockchain.g:5311:1: rule__ExpresionRelacional__DerAssignment_3 : ( ruleExpresion ) ;
    public final void rule__ExpresionRelacional__DerAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBlockchain.g:5315:1: ( ( ruleExpresion ) )
            // InternalBlockchain.g:5316:2: ( ruleExpresion )
            {
            // InternalBlockchain.g:5316:2: ( ruleExpresion )
            // InternalBlockchain.g:5317:3: ruleExpresion
            {
             before(grammarAccess.getExpresionRelacionalAccess().getDerExpresionParserRuleCall_3_0()); 
            pushFollow(FOLLOW_2);
            ruleExpresion();

            state._fsp--;

             after(grammarAccess.getExpresionRelacionalAccess().getDerExpresionParserRuleCall_3_0()); 

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
    // $ANTLR end "rule__ExpresionRelacional__DerAssignment_3"


    // $ANTLR start "rule__Primitivo__TipoAssignment_1"
    // InternalBlockchain.g:5326:1: rule__Primitivo__TipoAssignment_1 : ( ruleDatoPrimitivo ) ;
    public final void rule__Primitivo__TipoAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBlockchain.g:5330:1: ( ( ruleDatoPrimitivo ) )
            // InternalBlockchain.g:5331:2: ( ruleDatoPrimitivo )
            {
            // InternalBlockchain.g:5331:2: ( ruleDatoPrimitivo )
            // InternalBlockchain.g:5332:3: ruleDatoPrimitivo
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
    // InternalBlockchain.g:5341:1: rule__Primitivo__NameAssignment_2 : ( ruleEString ) ;
    public final void rule__Primitivo__NameAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBlockchain.g:5345:1: ( ( ruleEString ) )
            // InternalBlockchain.g:5346:2: ( ruleEString )
            {
            // InternalBlockchain.g:5346:2: ( ruleEString )
            // InternalBlockchain.g:5347:3: ruleEString
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


    // $ANTLR start "rule__Mapa__TipoDatoKeyAssignment_2"
    // InternalBlockchain.g:5356:1: rule__Mapa__TipoDatoKeyAssignment_2 : ( ( ruleEString ) ) ;
    public final void rule__Mapa__TipoDatoKeyAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBlockchain.g:5360:1: ( ( ( ruleEString ) ) )
            // InternalBlockchain.g:5361:2: ( ( ruleEString ) )
            {
            // InternalBlockchain.g:5361:2: ( ( ruleEString ) )
            // InternalBlockchain.g:5362:3: ( ruleEString )
            {
             before(grammarAccess.getMapaAccess().getTipoDatoKeyTipoDatoCrossReference_2_0()); 
            // InternalBlockchain.g:5363:3: ( ruleEString )
            // InternalBlockchain.g:5364:4: ruleEString
            {
             before(grammarAccess.getMapaAccess().getTipoDatoKeyTipoDatoEStringParserRuleCall_2_0_1()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getMapaAccess().getTipoDatoKeyTipoDatoEStringParserRuleCall_2_0_1()); 

            }

             after(grammarAccess.getMapaAccess().getTipoDatoKeyTipoDatoCrossReference_2_0()); 

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
    // $ANTLR end "rule__Mapa__TipoDatoKeyAssignment_2"


    // $ANTLR start "rule__Mapa__TipoDatoValueAssignment_4"
    // InternalBlockchain.g:5375:1: rule__Mapa__TipoDatoValueAssignment_4 : ( ( ruleEString ) ) ;
    public final void rule__Mapa__TipoDatoValueAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBlockchain.g:5379:1: ( ( ( ruleEString ) ) )
            // InternalBlockchain.g:5380:2: ( ( ruleEString ) )
            {
            // InternalBlockchain.g:5380:2: ( ( ruleEString ) )
            // InternalBlockchain.g:5381:3: ( ruleEString )
            {
             before(grammarAccess.getMapaAccess().getTipoDatoValueTipoDatoCrossReference_4_0()); 
            // InternalBlockchain.g:5382:3: ( ruleEString )
            // InternalBlockchain.g:5383:4: ruleEString
            {
             before(grammarAccess.getMapaAccess().getTipoDatoValueTipoDatoEStringParserRuleCall_4_0_1()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getMapaAccess().getTipoDatoValueTipoDatoEStringParserRuleCall_4_0_1()); 

            }

             after(grammarAccess.getMapaAccess().getTipoDatoValueTipoDatoCrossReference_4_0()); 

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
    // $ANTLR end "rule__Mapa__TipoDatoValueAssignment_4"


    // $ANTLR start "rule__Mapa__NameAssignment_7"
    // InternalBlockchain.g:5394:1: rule__Mapa__NameAssignment_7 : ( ruleEString ) ;
    public final void rule__Mapa__NameAssignment_7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBlockchain.g:5398:1: ( ( ruleEString ) )
            // InternalBlockchain.g:5399:2: ( ruleEString )
            {
            // InternalBlockchain.g:5399:2: ( ruleEString )
            // InternalBlockchain.g:5400:3: ruleEString
            {
             before(grammarAccess.getMapaAccess().getNameEStringParserRuleCall_7_0()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getMapaAccess().getNameEStringParserRuleCall_7_0()); 

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
    // $ANTLR end "rule__Mapa__NameAssignment_7"

    // Delegated rules


 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000800000000L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000000030L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000001000000000L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x000000E000000000L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000004000000002L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000008000000000L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000008000000002L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x1000010780000030L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0001032000000000L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000010000000000L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000010000000002L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0001000000000000L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0001000000000002L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000020000000000L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000020000000002L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x0000002000000030L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x0000000000000032L});
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x0000200000000030L});
    public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x0000040000000000L});
    public static final BitSet FOLLOW_22 = new BitSet(new long[]{0x0000080000000030L});
    public static final BitSet FOLLOW_23 = new BitSet(new long[]{0x0000801000000000L});
    public static final BitSet FOLLOW_24 = new BitSet(new long[]{0x0BDE1C2000000000L});
    public static final BitSet FOLLOW_25 = new BitSet(new long[]{0x0000040000000002L});
    public static final BitSet FOLLOW_26 = new BitSet(new long[]{0x0BDE000000000002L});
    public static final BitSet FOLLOW_27 = new BitSet(new long[]{0x0000080000000002L});
    public static final BitSet FOLLOW_28 = new BitSet(new long[]{0x0000000000003000L});
    public static final BitSet FOLLOW_29 = new BitSet(new long[]{0x0000400000000000L});
    public static final BitSet FOLLOW_30 = new BitSet(new long[]{0x0000400000000002L});
    public static final BitSet FOLLOW_31 = new BitSet(new long[]{0x0BC6040000000000L});
    public static final BitSet FOLLOW_32 = new BitSet(new long[]{0x0BC60C0000FF0000L});
    public static final BitSet FOLLOW_33 = new BitSet(new long[]{0x0000080000000000L});
    public static final BitSet FOLLOW_34 = new BitSet(new long[]{0x0004000000000000L});
    public static final BitSet FOLLOW_35 = new BitSet(new long[]{0x0BC60C007F000000L});
    public static final BitSet FOLLOW_36 = new BitSet(new long[]{0x0002001000000000L});
    public static final BitSet FOLLOW_37 = new BitSet(new long[]{0x0BDE002000000000L});
    public static final BitSet FOLLOW_38 = new BitSet(new long[]{0x0020000000000000L});
    public static final BitSet FOLLOW_39 = new BitSet(new long[]{0x0040000000000000L});
    public static final BitSet FOLLOW_40 = new BitSet(new long[]{0x0000000002000840L});
    public static final BitSet FOLLOW_41 = new BitSet(new long[]{0x0080000000000000L});
    public static final BitSet FOLLOW_42 = new BitSet(new long[]{0x0100000000000000L});
    public static final BitSet FOLLOW_43 = new BitSet(new long[]{0x0400000000000030L});
    public static final BitSet FOLLOW_44 = new BitSet(new long[]{0x0000002000000000L});
    public static final BitSet FOLLOW_45 = new BitSet(new long[]{0x0000000002000040L});
    public static final BitSet FOLLOW_46 = new BitSet(new long[]{0x0BC6000000000000L});
    public static final BitSet FOLLOW_47 = new BitSet(new long[]{0x0BC6000000000800L});
    public static final BitSet FOLLOW_48 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_49 = new BitSet(new long[]{0x000000000000C000L});
    public static final BitSet FOLLOW_50 = new BitSet(new long[]{0x0000000780000030L});
    public static final BitSet FOLLOW_51 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_52 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_53 = new BitSet(new long[]{0x0000800000000000L});

}