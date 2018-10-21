package me.amuxix

import me.amuxix.stanton.moons.{Cellin, Daymar, Yela}
import me.amuxix.stanton.planets.{Crusader, Delamar}

package object stanton {
  val tradingPosts: Set[TradingPost] = Set(PortOlisar, ArcCorpMiningArea141, BountyfulHarvestHydroponics, ShubinMiningFacility, /*KudreOre, */TerraMillsHydroFarm,
    GaletteFamilyFarms, HickesResearchOutpost, TramMyersMining, GrimHex, ArcCorpMiningArea157, BensonMiningOutpost, DeakingReaserchOutpost, DrugLab, Levski)

  val celestialBodies: Set[CelestialBody] = Set(Crusader, Delamar, Cellin, Daymar, Yela)

  case object PortOlisar extends TradingPost {
    override val celestialBody: CelestialBody = stations.PortOlisar
    override val buy: Map[Material, Double] = Map(
      AgricultureSupplies -> 0.75,
      Fluorine -> 2.65,
      Gold -> 6.08,
      MedicalSupplies -> 17.02,
      Scrap -> 1.52,
      Waste -> 0.09
    )
    override val sell: Map[Material, Double] = Map(
      Agricium -> 25.72,
      Aluminum -> 1.22,
      Astatine -> 8.44,
      Beryl -> 4.3,
      Chlorine -> 1.56,
      Corundum -> 2.8,
      Diamond -> 6.8,
      DistilledSpirits -> 4.95,
      Hydrogen -> 0.17,
      Iodine -> 0.44,
      Laranite -> 28.54,
      ProcessedFood -> 1.38,
      Quartz -> 1.46,
      Stims -> 3.42,
      Titanium -> 2.29,
      Tungsten -> 3.94
    )
  }

  case object ArcCorpMiningArea141 extends TradingPost {
    override val celestialBody: CelestialBody = Daymar
    override val buy: Map[Material, Double] = Map(
      Agricium -> 24.92,
      Beryl -> 4.09,
      Quartz -> 1.33,
      Tungsten -> 3.65
    )
    override val sell: Map[Material, Double] = Map(
      Alutruciatoxine -> 0,
      DistilledSpirits -> 4.95,
      MedicalSupplies -> 17.37,
      ProcessedFood -> 1.38,
      Stims -> 3.42,
      WiDoW -> 0
    )
  }

  case object BountyfulHarvestHydroponics extends TradingPost {
    override val celestialBody: CelestialBody = Daymar
    override val buy: Map[Material, Double] = Map(
      DistilledSpirits -> 4.64,
      ProcessedFood -> 1.31,
      Stims -> 3.17
    )
    override val sell: Map[Material, Double] = Map(
      AgricultureSupplies -> 0.8,
      MedicalSupplies -> 17.97
    )
  }

  case object ShubinMiningFacility extends TradingPost {
    override val celestialBody: CelestialBody = Daymar
    override val buy: Map[Material, Double] = Map(
      Beryl -> 4.09,
      Gold -> 5.71,
      Quartz -> 1.33,
      Tungsten -> 3.65
    )
    override val sell: Map[Material, Double] = Map(
      Alutruciatoxine -> 0,
      DistilledSpirits -> 4.95,
      MedicalSupplies -> 17.97,
      ProcessedFood -> 1.38,
      Stims -> 3.42,
      WiDoW -> 0
    )
  }

  case object TerraMillsHydroFarm extends TradingPost  {
    override val celestialBody: CelestialBody = Cellin
    override val buy: Map[Material, Double] = Map(
      DistilledSpirits -> 4.64,
      ProcessedFood -> 1.31,
      Stims -> 3.17
    )
    override val sell: Map[Material, Double] = Map(
      AgricultureSupplies -> 0.8,
      MedicalSupplies -> 17.97
    )
  }

  case object GaletteFamilyFarms extends TradingPost {
    override val celestialBody: CelestialBody = Cellin
    override val buy: Map[Material, Double] = Map(
      DistilledSpirits -> 4.64,
      ProcessedFood -> 1.31,
      Stims -> 3.17
    )
    override val sell: Map[Material, Double] = Map(
      AgricultureSupplies -> 0.8,
      MedicalSupplies -> 17.72
    )
  }

  case object HickesResearchOutpost extends TradingPost {
    override val celestialBody: CelestialBody = Cellin
    override val buy: Map[Material, Double] = Map(
      AgricultureSupplies -> 0.69,
      MedicalSupplies -> 17.02
    )
    override val sell: Map[Material, Double] = Map(
      Astatine -> 8.44,
      Chlorine -> 1.56,
      Fluorine -> 2.75,
      Iodine -> 0.44,
      ProcessedFood -> 1.38
    )
  }

  case object TramMyersMining extends TradingPost {
    override val celestialBody: CelestialBody = Cellin
    override val buy: Map[Material, Double] = Map(
      Aluminum -> 1.17,
      Corundum -> 2.41,
      Diamond -> 6.39,
      Laranite -> 28.03,
      Titanium -> 2.1
    )
    override val sell: Map[Material, Double] = Map(
      Alutruciatoxine -> 0,
      DistilledSpirits -> 4.95,
      MedicalSupplies -> 17.97,
      ProcessedFood -> 1.38,
      Stims -> 3.42,
      WiDoW -> 0
    )
  }

  case object GrimHex extends TradingPost {
    override val celestialBody: CelestialBody = stations.GrimHex
    override val buy: Map[Material, Double] = Map(
      Agricium -> 25.72,
      Diamond -> 6.8,
      Gold -> 6.08,
      Laranite -> 28.54,
      Scrap -> 1.52
    )
    override val sell: Map[Material, Double] = Map(
      Aluminum -> 1.22,
      Alutruciatoxine -> 0,
      Astatine -> 8.44,
      Beryl -> 4.3,
      Chlorine -> 1.56,
      Corundum -> 2.58,
      DistilledSpirits -> 4.95,
      Fluorine -> 2.75,
      Hydrogen -> 0.17,
      Iodine -> 0.44,
      MedicalSupplies -> 17.97,
      ProcessedFood -> 1.38,
      Quartz -> 1.46,
      Stims -> 3.42,
      Titanium -> 2.29,
      Tungsten -> 3.94,
      Waste -> 0.1,
      WiDoW -> 0
    )
  }

  case object ArcCorpMiningArea157 extends TradingPost {
    override val celestialBody: CelestialBody = Yela
    override val buy: Map[Material, Double] = Map(
      Astatine -> 7.91,
      Chlorine -> 1.44,
      Fluorine -> 2.54,
      Hydrogen -> 0.12,
      Iodine -> 0.35
    )
    override val sell: Map[Material, Double] = Map(
      Alutruciatoxine -> 0,
      DistilledSpirits -> 4.95,
      MedicalSupplies -> 17.97,
      ProcessedFood -> 1.38,
      Stims -> 3.42,
      WiDoW -> 0
    )
  }

  case object BensonMiningOutpost extends TradingPost {
    override val celestialBody: CelestialBody = Yela
    override val buy: Map[Material, Double] = Map(
      Astatine -> 7.91,
      Chlorine -> 1.44,
      Fluorine -> 2.54,
      Hydrogen -> 0.12,
      Iodine -> 0.35
    )
    override val sell: Map[Material, Double] = Map(
      Alutruciatoxine -> 0,
      DistilledSpirits -> 4.95,
      MedicalSupplies -> 17.97,
      ProcessedFood -> 1.38,
      Stims -> 3.42,
      WiDoW -> 0
    )
  }

  case object DeakingReaserchOutpost extends TradingPost {
    override val celestialBody: CelestialBody = Yela
    override val buy: Map[Material, Double] = Map(
      AgricultureSupplies -> 0.69,
      MedicalSupplies -> 17.02
    )
    override val sell: Map[Material, Double] = Map(
      Astatine -> 8.44,
      Chlorine -> 1.56,
      Fluorine -> 2.75,
      Iodine -> 0.44,
      ProcessedFood -> 1.38
    )
  }

  case object DrugLab extends TradingPost {
    override val celestialBody: CelestialBody = Yela
    override val buy: Map[Material, Double] = Map(
    Alutruciatoxine -> 0,
    WiDoW -> 0
    )
    override val sell: Map[Material, Double] = Map(
      AgricultureSupplies -> 0
    )
  }

  case object Levski extends TradingPost {
    override val celestialBody: CelestialBody = Delamar
    override val buy: Map[Material, Double] = Map(
      AgricultureSupplies -> 0.69,
      Aluminum -> 1.17,
      Iodine -> 0.35,
      Quartz -> 1.33
    )
    override val sell: Map[Material, Double] = Map(
      Agricium -> 25.72,
      Alutruciatoxine -> 0,
      Astatine -> 8.44,
      Beryl -> 4.3,
      Chlorine -> 1.56,
      Corundum -> 2.58,
      Diamond -> 6.8,
      DistilledSpirits -> 4.95,
      Fluorine -> 2.75,
      Gold -> 6.08,
      Hydrogen -> 0.17,
      Laranite -> 28.54,
      MedicalSupplies -> 17.97,
      ProcessedFood -> 1.38,
      Scrap -> 1.6,
      Stims -> 3.42,
      Titanium -> 2.29,
      Tungsten -> 3.94,
      Waste -> 0.1,
      WiDoW -> 0
    )
  }
}
