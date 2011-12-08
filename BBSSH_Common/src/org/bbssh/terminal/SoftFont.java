package org.bbssh.terminal;

import net.rim.device.api.ui.Graphics;
import net.rim.device.api.util.IntHashtable;

/**
 * Any characters that are not available in standard java fonts may be
 * drawn using the softfont utility. This utility class was derived from
 * the cpi fonts used in linux console drivers.<P>
 * <small>Font file generated by cpi2fnt</small>
 * <P>
 * <B>Maintainer:</B> Marcus Meissner
 *
 * @version $Id: SoftFont.java 499 2005-09-29 08:24:54Z leo $
 * @author Matthias L. Jugel, Marcus Meissner
 */
public class SoftFont {
	private static SoftFont me;

	public static SoftFont getInstance() { 
		if (me == null) {
			me = new SoftFont();
		}
		return me;
	}
	
	final static private char	SF_BITMAP = 0;
	final static private char	SF_FILLRECT = 1;


//	final static private char	SF_CHAR	= 0;
	final static private char	SF_WIDTH= 1;
	final static private char	SF_HEIGHT= 2;
	final static private char	SF_TYPE  = 3;
	final static private char	SF_DATA  = 4;
	IntHashtable font;
	/** softfont characterdata */
	private static char[][] fontdata = {
	
	{0x01,8,8,SF_BITMAP, /* 1 0x01 '^A' */
	0x7e, /* 01111110 */
	0x81, /* 10000001 */
	0xa5, /* 10100101 */
	0x81, /* 10000001 */
	0xbd, /* 10111101 */
	0x99, /* 10011001 */
	0x81, /* 10000001 */
	0x7e, /* 01111110 */
	},{ 0x02,8,8,SF_BITMAP,/* 2 0x02 '^B' */
	0x7e, /* 01111110 */
	0xff, /* 11111111 */
	0xdb, /* 11011011 */
	0xff, /* 11111111 */
	0xc3, /* 11000011 */
	0xe7, /* 11100111 */
	0xff, /* 11111111 */
	0x7e, /* 01111110 */
	},{ 0x03,8,8,SF_BITMAP,/* 3 0x03 '^C' */
	0x6c, /* 01101100 */
	0xfe, /* 11111110 */
	0xfe, /* 11111110 */
	0xfe, /* 11111110 */
	0x7c, /* 01111100 */
	0x38, /* 00111000 */
	0x10, /* 00010000 */
	0x00, /* 00000000 */
	},{ 0x04,8,8,SF_BITMAP,/* 4 0x04 '^D' */
	0x10, /* 00010000 */
	0x38, /* 00111000 */
	0x7c, /* 01111100 */
	0xfe, /* 11111110 */
	0x7c, /* 01111100 */
	0x38, /* 00111000 */
	0x10, /* 00010000 */
	0x00, /* 00000000 */
	},{ 0x05,8,8,SF_BITMAP,/* 5 0x05 '^E' */
	0x38, /* 00111000 */
	0x7c, /* 01111100 */
	0x38, /* 00111000 */
	0xfe, /* 11111110 */
	0xfe, /* 11111110 */
	0xd6, /* 11010110 */
	0x10, /* 00010000 */
	0x38, /* 00111000 */
	},{ 0x06,8,8,SF_BITMAP,/* 6 0x06 '^F' */
	0x10, /* 00010000 */
	0x38, /* 00111000 */
	0x7c, /* 01111100 */
	0xfe, /* 11111110 */
	0xfe, /* 11111110 */
	0x7c, /* 01111100 */
	0x10, /* 00010000 */
	0x38, /* 00111000 */
	},{ 0x2666,8,8,SF_BITMAP,/* 9830 0x2666 BLACK DIAMOND */
	0x00, /* 00000000 */
	0x00, /* 00000000 */
	0x18, /* 00011000 */
	0x3c, /* 00111100 */
	0x3c, /* 00111100 */
	0x18, /* 00011000 */
	0x00, /* 00000000 */
	0x00, /* 00000000 */
	},{ 0x07,8,8,SF_BITMAP,/* 7 0x07 '^G' */
	0x00, /* 00000000 */
	0x00, /* 00000000 */
	0x18, /* 00011000 */
	0x3c, /* 00111100 */
	0x3c, /* 00111100 */
	0x18, /* 00011000 */
	0x00, /* 00000000 */
	0x00, /* 00000000 */
	},{ 0x08,8,8,SF_BITMAP,/* 8 0x08 '^H' */
	0xff, /* 11111111 */
	0xff, /* 11111111 */
	0xe7, /* 11100111 */
	0xc3, /* 11000011 */
	0xc3, /* 11000011 */
	0xe7, /* 11100111 */
	0xff, /* 11111111 */
	0xff, /* 11111111 */
	},{ 0x09,8,8,SF_BITMAP,/* 9 0x09 '^I' */
	0x00, /* 00000000 */
	0x3c, /* 00111100 */
	0x66, /* 01100110 */
	0x42, /* 01000010 */
	0x42, /* 01000010 */
	0x66, /* 01100110 */
	0x3c, /* 00111100 */
	0x00, /* 00000000 */
	},{ 0x0a,8,8,SF_BITMAP,/* 10 0x0a '^J' */
	0xff, /* 11111111 */
	0xc3, /* 11000011 */
	0x99, /* 10011001 */
	0xbd, /* 10111101 */
	0xbd, /* 10111101 */
	0x99, /* 10011001 */
	0xc3, /* 11000011 */
	0xff, /* 11111111 */
	},{ 0x0b,8,8,SF_BITMAP,/* 11 0x0b '^K' */
	0x0f, /* 00001111 */
	0x07, /* 00000111 */
	0x0f, /* 00001111 */
	0x7d, /* 01111101 */
	0xcc, /* 11001100 */
	0xcc, /* 11001100 */
	0xcc, /* 11001100 */
	0x78, /* 01111000 */
	},{ 0x0c,8,8,SF_BITMAP,/* 12 0x0c '^L' */
	0x3c, /* 00111100 */
	0x66, /* 01100110 */
	0x66, /* 01100110 */
	0x66, /* 01100110 */
	0x3c, /* 00111100 */
	0x18, /* 00011000 */
	0x7e, /* 01111110 */
	0x18, /* 00011000 */
	},{ 0x0d,8,8,SF_BITMAP,/* 13 0x0d '^M' */
	0x3f, /* 00111111 */
	0x33, /* 00110011 */
	0x3f, /* 00111111 */
	0x30, /* 00110000 */
	0x30, /* 00110000 */
	0x70, /* 01110000 */
	0xf0, /* 11110000 */
	0xe0, /* 11100000 */
	},{ 0x0e,8,8,SF_BITMAP,/* 14 0x0e '^N' */
	0x7f, /* 01111111 */
	0x63, /* 01100011 */
	0x7f, /* 01111111 */
	0x63, /* 01100011 */
	0x63, /* 01100011 */
	0x67, /* 01100111 */
	0xe6, /* 11100110 */
	0xc0, /* 11000000 */
	},{ 0x0f,8,8,SF_BITMAP,/* 15 0x0f '^O' */
	0x18, /* 00011000 */
	0xdb, /* 11011011 */
	0x3c, /* 00111100 */
	0xe7, /* 11100111 */
	0xe7, /* 11100111 */
	0x3c, /* 00111100 */
	0xdb, /* 11011011 */
	0x18, /* 00011000 */
	},{ 0x10,8,8,SF_BITMAP,/* 16 0x10 '^P' */
	0x80, /* 10000000 */
	0xe0, /* 11100000 */
	0xf8, /* 11111000 */
	0xfe, /* 11111110 */
	0xf8, /* 11111000 */
	0xe0, /* 11100000 */
	0x80, /* 10000000 */
	0x00, /* 00000000 */
	},{ 0x11,8,8,SF_BITMAP,/* 17 0x11 '^Q' */
	0x02, /* 00000010 */
	0x0e, /* 00001110 */
	0x3e, /* 00111110 */
	0xfe, /* 11111110 */
	0x3e, /* 00111110 */
	0x0e, /* 00001110 */
	0x02, /* 00000010 */
	0x00, /* 00000000 */
	},{ 0x12,8,8,SF_BITMAP,/* 18 0x12 '^R' */
	0x18, /* 00011000 */
	0x3c, /* 00111100 */
	0x7e, /* 01111110 */
	0x18, /* 00011000 */
	0x18, /* 00011000 */
	0x7e, /* 01111110 */
	0x3c, /* 00111100 */
	0x18, /* 00011000 */
	},{ 0x13,8,8,SF_BITMAP,/* 19 0x13 '^S' */
	0x66, /* 01100110 */
	0x66, /* 01100110 */
	0x66, /* 01100110 */
	0x66, /* 01100110 */
	0x66, /* 01100110 */
	0x00, /* 00000000 */
	0x66, /* 01100110 */
	0x00, /* 00000000 */
	},{ 0x14,8,8,SF_BITMAP,/* 20 0x14 '^T' */
	0x7f, /* 01111111 */
	0xdb, /* 11011011 */
	0xdb, /* 11011011 */
	0x7b, /* 01111011 */
	0x1b, /* 00011011 */
	0x1b, /* 00011011 */
	0x1b, /* 00011011 */
	0x00, /* 00000000 */
	},{ 0x15,8,8,SF_BITMAP,/* 21 0x15 '^U' */
	0x3e, /* 00111110 */
	0x61, /* 01100001 */
	0x3c, /* 00111100 */
	0x66, /* 01100110 */
	0x66, /* 01100110 */
	0x3c, /* 00111100 */
	0x86, /* 10000110 */
	0x7c, /* 01111100 */
	},{ 0x16,8,8,SF_BITMAP,/* 22 0x16 '^V' */
	0x00, /* 00000000 */
	0x00, /* 00000000 */
	0x00, /* 00000000 */
	0x00, /* 00000000 */
	0x7e, /* 01111110 */
	0x7e, /* 01111110 */
	0x7e, /* 01111110 */
	0x00, /* 00000000 */
	},{ 0x17,8,8,SF_BITMAP,/* 23 0x17 '^W' */
	0x18, /* 00011000 */
	0x3c, /* 00111100 */
	0x7e, /* 01111110 */
	0x18, /* 00011000 */
	0x7e, /* 01111110 */
	0x3c, /* 00111100 */
	0x18, /* 00011000 */
	0xff, /* 11111111 */
	},{ 0x18,8,8,SF_BITMAP,/* 24 0x18 '^X' */
	0x18, /* 00011000 */
	0x3c, /* 00111100 */
	0x7e, /* 01111110 */
	0x18, /* 00011000 */
	0x18, /* 00011000 */
	0x18, /* 00011000 */
	0x18, /* 00011000 */
	0x00, /* 00000000 */
	},{ 0x19,8,8,SF_BITMAP,/* 25 0x19 '^Y' */
	0x18, /* 00011000 */
	0x18, /* 00011000 */
	0x18, /* 00011000 */
	0x18, /* 00011000 */
	0x7e, /* 01111110 */
	0x3c, /* 00111100 */
	0x18, /* 00011000 */
	0x00, /* 00000000 */
	},{ 0x1a,8,8,SF_BITMAP,/* 26 0x1a '^Z' */
	0x00, /* 00000000 */
	0x18, /* 00011000 */
	0x0c, /* 00001100 */
	0xfe, /* 11111110 */
	0x0c, /* 00001100 */
	0x18, /* 00011000 */
	0x00, /* 00000000 */
	0x00, /* 00000000 */
	},{ 0x1b,8,8,SF_BITMAP,/* 27 0x1b '^[' */
	0x00, /* 00000000 */
	0x30, /* 00110000 */
	0x60, /* 01100000 */
	0xfe, /* 11111110 */
	0x60, /* 01100000 */
	0x30, /* 00110000 */
	0x00, /* 00000000 */
	0x00, /* 00000000 */
	},{ 0x1c,8,8,SF_BITMAP,/* 28 0x1c '^\' */
	0x00, /* 00000000 */
	0x00, /* 00000000 */
	0xc0, /* 11000000 */
	0xc0, /* 11000000 */
	0xc0, /* 11000000 */
	0xfe, /* 11111110 */
	0x00, /* 00000000 */
	0x00, /* 00000000 */
	},{ 0x1d,8,8,SF_BITMAP,/* 29 0x1d '^]' */
	0x00, /* 00000000 */
	0x24, /* 00100100 */
	0x66, /* 01100110 */
	0xff, /* 11111111 */
	0x66, /* 01100110 */
	0x24, /* 00100100 */
	0x00, /* 00000000 */
	0x00, /* 00000000 */
	},{ 0x1e,8,8,SF_BITMAP,/* 30 0x1e '^^' */
	0x00, /* 00000000 */
	0x18, /* 00011000 */
	0x3c, /* 00111100 */
	0x7e, /* 01111110 */
	0xff, /* 11111111 */
	0xff, /* 11111111 */
	0x00, /* 00000000 */
	0x00, /* 00000000 */
	},{ 0x1f,8,8,SF_BITMAP,/* 31 0x1f '^_' */
	0x00, /* 00000000 */
	0xff, /* 11111111 */
	0xff, /* 11111111 */
	0x7e, /* 01111110 */
	0x3c, /* 00111100 */
	0x18, /* 00011000 */
	0x00, /* 00000000 */
	0x00, /* 00000000 */
	},{ 0x7f,8,8,SF_BITMAP,/* 127 0x7f '' */
	0x00, /* 00000000 */
	0x10, /* 00010000 */
	0x38, /* 00111000 */
	0x6c, /* 01101100 */
	0xc6, /* 11000110 */
	0xc6, /* 11000110 */
	0xfe, /* 11111110 */
	0x00, /* 00000000 */
	},{ 0x2591,8,8,SF_BITMAP,/* LIGHT SHADE */
	0x22, /* 00100010 */
	0x88, /* 10001000 */
	0x22, /* 00100010 */
	0x88, /* 10001000 */
	0x22, /* 00100010 */
	0x88, /* 10001000 */
	0x22, /* 00100010 */
	0x88, /* 10001000 */
	},{ 0x2592,8,8,SF_BITMAP,/* MEDIUM SHADE */
	0x55, /* 01010101 */
	0xaa, /* 10101010 */
	0x55, /* 01010101 */
	0xaa, /* 10101010 */
	0x55, /* 01010101 */
	0xaa, /* 10101010 */
	0x55, /* 01010101 */
	0xaa, /* 10101010 */
	},{ 0x2593,8,8,SF_BITMAP,/* DARK SHADE */
	0x77, /* 01110111 */
	0xdd, /* 11011101 */
	0x77, /* 01110111 */
	0xdd, /* 11011101 */
	0x77, /* 01110111 */
	0xdd, /* 11011101 */
	0x77, /* 01110111 */
	0xdd, /* 11011101 */
	},{ 0x221a,8,8,SF_BITMAP,/* SQUARE ROOT */
	0x78, /* 01111000 */
	0x0c, /* 00001100 */
	0x18, /* 00011000 */
	0x30, /* 00110000 */
	0x7c, /* 01111100 */
	0x00, /* 00000000 */
	0x00, /* 00000000 */
	0x00, /* 00000000 */
	},{ 0x2320,8,8,SF_FILLRECT,/* UPPER INTERVAL*/
		0x4031,
		0x3127,
		0x6122,
		/* 00001110 */
		/* 00011011 */
		/* 00011011 */
		/* 00011000 */
		/* 00011000 */
		/* 00011000 */
		/* 00011000 */
		/* 00011000 */
	},{ 0x2321,8,8,SF_FILLRECT,/* BOTTOM HALF INTEGRAL */
		0x3027,
		0x0522,
		0x1731,
		/* 00011000 */
		/* 00011000 */
		/* 00011000 */
		/* 00011000 */
		/* 00011000 */
		/* 11011000 */
		/* 11011000 */
		/* 01110000 */
	},{ 0x25a0,8,8,SF_FILLRECT,/* BLACK SQUARE */
		0x2244,
		/* 00000000 */
		/* 00000000 */
		/* 00111100 */
		/* 00111100 */
		/* 00111100 */
		/* 00111100 */
		/* 00000000 */
		/* 00000000 */
	},{ 0x2502,8,8,SF_FILLRECT,/*BOX DRAWINGS LIGHT VERTICAL*/
		0x3028,
		/* 00011000 */
		/* 00011000 */
		/* 00011000 */
		/* 00011000 */
		/* 00011000 */
		/* 00011000 */
		/* 00011000 */
		/* 00011000 */
	},{ 0x2524,8,8,SF_FILLRECT,/* BOX DRAWINGS LIGHT VERTICAL AND LEFT */
		0x3028,
		0x0431,
		/* 00011000 */
		/* 00011000 */
		/* 00011000 */
		/* 00011000 */
		/* 11111000 */
		/* 00011000 */
		/* 00011000 */
		/* 00011000 */
	},{ 0x2561,8,8,SF_FILLRECT,/*BOX DRAWINGS VERTICAL SINGLE AND LEFT DOUBLE*/
		0x3028,
		0x0231,
		0x0431,
		/* 00011000 */
		/* 00011000 */
		/* 11111000 */
		/* 00011000 */
		/* 11111000 */
		/* 00011000 */
		/* 00011000 */
		/* 00011000 */
	},{ 0x2562,8,8,SF_FILLRECT,/* BOX DRAWINGS VERTICAL DOUBLE AND LEFT SINGLE */
		0x2028,
		0x5028,
		0x0421,
		/* 00110110 */
		/* 00110110 */
		/* 00110110 */
		/* 00110110 */
		/* 11110110 */
		/* 00110110 */
		/* 00110110 */
		/* 00110110 */
	},{ 0x2556,8,8,SF_FILLRECT,/* BOX DRAWINGS DOWN DOUBLE AND LEFT SINGLE */
		0x0471,
		0x2523,
		0x5523,
		/* 00000000 */
		/* 00000000 */
		/* 00000000 */
		/* 00000000 */
		/* 11111110 */
		/* 00110110 */
		/* 00110110 */
		/* 00110110 */
	},{ 0x2555,8,8,SF_FILLRECT,/* BOX DRAWINGS DOWN SINGLE AND LEFT DOUBLE */
		0x3226,
		0x0231,
		0x0431,
		/* 00000000 */
		/* 00000000 */
		/* 11111000 */
		/* 00011000 */
		/* 11111000 */
		/* 00011000 */
		/* 00011000 */
		/* 00011000 */
	},{ 0x2563,8,8,SF_FILLRECT,/* BOX DRAWINGS DOUBLE VERTICAL AND LEFT*/
		0x2022,
		0x0221,
		0x0421,
		0x2424,
		0x5028,
		/* 00110110 */
		/* 00110110 */
		/* 11110110 */
		/* 00000110 */
		/* 11110110 */
		/* 00110110 */
		/* 00110110 */
		/* 00110110 */
	},{ 0x2551,8,8,SF_FILLRECT,/* BOX DRAWINGS DOUBLE VERTICAL */
		0x2028,
		0x5028,
		/* 00110110 */
		/* 00110110 */
		/* 00110110 */
		/* 00110110 */
		/* 00110110 */
		/* 00110110 */
		/* 00110110 */
		/* 00110110 */
	},{ 0x2557,8,8,SF_FILLRECT,/*  BOX DRAWINGS DOUBLE DOWN AND LEFT */
		0x0271,
		0x5325,
		0x0441,
		0x2523,
		/* 00000000 */
		/* 00000000 */
		/* 11111110 */
		/* 00000110 */
		/* 11110110 */
		/* 00110110 */
		/* 00110110 */
		/* 00110110 */
	},{ 0x255d,8,8,SF_FILLRECT,/* BOX DRAWINGS DOUBLE UP AND LEFT */
		0x2022,
		0x0241,
		0x5025,
		0x0451,
		/* 00110110 */
		/* 00110110 */
		/* 11110110 */
		/* 00000110 */
		/* 11111110 */
		/* 00000000 */
		/* 00000000 */
		/* 00000000 */
	},{ 0x255c,8,8,SF_FILLRECT,/* BOX DRAWINGS UP DOUBLE AND LEFT SINGLE */
		0x2024,
		0x5024,
		0x0471,
		/* 00110110 */
		/* 00110110 */
		/* 00110110 */
		/* 00110110 */
		/* 11111110 */
		/* 00000000 */
		/* 00000000 */
		/* 00000000 */
	},{ 0x255b,8,8,SF_FILLRECT,/* BOX DRAWINGS UP SINGLE AND LEFT DOUBLE */
		0x3025,
		0x0231,
		0x0431,
		/* 00011000 */
		/* 00011000 */
		/* 11111000 */
		/* 00011000 */
		/* 11111000 */
		/* 00000000 */
		/* 00000000 */
		/* 00000000 */
	},{ 0x2510,8,8,SF_FILLRECT,/* BOX DRAWINGS LIGHT DOWN AND LEFT */
		0x0451,
		0x3523,
		/* 00000000 */
		/* 00000000 */
		/* 00000000 */
		/* 00000000 */
		/* 11111000 */
		/* 00011000 */
		/* 00011000 */
		/* 00011000 */
	},{ 0x2514,8,8,SF_FILLRECT,/* BOX DRAWINGS LIGHT UP AND RIGHT */
		0x3025,
		0x5431,
		/* 00011000 */
		/* 00011000 */
		/* 00011000 */
		/* 00011000 */
		/* 00011111 */
		/* 00000000 */
		/* 00000000 */
		/* 00000000 */
	},{ 0x2534,8,8,SF_FILLRECT,/* BOX DRAWINGS LIGHT UP AND HORIZONTAL */
		0x3024,
		0x0481,
		/* 00011000 */
		/* 00011000 */
		/* 00011000 */
		/* 00011000 */
		/* 11111111 */
		/* 00000000 */
		/* 00000000 */
		/* 00000000 */
	},{ 0x252c,8,8,SF_FILLRECT,/* BOX DRAWINGS LIGHT DOWN AND HORIZONTAL */
		0x0481,
		0x3523,
		/* 00000000 */
		/* 00000000 */
		/* 00000000 */
		/* 00000000 */
		/* 11111111 */
		/* 00011000 */
		/* 00011000 */
		/* 00011000 */
	},{ 0x251c,8,8,SF_FILLRECT,/* BOX DRAWINGS LIGHT VERTICAL AND RIGHT */
		0x3028,
		0x5431,
		/* 00011000 */
		/* 00011000 */
		/* 00011000 */
		/* 00011000 */
		/* 00011111 */
		/* 00011000 */
		/* 00011000 */
		/* 00011000 */
	},{ 0x2500,8,8,SF_FILLRECT,/* BOX DRAWINGS LIGHT HORIZONTAL */
		0x0481,
		/* 00000000 */
		/* 00000000 */
		/* 00000000 */
		/* 00000000 */
		/* 11111111 */
		/* 00000000 */
		/* 00000000 */
		/* 00000000 */
	},{ 0x2594,8,8,SF_FILLRECT,/* UPPER 1/8 (1st scanline) */
		0x0081,
		/* 11111111 */
		/* 00000000 */
		/* 00000000 */
		/* 00000000 */
		/* 00000000 */
		/* 00000000 */
		/* 00000000 */
		/* 00000000 */
	},{ 0x25ac,8,8,SF_FILLRECT,/* LOWER 1/8 (7nd scanline) */
		0x0781,
		/* 11111111 */
		/* 00000000 */
		/* 00000000 */
		/* 00000000 */
		/* 00000000 */
		/* 00000000 */
		/* 00000000 */
		/* 00000000 */
	},{ 0x253c,8,8,SF_FILLRECT,/* BOX DRAWINGS LIGHT VERTICAL AND HORIZONTAL */
		0x3028,
		0x0481,
		/* 00011000 */
		/* 00011000 */
		/* 00011000 */
		/* 00011000 */
		/* 11111111 */
		/* 00011000 */
		/* 00011000 */
		/* 00011000 */
	},{ 0x255e,8,8,SF_FILLRECT,/* BOX DRAWINGS VERTICAL SINGLE AND RIGHT DOUBLE */
		0x3028,
		0x5231,
		0x5431,
		/* 00011000 */
		/* 00011000 */
		/* 00011111 */
		/* 00011000 */
		/* 00011111 */
		/* 00011000 */
		/* 00011000 */
		/* 00011000 */
	},{ 0x255f,8,8,SF_FILLRECT,/* BOX DRAWINGS VERTICAL DOUBLE AND RIGHT SINGLE */
		0x2028,
		0x5028,
		0x7411,
		/* 00110110 */
		/* 00110110 */
		/* 00110110 */
		/* 00110110 */
		/* 00110111 */
		/* 00110110 */
		/* 00110110 */
		/* 00110110 */
	},{ 0x255a,8,8,SF_FILLRECT,/* BOX DRAWINGS DOUBLE UP AND RIGHT */
		0x2025,
		0x5023,
		0x7211,
		0x4441,
		/* 00110110 */
		/* 00110110 */
		/* 00110111 */
		/* 00110000 */
		/* 00111111 */
		/* 00000000 */
		/* 00000000 */
		/* 00000000 */
	},{ 0x2554,8,8,SF_FILLRECT,/* BOX DRAWINGS DOUBLE DOWN AND RIGHT */
		0x2261,
		0x2325,
		0x5424,
		0x7411,
		/* 00000000 */
		/* 00000000 */
		/* 00111111 */
		/* 00110000 */
		/* 00110111 */
		/* 00110110 */
		/* 00110110 */
		/* 00110110 */
	},{ 0x2569,8,8,SF_FILLRECT,/* BOX DRAWINGS DOUBLE UP AND HORIZONTAL */
		0x2022,
		0x0241,
		0x5022,
		0x5231,
		0x0481,
		/* 00110110 */
		/* 00110110 */
		/* 11110111 */
		/* 00000000 */
		/* 11111111 */
		/* 00000000 */
		/* 00000000 */
		/* 00000000 */
	},{ 0x2566,8,8,SF_FILLRECT,/* BOX DRAWINGS DOUBLE DOWN AND HORIZONTAL */
		0x0281,
		0x0441,
		0x2523,
		0x5431,
		0x5523,
		/* 00000000 */
		/* 00000000 */
		/* 11111111 */
		/* 00000000 */
		/* 11110111 */
		/* 00110110 */
		/* 00110110 */
		/* 00110110 */
	},{ 0x2560,8,8,SF_FILLRECT,/* BOX DRAWINGS DOUBLE VERTICAL AND RIGHT */
		0x2028,
		0x5022,
		0x5231,
		0x5431,
		0x5623,
		/* 00110110 */
		/* 00110110 */
		/* 00110111 */
		/* 00110000 */
		/* 00110111 */
		/* 00110110 */
		/* 00110110 */
		/* 00110110 */
	},{ 0x2550,8,8,SF_FILLRECT,/* BOX DRAWINGS DOUBLE HORIZONTAL */
		0x0281,
		0x0481,
		/* 00000000 */
		/* 00000000 */
		/* 11111111 */
		/* 00000000 */
		/* 11111111 */
		/* 00000000 */
		/* 00000000 */
		/* 00000000 */
	},{ 0x256c,8,8,SF_FILLRECT,/* BOX DRAWINGS DOUBLE VERTICAL AND HORIZONTAL */
		0x2022,
		0x0241,
		0x5022,
		0x5231,
		0x0441,
		0x2523,
		0x5431,
		0x5523,
		/* 00110110 */
		/* 00110110 */
		/* 11110111 */
		/* 00000000 */
		/* 11110111 */
		/* 00110110 */
		/* 00110110 */
		/* 00110110 */
	},{ 0x2567,8,8,SF_FILLRECT,/* BOX DRAWINGS UP SINGLE AND HORIZONTAL DOUBLE */
		0x3022,
		0x0281,
		0x0481,
		/* 00011000 */
		/* 00011000 */
		/* 11111111 */
		/* 00000000 */
		/* 11111111 */
		/* 00000000 */
		/* 00000000 */
		/* 00000000 */
	},{ 0x2568,8,8,SF_FILLRECT,/* BOX DRAWINGS UP DOUBLE AND HORIZONTAL SINGLE */
		0x2024,
		0x5024,
		0x0481,
		/* 00110110 */
		/* 00110110 */
		/* 00110110 */
		/* 00110110 */
		/* 11111111 */
		/* 00000000 */
		/* 00000000 */
		/* 00000000 */
	},{ 0x2564,8,8,SF_FILLRECT,/* BOX DRAWINGS DOWN SINGLE AND HORIZONTAL DOUBLE */
		0x0281,
		0x0481,
		0x3523,
		/* 00000000 */
		/* 00000000 */
		/* 11111111 */
		/* 00000000 */
		/* 11111111 */
		/* 00011000 */
		/* 00011000 */
		/* 00011000 */
	},{ 0x2565,8,8,SF_FILLRECT,/* BOX DRAWINGS DOWN DOUBLE AND HORIZONTAL SINGLE */
		0x0481,
		0x2523,
		0x5523,
		/* 00000000 */
		/* 00000000 */
		/* 00000000 */
		/* 00000000 */
		/* 11111111 */
		/* 00110110 */
		/* 00110110 */
		/* 00110110 */
	},{ 0x2559,8,8,SF_FILLRECT,/* BOX DRAWINGS UP DOUBLE AND RIGHT SINGLE */
		0x2024,
		0x5024,
		0x2461,
		/* 00110110 */
		/* 00110110 */
		/* 00110110 */
		/* 00110110 */
		/* 00111111 */
		/* 00000000 */
		/* 00000000 */
		/* 00000000 */
	},{ 0x2558,8,8,SF_FILLRECT,/* BOX DRAWINGS UP SINGLE AND RIGHT DOUBLE */
		0x3025,
		0x5231,
		0x5431,
		/* 00011000 */
		/* 00011000 */
		/* 00011111 */
		/* 00011000 */
		/* 00011111 */
		/* 00000000 */
		/* 00000000 */
		/* 00000000 */
	},{ 0x2552,8,8,SF_FILLRECT,/* BOX DRAWINGS DOWN SINGLE AND RIGHT DOUBLE */
		0x3226,
		0x5231,
		0x5431,
		/* 00000000 */
		/* 00000000 */
		/* 00011111 */
		/* 00011000 */
		/* 00011111 */
		/* 00011000 */
		/* 00011000 */
		/* 00011000 */
	},{ 0x2553,8,8,SF_FILLRECT,/* BOX DRAWINGS DOWN DOUBLE AND RIGHT SINGLE */
		0x2461,
		0x2523,
		0x5523,
		/* 00000000 */
		/* 00000000 */
		/* 00000000 */
		/* 00000000 */
		/* 00111111 */
		/* 00110110 */
		/* 00110110 */
		/* 00110110 */
	},{ 0x256b,8,8,SF_FILLRECT,/* BOX DRAWINGS VERTICAL DOUBLE AND HORIZONTAL SINGLE */
		0x2028,
		0x5028,
		0x0481,
		/* 00110110 */
		/* 00110110 */
		/* 00110110 */
		/* 00110110 */
		/* 11111111 */
		/* 00110110 */
		/* 00110110 */
		/* 00110110 */
	},{ 0x256a,8,8,SF_FILLRECT,/* BOX DRAWINGS VERTICAL SINGLE AND HORIZONTAL DOUBLE */
		0x3028,
		0x0281,
		0x0481,
		/* 00011000 */
		/* 00011000 */
		/* 11111111 */
		/* 00011000 */
		/* 11111111 */
		/* 00011000 */
		/* 00011000 */
		/* 00011000 */
	},{ 0x2518,8,8,SF_FILLRECT,/* BOX DRAWINGS LIGHT UP AND LEFT */
		0x3025,
		0x0431,
		/* 00011000 */
		/* 00011000 */
		/* 00011000 */
		/* 00011000 */
		/* 11111000 */
		/* 00000000 */
		/* 00000000 */
		/* 00000000 */
	},{ 0x250c,8,8,SF_FILLRECT,/* BOX DRAWINGS LIGHT DOWN AND RIGHT */
		0x3451,
		0x3523,
		/* 00000000 */
		/* 00000000 */
		/* 00000000 */
		/* 00000000 */
		/* 00011111 */
		/* 00011000 */
		/* 00011000 */
		/* 00011000 */
	},{ 0x2588,8,8,SF_FILLRECT,/* FULL BLOCK */
		0x0088,
		/* 11111111 */
		/* 11111111 */
		/* 11111111 */
		/* 11111111 */
		/* 11111111 */
		/* 11111111 */
		/* 11111111 */
		/* 11111111 */
	},{ 0x2584,8,8,SF_FILLRECT,/* LOWER HALF BLOCK */
		0x0484,
		/* 00000000 */
		/* 00000000 */
		/* 00000000 */
		/* 00000000 */
		/* 11111111 */
		/* 11111111 */
		/* 11111111 */
		/* 11111111 */
	},{ 0x258c,8,8,SF_FILLRECT,/* LEFT HALF BLOCK */
		0x0048,
		/* 11110000 */
		/* 11110000 */
		/* 11110000 */
		/* 11110000 */
		/* 11110000 */
		/* 11110000 */
		/* 11110000 */
		/* 11110000 */
	},{ 0x2590,8,8,SF_FILLRECT,/* RIGHT HALF BLOCK */
		0x4048,
		/* 00001111 */
		/* 00001111 */
		/* 00001111 */
		/* 00001111 */
		/* 00001111 */
		/* 00001111 */
		/* 00001111 */
		/* 00001111 */
	},{ 0x2580,8,8,SF_FILLRECT,/* UPPER HALF BLOCK */
		0x0084,
		/* 11111111 */
		/* 11111111 */
		/* 11111111 */
		/* 11111111 */
		/* 00000000 */
		/* 00000000 */
		/* 00000000 */
		/* 00000000 */
	},{ 0x2261,8,8,SF_FILLRECT,/* EQUIVALENT SIGN */
		0x2081,
		0x4081,
		0x6081,
		/* 00000000 */
		/* 00000000 */
		/* 11111111 */
		/* 00000000 */
		/* 11111111 */
		/* 00000000 */
		/* 11111111 */
		/* 00000000 */
	},{ 0x221e,8,8,SF_BITMAP,/* INFINITY */
		0x00,
		0x00,
		0x7e,
		0xdb,
		0xdb,
		0x7e,
		0x00,
		0x00,
		/* 00000000 */
		/* 00000000 */
		/* 01111110 */
		/* 11011011 */
		/* 11011011 */
		/* 01111110 */
		/* 00000000 */
		/* 00000000 */
	},{ 0x207f,8,8,SF_FILLRECT,/* small superscript n */
		0x1041,
		0x1124,
		0x4124,
		/* 01111000 */
		/* 01101100 */
		/* 01101100 */
		/* 01101100 */
		/* 01101100 */
		/* 00000000 */
		/* 00000000 */
		/* 00000000 */
	},{ 0x00b2,8,8,SF_BITMAP,/* small superscript 2 */
		0x70, /* 01110000 */
		0x1c, /* 00011100 */
		0x38, /* 00111000 */
		0x60, /* 01100000 */
		0x78, /* 01111000 */
		0x00, /* 00000000 */
		0x00, /* 00000000 */
		0x00, /* 00000000 */
	},{ 0x2219,8,8,SF_FILLRECT,/* BULLET OPERATOR */
		0x3322,
		/* 00000000 */
		/* 00000000 */
		/* 00000000 */
		/* 00011000 */
		/* 00011000 */
		/* 00000000 */
		/* 00000000 */
		/* 00000000 */
	},{ 0x2191,8,8,SF_BITMAP,/* UP ARROW */
		0x08, /* 00001000 */
		0x1c, /* 00011100 */
		0x3e, /* 00111110 */
		0x7f, /* 01111111 */
		0x1c, /* 00011100 */
		0x1c, /* 00011100 */
		0x1c, /* 00011100 */
		0x1c, /* 00011100 */
	},{ 0x2193,8,8,SF_BITMAP,/* DOWN ARROW */
		0x1c, /* 00011100 */
		0x1c, /* 00011100 */
		0x1c, /* 00011100 */
		0x1c, /* 00011100 */
		0x7f, /* 01111111 */
		0x3e, /* 00111110 */
		0x1c, /* 00011100 */
		0x08, /* 00001000 */
	},{ 0x25ba,8,8,SF_BITMAP,/* RIGHT ARROW (TRIANGLE ONLY) */
		0x00, /* 00000000 */
		0x40, /* 01000000 */
		0x60, /* 01100000 */
		0x7c, /* 01111100 */
		0x70, /* 01110000 */
		0x60, /* 01100000 */
		0x40, /* 01000000 */
		0x00, /* 00000000 */
	},{ 0x25c4,8,8,SF_BITMAP,/* LEFT ARROW (TRIANGLE ONLY) */
		0x00, /* 00000000 */
		0x02, /* 00000010 */
		0x06, /* 00000110 */
		0x3e, /* 00111110 */
		0x0e, /* 00001110 */
		0x06, /* 00000110 */
		0x02, /* 00000010 */
		0x00, /* 00000000 */
	}};

