// See LICENSE for license details.

// Allows legacy users to continue using Chisel (capital C) package name while
// moving to the more standard package naming convention chisel (lowercase c).

package object Chisel {
  type Direction = chisel.Direction
  val INPUT = chisel.INPUT
  val OUTPUT = chisel.OUTPUT
  val NO_DIR = chisel.NO_DIR
  val debug = chisel.debug
  type Flipped = chisel.Flipped
  type Data = chisel.Data
  val Wire = chisel.Wire
  val Clock = chisel.Clock
  type Clock = chisel.Clock

  type Aggregate = chisel.Aggregate
  val Vec = chisel.Vec
  type Vec[T <: Data] = chisel.Vec[T]
  type VecLike[T <: Data] = chisel.VecLike[T]
  type Bundle = chisel.Bundle

  val assert = chisel.assert

  val BitPat = chisel.BitPat
  type BitPat = chisel.BitPat

  type Element = chisel.Element
  type Bits = chisel.Bits
  val Bits = chisel.Bits
  type Num[T <: Data] = chisel.Num[T]
  type UInt = chisel.UInt
  val UInt = chisel.UInt
  type SInt = chisel.SInt
  val SInt = chisel.SInt
  type Bool = chisel.Bool
  val Bool = chisel.Bool
  val Mux = chisel.Mux

  type BlackBox = chisel.BlackBox

  val Mem = chisel.Mem
  type MemBase[T <: Data] = chisel.MemBase[T]
  type Mem[T <: Data] = chisel.Mem[T]
  val SeqMem = chisel.SeqMem
  type SeqMem[T <: Data] = chisel.SeqMem[T]

  val Module = chisel.Module
  type Module = chisel.Module

  val printf = chisel.printf

  val Reg = chisel.Reg

  val when = chisel.when
  type WhenContext = chisel.WhenContext


  type BackendCompilationUtilities = chisel.BackendCompilationUtilities
  val Driver = chisel.Driver
  type FileSystemUtilities = chisel.FileSystemUtilities
  val ImplicitConversions = chisel.ImplicitConversions
  val chiselMain = chisel.chiselMain
  val throwException = chisel.throwException


  object testers {
    type BasicTester = chisel.testers.BasicTester
    val TesterDriver = chisel.testers.TesterDriver
  }


  val log2Up = chisel.util.log2Up
  val log2Ceil = chisel.util.log2Ceil
  val log2Down = chisel.util.log2Down
  val log2Floor = chisel.util.log2Floor
  val isPow2 = chisel.util.isPow2

  type ArbiterIO[T <: Data] = chisel.util.ArbiterIO[T]
  type LockingArbiterLike[T <: Data] = chisel.util.LockingArbiterLike[T]
  type LockingRRArbiter[T <: Data] = chisel.util.LockingRRArbiter[T]
  type LockingArbiter[T <: Data] = chisel.util.LockingArbiter[T]
  type RRArbiter[T <: Data] = chisel.util.RRArbiter[T]
  type Arbiter[T <: Data] = chisel.util.Arbiter[T]

  val FillInterleaved = chisel.util.FillInterleaved
  val PopCount = chisel.util.PopCount
  val Fill = chisel.util.Fill
  val Reverse = chisel.util.Reverse

  val Cat = chisel.util.Cat

  val Log2 = chisel.util.Log2

  val unless = chisel.util.unless
  type SwitchContext[T <: Bits] = chisel.util.SwitchContext[T]
  val is = chisel.util.is
  val switch = chisel.util.switch

  type Counter = chisel.util.Counter
  val Counter = chisel.util.Counter

  type DecoupledIO[+T <: Data] = chisel.util.DecoupledIO[T]
  val Decoupled = chisel.util.Decoupled
  type EnqIO[T <: Data] = chisel.util.EnqIO[T]
  type DeqIO[T <: Data] = chisel.util.DeqIO[T]
  type DecoupledIOC[+T <: Data] = chisel.util.DecoupledIOC[T]
  type QueueIO[T <: Data] = chisel.util.QueueIO[T]
  type Queue[T <: Data] = chisel.util.Queue[T]
  val Queue = chisel.util.Queue

  val Enum = chisel.util.Enum

  val LFSR16 = chisel.util.LFSR16

  val ListLookup = chisel.util.ListLookup
  val Lookup = chisel.util.Lookup

  val Mux1H = chisel.util.Mux1H
  val PriorityMux = chisel.util.PriorityMux
  val MuxLookup = chisel.util.MuxLookup
  val MuxCase = chisel.util.MuxCase

  val OHToUInt = chisel.util.OHToUInt
  val PriorityEncoder = chisel.util.PriorityEncoder
  val UIntToOH = chisel.util.UIntToOH
  val PriorityEncoderOH = chisel.util.PriorityEncoderOH

  val RegNext = chisel.util.RegNext
  val RegInit = chisel.util.RegInit
  val RegEnable = chisel.util.RegEnable
  val ShiftRegister = chisel.util.ShiftRegister

  type ValidIO[+T <: Data] = chisel.util.ValidIO[T]
  val Valid = chisel.util.Valid
  val Pipe = chisel.util.Pipe
  type Pipe[T <: Data] = chisel.util.Pipe[T]


  import chisel.internal.firrtl.Width
  implicit def fromBigIntToLiteral(x: BigInt): chisel.fromBigIntToLiteral =
    new chisel.fromBigIntToLiteral(x)
  implicit def fromIntToLiteral(x: Int): chisel.fromIntToLiteral=
    new chisel.fromIntToLiteral(x)
  implicit def fromStringToLiteral(x: String): chisel.fromStringToLiteral=
    new chisel.fromStringToLiteral(x)
  implicit def fromBooleanToLiteral(x: Boolean): chisel.fromBooleanToLiteral=
    new chisel.fromBooleanToLiteral(x)
}