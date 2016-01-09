import java.io.PrintStream;
import sign.signlink;


public class Class20
{

   public static void method257(int i, Class44 class44)
    {
		for(int j = 0; j < FrameStart.length; j++)
		FrameStart[j] = 0;
Class30_Sub2_Sub2 class30_sub2_sub2 = new Class30_Sub2_Sub2(class44.method571("seq.dat", null), 891);
        anInt350 = class30_sub2_sub2.method410()+3299;
        if(aClass20Array351 == null)
            aClass20Array351 = new Class20[anInt350];
        for(int j = 0; j < anInt350; j++)
        {
            if(aClass20Array351[j] == null)
                aClass20Array351[j] = new Class20();
if(j < 3997)
            aClass20Array351[j].method259(true, class30_sub2_sub2);
else
            setAnimBase(j);
//added	By Pb600 	

if(j == 301) { //2h Stand
int file = 1834;
if(FrameStart[file] < 1)
Class36.methodCustomAnimations(false, file);
int[] frames = {0,1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16};
aClass20Array351[j].anInt352 = frames.length-1;
aClass20Array351[j].anIntArray353 = new int[frames.length-1];
aClass20Array351[j].anIntArray354 = new int[frames.length-1];
aClass20Array351[j].anIntArray355 = new int[frames.length-1];
for(int i2 = 0; i2 < frames.length-1; i2++) {
aClass20Array351[j].anIntArray353[i2] = frames[i2]+FrameStart[file];
aClass20Array351[j].anIntArray354[i2] = -1;
aClass20Array351[j].anIntArray355[i2] = 0;
}
}

if(j == 302) { //BGS special emote
int file = 1834;
if(FrameStart[file] < 1)
Class36.methodCustomAnimations(false, file);
int[] frames = {167,168,169,170,171,172,173,174,175,176,177,178,179,180,181,182,183,184,185,186,187,188};
aClass20Array351[j].anInt352 = frames.length-1;
aClass20Array351[j].anIntArray353 = new int[frames.length-1];
aClass20Array351[j].anIntArray354 = new int[frames.length-1];
aClass20Array351[j].anIntArray355 = new int[frames.length-1];
for(int i2 = 0; i2 < frames.length-1; i2++) {
aClass20Array351[j].anIntArray353[i2] = frames[i2]+FrameStart[file];
aClass20Array351[j].anIntArray354[i2] = -1;
aClass20Array351[j].anIntArray355[i2] = 0;
}
}

if(j == 303) { //ZGS special emote
int file = 1834;
if(FrameStart[file] < 1)
Class36.methodCustomAnimations(false, file);
int[] frames = {189,190,191,192,193,194,195,196,197,198,199,200,201,202,203,204,205,206,207,208,209,210,211,212,213,214};
aClass20Array351[j].anInt352 = frames.length-1;
aClass20Array351[j].anIntArray353 = new int[frames.length-1];
aClass20Array351[j].anIntArray354 = new int[frames.length-1];
aClass20Array351[j].anIntArray355 = new int[frames.length-1];
for(int i2 = 0; i2 < frames.length-1; i2++) {
aClass20Array351[j].anIntArray353[i2] = frames[i2]+FrameStart[file];
aClass20Array351[j].anIntArray354[i2] = -1;
aClass20Array351[j].anIntArray355[i2] = 0;
}
}

if(j == 304) { //SGS special emote
int file = 1834;
if(FrameStart[file] < 1)
Class36.methodCustomAnimations(false, file);
int[] frames = {215,216,217,218,219,220,221,222,223,224,225,226,227,228,229,230,231,232,233,234,235,236,237,238,239,240,241,242,243,244,245,246,247,248};
aClass20Array351[j].anInt352 = frames.length-1;
aClass20Array351[j].anIntArray353 = new int[frames.length-1];
aClass20Array351[j].anIntArray354 = new int[frames.length-1];
aClass20Array351[j].anIntArray355 = new int[frames.length-1];
for(int i2 = 0; i2 < frames.length-1; i2++) {
aClass20Array351[j].anIntArray353[i2] = frames[i2]+FrameStart[file];
aClass20Array351[j].anIntArray354[i2] = -1;
aClass20Array351[j].anIntArray355[i2] = 0;
}
}

if(j == 305) { //AGS special emote
int file = 1834;
if(FrameStart[file] < 1)
Class36.methodCustomAnimations(false, file);
int[] frames = {136,137,138,139,140,141,142,143,144,145,146,147,148,149,150,151,152,153,154,155,156,157,158,159,160,161,162,163,164,165,166};
aClass20Array351[j].anInt352 = frames.length-1;
aClass20Array351[j].anIntArray353 = new int[frames.length-1];
aClass20Array351[j].anIntArray354 = new int[frames.length-1];
aClass20Array351[j].anIntArray355 = new int[frames.length-1];
for(int i2 = 0; i2 < frames.length-1; i2++) {
aClass20Array351[j].anIntArray353[i2] = frames[i2]+FrameStart[file];
aClass20Array351[j].anIntArray354[i2] = -1;
aClass20Array351[j].anIntArray355[i2] = 0;
}
}

	if(j == 306) { //2h run
			int file = 1834;
		if(FrameStart[file] < 1)
			Class36.methodCustomAnimations(false, file);
				int[] frames = {65,66,67,68,69,70,71,72,73,74,75,76,77,78,79,80,81,82,83,84,85,86,87,
								88,89,90,91,92,93,94,95,96};
aClass20Array351[j].anInt352 = frames.length-1;
aClass20Array351[j].anIntArray353 = new int[frames.length-1];
aClass20Array351[j].anIntArray354 = new int[frames.length-1];
aClass20Array351[j].anIntArray355 = new int[frames.length-1];
		for(int i2 = 0; i2 < frames.length-1; i2++) {
aClass20Array351[j].anIntArray353[i2] = frames[i2]+FrameStart[file];
aClass20Array351[j].anIntArray354[i2] = -1;
aClass20Array351[j].anIntArray355[i2] = 0;
		}
	}

if(j == 307) { //2h walk
int file = 1834;
if(FrameStart[file] < 1)
Class36.methodCustomAnimations(false, file);
int[] frames = {49,50,51,52,53,54,55,56,57,58,59,60,61,62,63,64};
aClass20Array351[j].anInt352 = frames.length-1;
aClass20Array351[j].anIntArray353 = new int[frames.length-1];
aClass20Array351[j].anIntArray354 = new int[frames.length-1];
aClass20Array351[j].anIntArray355 = new int[frames.length-1];
for(int i2 = 0; i2 < frames.length-1; i2++) {
aClass20Array351[j].anIntArray353[i2] = frames[i2]+FrameStart[file];
aClass20Array351[j].anIntArray354[i2] = -1;
aClass20Array351[j].anIntArray355[i2] = 0;
}
}
if(j == 308) { //2h attack
int file = 1834;
if(FrameStart[file] < 1)
Class36.methodCustomAnimations(false, file);
int[] frames = {97,98,99,100,101,102,103,104,105,106,107,108,109,110,111,112,113,114,115};
aClass20Array351[j].anInt352 = frames.length-1;
aClass20Array351[j].anIntArray353 = new int[frames.length-1];
aClass20Array351[j].anIntArray354 = new int[frames.length-1];
aClass20Array351[j].anIntArray355 = new int[frames.length-1];
for(int i2 = 0; i2 < frames.length-1; i2++) {
aClass20Array351[j].anIntArray353[i2] = frames[i2]+FrameStart[file];
aClass20Array351[j].anIntArray354[i2] = -1;
aClass20Array351[j].anIntArray355[i2] = 0;
}
}

if(j == 309) { //2h block
int file = 1834;
if(FrameStart[file] < 1)
Class36.methodCustomAnimations(false, file);
int[] frames = {116,117,118,119,120,121,122,123,124,125,126,127,128,129,130,131,132,133,134,135};
aClass20Array351[j].anInt352 = frames.length-1;
aClass20Array351[j].anIntArray353 = new int[frames.length-1];
aClass20Array351[j].anIntArray354 = new int[frames.length-1];
aClass20Array351[j].anIntArray355 = new int[frames.length-1];
for(int i2 = 0; i2 < frames.length-1; i2++) {
aClass20Array351[j].anIntArray353[i2] = frames[i2]+FrameStart[file];
aClass20Array351[j].anIntArray354[i2] = -1;
aClass20Array351[j].anIntArray355[i2] = 0;
}
}

if(j == 3994){
int file = 1686;
Class20 a = aClass20Array351[j];
if(FrameStart[file] < 1)
Class36.methodCustomAnimations(false, file);
int[] framez  = {75,75,62,62,93,93,93,82,82,57,57,71,71,66,66,66,61,92,73,73,65,65,89,89,70,70,81,81,67,67,67,84,59,63,63,99,99,78,69,69,96,96,74,74,74,79,90,90,94,94,58,0};
a.anInt352 = framez.length-1;
a.anIntArray353 = new int[framez.length-1];
a.anIntArray354 = new int[framez.length-1];
a.anIntArray355 = new int[framez.length-1];
a.anInt363 = 0;
a.anInt364 = 0;
for(int i2 = 0; i2 < framez.length-1; i2++){
a.anIntArray353[i2] = framez[i2]+FrameStart[file];
a.anIntArray354[i2] = -1;
a.anIntArray355[i2] = 2; //Decrease this if you want to speed it up
}
}
//Boss
//Bandos att
if(j == 6000){
int file = 1686;
if(FrameStart[file] < 1)
Class36.methodCustomAnimations(false, file);
int[] frames  =    {75,75 ,62,62,93,93,93,82,82,57,57,71,71,66,66,66,61,92,73,73, 65,65,89,89,70,70,81,81,67,67,67,84,59,63,63,99,99,78,69,69,96,96,74,74,74 ,79,90,90,94,94,58,0};
aClass20Array351[j].anInt352 = frames.length-1;
aClass20Array351[j].anIntArray353 = new int[frames.length-1];
aClass20Array351[j].anIntArray354 = new int[frames.length-1];
aClass20Array351[j].anIntArray355 = new int[frames.length-1];
aClass20Array351[j].anInt363 = 0;
aClass20Array351[j].anInt364 = 0;
for(int i2 = 0; i2 < frames.length-1; i2++){
aClass20Array351[j].anIntArray353[i2] = frames[i2] + FrameStart[file];
aClass20Array351[j].anIntArray354[i2] = -1;
aClass20Array351[j].anIntArray355[i2] = 2; //Decrease this if you want to speed it up
}
}
if(j == 1661){
int file = 999;
if(FrameStart[file] < 1)
Class36.methodCustomAnimations(false, file);
int[] frames = {231,232,233,234,235,236,237,238,0};
int[] delays = {5,4,4,4,5,4,4,4,0};
aClass20Array351[j].anInt352 = frames.length-1;
aClass20Array351[j].anIntArray353 = new int[frames.length-1];
aClass20Array351[j].anIntArray354 = new int[frames.length-1];
aClass20Array351[j].anIntArray355 = new int[frames.length-1];
for(int i2 = 0; i2 < frames.length-1; i2++){
aClass20Array351[j].anIntArray353[i2] = frames[i2]+FrameStart[file];
aClass20Array351[j].anIntArray354[i2] = -1;
aClass20Array351[j].anIntArray355[i2] = delays[i2];
}
}
if(j == 1660){
int file = 999;
if(FrameStart[file] < 1)
Class36.methodCustomAnimations(false, file);
int[] frames = {239,240,241,242,243,244,245,246,0};
int[] delays = {6,6,6,6,6,6,6,6,0};
aClass20Array351[j].anInt352 = frames.length-1;
aClass20Array351[j].anIntArray353 = new int[frames.length-1];
aClass20Array351[j].anIntArray354 = new int[frames.length-1];
aClass20Array351[j].anIntArray355 = new int[frames.length-1];
for(int i2 = 0; i2 < frames.length-1; i2++){
aClass20Array351[j].anIntArray353[i2] = frames[i2]+FrameStart[file];
aClass20Array351[j].anIntArray354[i2] = -1;
aClass20Array351[j].anIntArray355[i2] = delays[i2];
}
}
if(j == 1659){
int file = 999;
if(FrameStart[file] < 1)
Class36.methodCustomAnimations(false, file);
int[] frames = {189,223,224,225,226,227,228,229,230,222,0};
int[] delays = {6,4,5,7,7,6,6,4,4,4,0};
aClass20Array351[j].anInt352 = frames.length-1;
aClass20Array351[j].anIntArray353 = new int[frames.length-1];
aClass20Array351[j].anIntArray354 = new int[frames.length-1];
aClass20Array351[j].anIntArray355 = new int[frames.length-1];
for(int i2 = 0; i2 < frames.length-1; i2++){
aClass20Array351[j].anIntArray353[i2] = frames[i2]+FrameStart[file];
aClass20Array351[j].anIntArray354[i2] = -1;
aClass20Array351[j].anIntArray355[i2] = delays[i2];
}
}
 
if(j == 1658){
int file = 999;
if(FrameStart[file] < 1)
Class36.methodCustomAnimations(false, file);
int[] frames = {190,214,215,216,217,218,219,220,221,208,209,210,211,212,213,0};
int[] delays = {4,3,2,1,1,4,2,2,8,1,2,2,3,2,2,0};
aClass20Array351[j].anInt352 = frames.length-1;
aClass20Array351[j].anIntArray353 = new int[frames.length-1];
aClass20Array351[j].anIntArray354 = new int[frames.length-1];
aClass20Array351[j].anIntArray355 = new int[frames.length-1];
for(int i2 = 0; i2 < frames.length-1; i2++){
aClass20Array351[j].anIntArray353[i2] = frames[i2]+FrameStart[file];
aClass20Array351[j].anIntArray354[i2] = -1;
aClass20Array351[j].anIntArray355[i2] = delays[i2];
}
}

if(j == 7060){
int file = 1124;
if(FrameStart[file] < 1)
Class36.methodCustomAnimations(false, file);
int[] frames = {330,210,311,248,169,301,145,146,232,233,184,252,220,230,0};
int[] delays = {3,3,3,3,3,3,3,3,3,3,3,3,3,3,0};
aClass20Array351[j].anInt352 = frames.length-1;
aClass20Array351[j].anIntArray353 = new int[frames.length-1];
aClass20Array351[j].anIntArray354 = new int[frames.length-1];
aClass20Array351[j].anIntArray355 = new int[frames.length-1];
for(int i2 = 0; i2 < frames.length-1; i2++){
aClass20Array351[j].anIntArray353[i2] = frames[i2]+FrameStart[file];
aClass20Array351[j].anIntArray354[i2] = -1;
aClass20Array351[j].anIntArray355[i2] = delays[i2];
}
}
//Block
if(j == 7061){
int file = 1124;
if(FrameStart[file] < 1)
Class36.methodCustomAnimations(false, file);
int[] frames = {275,327,260,133,321,138,238,164,293,183,200,0};
int[] delays = {4,4,4,4,4,4,4,4,4,4,4,0};
aClass20Array351[j].anInt352 = frames.length-1;
aClass20Array351[j].anIntArray353 = new int[frames.length-1];
aClass20Array351[j].anIntArray354 = new int[frames.length-1];
aClass20Array351[j].anIntArray355 = new int[frames.length-1];
for(int i2 = 0; i2 < frames.length-1; i2++){
aClass20Array351[j].anIntArray353[i2] = frames[i2]+FrameStart[file];
aClass20Array351[j].anIntArray354[i2] = -1;
aClass20Array351[j].anIntArray355[i2] = delays[i2];
}
}
//Die
if(j == 7062){
int file = 1124;
if(FrameStart[file] < 1)
Class36.methodCustomAnimations(false, file);
int[] frames = {266,201,175,297,144,249,340,224,207,215,151,213,314,262,298,345,274,159,279,165,309,257,235,203,277,282,285,134,167,244,296,343,312,305,250,255,290,149,307,157,0};
int[] delays = {3,3,3,3,3,3,3,3,3,3,3,3,3,3,3,3,3,3,3,3,3,3,3,3,3,3,3,3,3,3,3,3,3,3,3,3,3,3,3,200,0};
aClass20Array351[j].anInt352 = frames.length-1;
aClass20Array351[j].anIntArray353 = new int[frames.length-1];
aClass20Array351[j].anIntArray354 = new int[frames.length-1];
aClass20Array351[j].anIntArray355 = new int[frames.length-1];
for(int i2 = 0; i2 < frames.length-1; i2++){
aClass20Array351[j].anIntArray353[i2] = frames[i2]+FrameStart[file];
aClass20Array351[j].anIntArray354[i2] = -1;
aClass20Array351[j].anIntArray355[i2] = delays[i2];
}
}
//Range att
if(j == 7063){
int file = 1124;
if(FrameStart[file] < 1)
Class36.methodCustomAnimations(false, file);
int[] frames = {334,173,141,236,317,156,198,332,342,320,263,242,271,143,240,223,0};
int[] delays = {3,3,3,3,3,3,3,3,3,3,3,3,3,3,3,3,0};
aClass20Array351[j].anInt352 = frames.length-1;
aClass20Array351[j].anIntArray353 = new int[frames.length-1];
aClass20Array351[j].anIntArray354 = new int[frames.length-1];
aClass20Array351[j].anIntArray355 = new int[frames.length-1];
for(int i2 = 0; i2 < frames.length-1; i2++){
aClass20Array351[j].anIntArray353[i2] = frames[i2]+FrameStart[file];
aClass20Array351[j].anIntArray354[i2] = -1;
aClass20Array351[j].anIntArray355[i2] = delays[i2];
}
}
//Die2
if(j == 7064){
int file = 1124;
if(FrameStart[file] < 1)
Class36.methodCustomAnimations(false, file);
int[] frames = {172,253,206,280,179,303,276,204,268,150,140,147,289,158,326,177,176,272,166,346,185,199,324,306,153,171,325,196,335,261,319,315,188,269,245,192,137,294,329,193,302,347,148,162,0};
int[] delays = {3,3,3,3,3,3,3,3,3,3,3,3,3,3,3,3,3,3,3,3,3,3,3,3,3,3,3,3,3,3,3,3,3,3,3,3,3,3,3,3,3,3,3,300,0};
aClass20Array351[j].anInt352 = frames.length-1;
aClass20Array351[j].anIntArray353 = new int[frames.length-1];
aClass20Array351[j].anIntArray354 = new int[frames.length-1];
aClass20Array351[j].anIntArray355 = new int[frames.length-1];
for(int i2 = 0; i2 < frames.length-1; i2++){
aClass20Array351[j].anIntArray353[i2] = frames[i2]+FrameStart[file];
aClass20Array351[j].anIntArray354[i2] = -1;
aClass20Array351[j].anIntArray355[i2] = delays[i2];
}
}
//Stand
if(j == 7059){
int file = 1124;
if(FrameStart[file] < 1)
Class36.methodCustomAnimations(false, file);
int[] frames = {278,136,152,273,202,254,180,228,190,331,336,168,0};
int[] delays = {4,4,4,4,4,4,4,4,4,4,4,4,0};
aClass20Array351[j].anInt352 = frames.length-1;
aClass20Array351[j].anIntArray353 = new int[frames.length-1];
aClass20Array351[j].anIntArray354 = new int[frames.length-1];
aClass20Array351[j].anIntArray355 = new int[frames.length-1];
for(int i2 = 0; i2 < frames.length-1; i2++){
aClass20Array351[j].anIntArray353[i2] = frames[i2]+FrameStart[file];
aClass20Array351[j].anIntArray354[i2] = -1;
aClass20Array351[j].anIntArray355[i2] = delays[i2];
}
}
//Walk
if(j == 7058){
int file = 1124;
if(FrameStart[file] < 1)
Class36.methodCustomAnimations(false, file);
int[] frames = {212,211,318,227,338,256,174,286,208,194,225,288,292,339,197,154,0};
int[] delays = {4,4,4,4,4,4,4,4,4,4,4,4,4,4,4,4,0};
aClass20Array351[j].anInt352 = frames.length-1;
aClass20Array351[j].anIntArray353 = new int[frames.length-1];
aClass20Array351[j].anIntArray354 = new int[frames.length-1];
aClass20Array351[j].anIntArray355 = new int[frames.length-1];
for(int i2 = 0; i2 < frames.length-1; i2++){
aClass20Array351[j].anIntArray353[i2] = frames[i2]+FrameStart[file];
aClass20Array351[j].anIntArray354[i2] = -1;
aClass20Array351[j].anIntArray355[i2] = delays[i2];
}
}
//Attack 2
if(j == 7052){
int file = 1124;
if(FrameStart[file] < 1)
Class36.methodCustomAnimations(false, file);
int[] frames = {341,299,337,132,283,265,139,229,322,170,241,308,316,0};
int[] delays = {3,3,3,3,3,3,3,3,3,3,3,3,3,0};
aClass20Array351[j].anInt352 = frames.length-1;
aClass20Array351[j].anIntArray353 = new int[frames.length-1];
aClass20Array351[j].anIntArray354 = new int[frames.length-1];
aClass20Array351[j].anIntArray355 = new int[frames.length-1];
for(int i2 = 0; i2 < frames.length-1; i2++){
aClass20Array351[j].anIntArray353[i2] = frames[i2]+FrameStart[file];
aClass20Array351[j].anIntArray354[i2] = -1;
aClass20Array351[j].anIntArray355[i2] = delays[i2];
}
}
if(j == 7051){
int file = 1124;
if(FrameStart[file] < 1)
Class36.methodCustomAnimations(false, file);
int[] frames = {258,323,186,216,189,243,313,155,234,182,218,304,187,178,161,300,284,259,217,195,328,214,310,246,231,0};
int[] delays = {4,4,4,4,4,4,4,4,4,4,4,4,4,4,4,4,4,4,4,4,4,4,4,4,4,0};
aClass20Array351[j].anInt352 = frames.length-1;
aClass20Array351[j].anIntArray353 = new int[frames.length-1];
aClass20Array351[j].anIntArray354 = new int[frames.length-1];
aClass20Array351[j].anIntArray355 = new int[frames.length-1];
for(int i2 = 0; i2 < frames.length-1; i2++){
aClass20Array351[j].anIntArray353[i2] = frames[i2]+FrameStart[file];
aClass20Array351[j].anIntArray354[i2] = -1;
aClass20Array351[j].anIntArray355[i2] = delays[i2];
}
}

if(j == 4322){
int file = 1124;
if(FrameStart[file] < 1)
Class36.methodCustomAnimations(false, file);
int[] frames = {70,81,91,92,93,94,95,96,97,71,72,73,74,75,76,77,78,79,80,82,83,84,85,86,87,88,89,90,0};
int[] delays = {2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,0};
aClass20Array351[j].anInt352 = frames.length-1;
aClass20Array351[j].anIntArray353 = new int[frames.length-1];
aClass20Array351[j].anIntArray354 = new int[frames.length-1];
aClass20Array351[j].anIntArray355 = new int[frames.length-1];
for(int i2 = 0; i2 < frames.length-1; i2++){
aClass20Array351[j].anIntArray353[i2] = frames[i2]+FrameStart[file];
aClass20Array351[j].anIntArray354[i2] = -1;
aClass20Array351[j].anIntArray355[i2] = delays[i2];
}
}
if(j == 4321){
int file = 1124;
if(FrameStart[file] < 1)
Class36.methodCustomAnimations(false, file);
int[] frames = {0,31,42,53,64,66,67,68,69,21,22,23,24,25,26,27,28,29,30,32,33,34,35,36,37,38,39,40,41,43,44,45,46,47,48,49,50,51,52,54,55,56,57,58,59,60,61,62,63,65,0};
int[] delays = {3,3,3,3,3,3,3,3,3,3,3,3,3,3,5,5,5,5,5,5,5,5,5,5,5,5,5,5,5,5,5,5,5,5,5,5,5,5,5,5,5,5,5,5,5,5,5,5,5,100,0};
aClass20Array351[j].anInt352 = frames.length-1;
aClass20Array351[j].anIntArray353 = new int[frames.length-1];
aClass20Array351[j].anIntArray354 = new int[frames.length-1];
aClass20Array351[j].anIntArray355 = new int[frames.length-1];
for(int i2 = 0; i2 < frames.length-1; i2++){
aClass20Array351[j].anIntArray353[i2] = frames[i2]+FrameStart[file];
aClass20Array351[j].anIntArray354[i2] = -1;
aClass20Array351[j].anIntArray355[i2] = delays[i2];
}
}
if(j == 4320){
int file = 1124;
if(FrameStart[file] < 1)
Class36.methodCustomAnimations(false, file);
int[] frames = {1,12,14,15,16,17,18,19,20,2,3,4,5,6,7,8,9,10,11,13,0};
int[] delays = {3,3,3,3,3,3,3,3,3,3,3,3,3,3,3,3,3,3,3,3,0};
aClass20Array351[j].anInt352 = frames.length-1;
aClass20Array351[j].anIntArray353 = new int[frames.length-1];
aClass20Array351[j].anIntArray354 = new int[frames.length-1];
aClass20Array351[j].anIntArray355 = new int[frames.length-1];
for(int i2 = 0; i2 < frames.length-1; i2++){
aClass20Array351[j].anIntArray353[i2] = frames[i2]+FrameStart[file];
aClass20Array351[j].anIntArray354[i2] = -1;
aClass20Array351[j].anIntArray355[i2] = delays[i2];
}
}
if(j == 4319){
int file = 1124;
if(FrameStart[file] < 1)
Class36.methodCustomAnimations(false, file);
int[] frames = {116,124,125,126,127,128,129,130,131,117,118,119,120,121,122,123,0};
int[] delays = {3,3,3,3,3,3,3,3,3,3,3,3,3,3,3,3,0};
aClass20Array351[j].anInt352 = frames.length-1;
aClass20Array351[j].anIntArray353 = new int[frames.length-1];
aClass20Array351[j].anIntArray354 = new int[frames.length-1];
aClass20Array351[j].anIntArray355 = new int[frames.length-1];
for(int i2 = 0; i2 < frames.length-1; i2++){
aClass20Array351[j].anIntArray353[i2] = frames[i2]+FrameStart[file];
aClass20Array351[j].anIntArray354[i2] = -1;
aClass20Array351[j].anIntArray355[i2] = delays[i2];
}
}
if(j == 4318){
int file = 1124;
if(FrameStart[file] < 1)
Class36.methodCustomAnimations(false, file);
int[] frames = {98,108,109,110,111,112,113,114,115,99,100,101,102,103,104,105,106,107,0,36,38,39,40,41,42,43,44,26,27,28,29,30,31,32,33,34,35,37,98,108,109,110,111,112,113,114,115,99,100,101,102,103,104,105,106,107,98,108,109,110,111,112,113,114,115,99,100,101,102,103,104,105,106,107,98,108,109,110,111,112,113,114,115,99,100,101,102,103,104,105,106,107,0};
int[] delays = {4,4,4,4,4,4,4,4,4,4,4,4,4,4,4,4,4,4,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,4,4,4,4,4,4,4,4,4,4,4,4,4,4,4,4,4,4,4,4,4,4,4,4,4,4,4,4,4,4,4,4,4,4,4,4,4,4,4,4,4,4,4,4,4,4,4,4,4,4,4,4,4,4,0};
aClass20Array351[j].anInt352 = frames.length-1;
aClass20Array351[j].anIntArray353 = new int[frames.length-1];
aClass20Array351[j].anIntArray354 = new int[frames.length-1];
aClass20Array351[j].anIntArray355 = new int[frames.length-1];
for(int i2 = 0; i2 < frames.length-1; i2++){
aClass20Array351[j].anIntArray353[i2] = frames[i2]+FrameStart[file];
aClass20Array351[j].anIntArray354[i2] = -1;
aClass20Array351[j].anIntArray355[i2] = delays[i2];
}
}
//Saradomin
//Voa e atacka
if(j == 6967){
int file = 1775;
if(FrameStart[file] < 1)
Class36.methodCustomAnimations(false, file);
int[] frames = {114,53,127,13,151,93,196,117,161,29,63,94,96,132,129,141,139,192,206,182,4,195,56,152,179,133,90,61,145,6,167,109,68,172,130,170,3,204,134,191,184,15,207,108,16,131,163,51,169,88,86,150,22,188,85,124,158,105,160,197,180,64,9,103,100,123,39,8,95,69,55,44,5,65,165,190,116,41,121,140,48,20,137,74,77,178,157,149,201,62,0};
int[] delays = {3,3,3,3,3,3,3,3,3,3,3,3,3,3,3,3,3,3,3,3,3,3,3,3,3,3,3,3,3,3,3,3,3,3,3,3,3,3,3,3,3,3,3,3,3,3,3,3,3,3,3,3,3,3,3,3,3,3,3,3,3,3,3,3,3,3,3,3,3,3,3,3,3,3,3,3,3,3,3,3,3,3,3,3,3,3,3,3,3,3,0};
aClass20Array351[j].anInt352 = frames.length-1;
aClass20Array351[j].anIntArray353 = new int[frames.length-1];
aClass20Array351[j].anIntArray354 = new int[frames.length-1];
aClass20Array351[j].anIntArray355 = new int[frames.length-1];
for(int i2 = 0; i2 < frames.length-1; i2++){
aClass20Array351[j].anIntArray353[i2] = frames[i2]+FrameStart[file];
aClass20Array351[j].anIntArray354[i2] = -1;
aClass20Array351[j].anIntArray355[i2] = delays[i2];
}
}

//Block
if(j == 6966){
int file = 1775;
if(FrameStart[file] < 1)
Class36.methodCustomAnimations(false, file);
int[] frames = {10,153,97,25,67,102,175,17,101,128,110,66,144,26,113,143,126,36,76,92,148,40,176,32,73,91,30,199,147,1,156,162,183,24,83,159,18,120,72,138,0};
int[] delays = {3,3,3,3,3,3,3,3,3,3,3,3,3,3,3,3,3,3,3,3,3,3,3,3,3,3,3,3,3,3,3,3,3,3,3,3,3,3,3,3,0};
aClass20Array351[j].anInt352 = frames.length-1;
aClass20Array351[j].anIntArray353 = new int[frames.length-1];
aClass20Array351[j].anIntArray354 = new int[frames.length-1];
aClass20Array351[j].anIntArray355 = new int[frames.length-1];
for(int i2 = 0; i2 < frames.length-1; i2++){
aClass20Array351[j].anIntArray353[i2] = frames[i2]+FrameStart[file];
aClass20Array351[j].anIntArray354[i2] = -1;
aClass20Array351[j].anIntArray355[i2] = delays[i2];
}
}
//Die

if(j == 6965){
int file = 1775;
if(FrameStart[file] < 1)
Class36.methodCustomAnimations(false, file);
int[] frames = {142,104,50,80,200,79,173,118,71,31,27,98,177,164,168,135,70,57,54,136,37,171,46,34,125,154,87,38,33,21,0};
int[] delays = {5,5,5,5,5,5,5,5,5,5,5,5,5,5,5,5,5,5,5,5,5,5,5,5,5,5,5,5,5,300,0};
aClass20Array351[j].anInt352 = frames.length-1;
aClass20Array351[j].anIntArray353 = new int[frames.length-1];
aClass20Array351[j].anIntArray354 = new int[frames.length-1];
aClass20Array351[j].anIntArray355 = new int[frames.length-1];
for(int i2 = 0; i2 < frames.length-1; i2++){
aClass20Array351[j].anIntArray353[i2] = frames[i2]+FrameStart[file];
aClass20Array351[j].anIntArray354[i2] = -1;
aClass20Array351[j].anIntArray355[i2] = delays[i2];
}
}
//Att
if(j == 6964){
int file = 1775;
if(FrameStart[file] < 1)
Class36.methodCustomAnimations(false, file);
int[] frames = {155,189,59,194,111,58,187,78,193,185,42,198,47,174,43,186,205,0};
int[] delays = {5,5,5,5,5,5,5,5,5,5,5,5,5,5,5,5,5,0};
aClass20Array351[j].anInt352 = frames.length-1;
aClass20Array351[j].anIntArray353 = new int[frames.length-1];
aClass20Array351[j].anIntArray354 = new int[frames.length-1];
aClass20Array351[j].anIntArray355 = new int[frames.length-1];
for(int i2 = 0; i2 < frames.length-1; i2++){
aClass20Array351[j].anIntArray353[i2] = frames[i2]+FrameStart[file];
aClass20Array351[j].anIntArray354[i2] = -1;
aClass20Array351[j].anIntArray355[i2] = delays[i2];
}
}
//Standing
if(j == 6963){
int file = 1775;
if(FrameStart[file] < 1)
Class36.methodCustomAnimations(false, file);
int[] frames = {203,112,99,28,45,14,81,19,52,119,7,49,202,146,0};
int[] delays = {5,5,5,5,5,5,5,5,5,5,5,5,5,5,0};
aClass20Array351[j].anInt352 = frames.length-1;
aClass20Array351[j].anIntArray353 = new int[frames.length-1];
aClass20Array351[j].anIntArray354 = new int[frames.length-1];
aClass20Array351[j].anIntArray355 = new int[frames.length-1];
for(int i2 = 0; i2 < frames.length-1; i2++){
aClass20Array351[j].anIntArray353[i2] = frames[i2]+FrameStart[file];
aClass20Array351[j].anIntArray354[i2] = -1;
aClass20Array351[j].anIntArray355[i2] = delays[i2];
}
}
//walking
if(j == 6962){
int file = 1775;
if(FrameStart[file] < 1)
Class36.methodCustomAnimations(false, file);
int[] frames = {181,106,89,122,12,166,75,107,60,115,11,2,23,82,35,84,0};
int[] delays = {4,4,4,4,4,4,4,4,4,4,4,4,4,4,4,4,0};
aClass20Array351[j].anInt352 = frames.length-1;
aClass20Array351[j].anIntArray353 = new int[frames.length-1];
aClass20Array351[j].anIntArray354 = new int[frames.length-1];
aClass20Array351[j].anIntArray355 = new int[frames.length-1];
for(int i2 = 0; i2 < frames.length-1; i2++){
aClass20Array351[j].anIntArray353[i2] = frames[i2]+FrameStart[file];
aClass20Array351[j].anIntArray354[i2] = -1;
aClass20Array351[j].anIntArray355[i2] = delays[i2];
}
}
//Kree graa
//Attack
if(j == 6977){
int file = 1773;
if(FrameStart[file] < 1)
Class36.methodCustomAnimations(false, file);
int[] frames = {0,35,40,184,168,95,33,82,12,20,72,79,167,94,0};
int[] delays = {3,3,3,3,3,3,3,3,3,3,3,3,3,3,0};
aClass20Array351[j].anInt352 = frames.length-1;
aClass20Array351[j].anIntArray353 = new int[frames.length-1];
aClass20Array351[j].anIntArray354 = new int[frames.length-1];
aClass20Array351[j].anIntArray355 = new int[frames.length-1];
for(int i2 = 0; i2 < frames.length-1; i2++){
aClass20Array351[j].anIntArray353[i2] = frames[i2]+FrameStart[file];
aClass20Array351[j].anIntArray354[i2] = -1;
aClass20Array351[j].anIntArray355[i2] = delays[i2];
}
}

//Block
if(j == 6974){
int file = 1773;
if(FrameStart[file] < 1)
Class36.methodCustomAnimations(false, file);
int[] frames = {111,152,164,25,56,106,87,136,103,59,7,31,99,70,54,69,22,50,179,115,0};
int[] delays = {3,3,3,3,3,3,3,3,3,3,3,3,3,3,3,3,3,3,3,3,0};
aClass20Array351[j].anInt352 = frames.length-1;
aClass20Array351[j].anIntArray353 = new int[frames.length-1];
aClass20Array351[j].anIntArray354 = new int[frames.length-1];
aClass20Array351[j].anIntArray355 = new int[frames.length-1];
for(int i2 = 0; i2 < frames.length-1; i2++){
aClass20Array351[j].anIntArray353[i2] = frames[i2]+FrameStart[file];
aClass20Array351[j].anIntArray354[i2] = -1;
aClass20Array351[j].anIntArray355[i2] = delays[i2];
}
}
//Death
if(j == 6975){
int file = 1773;
if(FrameStart[file] < 1)
Class36.methodCustomAnimations(false, file);
int[] frames = {19,145,186,68,142,123,178,67,161,146,107,125,159,47,62,116,34,73,180,149,78,163,9,120,3,74,58,126,144,43,38,102,129,140,138,14,88,101,89,57,182,32,147,0};
int[] delays = {3,3,3,3,3,3,3,3,3,3,3,3,3,3,3,3,3,3,3,3,3,3,3,3,3,3,3,3,3,3,3,3,3,3,3,3,3,3,3,3,3,3,300,0};
aClass20Array351[j].anInt352 = frames.length-1;
aClass20Array351[j].anIntArray353 = new int[frames.length-1];
aClass20Array351[j].anIntArray354 = new int[frames.length-1];
aClass20Array351[j].anIntArray355 = new int[frames.length-1];
for(int i2 = 0; i2 < frames.length-1; i2++){
aClass20Array351[j].anIntArray353[i2] = frames[i2]+FrameStart[file];
aClass20Array351[j].anIntArray354[i2] = -1;
aClass20Array351[j].anIntArray355[i2] = delays[i2];
}
}
//Stand
if(j == 6972){
int file = 1773;
if(FrameStart[file] < 1)
Class36.methodCustomAnimations(false, file);
int[] frames = {66,118,108,15,156,1,100,42,154,185,37,4,30,26,28,27,143,170,181,84,29,139,39,11,117,36,104,183,91,48,0};
int[] delays = {3,3,3,3,3,3,3,3,3,3,3,3,3,3,3,3,3,3,3,3,3,3,3,3,3,3,3,3,3,3,0};
aClass20Array351[j].anInt352 = frames.length-1;
aClass20Array351[j].anIntArray353 = new int[frames.length-1];
aClass20Array351[j].anIntArray354 = new int[frames.length-1];
aClass20Array351[j].anIntArray355 = new int[frames.length-1];
for(int i2 = 0; i2 < frames.length-1; i2++){
aClass20Array351[j].anIntArray353[i2] = frames[i2]+FrameStart[file];
aClass20Array351[j].anIntArray354[i2] = -1;
aClass20Array351[j].anIntArray355[i2] = delays[i2];
}
}
//Walk
if(j == 6973){
int file = 1773;
if(FrameStart[file] < 1)
Class36.methodCustomAnimations(false, file);
int[] frames = {41,76,51,13,158,65,64,150,148,46,90,153,134,18,130,172,49,112,105,135,81,92,53,166,141,86,127,2,171,132,0};
int[] delays = {3,3,3,3,3,3,3,3,3,3,3,3,3,3,3,3,3,3,3,3,3,3,3,3,3,3,3,3,3,3,0};
aClass20Array351[j].anInt352 = frames.length-1;
aClass20Array351[j].anIntArray353 = new int[frames.length-1];
aClass20Array351[j].anIntArray354 = new int[frames.length-1];
aClass20Array351[j].anIntArray355 = new int[frames.length-1];
for(int i2 = 0; i2 < frames.length-1; i2++){
aClass20Array351[j].anIntArray353[i2] = frames[i2]+FrameStart[file];
aClass20Array351[j].anIntArray354[i2] = -1;
aClass20Array351[j].anIntArray355[i2] = delays[i2];
}
}
//Range atts
if(j == 6976){
int file = 1773;
if(FrameStart[file] < 1)
Class36.methodCustomAnimations(false, file);
int[] frames = {137,133,21,55,24,124,114,174,17,155,169,131,177,173,109,8,80,16,61,165,0};
int[] delays = {3,3,3,3,3,3,3,3,3,3,3,3,3,3,3,3,3,3,3,3,0};
aClass20Array351[j].anInt352 = frames.length-1;
aClass20Array351[j].anIntArray353 = new int[frames.length-1];
aClass20Array351[j].anIntArray354 = new int[frames.length-1];
aClass20Array351[j].anIntArray355 = new int[frames.length-1];
for(int i2 = 0; i2 < frames.length-1; i2++){
aClass20Array351[j].anIntArray353[i2] = frames[i2]+FrameStart[file];
aClass20Array351[j].anIntArray354[i2] = -1;
aClass20Array351[j].anIntArray355[i2] = delays[i2];
}
}






}
}