	public SoftFont() {
		// @todo IntIntHashtable 
		
		font = new IntHashtable();
		
		for (int i=0;i<fontdata.length;i++)
			font.put(fontdata[i][0],new Integer(i));

	}

	public boolean inSoftFont(char c) {
		boolean insoftfont;

		insoftfont = (null!=font.get(c));
		if (!insoftfont && (int)c>=0x100) {
	//		System.out.println("Character "+((int)c)+" not in softfont");
		}
		return insoftfont;
	}

	public void drawChar(Graphics g,char c,int x,int y,int cw,int ch) {
		double	dw,dh;
		Object	Ientry;
		int	w,h,entry,i,fontwidth,fontheight;
		
		Ientry = font.get(c);
		if (Ientry == null)
			return;
		entry = ((Integer)Ientry).intValue();
		fontwidth = fontdata[entry][SF_WIDTH];
		fontheight = fontdata[entry][SF_HEIGHT];

		dw = cw*1.0/fontwidth;
		dh = ch*1.0/fontheight;

		switch (fontdata[entry][SF_TYPE]) {
		case SF_BITMAP:
			for (h=0;h<fontheight;h++) {
				for (w=0;w<fontwidth;w++) {
					//FIXME: 8 bit max currently...
					if (0!=(fontdata[entry][h+SF_DATA] & (1<<(7-w)))) {
						g.fillRect(
							x+(int)(w*dw),
							y+(int)(h*dh),
							((int)((w+1)*dw))-(int)(w*dw),
							((int)((h+1)*dh))-(int)(h*dh)
						);
					}
				}
			}
			break;
		case SF_FILLRECT:
			i=SF_DATA;
			while (i<fontdata[entry].length) {
				int	xw,xh;

				w=(fontdata[entry][i]&0xF000)>>12;
				h=(fontdata[entry][i]&0x0F00)>>8;
				xw = (fontdata[entry][i]&0x00F0)>>4;
				xh = (fontdata[entry][i]&0x000F);
				g.fillRect(
					x+(int)(w*dw),
					y+(int)(h*dh),
					((int)((w+xw)*dw))-(int)(w*dw),
					((int)((h+xh)*dh))-(int)(h*dh)
				);
				i++;
			}
			break;
		default:
			break;
		}
	}
}