	public int method258(int i, byte byte0)
	{
		int j = anIntArray355[i];
		if(byte0 != -39)
		{
			for(int k = 1; k > 0; k++);
		}
		if(j == 0)
		{
			Class36 class36 = Class36.method531(anInt348, anIntArray353[i]);
			if(class36 != null)
			j = anIntArray355[i] = class36.anInt636;
		}
		if(j == 0)
		j = 1;
		return j;
	}
	
	public static void setAnimBase(int j){
aClass20Array351[j].anInt352 = aClass20Array351[808].anInt352;
aClass20Array351[j].anIntArray353 = aClass20Array351[808].anIntArray353;
aClass20Array351[j].anIntArray354 = aClass20Array351[808].anIntArray354;
aClass20Array351[j].anIntArray355 = aClass20Array351[808].anIntArray355;
aClass20Array351[j].anInt356 = aClass20Array351[808].anInt356;
aClass20Array351[j].anIntArray357 = aClass20Array351[808].anIntArray357;
aClass20Array351[j].anInt359 = aClass20Array351[808].anInt359;
aClass20Array351[j].anInt360 = aClass20Array351[808].anInt360;
aClass20Array351[j].anInt361 = aClass20Array351[808].anInt361;
aClass20Array351[j].anInt362 = aClass20Array351[808].anInt362;
aClass20Array351[j].anInt363 = aClass20Array351[808].anInt363;
aClass20Array351[j].anInt364 = aClass20Array351[808].anInt364;
aClass20Array351[j].anInt365 = aClass20Array351[808].anInt365;
aClass20Array351[j].anInt366 = aClass20Array351[808].anInt366;
aClass20Array351[j].anInt352 = aClass20Array351[808].anInt352;
}

	public void method259(boolean flag, Class30_Sub2_Sub2 class30_sub2_sub2)
	{
		if(!flag)
		aBoolean349 = !aBoolean349;
		do
		{
			int i = class30_sub2_sub2.method408();
			if(i == 0)
			break;
			if(i == 1)
			{
				anInt352 = class30_sub2_sub2.method408();
				anIntArray353 = new int[anInt352];
				anIntArray354 = new int[anInt352];
				anIntArray355 = new int[anInt352];
				for(int j = 0; j < anInt352; j++)
				{
					anIntArray353[j] = class30_sub2_sub2.method410();
					anIntArray354[j] = class30_sub2_sub2.method410();
					if(anIntArray354[j] == 65535)
					anIntArray354[j] = -1;
					anIntArray355[j] = class30_sub2_sub2.method410();
				}

			} else
			if(i == 2)
			anInt356 = class30_sub2_sub2.method410();
			else
			if(i == 3)
			{
				int k = class30_sub2_sub2.method408();
				anIntArray357 = new int[k + 1];
				for(int l = 0; l < k; l++)
				anIntArray357[l] = class30_sub2_sub2.method408();

				anIntArray357[k] = 0x98967f;
			} else
			if(i == 4)
			aBoolean358 = true;
			else
			if(i == 5)
			anInt359 = class30_sub2_sub2.method408();
			else
			if(i == 6)
			anInt360 = class30_sub2_sub2.method410();
			else
			if(i == 7)
			anInt361 = class30_sub2_sub2.method410();
			else
			if(i == 8)
			anInt362 = class30_sub2_sub2.method408();
			else
			if(i == 9)
			anInt363 = class30_sub2_sub2.method408();
			else
			if(i == 10)
			anInt364 = class30_sub2_sub2.method408();
			else
			if(i == 11)
			anInt365 = class30_sub2_sub2.method408();
			else
			if(i == 12)
			anInt366 = class30_sub2_sub2.method413();
			else
			System.out.println("Error unrecognised seq config code: " + i);
		} while(true);
		if(anInt352 == 0)
		{
			anInt352 = 1;
			anIntArray353 = new int[1];
			anIntArray353[0] = -1;
			anIntArray354 = new int[1];
			anIntArray354[0] = -1;
			anIntArray355 = new int[1];
			anIntArray355[0] = -1;
		}
		if(anInt363 == -1)
		if(anIntArray357 != null)
		anInt363 = 2;
		else
		anInt363 = 0;
		if(anInt364 == -1)
		{
			if(anIntArray357 != null)
			{
				anInt364 = 2;
				return;
			}
			anInt364 = 0;
		}
	}

	public Class20()
	{
		anInt348 = 9;
		aBoolean349 = false;
		anInt356 = -1;
		aBoolean358 = false;
		anInt359 = 5;
		anInt360 = -1;
		anInt361 = -1;
		anInt362 = 99;
		anInt363 = -1;
		anInt364 = -1;
		anInt365 = 2;
	}

	private int anInt348;
	public static int FrameStart[] = new int[2500];
	private boolean aBoolean349;
	public static int anInt350;
	public static Class20 aClass20Array351[];
	public int anInt352;
	public int anIntArray353[];
	public int anIntArray354[];
	private int anIntArray355[];
	public int anInt356;
	public int anIntArray357[];
	public boolean aBoolean358;
	public int anInt359;
	public int anInt360;
	public int anInt361;
	public int anInt362;
	public int anInt363;
	public int anInt364;
	public int anInt365;
	public int anInt366;
	public static int anInt367;
}
